import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrame extends javax.swing.JFrame {

   
    public JFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        CalcButton = new javax.swing.JButton();
        LowTextField = new javax.swing.JTextField();
        UpTextField = new javax.swing.JTextField();
        StepTextField = new javax.swing.JTextField();
        LowLabel = new javax.swing.JLabel();
        UpLabel = new javax.swing.JLabel();
        StepLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Нижняя граница", "Верхняя граница", "Шаг", "Результат"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setSelectionBackground(new java.awt.Color(255, 20, 147));
        Table.setShowGrid(false);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);

        AddButton.setBackground(new java.awt.Color(255, 20, 147));
        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Добавить");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 20, 147));
        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Удалить");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        CalcButton.setBackground(new java.awt.Color(255, 20, 147));
        CalcButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CalcButton.setForeground(new java.awt.Color(255, 255, 255));
        CalcButton.setText("Вычислить");
        CalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcButtonActionPerformed(evt);
            }
        });

        LowTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        UpTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        StepTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        LowLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LowLabel.setForeground(new java.awt.Color(204, 0, 102));
        LowLabel.setText("Нижняя граница");

        UpLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        UpLabel.setForeground(new java.awt.Color(204, 0, 102));
        UpLabel.setText("Верхняя граница");

        StepLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        StepLabel.setForeground(new java.awt.Color(204, 0, 102));
        StepLabel.setText("Шаг");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StepLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(UpTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(StepTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(LowLabel)
                        .addGap(18, 18, 18)
                        .addComponent(LowTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LowTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(LowLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StepLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
       if (LowTextField.getText().equals("") || UpTextField.getText().equals("") || StepTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Заполните все поля данными!", "Ошибочка вышла!", JOptionPane.PLAIN_MESSAGE);
       } else
            if(Double.valueOf(StepTextField.getText()) > Double.valueOf(UpTextField.getText()) || Double.valueOf(LowTextField.getText())> Double.valueOf(UpTextField.getText()) || Double.valueOf(StepTextField.getText()) == 0)
                     JOptionPane.showMessageDialog(this, "Что-то не то с данными!", "Ошибочка вышла!", JOptionPane.PLAIN_MESSAGE);
                else
                    {
                      DefaultTableModel model = (DefaultTableModel)Table.getModel();
                      model.addRow(new Object[]{LowTextField.getText(),UpTextField.getText(),StepTextField.getText()});
                      LowTextField.setText("");
                      UpTextField.setText("");
                      StepTextField.setText("");
                    }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)Table.getModel(); 
            if (Table.getSelectedRowCount() == 1 )
                model.removeRow(Table.getSelectedRow()); 
            else
                JOptionPane.showMessageDialog(this, "Выберите строку, которую нужно удалить!", "Ошибочка вышла!", JOptionPane.PLAIN_MESSAGE);  
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void CalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)Table.getModel(); 
        
        if (Table.getSelectedRowCount() == 0 )
            JOptionPane.showMessageDialog(this, "Выберите строку для вычисления!", "Ошибочка вышла!", JOptionPane.PLAIN_MESSAGE);
        
        double IntegralFunc = 0;
        double low = Double.parseDouble(model.getValueAt(Table.getSelectedRow(),0).toString());
        double up = Double.parseDouble(model.getValueAt(Table.getSelectedRow(),1).toString());
        double step = Double.parseDouble(model.getValueAt(Table.getSelectedRow(),2).toString());

        if(step > up || low > up || step == 0)
          JOptionPane.showMessageDialog(this, "Вы некорректно изменили данные в таблице!", "Ошибочка вышла!", JOptionPane.PLAIN_MESSAGE);
        
        if (Table.getSelectedRowCount() == 1 )
            {
                for (double i = low; i < up - step; i+= step)
                {
                    if (up - low > step)
                        IntegralFunc += ((Math.sin(i) + Math.sin(i+step))/2)*step;   
                    else
                        IntegralFunc += ((Math.sin(up) + Math.sin(i-step))/2)*step;      
                }
                
                model.setValueAt(IntegralFunc, Table.getSelectedRow(), 3);
            }
//            else
//                 JOptionPane.showMessageDialog(this, "Выберите строку для вычисления!", "Ошибочка вышла!", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_CalcButtonActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setTitle("Вычисляем интегральчик");
                frame.getContentPane().setBackground(new java.awt.Color(255, 228, 225));              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CalcButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel LowLabel;
    private javax.swing.JTextField LowTextField;
    private javax.swing.JLabel StepLabel;
    private javax.swing.JTextField StepTextField;
    private javax.swing.JTable Table;
    private javax.swing.JLabel UpLabel;
    private javax.swing.JTextField UpTextField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}