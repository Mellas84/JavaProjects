
public class MonteHallGamePlus extends javax.swing.JFrame {

    public MonteHallGamePlus() {
        initComponents();
    }
    int winDoor;
    int openDoor;
    int choice;
    int times;

    double winScore;
    double loseScore;

    int nrSims;
    int nrFinalSim;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDoor1 = new javax.swing.JButton();
        btnDoor2 = new javax.swing.JButton();
        btnDoor3 = new javax.swing.JButton();
        btnDoor4 = new javax.swing.JButton();
        txfInstruct = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaScoreboard = new javax.swing.JTextArea();
        txfLoseScore = new javax.swing.JTextField();
        txfWinScore = new javax.swing.JTextField();
        txfWinPercent = new javax.swing.JTextField();
        lblGz = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSimulate = new javax.swing.JButton();
        cmbNrSim = new javax.swing.JComboBox<>();
        cmbSwapOrStaySim = new javax.swing.JComboBox<>();
        txfNrSim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MonteHallGame++");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnRestart.setText("Reset Score");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("The Game"));

        btnDoor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg"))); // NOI18N
        btnDoor1.setText("Door 1");
        btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg"))); // NOI18N
        btnDoor1.setEnabled(false);
        btnDoor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoor1ActionPerformed(evt);
            }
        });

        btnDoor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg"))); // NOI18N
        btnDoor2.setText("Door 2");
        btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg"))); // NOI18N
        btnDoor2.setEnabled(false);
        btnDoor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoor2ActionPerformed(evt);
            }
        });

        btnDoor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg"))); // NOI18N
        btnDoor3.setText("Door 3");
        btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg"))); // NOI18N
        btnDoor3.setEnabled(false);
        btnDoor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoor3ActionPerformed(evt);
            }
        });

        btnDoor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg"))); // NOI18N
        btnDoor4.setText("Door 4");
        btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg"))); // NOI18N
        btnDoor4.setEnabled(false);
        btnDoor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoor4ActionPerformed(evt);
            }
        });

        txfInstruct.setEditable(false);
        txfInstruct.setText("Click the Start button to start the game");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfInstruct)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDoor1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDoor2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDoor3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDoor4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDoor1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDoor2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDoor3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDoor4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txfInstruct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Scoreboard"));

        txaScoreboard.setEditable(false);
        txaScoreboard.setColumns(20);
        txaScoreboard.setRows(5);
        jScrollPane1.setViewportView(txaScoreboard);

        txfLoseScore.setEditable(false);
        txfLoseScore.setText("Losses: 0");

        txfWinScore.setEditable(false);
        txfWinScore.setText("Wins: 0");

        txfWinPercent.setEditable(false);
        txfWinPercent.setText("Win%: 0");

        lblGz.setText("   ");
        lblGz.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/270600769011211.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfLoseScore, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(txfWinScore)
                    .addComponent(txfWinPercent))
                .addGap(58, 58, 58)
                .addComponent(lblGz, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(txfLoseScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txfWinScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txfWinPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Simulation"));

        btnSimulate.setText("Simulate");
        btnSimulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulateActionPerformed(evt);
            }
        });

        cmbNrSim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "5000", "10000", "50000", "100000", "500000" }));

        cmbSwapOrStaySim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stay", "Random Switch" }));

        txfNrSim.setEditable(false);
        txfNrSim.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbSwapOrStaySim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfNrSim)
                    .addComponent(cmbNrSim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimulate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbNrSim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSwapOrStaySim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txfNrSim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        winDoor = (int) (Math.random() * 4) + 1;
        btnStart.setText("New Game");
        txfInstruct.setText("Choose a door");

        btnDoor1.setEnabled(true);
        btnDoor2.setEnabled(true);
        btnDoor3.setEnabled(true);
        btnDoor4.setEnabled(true);
        lblGz.setEnabled(true);
        btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg")));
        btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg")));
        btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg")));
        btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/closedDoor.jpg")));
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        loseScore = 0;
        winScore = 0;
        btnRestart.setEnabled(false);
        txfLoseScore.setText("Losses: 0");
        txfWinScore.setText("Wins: 0");
        txfWinPercent.setText("Win%: 0");
        txaScoreboard.setText(" ");
        txfNrSim.setText(" ");
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnDoor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoor1ActionPerformed
        choice = 1;

        if (times == 0) {
            openDoor = openDoorCalcPlus.openDoor(choice, winDoor);
            times++;

            switch (openDoor) {
                case 2:
                    btnDoor2.setEnabled(false);
                    btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
                case 3:
                    btnDoor3.setEnabled(false);
                    btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
                case 4:
                    btnDoor4.setEnabled(false);
                    btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
            }
            txfInstruct.setText("Door " + openDoor + " is empty, make your final choice");

        } else {
            if (winDoor == choice) {
                txfInstruct.setText("You won!");
                txaScoreboard.append("Victory!\n");
                lblGz.setEnabled(false);
                winScore++;
                txfWinScore.setText("Wins: " + winScore);
            } else {
                txfInstruct.setText("Better luck next time.");
                txaScoreboard.append("Defeat.\n");
                loseScore++;
                txfLoseScore.setText("Losses: " + loseScore);
            }
            switch (winDoor) {
                case 1:
                    btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 2:
                    btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 3:
                    btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 4:
                    btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
            }
            double winPercent = winScore / (winScore + loseScore) * 100000;
            int winIntPercent = (int) winPercent;
            double finalWinPercent = (double) winIntPercent / 1000;
            txfWinPercent.setText("Win%: " + finalWinPercent);
            times = 0;
            btnRestart.setEnabled(true);
            btnDoor1.setEnabled(false);
            btnDoor2.setEnabled(false);
            btnDoor3.setEnabled(false);
            btnDoor4.setEnabled(false);
            txfInstruct.setText("Click the New Game button to play again!");
        }
    }//GEN-LAST:event_btnDoor1ActionPerformed

    private void btnDoor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoor2ActionPerformed
        choice = 2;

        if (times == 0) {
            openDoor = openDoorCalcPlus.openDoor(choice, winDoor);
            times++;

            switch (openDoor) {
                case 1:
                    btnDoor1.setEnabled(false);
                    btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
                case 3:
                    btnDoor3.setEnabled(false);
                    btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
                case 4:
                    btnDoor4.setEnabled(false);
                    btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
            }
            txfInstruct.setText("Door " + openDoor + " is empty, make your final choice");

        } else {
            if (winDoor == choice) {
                txfInstruct.setText("You won!");
                txaScoreboard.append("Victory!\n");
                lblGz.setEnabled(false);
                winScore++;
                txfWinScore.setText("Wins: " + winScore);
            } else {
                txfInstruct.setText("Better luck next time.");
                txaScoreboard.append("Defeat.\n");
                loseScore++;
                txfLoseScore.setText("Losses: " + loseScore);
            }
            switch (winDoor) {
                case 1:
                    btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 2:
                    btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 3:
                    btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 4:
                    btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
            }
            double winPercent = winScore / (winScore + loseScore) * 100000;
            int winIntPercent = (int) winPercent;
            double finalWinPercent = (double) winIntPercent / 1000;
            txfWinPercent.setText("Win%: " + finalWinPercent);
            times = 0;
            btnRestart.setEnabled(true);
            btnDoor1.setEnabled(false);
            btnDoor2.setEnabled(false);
            btnDoor3.setEnabled(false);
            btnDoor4.setEnabled(false);
            txfInstruct.setText("Click the New Game button to play again!");
        }
    }//GEN-LAST:event_btnDoor2ActionPerformed

    private void btnDoor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoor3ActionPerformed
        choice = 3;

        if (times == 0) {
            openDoor = openDoorCalcPlus.openDoor(choice, winDoor);
            times++;

            switch (openDoor) {
                case 1:
                    btnDoor1.setEnabled(false);
                    btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
                case 2:
                    btnDoor2.setEnabled(false);
                    btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
                case 4:
                    btnDoor4.setEnabled(false);
                    btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
            }
            txfInstruct.setText("Door " + openDoor + " is empty, make your final choice");
        } else {
            if (winDoor == choice) {
                txfInstruct.setText("You won!");
                txaScoreboard.append("Victory!\n");
                lblGz.setEnabled(false);
                winScore++;
                txfWinScore.setText("Wins: " + winScore);
            } else {
                txfInstruct.setText("Better luck next time.");
                txaScoreboard.append("Defeat.\n");
                loseScore++;
                txfLoseScore.setText("Losses: " + loseScore);
            }
            switch (winDoor) {
                case 1:
                    btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 2:
                    btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 3:
                    btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 4:
                    btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
            }
            double winPercent = winScore / (winScore + loseScore) * 100000;
            int winIntPercent = (int) winPercent;
            double finalWinPercent = (double) winIntPercent / 1000;
            txfWinPercent.setText("Win%: " + finalWinPercent);
            times = 0;
            btnRestart.setEnabled(true);
            btnDoor1.setEnabled(false);
            btnDoor2.setEnabled(false);
            btnDoor3.setEnabled(false);
            btnDoor4.setEnabled(false);
            txfInstruct.setText("Click the New Game button to play again!");
        }
    }//GEN-LAST:event_btnDoor3ActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnSimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulateActionPerformed
        int nrSim = Integer.parseInt((String) (cmbNrSim).getSelectedItem());
        int n = 0;
        int secondChoice = 0;
