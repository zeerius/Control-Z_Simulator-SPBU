package com.mycompany.goperta;


import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {
    
    private User user;
    private SPBU premium;
    private SPBU pertalite;
    private SPBU pertamax;
    private SPBU solar = new Solar();
    
    private javax.swing.JButton buttonCekSaldo;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonExit2;
    private javax.swing.ButtonGroup buttonGroupBahanBakar;
    private javax.swing.JButton buttonIsi;
    private javax.swing.JButton buttonIsiMinyak;
    private javax.swing.JButton buttonKembali1;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonProfil;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JButton buttonTopUp;
    private javax.swing.JLabel iconIsiMinyak;
    private javax.swing.JLabel iconSaldo;
    private javax.swing.JLabel iconTopUp1;
    private javax.swing.JLabel iconTopUp2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelBahanBakar;
    private javax.swing.JLabel labelCreateAccount;
    private javax.swing.JLabel labelDecor;
    private javax.swing.JLabel labelDecor1;
    private javax.swing.JLabel labelDecor2;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail2;
    private javax.swing.JLabel labelGoPerta;
    private javax.swing.JLabel labelGoPerta1;
    private javax.swing.JLabel labelGoPerta2;
    private javax.swing.JLabel labelIcon1;
    private javax.swing.JLabel labelIcon2;
    private javax.swing.JLabel labelIcon3;
    private javax.swing.JLabel labelIsiData;
    private javax.swing.JLabel labelIsiUlang;
    private javax.swing.JLabel labelIsiUlang1;
    private javax.swing.JLabel labelJenisKendaraan;
    private javax.swing.JLabel labelLiter;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelMenu1;
    private javax.swing.JLabel labelMenu2;
    private javax.swing.JLabel labelMenu3;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoHP;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword2;
    private javax.swing.JLabel labelValidasi;
    private javax.swing.JLabel labelValidasiLiter;
    private javax.swing.JPanel panelBtnMenu1;
    private javax.swing.JPanel panelBtnMenu2;
    private javax.swing.JPanel panelBtnMenu3;
    private javax.swing.JPanel panelCekSaldo;
    private javax.swing.JPanel panelCreateAccount;
    private javax.swing.JPanel panelFrame;
    private javax.swing.JPanel panelIsiDataUser;
    private javax.swing.JPanel panelIsiMinyak;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelProfil;
    private javax.swing.JPanel panelTopIsiMinyak;
    private javax.swing.JPanel panelTopUp;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JPanel panelWelcome;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JRadioButton radioButtonPertalite;
    private javax.swing.JRadioButton radioButtonPertamax;
    private javax.swing.JRadioButton radioButtonPremium;
    private javax.swing.JRadioButton radioButtonSolar;
    private javax.swing.JTextField textFieldAlamat;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEmail2;
    private javax.swing.JTextField textFieldJenisKendaraan;
    private javax.swing.JTextField textFieldJumlahLiter;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldNoHP;

    public GUI() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }
   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroupBahanBakar = new javax.swing.ButtonGroup();
        panelFrame = new javax.swing.JPanel();
        panelWelcome = new javax.swing.JPanel();
        panelUtama = new javax.swing.JPanel();
        panelCreateAccount = new javax.swing.JPanel();
        labelCreateAccount = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        buttonNext = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        labelGoPerta = new javax.swing.JLabel();
        panelIsiDataUser = new javax.swing.JPanel();
        labelIsiData = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        textFieldNoHP = new javax.swing.JTextField();
        textFieldJenisKendaraan = new javax.swing.JTextField();
        textFieldAlamat = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        buttonRegister = new javax.swing.JButton();
        buttonKembali1 = new javax.swing.JButton();
        labelAlamat = new javax.swing.JLabel();
        labelJenisKendaraan = new javax.swing.JLabel();
        labelNoHP = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        textFieldEmail2 = new javax.swing.JTextField();
        labelEmail2 = new javax.swing.JLabel();
        labelPassword2 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        buttonExit2 = new javax.swing.JButton();
        labelValidasi = new javax.swing.JLabel();
        labelGoPerta1 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        labelGoPerta2 = new javax.swing.JLabel();
        buttonIsiMinyak = new javax.swing.JButton();
        buttonCekSaldo = new javax.swing.JButton();
        buttonTopUp = new javax.swing.JButton();
        buttonProfil = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        panelIsiMinyak = new javax.swing.JPanel();
        labelBahanBakar = new javax.swing.JLabel();
        radioButtonPremium = new javax.swing.JRadioButton();
        radioButtonPertalite = new javax.swing.JRadioButton();
        radioButtonPertamax = new javax.swing.JRadioButton();
        radioButtonSolar = new javax.swing.JRadioButton();
        labelLiter = new javax.swing.JLabel();
        textFieldJumlahLiter = new javax.swing.JTextField();
        buttonIsi = new javax.swing.JButton();
        labelIsiUlang = new javax.swing.JLabel();
        labelIsiUlang1 = new javax.swing.JLabel();
        labelValidasiLiter = new javax.swing.JLabel();
        panelTopIsiMinyak = new javax.swing.JPanel();
        panelBtnMenu1 = new javax.swing.JPanel();
        labelIcon1 = new javax.swing.JLabel();
        labelMenu1 = new javax.swing.JLabel();
        iconIsiMinyak = new javax.swing.JLabel();
        labelDecor = new javax.swing.JLabel();
        panelCekSaldo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelBtnMenu2 = new javax.swing.JPanel();
        labelIcon2 = new javax.swing.JLabel();
        labelMenu2 = new javax.swing.JLabel();
        iconSaldo = new javax.swing.JLabel();
        labelDecor1 = new javax.swing.JLabel();
        panelTopUp = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelBtnMenu3 = new javax.swing.JPanel();
        labelIcon3 = new javax.swing.JLabel();
        labelMenu3 = new javax.swing.JLabel();
        iconTopUp1 = new javax.swing.JLabel();
        iconTopUp2 = new javax.swing.JLabel();
        labelDecor2 = new javax.swing.JLabel();
        panelProfil = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFrame.setBackground(new java.awt.Color(196, 69, 105));
        panelFrame.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelWelcomeLayout = new javax.swing.GroupLayout(panelWelcome);
        panelWelcome.setLayout(panelWelcomeLayout);
        panelWelcomeLayout.setHorizontalGroup(
            panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
        panelWelcomeLayout.setVerticalGroup(
            panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        panelFrame.add(panelWelcome, "card3");

        panelUtama.setBackground(new java.awt.Color(196, 69, 105));
        panelUtama.setLayout(new java.awt.CardLayout());

        panelCreateAccount.setBackground(new java.awt.Color(196, 69, 105));

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

        labelGoPerta.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        labelGoPerta.setForeground(new java.awt.Color(252, 243, 243));
        labelGoPerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta.setText("goPERTA");

        javax.swing.GroupLayout panelCreateAccountLayout = new javax.swing.GroupLayout(panelCreateAccount);
        panelCreateAccount.setLayout(panelCreateAccountLayout);
        panelCreateAccountLayout.setHorizontalGroup(
            panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addGroup(panelCreateAccountLayout.createSequentialGroup()
                        .addComponent(labelGoPerta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateAccountLayout.createSequentialGroup()
                        .addComponent(labelPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateAccountLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonNext)
                        .addGap(18, 18, 18)
                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateAccountLayout.createSequentialGroup()
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCreateAccountLayout.setVerticalGroup(
            panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGoPerta)
                .addGap(46, 46, 46)
                .addComponent(labelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExit)
                    .addComponent(buttonNext))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        panelUtama.add(panelCreateAccount, "card2");

        panelIsiDataUser.setBackground(new java.awt.Color(196, 69, 105));

        labelIsiData.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelIsiData.setForeground(new java.awt.Color(252, 243, 243));
        labelIsiData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIsiData.setText("ISI DATA");

        labelNama.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelNama.setForeground(new java.awt.Color(252, 243, 243));
        labelNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNama.setText("Nama");

        textFieldNoHP.setBackground(new java.awt.Color(252, 243, 243));
        textFieldNoHP.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldNoHP.setText("Masukkan nomor hp anda"); // NOI18N
        textFieldNoHP.setToolTipText("");
        textFieldNoHP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNoHPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNoHPFocusLost(evt);
            }
        });
        textFieldNoHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNoHPActionPerformed(evt);
            }
        });

        textFieldJenisKendaraan.setBackground(new java.awt.Color(252, 243, 243));
        textFieldJenisKendaraan.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldJenisKendaraan.setText("Masukkan jenis kendaraan anda"); // NOI18N
        textFieldJenisKendaraan.setToolTipText("");
        textFieldJenisKendaraan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldJenisKendaraanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldJenisKendaraanFocusLost(evt);
            }
        });
        textFieldJenisKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldJenisKendaraanActionPerformed(evt);
            }
        });

        textFieldAlamat.setBackground(new java.awt.Color(252, 243, 243));
        textFieldAlamat.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldAlamat.setText("Masukkan alamat anda"); // NOI18N
        textFieldAlamat.setToolTipText("");
        textFieldAlamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldAlamatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldAlamatFocusLost(evt);
            }
        });
        textFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAlamatActionPerformed(evt);
            }
        });

        textFieldNama.setBackground(new java.awt.Color(252, 243, 243));
        textFieldNama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldNama.setText("Masukkan nama anda"); // NOI18N
        textFieldNama.setToolTipText("");
        textFieldNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNamaFocusLost(evt);
            }
        });
        textFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNamaActionPerformed(evt);
            }
        });

        buttonRegister.setBackground(new java.awt.Color(252, 243, 243));
        buttonRegister.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonRegister.setText("Register");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        buttonKembali1.setBackground(new java.awt.Color(252, 243, 243));
        buttonKembali1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonKembali1.setText("Kembali");
        buttonKembali1.setToolTipText("");
        buttonKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembali1ActionPerformed(evt);
            }
        });

        labelAlamat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(252, 243, 243));
        labelAlamat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlamat.setText("Alamat");

        labelJenisKendaraan.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelJenisKendaraan.setForeground(new java.awt.Color(252, 243, 243));
        labelJenisKendaraan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJenisKendaraan.setText("Jenis Kendaraan");

        labelNoHP.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelNoHP.setForeground(new java.awt.Color(252, 243, 243));
        labelNoHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNoHP.setText("No. HP");

        javax.swing.GroupLayout panelIsiDataUserLayout = new javax.swing.GroupLayout(panelIsiDataUser);
        panelIsiDataUser.setLayout(panelIsiDataUserLayout);
        panelIsiDataUserLayout.setHorizontalGroup(
            panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama)
                            .addComponent(labelJenisKendaraan)
                            .addComponent(labelNoHP)
                            .addComponent(labelAlamat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                                .addComponent(buttonRegister)
                                .addGap(18, 18, 18)
                                .addComponent(buttonKembali1))
                            .addComponent(textFieldNama)
                            .addComponent(textFieldAlamat)
                            .addComponent(textFieldNoHP)
                            .addComponent(textFieldJenisKendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                    .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelIsiData, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIsiDataUserLayout.setVerticalGroup(
            panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelIsiData, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldJenisKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJenisKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegister)
                    .addComponent(buttonKembali1))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        panelUtama.add(panelIsiDataUser, "card2");

        panelLogin.setBackground(new java.awt.Color(196, 69, 105));

        labelLogin.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(252, 243, 243));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("LOGIN");

        passwordField2.setBackground(new java.awt.Color(252, 243, 243));
        passwordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordField2FocusLost(evt);
            }
        });

        textFieldEmail2.setBackground(new java.awt.Color(252, 243, 243));
        textFieldEmail2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldEmail2.setText("Masukkan email anda");
        textFieldEmail2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEmail2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEmail2FocusLost(evt);
            }
        });
        textFieldEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmail2ActionPerformed(evt);
            }
        });

        labelEmail2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelEmail2.setForeground(new java.awt.Color(252, 243, 243));
        labelEmail2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail2.setText("E-mail");

        labelPassword2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPassword2.setForeground(new java.awt.Color(252, 243, 243));
        labelPassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPassword2.setText("Password");

        buttonLogin.setBackground(new java.awt.Color(252, 243, 243));
        buttonLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonExit2.setBackground(new java.awt.Color(252, 243, 243));
        buttonExit2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonExit2.setText("Exit");
        buttonExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExit2ActionPerformed(evt);
            }
        });

        labelValidasi.setFont(new java.awt.Font("Century", 2, 12)); // NOI18N
        labelValidasi.setForeground(new java.awt.Color(196, 69, 105));
        labelValidasi.setText("Email or password incorrect ");

        labelGoPerta1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        labelGoPerta1.setForeground(new java.awt.Color(252, 243, 243));
        labelGoPerta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta1.setText("goPERTA");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(buttonLogin)
                        .addGap(37, 37, 37)
                        .addComponent(buttonExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                                .addComponent(labelPassword2)
                                .addGap(18, 18, 18))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(labelEmail2)
                                .addGap(47, 47, 47)))
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldEmail2)
                            .addComponent(passwordField2)
                            .addComponent(labelValidasi, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelGoPerta1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGoPerta1)
                .addGap(29, 29, 29)
                .addComponent(labelLogin)
                .addGap(73, 73, 73)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword2)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelValidasi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogin)
                    .addComponent(buttonExit2))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        panelUtama.add(panelLogin, "card2");

        panelMenu.setBackground(new java.awt.Color(196, 69, 105));

        labelGoPerta2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        labelGoPerta2.setForeground(new java.awt.Color(252, 243, 243));
        labelGoPerta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta2.setText("goPERTA");

        buttonIsiMinyak.setBackground(new java.awt.Color(252, 243, 243));
        buttonIsiMinyak.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonIsiMinyak.setText("Isi Minyak");
        buttonIsiMinyak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIsiMinyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIsiMinyakActionPerformed(evt);
            }
        });

        buttonCekSaldo.setBackground(new java.awt.Color(252, 243, 243));
        buttonCekSaldo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonCekSaldo.setText("Cek Saldo");
        buttonCekSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekSaldoActionPerformed(evt);
            }
        });

        buttonTopUp.setBackground(new java.awt.Color(252, 243, 243));
        buttonTopUp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonTopUp.setText("Top Up");
        buttonTopUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTopUpActionPerformed(evt);
            }
        });

        buttonProfil.setBackground(new java.awt.Color(252, 243, 243));
        buttonProfil.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonProfil.setText("Profil");
        buttonProfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProfilActionPerformed(evt);
            }
        });

        buttonLogout.setBackground(new java.awt.Color(252, 243, 243));
        buttonLogout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonLogout.setText("Logout");
        buttonLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(labelGoPerta2)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonIsiMinyak, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(labelGoPerta2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(buttonIsiMinyak, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        panelUtama.add(panelMenu, "card2");

        panelIsiMinyak.setBackground(new java.awt.Color(255, 255, 255));

        labelBahanBakar.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        labelBahanBakar.setForeground(new java.awt.Color(196, 69, 105));
        labelBahanBakar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBahanBakar.setText("PILIH JENIS BAHAN BAKAR");

        radioButtonPremium.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupBahanBakar.add(radioButtonPremium);
        radioButtonPremium.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioButtonPremium.setText("Premium");
        radioButtonPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPremiumActionPerformed(evt);
            }
        });

        radioButtonPertalite.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupBahanBakar.add(radioButtonPertalite);
        radioButtonPertalite.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioButtonPertalite.setText("Pertalite");
        radioButtonPertalite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPertaliteActionPerformed(evt);
            }
        });

        radioButtonPertamax.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupBahanBakar.add(radioButtonPertamax);
        radioButtonPertamax.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioButtonPertamax.setText("Pertamax");
        radioButtonPertamax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPertamaxActionPerformed(evt);
            }
        });

        radioButtonSolar.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupBahanBakar.add(radioButtonSolar);
        radioButtonSolar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioButtonSolar.setText("Solar");
        radioButtonSolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonSolarActionPerformed(evt);
            }
        });

        labelLiter.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        labelLiter.setForeground(new java.awt.Color(196, 69, 105));
        labelLiter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLiter.setText("LITER BAHAN BAKAR");

        textFieldJumlahLiter.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldJumlahLiter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldJumlahLiter.setText("Masukkan jumlah liter");
        textFieldJumlahLiter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldJumlahLiterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldJumlahLiterFocusLost(evt);
            }
        });
        textFieldJumlahLiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldJumlahLiterActionPerformed(evt);
            }
        });

        buttonIsi.setBackground(new java.awt.Color(252, 243, 243));
        buttonIsi.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonIsi.setText("ISI");
        buttonIsi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIsiActionPerformed(evt);
            }
        });

        labelIsiUlang.setBackground(new java.awt.Color(196, 69, 105));
        labelIsiUlang.setFont(new java.awt.Font("Century", 2, 12)); // NOI18N
        labelIsiUlang.setForeground(new java.awt.Color(255, 0, 0));
        labelIsiUlang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIsiUlang.setText("Mohon tunggu sebentar");
        labelIsiUlang.setToolTipText("");

        labelIsiUlang1.setFont(new java.awt.Font("Century", 2, 12)); // NOI18N
        labelIsiUlang1.setForeground(new java.awt.Color(255, 0, 0));
        labelIsiUlang1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIsiUlang1.setText("Tangki SPBU sedang diisi ulang");
        labelIsiUlang1.setToolTipText("");

        labelValidasiLiter.setBackground(new java.awt.Color(196, 69, 105));
        labelValidasiLiter.setFont(new java.awt.Font("Century", 2, 12)); // NOI18N
        labelValidasiLiter.setForeground(new java.awt.Color(255, 0, 0));
        labelValidasiLiter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValidasiLiter.setText("Mohon input bilangan bulat 1 sampai 1000 ");
        labelValidasiLiter.setToolTipText("");

        panelTopIsiMinyak.setBackground(new java.awt.Color(196, 69, 105));

        panelBtnMenu1.setBackground(new java.awt.Color(196, 69, 105));
        panelBtnMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtnMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnMenu1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBtnMenu1MousePressed(evt);
            }
        });

        labelIcon1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelIcon1.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\menuIcon2.png")); // NOI18N
        labelIcon1.setToolTipText("");
        labelIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIcon1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelIcon1MousePressed(evt);
            }
        });

        labelMenu1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelMenu1.setText("MENU");
        labelMenu1.setToolTipText("");
        labelMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMenu1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMenu1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnMenu1Layout = new javax.swing.GroupLayout(panelBtnMenu1);
        panelBtnMenu1.setLayout(panelBtnMenu1Layout);
        panelBtnMenu1Layout.setHorizontalGroup(
            panelBtnMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIcon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu1)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelBtnMenu1Layout.setVerticalGroup(
            panelBtnMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnMenu1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBtnMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        iconIsiMinyak.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\iconFuel.png")); // NOI18N

        javax.swing.GroupLayout panelTopIsiMinyakLayout = new javax.swing.GroupLayout(panelTopIsiMinyak);
        panelTopIsiMinyak.setLayout(panelTopIsiMinyakLayout);
        panelTopIsiMinyakLayout.setHorizontalGroup(
            panelTopIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopIsiMinyakLayout.createSequentialGroup()
                .addComponent(panelBtnMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconIsiMinyak)
                .addContainerGap())
        );
        panelTopIsiMinyakLayout.setVerticalGroup(
            panelTopIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBtnMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopIsiMinyakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconIsiMinyak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelDecor.setBackground(new java.awt.Color(255, 255, 255));
        labelDecor.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\decorBawah3.jpeg")); // NOI18N

        javax.swing.GroupLayout panelIsiMinyakLayout = new javax.swing.GroupLayout(panelIsiMinyak);
        panelIsiMinyak.setLayout(panelIsiMinyakLayout);
        panelIsiMinyakLayout.setHorizontalGroup(
            panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIsiMinyakLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBahanBakar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLiter, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addComponent(panelTopIsiMinyak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                .addGroup(panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(buttonIsi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelValidasiLiter, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelIsiMinyakLayout.createSequentialGroup()
                                .addComponent(radioButtonPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButtonPertalite, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                                .addComponent(radioButtonPertamax, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(radioButtonSolar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIsiUlang1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIsiUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(textFieldJumlahLiter, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(labelDecor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelIsiMinyakLayout.setVerticalGroup(
            panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                .addComponent(panelTopIsiMinyak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelBahanBakar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonPremium)
                    .addComponent(radioButtonPertalite))
                .addGap(18, 18, 18)
                .addGroup(panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonPertamax)
                    .addComponent(radioButtonSolar))
                .addGap(18, 18, 18)
                .addComponent(labelLiter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldJumlahLiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelValidasiLiter)
                .addGap(15, 15, 15)
                .addComponent(buttonIsi)
                .addGap(18, 18, 18)
                .addComponent(labelIsiUlang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIsiUlang1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(labelDecor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelUtama.add(panelIsiMinyak, "card2");

        panelCekSaldo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(196, 69, 105));

        panelBtnMenu2.setBackground(new java.awt.Color(196, 69, 105));
        panelBtnMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtnMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnMenu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnMenu2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBtnMenu2MousePressed(evt);
            }
        });

        labelIcon2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelIcon2.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\menuIcon2.png")); // NOI18N
        labelIcon2.setToolTipText("");
        labelIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIcon2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelIcon2MousePressed(evt);
            }
        });

        labelMenu2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelMenu2.setText("MENU");
        labelMenu2.setToolTipText("");
        labelMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMenu2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMenu2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnMenu2Layout = new javax.swing.GroupLayout(panelBtnMenu2);
        panelBtnMenu2.setLayout(panelBtnMenu2Layout);
        panelBtnMenu2Layout.setHorizontalGroup(
            panelBtnMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnMenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIcon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu2)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelBtnMenu2Layout.setVerticalGroup(
            panelBtnMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnMenu2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBtnMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        iconSaldo.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\iconSaldo.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelBtnMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconSaldo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBtnMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelDecor1.setBackground(new java.awt.Color(255, 255, 255));
        labelDecor1.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\decorBawah3.jpeg")); // NOI18N

        javax.swing.GroupLayout panelCekSaldoLayout = new javax.swing.GroupLayout(panelCekSaldo);
        panelCekSaldo.setLayout(panelCekSaldoLayout);
        panelCekSaldoLayout.setHorizontalGroup(
            panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelDecor1)
        );
        panelCekSaldoLayout.setVerticalGroup(
            panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCekSaldoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(labelDecor1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelUtama.add(panelCekSaldo, "card2");

        panelTopUp.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(196, 69, 105));

        panelBtnMenu3.setBackground(new java.awt.Color(196, 69, 105));
        panelBtnMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtnMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnMenu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnMenu3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBtnMenu3MousePressed(evt);
            }
        });

        labelIcon3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelIcon3.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\menuIcon2.png")); // NOI18N
        labelIcon3.setToolTipText("");
        labelIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIcon3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelIcon3MousePressed(evt);
            }
        });

        labelMenu3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelMenu3.setText("MENU");
        labelMenu3.setToolTipText("");
        labelMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMenu3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMenu3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnMenu3Layout = new javax.swing.GroupLayout(panelBtnMenu3);
        panelBtnMenu3.setLayout(panelBtnMenu3Layout);
        panelBtnMenu3Layout.setHorizontalGroup(
            panelBtnMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnMenu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIcon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu3)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelBtnMenu3Layout.setVerticalGroup(
            panelBtnMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnMenu3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBtnMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        iconTopUp1.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\iconTopUp.png")); // NOI18N

        iconTopUp2.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\iconSaldo.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelBtnMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconTopUp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconTopUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBtnMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconTopUp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconTopUp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        labelDecor2.setBackground(new java.awt.Color(255, 255, 255));
        labelDecor2.setIcon(new javax.swing.ImageIcon("D:\\Smt 3\\PBO\\ProjekLab\\goPERTA\\src\\main\\java\\com\\mycompany\\goperta\\decorBawah3.jpeg")); // NOI18N

        javax.swing.GroupLayout panelTopUpLayout = new javax.swing.GroupLayout(panelTopUp);
        panelTopUp.setLayout(panelTopUpLayout);
        panelTopUpLayout.setHorizontalGroup(
            panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDecor2)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTopUpLayout.setVerticalGroup(
            panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopUpLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(labelDecor2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelUtama.add(panelTopUp, "card2");

        panelProfil.setBackground(new java.awt.Color(196, 69, 105));

        javax.swing.GroupLayout panelProfilLayout = new javax.swing.GroupLayout(panelProfil);
        panelProfil.setLayout(panelProfilLayout);
        panelProfilLayout.setHorizontalGroup(
            panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
        panelProfilLayout.setVerticalGroup(
            panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        panelUtama.add(panelProfil, "card2");

        panelFrame.add(panelUtama, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

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

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {                                               

    }                                              

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {                                          

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

    private void textFieldNoHPFocusGained(java.awt.event.FocusEvent evt) {                                          
        if(textFieldNoHP.getText().equals("Masukkan nomor hp anda")) {
            textFieldNoHP.setText("");
        }
    }                                         

    private void textFieldNoHPFocusLost(java.awt.event.FocusEvent evt) {                                        
        if(textFieldNoHP.getText().equals("")) {
            textFieldNoHP.setText("Masukkan nomor hp anda");
        }
    }                                       

    private void textFieldJenisKendaraanFocusGained(java.awt.event.FocusEvent evt) {                                                    
        if(textFieldJenisKendaraan.getText().equals("Masukkan jenis kendaraan anda")) {
            textFieldJenisKendaraan.setText("");
        }
    }                                                   

    private void textFieldJenisKendaraanFocusLost(java.awt.event.FocusEvent evt) {                                                  
        if(textFieldJenisKendaraan.getText().equals("")) {
            textFieldJenisKendaraan.setText("Masukkan jenis kendaraan anda");
        }
    }                                                 

    private void textFieldAlamatFocusGained(java.awt.event.FocusEvent evt) {                                            
        if(textFieldAlamat.getText().equals("Masukkan alamat anda")) {
            textFieldAlamat.setText("");
        }
    }                                           

    private void textFieldAlamatFocusLost(java.awt.event.FocusEvent evt) {                                          
        if(textFieldAlamat.getText().equals("")) {
            textFieldAlamat.setText("Masukkan alamat anda");
        }
    }                                         

    private void textFieldNamaFocusGained(java.awt.event.FocusEvent evt) {                                          
        if(textFieldNama.getText().equals("Masukkan nama anda")) {
            textFieldNama.setText("");
        }
    }                                         

    private void textFieldNamaFocusLost(java.awt.event.FocusEvent evt) {                                        
        if(textFieldNama.getText().equals("")) {
            textFieldNama.setText("Masukkan nama anda");
        }
    }                                       

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String nama = textFieldNama.getText();
        String alamat = textFieldAlamat.getText();
        String jenisKendaraan = textFieldJenisKendaraan.getText();
        String noHp = textFieldNoHP.getText();

        // buat setter

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelLogin);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                              

    private void buttonKembali1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelCreateAccount);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                              

    private void passwordField2FocusLost(java.awt.event.FocusEvent evt) {                                         

    }                                        

    private void textFieldEmail2FocusGained(java.awt.event.FocusEvent evt) {                                            
        if(textFieldEmail2.getText().equals("Masukkan email anda")) {
            textFieldEmail2.setText("");
        }
    }                                           

    private void textFieldEmail2FocusLost(java.awt.event.FocusEvent evt) {                                          
        if(textFieldEmail2.getText().equals("")) {
            textFieldEmail2.setText("Masukkan email anda");
        }
    }                                         

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(textFieldEmail2.getText().equals(user.getEmail()) && String.valueOf(passwordField2.getPassword()).equals(user.getPassword())) {
            panelUtama.removeAll();
            panelUtama.repaint();
            panelUtama.revalidate();

            panelUtama.add(panelMenu);
            panelUtama.repaint();
            panelUtama.revalidate();
        }
        else {
            labelValidasi.setForeground(Color.black);
        }
    }                                           

    private void buttonExit2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.exit(0);
    }                                           

    private void buttonIsiMinyakActionPerformed(java.awt.event.ActionEvent evt) {                                                
        resetPanelIsiMinyak(panelIsiMinyak);        
    }                                               

    private void buttonCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelCekSaldo);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                              

    private void buttonTopUpActionPerformed(java.awt.event.ActionEvent evt) {                                            
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelTopUp);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                           

    private void buttonProfilActionPerformed(java.awt.event.ActionEvent evt) {                                             
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelProfil);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                            

    private void textFieldJumlahLiterFocusGained(java.awt.event.FocusEvent evt) {                                                 
       if(textFieldJumlahLiter.getText().equals("Masukkan jumlah liter")) {
            textFieldJumlahLiter.setText("");
        }
    }                                                

    private void textFieldJumlahLiterFocusLost(java.awt.event.FocusEvent evt) {                                               
        if(textFieldJumlahLiter.getText().equals("")) {
            textFieldJumlahLiter.setText("Masukkan jumlah liter");
        }
    }                                              

    private void buttonIsiActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int liter;
        SPBU spbu;
        if (radioButtonPremium.isSelected()) {
            spbu = premium;
        }
        else if (radioButtonPertalite.isSelected()){
            spbu = pertalite;
        }
        else if (radioButtonPertamax.isSelected()) {
            spbu = pertamax;
        }
        else if (radioButtonSolar.isSelected()) {
            spbu = solar;
        }
        else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih bahan bakar!", "BAHAN BAKAR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            liter =Integer.parseInt(textFieldJumlahLiter.getText());
            if (liter <= 0 || liter > spbu.getTangki().getKapasitas()) {
                throw new Exception();
            }
        } catch (Exception e) {
            labelValidasiLiter.setVisible(true);
            labelValidasiLiter.setText("Mohon input bilangan bulat 1 sampai " + spbu.getTangki().getKapasitas() + " ");
            textFieldJumlahLiter.setText("Masukkan jumlah liter");
            return;
        }
    
        if(!spbu.cekIsiTangki(liter)) {
            // pesan nunggu 5 detik
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                public void run() {
                    labelIsiUlang.setText("Tangki SPBU sudah terisi kembali ");
                    labelIsiUlang1.setText("Silakan klik kembali tombol ISI ");
                    buttonIsi.setVisible(true);
                }
            };
            labelIsiUlang.setVisible(true);
            labelIsiUlang1.setVisible(true);
            buttonIsi.setVisible(false);
            spbu.getTangki().tambah(spbu.getTangki().getKapasitas() - spbu.getTangki().getIsiTangki());
            timer.schedule(task, 5000);
        }
        else{
            
            int biaya = liter * spbu.getTangki().getHarga();
            if (biaya > user.getSaldo()) {
                int biayaKurang = biaya - user.getSaldo();
                String dialogKurangSaldo = "Maaf, uang yang Anda miliki kurang Rp" + biayaKurang + ",00. \n" + 
                        "Apakah Anda ingin menambah uang?";
                int pilihan = JOptionPane.showConfirmDialog(this, dialogKurangSaldo, "SALDO TIDAK CUKUP", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if (pilihan == JOptionPane.YES_OPTION) {
                    resetPanelIsiMinyak(panelTopUp);
                }
                else if(spbu.cekSaldoUser(user.getSaldo())){
                    int literCukup = user.getSaldo() / spbu.getTangki().getHarga();
                    String dialogKurangiLiter = "Dengan uang yang Anda miliki, Anda hanya dapat mengisi " + literCukup + " liter \n" +
                            "Apakah Anda tetap ingin mengisi?";
                    pilihan = JOptionPane.showConfirmDialog(this, dialogKurangiLiter, "KURANGI LITER", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    
                    if (pilihan == JOptionPane.YES_OPTION) {
                        liter = literCukup;
                        biaya = liter * spbu.getTangki().getHarga();
                        spbu.isiMinyak(user, liter, biaya);
                        // pop up berhasil
                        JOptionPane.showMessageDialog(this, "Pengisian Bahan Bakar Berhasil Dilakukan", "STATUS TRANSAKSI", JOptionPane.INFORMATION_MESSAGE);                        
                    }
                    else {
                        // pop up gagal
                        JOptionPane.showMessageDialog(this, "Pengisian Bahan Bakar Gagal Dilakukan", "STATUS TRANSAKSI", JOptionPane.ERROR_MESSAGE);
                        //return;
                    }
                    // balek ke panel menu
                    resetPanelIsiMinyak(panelMenu);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Pengisian Bahan Bakar Gagal Dilakukan", "STATUS TRANSAKSI", JOptionPane.ERROR_MESSAGE);
                    resetPanelIsiMinyak(panelMenu);
                }
            } 
            else {
                spbu.isiMinyak(user, liter, biaya);
                // pop up berhasil
                JOptionPane.showMessageDialog(this, "Pengisian Bahan Bakar Berhasil Dilakukan", "STATUS TRANSAKSI", JOptionPane.INFORMATION_MESSAGE);
                // balek ke panel menu
                resetPanelIsiMinyak(panelMenu);
            }
        } 
    }                                         

    private void panelBtnMenu1MouseEntered(java.awt.event.MouseEvent evt) {                                           
        panelBtnMenu1.setBackground(new Color(222, 95, 131));
    }                                          

    private void panelBtnMenu1MouseExited(java.awt.event.MouseEvent evt) {                                          
        panelBtnMenu1.setBackground(new Color(196,69,105));
    }                                         

    private void labelIcon1MouseEntered(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu1.setBackground(new Color(222, 95, 131));
    }                                       

    private void labelMenu1MouseEntered(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu1.setBackground(new Color(222, 95, 131));
    }                                       

    private void panelBtnMenu1MousePressed(java.awt.event.MouseEvent evt) {                                           
        panelBtnMenu1.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                          

    private void labelIcon1MousePressed(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu1.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                       

    private void labelMenu1MousePressed(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu1.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                       

    private void labelIcon2MouseEntered(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu2.setBackground(new Color(222, 95, 131));
    }                                       

    private void labelIcon2MousePressed(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu2.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                       

    private void labelMenu2MouseEntered(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu2.setBackground(new Color(222, 95, 131));
    }                                       

    private void labelMenu2MousePressed(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu2.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                       

    private void panelBtnMenu2MouseEntered(java.awt.event.MouseEvent evt) {                                           
        panelBtnMenu2.setBackground(new Color(222, 95, 131));
    }                                          

    private void panelBtnMenu2MouseExited(java.awt.event.MouseEvent evt) {                                          
        panelBtnMenu2.setBackground(new Color(196,69,105));
    }                                         

    private void panelBtnMenu2MousePressed(java.awt.event.MouseEvent evt) {                                           
        panelBtnMenu2.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                          

    private void labelIcon3MouseEntered(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu3.setBackground(new Color(222, 95, 131));
    }                                       

    private void labelIcon3MousePressed(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu3.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                       

    private void labelMenu3MouseEntered(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu3.setBackground(new Color(222, 95, 131));
    }                                       

    private void labelMenu3MousePressed(java.awt.event.MouseEvent evt) {                                        
        panelBtnMenu3.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                       

    private void panelBtnMenu3MouseEntered(java.awt.event.MouseEvent evt) {                                           
        panelBtnMenu3.setBackground(new Color(222, 95, 131));
    }                                          

    private void panelBtnMenu3MouseExited(java.awt.event.MouseEvent evt) {                                          
        panelBtnMenu3.setBackground(new Color(196,69,105));
    }                                         

    private void panelBtnMenu3MousePressed(java.awt.event.MouseEvent evt) {                                           
        panelBtnMenu3.setBackground(new Color(196,69,105));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }                                          

    public void resetPanelIsiMinyak(JPanel panelTujuan) {
        textFieldJumlahLiter.setText("Masukkan jumlah liter");
        labelIsiUlang.setText("Mohon tunggu sebentar ");
        labelIsiUlang1.setText("Tangki SPBU sedang diisi ulang ");
        buttonGroupBahanBakar.clearSelection();
        labelValidasiLiter.setVisible(false);
        labelIsiUlang.setVisible(false);
        labelIsiUlang1.setVisible(false);
        
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelTujuan);
        panelUtama.repaint();
        panelUtama.revalidate();
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
