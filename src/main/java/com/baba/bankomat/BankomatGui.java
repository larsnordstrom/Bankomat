/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baba.bankomat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Lars Nordstrom <lars.nordstrom@jgy.se>
 */
public class BankomatGui extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet res = null;

    boolean isLoggedIn = false;
    int loginAttempts = 0;
    boolean failedToLogin = false;

    String cardNumber = "";
    String cardPin = "";

    static String HOST = null;
    static String PORT = null;
    static String DATABASE = null;
    static String USERNAME = null;
    static String PASSWORD = null;
    static String URL = null;

    /**
     * Creates new form BankomatGui
     */
    public BankomatGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left_Btn1 = new javax.swing.JButton();
        left_Btn2 = new javax.swing.JButton();
        left_Btn3 = new javax.swing.JButton();
        left_Btn4 = new javax.swing.JButton();
        right_Btn1 = new javax.swing.JButton();
        right_Btn2 = new javax.swing.JButton();
        right_Btn3 = new javax.swing.JButton();
        right_Btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn_blank_left = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn_blank_right = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        btn_Enter = new javax.swing.JButton();
        btn_Card = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bankomaten");
        setResizable(false);

        left_Btn1.setBackground(new java.awt.Color(204, 204, 204));
        left_Btn1.setText(" ->");
        left_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_Btn1ActionPerformed(evt);
            }
        });

        left_Btn2.setBackground(new java.awt.Color(204, 204, 204));
        left_Btn2.setText(" ->");
        left_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_Btn2ActionPerformed(evt);
            }
        });

        left_Btn3.setBackground(new java.awt.Color(204, 204, 204));
        left_Btn3.setText(" ->");
        left_Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_Btn3ActionPerformed(evt);
            }
        });

        left_Btn4.setBackground(new java.awt.Color(204, 204, 204));
        left_Btn4.setText(" ->");
        left_Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_Btn4ActionPerformed(evt);
            }
        });

        right_Btn1.setBackground(new java.awt.Color(204, 204, 204));
        right_Btn1.setText("<-");
        right_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_Btn1ActionPerformed(evt);
            }
        });

        right_Btn2.setBackground(new java.awt.Color(204, 204, 204));
        right_Btn2.setText("<-");
        right_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_Btn2ActionPerformed(evt);
            }
        });

        right_Btn3.setBackground(new java.awt.Color(204, 204, 204));
        right_Btn3.setText("<-");
        right_Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_Btn3ActionPerformed(evt);
            }
        });

        right_Btn4.setBackground(new java.awt.Color(204, 204, 204));
        right_Btn4.setText("<-");
        right_Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_Btn4ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn_blank_left.setBackground(new java.awt.Color(204, 204, 204));
        btn_blank_left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_blank_leftActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn_blank_right.setBackground(new java.awt.Color(204, 204, 204));
        btn_blank_right.setText("Pin");
        btn_blank_right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_blank_rightActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn_Clear.setBackground(new java.awt.Color(204, 204, 204));
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        btn_Cancel.setBackground(new java.awt.Color(204, 204, 204));
        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        btn_Enter.setBackground(new java.awt.Color(204, 204, 204));
        btn_Enter.setText("Enter");
        btn_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnterActionPerformed(evt);
            }
        });

        btn_Card.setBackground(new java.awt.Color(204, 204, 204));
        btn_Card.setText("Kort");
        btn_Card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CardActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_blank_left, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_blank_right, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Card, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(left_Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(left_Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(left_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(left_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(right_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right_Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right_Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(left_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left_Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left_Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(right_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right_Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right_Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_blank_left, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Card, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_blank_right, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void left_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left_Btn1ActionPerformed

    }//GEN-LAST:event_left_Btn1ActionPerformed

    private void left_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left_Btn2ActionPerformed

    }//GEN-LAST:event_left_Btn2ActionPerformed

    private void left_Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left_Btn3ActionPerformed

    }//GEN-LAST:event_left_Btn3ActionPerformed

    private void left_Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left_Btn4ActionPerformed

    }//GEN-LAST:event_left_Btn4ActionPerformed

    private void right_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_right_Btn1ActionPerformed

    }//GEN-LAST:event_right_Btn1ActionPerformed

    private void right_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_right_Btn2ActionPerformed

    }//GEN-LAST:event_right_Btn2ActionPerformed

    private void right_Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_right_Btn3ActionPerformed

    }//GEN-LAST:event_right_Btn3ActionPerformed

    private void right_Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_right_Btn4ActionPerformed

    }//GEN-LAST:event_right_Btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        buildCardNumber("1");

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        buildCardNumber("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        buildCardNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn_blank_leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_blank_leftActionPerformed

    }//GEN-LAST:event_btn_blank_leftActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

        buildCardNumber("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        buildCardNumber("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        buildCardNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        buildCardNumber("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        buildCardNumber("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn_blank_rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_blank_rightActionPerformed
        // TODO: Lagra pinkod i pin variabeln

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv pinkod: ");

        cardPin = input.nextLine();


    }//GEN-LAST:event_btn_blank_rightActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed

        buildCardNumber("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed

        buildCardNumber("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed

    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed

        if (conn != null) {
            try {
                conn.close();
                conn = null;
                System.out.println("Connection closed");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnterActionPerformed

        showApplicationStatus();

        // (isLoggedIn == false)
        // (isLoggedIn != true)
        // (!isLoggedIn)
        // Kontrollera om kunden har loggat in på bankomaten
        if (isLoggedIn == false) {

            // kontrollera så kunden inte har ett spärrat kort.
            if (loginAttempts < 3) {

                try {
                    // skicka en fråga till databasen om bankkortnummer och pin matchar.
                    stmt = conn.createStatement();
                    //String queryString = "SELECT * FROM customer WHERE card_number='1234' AND pin_number='1234';";
                    String queryString = "SELECT * FROM customer WHERE card_number='" + cardNumber + "' AND pin_number='" + cardPin + "';";
                    res = stmt.executeQuery(queryString);

                    // Om cardNumber och cardPin inte matchar, öka login attempt med 1.
                    if (res.next()) {
                        // Ändra login status för användaren så hen kan nyttja bankomaten....
                        isLoggedIn = true;
                        // loginAttempts = loginAttempts + 1;
                        // loginAttempts++;
                        loginAttempts += 1;

                    } else {
                        // om kort och pin inte matchar, öka loginAttempts med 1.
                        loginAttempts += 1;

                        if (loginAttempts > 3) {
                            failedToLogin = true;
                            // Bankomat behåller kortet.
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } else if (isLoggedIn == true) {
            // Utföra uttag mm.
            System.out.println("You are logged in...");

        } else {

            // Hantera olika fel...mm.
        }

    }//GEN-LAST:event_btn_EnterActionPerformed

    private void btn_CardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CardActionPerformed

        // TODO: Ta bort scanner när knapparna fungerar...
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv ditt kortnummer: ");
        cardNumber = input.nextLine();

        // Koppls upp mot databasen.
        try {

            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to " + DATABASE);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btn_CardActionPerformed

    private void buildCardNumber(String number) {
        if (cardNumber.length() <= 4) {
            cardNumber = cardNumber + number;
        } else {

            System.out.println("Cardnumber is full...");

        }
    }

    private void showApplicationStatus() {
        if (conn != null) {
            System.out.println("Connection open ");
        }
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Pin Number : " + cardPin);
        System.out.println("Login Attempts : " + loginAttempts);
        System.out.println("Failed to login : " + failedToLogin);
        System.out.println("Is logged in : " + isLoggedIn);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        boolean isLocalhost = false;
        HOST = (isLocalhost == false) ? args[0] : "localhost";
        PORT = (isLocalhost == false) ? args[1] : "3306";
        DATABASE = (isLocalhost == false) ? args[2] : "bank_db";
        USERNAME = (isLocalhost == false) ? args[3] : "root";
        PASSWORD = (isLocalhost == false) ? args[4] : "";
        URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

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
            java.util.logging.Logger.getLogger(BankomatGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankomatGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankomatGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankomatGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankomatGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Card;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Enter;
    private javax.swing.JButton btn_blank_left;
    private javax.swing.JButton btn_blank_right;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton left_Btn1;
    private javax.swing.JButton left_Btn2;
    private javax.swing.JButton left_Btn3;
    private javax.swing.JButton left_Btn4;
    private javax.swing.JButton right_Btn1;
    private javax.swing.JButton right_Btn2;
    private javax.swing.JButton right_Btn3;
    private javax.swing.JButton right_Btn4;
    // End of variables declaration//GEN-END:variables
}
