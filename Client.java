
import java.io.*;
import java.net.*;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class TwoThreads extends Thread {

    double Low;
    double Up;
    double Step;
    int i;
    PrintWriter pw;
    //double result;

    public TwoThreads(double Low, double Up, double Step, int i, PrintWriter pw) {
        this.Up = Up;
        this.Low = Low;
        this.Step = Step;
        this.i = i;
        this.pw = pw;
    }

    @Override
    public void run() {
        double IntegralFunc = 0;
        for (double i = Low; i < Up - Step; i += Step) {
            if (Up - Low > Step) {
                IntegralFunc += ((Math.sin(i) + Math.sin(i + Step)) / 2) * Step;
            } else {
                IntegralFunc += ((Math.sin(Up) + Math.sin(i - Step)) / 2) * Step;
            }
        }
        String message = String.valueOf(IntegralFunc) + " " + i;
        pw.println(message);
        System.out.println("Отправляем на сервер " + message);

    }
}

public class Client {
    public static void main(String args[]) throws Exception {
        // Определяем номер порта, на котором нас ожидает сервер для ответа
        int portNumber = 1777;
        
        System.out.println("Клиент запущен");
 
        // Открыть сокет (Socket) для обращения к локальному компьютеру
        // Сервер мы будем запускать на этом же компьютере
        // Это специальный класс для сетевого взаимодействия c клиентской стороны
        Socket socket = new Socket("127.0.0.1", portNumber);
 
        // Создать поток для чтения символов из сокета
        // Для этого надо открыть поток сокета - socket.getInputStream()
        // Потом преобразовать его в поток символов - new InputStreamReader
        // И уже потом сделать его читателем строк - BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 
        // Создать поток для записи символов в сокет
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
 
        String str = " ";
 
         //!"bye".equals(str = br.readLine())
        // Входим в цикл чтения, что нам ответил сервер
        while ((str = br.readLine()) != null) {           
            Double[] num = Arrays.stream(str.split(" ")).map(Double::parseDouble).toArray(Double[]::new);
            TwoThreads threadthird = new TwoThreads(num[0], num[1], num[2], num[3].intValue(), pw);
            threadthird.start(); 
             
        }
        br.close();
        pw.close();
        socket.close();
        
    }
}
