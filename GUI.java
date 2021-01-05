import java.awt.Color;
import javax.swing.JFrame;

public class GUI extends javax.swing.JFrame {

    private javax.swing.JButton buttonCekSaldo;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonExit2;
    private javax.swing.JButton buttonIsiMinyak;
    private javax.swing.JButton buttonKembali1;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonProfil;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JButton buttonTopUp;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelCreateAccount;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail2;
    private javax.swing.JLabel labelGoPerta;
    private javax.swing.JLabel labelGoPerta1;
    private javax.swing.JLabel labelGoPerta2;
    private javax.swing.JLabel labelIsiData;
    private javax.swing.JLabel labelJenisKendaraan;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoHP;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword2;
    private javax.swing.JLabel labelValidasi;
    private javax.swing.JPanel panelCekSaldo;
    private javax.swing.JPanel panelFrame;
    private javax.swing.JPanel panelIsiDataUser;
    private javax.swing.JPanel panelIsiMinyak;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelProfil;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JPanel panelTopUp;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField textFieldAlamat;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEmail2;
    private javax.swing.JTextField textFieldJenisKendaraan;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldNoHP;
    
    private User user;
    
    
    public GUI() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")                   
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
        labelIsiData = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        textFieldAlamat = new javax.swing.JTextField();
        labelJenisKendaraan = new javax.swing.JLabel();
        textFieldJenisKendaraan = new javax.swing.JTextField();
        labelNoHP = new javax.swing.JLabel();
        textFieldNoHP = new javax.swing.JTextField();
        buttonRegister = new javax.swing.JButton();
        buttonKembali1 = new javax.swing.JButton();
        panelLogin = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelEmail2 = new javax.swing.JLabel();
        textFieldEmail2 = new javax.swing.JTextField();
        labelPassword2 = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();
        buttonExit2 = new javax.swing.JButton();
        labelGoPerta1 = new javax.swing.JLabel();
        labelValidasi = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        labelGoPerta2 = new javax.swing.JLabel();
        buttonIsiMinyak = new javax.swing.JButton();
        buttonCekSaldo = new javax.swing.JButton();
        buttonTopUp = new javax.swing.JButton();
        buttonProfil = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
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
        panelRegister.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

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

        labelIsiData.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelIsiData.setForeground(new java.awt.Color(252, 243, 243));
        labelIsiData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIsiData.setText("ISI DATA");