// Stay function on sim does not work!!
        while (n < nrSim) {
            winDoor = (int) (Math.random() * 4) + 1;
            choice = (int) (Math.random() * 4) + 1;
            openDoor = openDoorCalcPlus.openDoor(choice, winDoor);

            if (cmbSwapOrStaySim.getSelectedItem().equals("Stay")) {
                if (choice == winDoor) {
                    winScore++;
                    n++;
                } else {
                    loseScore++;
                    n++;
                }

            } else {
                switch (openDoor) {
                    case 1:
                        secondChoice = (int) (Math.random() * 3) + 2;
                        break;
                    case 2:
                        secondChoice = (int) (Math.random() * 3) + 2;
                        if (secondChoice == 2) {
                            secondChoice = 1;
                        }
                        break;
                    case 3:
                        secondChoice = (int) (Math.random() * 3) + 1;
                        if (secondChoice == 3) {
                            secondChoice = 4;
                        }
                        break;
                    case 4:
                        secondChoice = (int) (Math.random() * 3) + 1;
                        break;
                }
                if (secondChoice == winDoor) {
                    winScore++;
                } else {
                    loseScore++;
                }

            }
            if (choice != secondChoice) {
                n++;
            }

        }
        double winPercent = winScore / (winScore + loseScore) * 100000;
        int winIntPercent = (int) winPercent;
        double finalWinPercent = (double) winIntPercent / 1000;
        txfWinPercent.setText("Win%: " + finalWinPercent);
        txfLoseScore.setText("Losses: " + loseScore);
        txfWinScore.setText("Wins: " + winScore);
        btnRestart.setEnabled(true);
        nrFinalSim = nrFinalSim + nrSim;
        txfNrSim.setText(Integer.toString(nrFinalSim));
    }//GEN-LAST:event_btnSimulateActionPerformed

    private void btnDoor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoor4ActionPerformed
        choice = 4;
        if (times == 0) {
            openDoor = openDoorCalcPlus.openDoor(choice, winDoor);
            times++;
            switch (openDoor) {
                case 1:
                    btnDoor1.setEnabled(false);
                    btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
                case 2:
                    btnDoor2.setEnabled(false);
                    btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
                case 3:
                    btnDoor3.setEnabled(false);
                    btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/openDoor.jpg")));
                    break;
            }
            txfInstruct.setText("Door " + openDoor + " is empty, make your final choice");

        } else {
            if (winDoor == choice) {
                txfInstruct.setText("You won!");
                txaScoreboard.append("Victory!\n");
                lblGz.setEnabled(false);
                winScore++;
                txfWinScore.setText("Wins: " + winScore);
            } else {
                txfInstruct.setText("Better luck next time.");
                txaScoreboard.append("Defeat.\n");
                loseScore++;
                txfLoseScore.setText("Losses: " + loseScore);
            }
            switch (winDoor) {
                case 1:
                    btnDoor1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 2:
                    btnDoor2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 3:
                    btnDoor3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
                case 4:
                    btnDoor4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/500589126857_lrg.png")));
                    break;
            }
            double winPercent = winScore / (winScore + loseScore) * 100000;
            int winIntPercent = (int) winPercent;
            double finalWinPercent = (double) winIntPercent / 1000;
            txfWinPercent.setText("Win%: " + finalWinPercent);
            times = 0;
            btnRestart.setEnabled(true);
            btnDoor1.setEnabled(false);
            btnDoor2.setEnabled(false);
            btnDoor3.setEnabled(false);
            btnDoor4.setEnabled(false);
            txfInstruct.setText("Click the New Game button to play again!");
        }
    }//GEN-LAST:event_btnDoor4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MonteHallGamePlus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonteHallGamePlus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonteHallGamePlus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonteHallGamePlus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonteHallGamePlus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoor1;
    private javax.swing.JButton btnDoor2;
    private javax.swing.JButton btnDoor3;
    private javax.swing.JButton btnDoor4;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSimulate;
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox<String> cmbNrSim;
    private javax.swing.JComboBox<String> cmbSwapOrStaySim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGz;
    private javax.swing.JTextArea txaScoreboard;
    private javax.swing.JTextField txfInstruct;
    private javax.swing.JTextField txfLoseScore;
    private javax.swing.JTextField txfNrSim;
    private javax.swing.JTextField txfWinPercent;
    private javax.swing.JTextField txfWinScore;
    // End of variables declaration//GEN-END:variables
}
