public class GUI extends javax.swing.JFrame
{  
    private javax.swing.JPanel panelFrame;
    private javax.swing.JPanel panelIsiDataUser;
    private javax.swing.JPanel panelIsiMinyak;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelProfil;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JPanel panelTopUp;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonExit;
    private javax.swing.JLabel labelCreateAccount;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JPasswordField passwordField;
    
    public GUI() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }
    
    private void initComponents() {

        panelFrame = new javax.swing.JPanel();
        panelUtama = new javax.swing.JPanel();
        
        panelRegister = new javax.swing.JPanel();
        labelCreateAccount = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        labelGoPerta = new javax.swing.JLabel();
        buttonNext = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        
        panelIsiDataUser = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        panelIsiMinyak = new javax.swing.JPanel();
        panelCekSaldo = new javax.swing.JPanel();
        panelTopUp = new javax.swing.JPanel();
        panelProfil = new javax.swing.JPanel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi goPERTA");

        panelFrame.setBackground(new java.awt.Color(196, 69, 105));
        
        
        panelUtama.setLayout(new java.awt.CardLayout());

        panelRegister.setBackground(new java.awt.Color(196, 69, 105));
        panelRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelRegister.setFont(new java.awt.Font("Century Gothic", 0, 14));
        
        labelCreateAccount.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelCreateAccount.setForeground(new java.awt.Color(252, 243, 243));
        labelCreateAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCreateAccount.setText("CREATE ACCOUNT");

        labelEmail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(252, 243, 243));
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail.setText("E-mail");

        textFieldEmail.setBackground(new java.awt.Color(252, 243, 243));
        textFieldEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldEmail.setText("Masukkan email anda"); // NOI18N
        textFieldEmail.setToolTipText("");
        textFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEmailFocusLost(evt);
            }
        });
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(252, 243, 243));
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPassword.setText("Password");

        passwordField.setBackground(new java.awt.Color(252, 243, 243));
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });

        labelGoPerta.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        labelGoPerta.setForeground(new java.awt.Color(252, 243, 243));
        labelGoPerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta.setText("goPERTA");

        buttonNext.setBackground(new java.awt.Color(252, 243, 243));
        buttonNext.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonNext.setText("Next");
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new java.awt.Color(252, 243, 243));
        buttonExit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonExit.setText("Exit");
        buttonExit.setToolTipText("");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addComponent(labelEmail)
                        .addGap(43, 43, 43)
                        .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addComponent(labelPassword)
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField)
                            .addGroup(panelRegisterLayout.createSequentialGroup()
                                .addComponent(buttonNext)
                                .addGap(18, 18, 18)
                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGoPerta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGoPerta)
                .addGap(140, 140, 140)
                .addComponent(labelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNext)
                    .addComponent(buttonExit))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        
        panelUtama.add(panelRegister, "card2");

        panelIsiDataUser.setBackground(new java.awt.Color(196, 69, 105));
        panelIsiDataUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        panelUtama.add(panelIsiDataUser, "card9");

        panelLogin.setBackground(new java.awt.Color(196, 69, 105));
        panelLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelLogin.setToolTipText("");

        panelUtama.add(panelLogin, "card3");

        panelMenu.setBackground(new java.awt.Color(196, 69, 105));
        panelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        panelUtama.add(panelMenu, "card4");

        panelIsiMinyak.setBackground(new java.awt.Color(196, 69, 105));
        panelIsiMinyak.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        panelUtama.add(panelIsiMinyak, "card5");

        panelCekSaldo.setBackground(new java.awt.Color(196, 69, 105));
        panelCekSaldo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        panelUtama.add(panelCekSaldo, "card6");

        panelTopUp.setBackground(new java.awt.Color(196, 69, 105));
        panelTopUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        panelUtama.add(panelTopUp, "card7");

        panelProfil.setBackground(new java.awt.Color(196, 69, 105));
        panelProfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelProfil.setToolTipText("");

        panelUtama.add(panelProfil, "card8");
        
        pack();
        setLocationRelativeTo(null);
    }

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String email = textFieldEmail.getText();
        String password = String.valueOf(passwordField.getPassword());
        user = new User(email, password);
        
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();
        
        panelUtama.add(panelIsiDataUser);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                          

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
    }
    
    private void textFieldEmailFocusGained(java.awt.event.FocusEvent evt) {                                           
        if(textFieldEmail.getText().equals("Masukkan email anda")) {
            textFieldEmail.setText("");
        }
    }                                          

    private void textFieldEmailFocusLost(java.awt.event.FocusEvent evt) {                                         
        if(textFieldEmail.getText().equals("")) {
            textFieldEmail.setText("Masukkan email anda");
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
}