        labelNama.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(252, 243, 243));
        labelNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNama.setText("Nama");

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

        labelAlamat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(252, 243, 243));
        labelAlamat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlamat.setText("Alamat");

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

        labelJenisKendaraan.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelJenisKendaraan.setForeground(new java.awt.Color(252, 243, 243));
        labelJenisKendaraan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJenisKendaraan.setText("Jenis Kendaraan");

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

        labelNoHP.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelNoHP.setForeground(new java.awt.Color(252, 243, 243));
        labelNoHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNoHP.setText("No. HP");

        textFieldNoHP.setBackground(new java.awt.Color(252, 243, 243));
        textFieldNoHP.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldNoHP.setText("Masukkan nomor handphone anda"); // NOI18N
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

        javax.swing.GroupLayout panelIsiDataUserLayout = new javax.swing.GroupLayout(panelIsiDataUser);
        panelIsiDataUser.setLayout(panelIsiDataUserLayout);
        panelIsiDataUserLayout.setHorizontalGroup(
            panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelIsiData, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIsiDataUserLayout.createSequentialGroup()
                        .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAlamat)
                            .addComponent(labelNama)
                            .addComponent(labelJenisKendaraan)
                            .addComponent(labelNoHP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldJenisKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                                .addComponent(buttonRegister)
                                .addGap(18, 18, 18)
                                .addComponent(buttonKembali1)))
                        .addGap(18, 18, 18))))
        );
        panelIsiDataUserLayout.setVerticalGroup(
            panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(labelIsiData, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldJenisKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegister)
                    .addComponent(buttonKembali1))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        panelUtama.add(panelIsiDataUser, "card9");

        panelLogin.setBackground(new java.awt.Color(196, 69, 105));
        panelLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelLogin.setToolTipText("");

        labelLogin.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(252, 243, 243));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("LOGIN");

        labelEmail2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelEmail2.setForeground(new java.awt.Color(252, 243, 243));
        labelEmail2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail2.setText("E-mail");

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

        labelPassword2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPassword2.setForeground(new java.awt.Color(252, 243, 243));
        labelPassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPassword2.setText("Password");

        passwordField2.setBackground(new java.awt.Color(252, 243, 243));
        passwordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordField2FocusLost(evt);
            }
        });

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

        labelGoPerta1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        labelGoPerta1.setForeground(new java.awt.Color(252, 243, 243));
        labelGoPerta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta1.setText("goPERTA");

        labelValidasi.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        labelValidasi.setForeground(new java.awt.Color(196, 69, 105));
        labelValidasi.setText("Email atau password yang anda masukkan tidak sesuai");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelGoPerta1))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEmail2)
                                    .addComponent(labelPassword2))
                                .addGap(20, 20, 20)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelLoginLayout.createSequentialGroup()
                                        .addComponent(buttonLogin)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textFieldEmail2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField2)))
                            .addComponent(labelValidasi))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGoPerta1)
                .addGap(145, 145, 145)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEmail2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(textFieldEmail2))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelValidasi)
                .addGap(12, 12, 12)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogin)
                    .addComponent(buttonExit2))
                .addGap(245, 245, 245))
        );

        panelUtama.add(panelLogin, "card3");

        panelMenu.setBackground(new java.awt.Color(196, 69, 105));
        panelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        labelGoPerta2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        labelGoPerta2.setForeground(new java.awt.Color(252, 243, 243));
        labelGoPerta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta2.setText("goPERTA");

        buttonIsiMinyak.setBackground(new java.awt.Color(252, 243, 243));
        buttonIsiMinyak.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonIsiMinyak.setText("Isi Minyak");
        buttonIsiMinyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIsiMinyakActionPerformed(evt);
            }
        });

        buttonCekSaldo.setBackground(new java.awt.Color(252, 243, 243));
        buttonCekSaldo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonCekSaldo.setText("Cek Saldo");
        buttonCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekSaldoActionPerformed(evt);
            }
        });

        buttonTopUp.setBackground(new java.awt.Color(252, 243, 243));
        buttonTopUp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonTopUp.setText("Top Up");
        buttonTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTopUpActionPerformed(evt);
            }
        });

        buttonProfil.setBackground(new java.awt.Color(252, 243, 243));
        buttonProfil.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonProfil.setText("Profil");
        buttonProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProfilActionPerformed(evt);
            }
        });

        buttonLogout.setBackground(new java.awt.Color(252, 243, 243));
        buttonLogout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonLogout.setText("Logout");
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
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMenuLayout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(labelGoPerta2))
                        .addGroup(panelMenuLayout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(buttonIsiMinyak, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(labelGoPerta2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(buttonIsiMinyak, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        panelUtama.add(panelMenu, "card4");

        panelIsiMinyak.setBackground(new java.awt.Color(196, 69, 105));
        panelIsiMinyak.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout panelIsiMinyakLayout = new javax.swing.GroupLayout(panelIsiMinyak);
        panelIsiMinyak.setLayout(panelIsiMinyakLayout);
        panelIsiMinyakLayout.setHorizontalGroup(
            panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        panelIsiMinyakLayout.setVerticalGroup(
            panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        panelUtama.add(panelIsiMinyak, "card5");

        panelCekSaldo.setBackground(new java.awt.Color(196, 69, 105));
        panelCekSaldo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout panelCekSaldoLayout = new javax.swing.GroupLayout(panelCekSaldo);
        panelCekSaldo.setLayout(panelCekSaldoLayout);
        panelCekSaldoLayout.setHorizontalGroup(
            panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        panelCekSaldoLayout.setVerticalGroup(
            panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        panelUtama.add(panelCekSaldo, "card6");

        panelTopUp.setBackground(new java.awt.Color(196, 69, 105));
        panelTopUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout panelTopUpLayout = new javax.swing.GroupLayout(panelTopUp);
        panelTopUp.setLayout(panelTopUpLayout);
        panelTopUpLayout.setHorizontalGroup(
            panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        panelTopUpLayout.setVerticalGroup(
            panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        panelUtama.add(panelTopUp, "card7");

        panelProfil.setBackground(new java.awt.Color(196, 69, 105));
        panelProfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelProfil.setToolTipText("");

        javax.swing.GroupLayout panelProfilLayout = new javax.swing.GroupLayout(panelProfil);
        panelProfil.setLayout(panelProfilLayout);
        panelProfilLayout.setHorizontalGroup(
            panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        panelProfilLayout.setVerticalGroup(
            panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        panelUtama.add(panelProfil, "card8");

        javax.swing.GroupLayout panelFrameLayout = new javax.swing.GroupLayout(panelFrame);
        panelFrame.setLayout(panelFrameLayout);
        panelFrameLayout.setHorizontalGroup(
            panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFrameLayout.setVerticalGroup(
            panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();
        
        panelUtama.add(panelIsiMinyak);
        panelUtama.repaint();
        panelUtama.revalidate();
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
        
        panelUtama.add(panelRegister);
        panelUtama.repaint();
        panelUtama.revalidate();
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

    private void textFieldNoHPFocusGained(java.awt.event.FocusEvent evt) {                                          
        if(textFieldNoHP.getText().equals("Masukkan nomor handphone anda")) {
            textFieldNoHP.setText("");
        }
    }                                         

    private void textFieldNoHPFocusLost(java.awt.event.FocusEvent evt) {                                        
        if(textFieldNoHP.getText().equals("")) {
            textFieldNoHP.setText("Masukkan nomor handphone anda");
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
