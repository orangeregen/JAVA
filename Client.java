
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
        System.out.println("���������� �� ������ " + message);

    }
}

public class Client {
    public static void main(String args[]) throws Exception {
        // ���������� ����� �����, �� ������� ��� ������� ������ ��� ������
        int portNumber = 1777;
        
        System.out.println("������ �������");
 
        // ������� ����� (Socket) ��� ��������� � ���������� ����������
        // ������ �� ����� ��������� �� ���� �� ����������
        // ��� ����������� ����� ��� �������� �������������� c ���������� �������
        Socket socket = new Socket("127.0.0.1", portNumber);
 
        // ������� ����� ��� ������ �������� �� ������
        // ��� ����� ���� ������� ����� ������ - socket.getInputStream()
        // ����� ������������� ��� � ����� �������� - new InputStreamReader
        // � ��� ����� ������� ��� ��������� ����� - BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 
        // ������� ����� ��� ������ �������� � �����
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
 
        String str = " ";
 
         //!"bye".equals(str = br.readLine())
        // ������ � ���� ������, ��� ��� ������� ������
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