import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    private User user;
    private Premium premium = new Premium();
    private Pertalite pertalite = new Pertalite();
    private Pertamax pertamax = new Pertamax();
    private Solar solar = new Solar();
    private SPBU spbu;

    private javax.swing.JButton buttonCekSaldo;
    private javax.swing.JButton buttonEditAlamat;
    private javax.swing.JButton buttonEditEmail;
    private javax.swing.JButton buttonEditJenisKendaraan;
    private javax.swing.JButton buttonEditNama;
    private javax.swing.JButton buttonEditNoHp;
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
    private javax.swing.JButton buttonProfil1;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JButton buttonSaveAlamat;
    private javax.swing.JButton buttonSaveEmail;
    private javax.swing.JButton buttonSaveJenisKendaraan;
    private javax.swing.JButton buttonSaveNama;
    private javax.swing.JButton buttonSaveNoHp;
    private javax.swing.JButton buttonTambahTopUp;
    private javax.swing.JButton buttonTopUp;
    private javax.swing.JButton buttonTopUp2;
    private javax.swing.JCheckBox checkBoxShowPassword;
    private javax.swing.JCheckBox checkBoxShowPassword1;
    private javax.swing.JComboBox<String> comboBoxJenisKendaraan;
    private javax.swing.JComboBox<String> comboBoxJenisKendaraan2;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconEmail2;
    private javax.swing.JLabel iconGoPerta;
    private javax.swing.JLabel iconGoPerta1;
    private javax.swing.JLabel iconIsiMinyak;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconPassword2;
    private javax.swing.JLabel iconProfil;
    private javax.swing.JLabel iconSaldo;
    private javax.swing.JLabel iconTopUp1;
    private javax.swing.JLabel iconTopUp2;
    private javax.swing.JLabel iconTopUp3;
    private javax.swing.JLabel labelAbout;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelAlamatProfil;
    private javax.swing.JLabel labelAlamatProfil1;
    private javax.swing.JLabel labelAnggota;
    private javax.swing.JLabel labelBahanBakar;
    private javax.swing.JLabel labelCreateAccount;
    private javax.swing.JLabel labelDecor;
    private javax.swing.JLabel labelDecor1;
    private javax.swing.JLabel labelDecor2;
    private javax.swing.JLabel labelDecor3;
    private javax.swing.JLabel labelDecor4;
    private javax.swing.JLabel labelEmailProfil;
    private javax.swing.JLabel labelEmailProfil1;
    private javax.swing.JLabel labelGoPerta;
    private javax.swing.JLabel labelGoPerta1;
    private javax.swing.JLabel labelGoPerta2;
    private javax.swing.JLabel labelIcon1;
    private javax.swing.JLabel labelIcon2;
    private javax.swing.JLabel labelIcon3;
    private javax.swing.JLabel labelIcon4;
    private javax.swing.JLabel labelIcon5;
    private javax.swing.JLabel labelIsiData;
    private javax.swing.JLabel labelIsiUlang;
    private javax.swing.JLabel labelIsiUlang1;
    private javax.swing.JLabel labelJenisKendaraan;
    private javax.swing.JLabel labelJenisKendaraanProfil;
    private javax.swing.JLabel labelJenisKendaraanProfil1;
    private javax.swing.JLabel labelJudulSaldo;
    private javax.swing.JLabel labelJudulTopUp;
    private javax.swing.JLabel labelJumlahTopUp;
    private javax.swing.JLabel labelKelompok;
    private javax.swing.JLabel labelLiter;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelMenu1;
    private javax.swing.JLabel labelMenu2;
    private javax.swing.JLabel labelMenu3;
    private javax.swing.JLabel labelMenu4;
    private javax.swing.JLabel labelMenu5;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNamaProfil;
    private javax.swing.JLabel labelNamaProfil1;
    private javax.swing.JLabel labelNoHP;
    private javax.swing.JLabel labelNoHpProfil;
    private javax.swing.JLabel labelNoHpProfil1;
    private javax.swing.JLabel labelRp;
    private javax.swing.JLabel labelRp1;
    private javax.swing.JLabel labelSaldoUser;
    private javax.swing.JLabel labelValidasiCreateAccount;
    private javax.swing.JLabel labelValidasiIsiData;
    private javax.swing.JLabel labelValidasiLiter;
    private javax.swing.JLabel labelValidasiLogin;
    private javax.swing.JLabel labelValidasiTopUp;
    private javax.swing.JLabel labelWelcome1;
    private javax.swing.JLabel labelWelcome2;
    private javax.swing.JPanel panelAbout;
    private javax.swing.JPanel panelBtnMenu1;
    private javax.swing.JPanel panelBtnMenu2;
    private javax.swing.JPanel panelBtnMenu3;
    private javax.swing.JPanel panelBtnMenu4;
    private javax.swing.JPanel panelBtnMenu5;
    private javax.swing.JPanel panelCekSaldo;
    private javax.swing.JPanel panelCreateAccount;
    private javax.swing.JPanel panelEditProfil;
    private javax.swing.JPanel panelFrame;
    private javax.swing.JPanel panelIsiDataUser;
    private javax.swing.JPanel panelIsiMinyak;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelProfil;
    private javax.swing.JPanel panelTopAbout;
    private javax.swing.JPanel panelTopCekSaldo;
    private javax.swing.JPanel panelTopIsiMinyak;
    private javax.swing.JPanel panelTopProfil;
    private javax.swing.JPanel panelTopTopUp;
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
    private javax.swing.JTextField textFieldEditAlamat;
    private javax.swing.JTextField textFieldEditEmail;
    private javax.swing.JTextField textFieldEditNama;
    private javax.swing.JTextField textFieldEditNoHp;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEmail2;
    private javax.swing.JTextField textFieldJumlahLiter;
    private javax.swing.JTextField textFieldJumlahTopUp;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldNoHP;

    public GUI() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        ImageIcon icon = new ImageIcon(getClass().getResource("icons/iconFrame.png"));
        setIconImage(icon.getImage());
        passwordField.setEchoChar((char)0);
        labelValidasiCreateAccount.setVisible(false);
        checkBoxShowPassword.setEnabled(false);
        addPanelUtama();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroupBahanBakar = new javax.swing.ButtonGroup();
        panelFrame = new javax.swing.JPanel();
        panelWelcome = new javax.swing.JPanel();
        labelWelcome1 = new javax.swing.JLabel();
        labelWelcome2 = new javax.swing.JLabel();
        panelUtama = new javax.swing.JPanel();
        panelCreateAccount = new javax.swing.JPanel();
        labelCreateAccount = new javax.swing.JLabel();
        iconEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        iconPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        buttonNext = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        labelGoPerta = new javax.swing.JLabel();
        checkBoxShowPassword = new javax.swing.JCheckBox();
        labelValidasiCreateAccount = new javax.swing.JLabel();
        iconGoPerta = new javax.swing.JLabel();
        panelIsiDataUser = new javax.swing.JPanel();
        labelIsiData = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        textFieldNoHP = new javax.swing.JTextField();
        textFieldAlamat = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        buttonRegister = new javax.swing.JButton();
        buttonKembali1 = new javax.swing.JButton();
        labelAlamat = new javax.swing.JLabel();
        labelJenisKendaraan = new javax.swing.JLabel();
        labelNoHP = new javax.swing.JLabel();
        labelValidasiIsiData = new javax.swing.JLabel();
        comboBoxJenisKendaraan = new javax.swing.JComboBox<>();
        panelLogin = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        textFieldEmail2 = new javax.swing.JTextField();
        iconEmail2 = new javax.swing.JLabel();
        iconPassword2 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        buttonExit2 = new javax.swing.JButton();
        labelValidasiLogin = new javax.swing.JLabel();
        labelGoPerta1 = new javax.swing.JLabel();
        checkBoxShowPassword1 = new javax.swing.JCheckBox();
        iconGoPerta1 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        labelGoPerta2 = new javax.swing.JLabel();
        buttonIsiMinyak = new javax.swing.JButton();
        buttonCekSaldo = new javax.swing.JButton();
        buttonTopUp = new javax.swing.JButton();
        buttonProfil = new javax.swing.JButton();
        buttonProfil1 = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        panelIsiMinyak = new javax.swing.JPanel();
        panelTopIsiMinyak = new javax.swing.JPanel();
        panelBtnMenu1 = new javax.swing.JPanel();
        labelIcon1 = new javax.swing.JLabel();
        labelMenu1 = new javax.swing.JLabel();
        iconIsiMinyak = new javax.swing.JLabel();
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
        labelDecor = new javax.swing.JLabel();
        panelCekSaldo = new javax.swing.JPanel();
        panelTopCekSaldo = new javax.swing.JPanel();
        panelBtnMenu2 = new javax.swing.JPanel();
        labelIcon2 = new javax.swing.JLabel();
        labelMenu2 = new javax.swing.JLabel();
        iconSaldo = new javax.swing.JLabel();
        labelDecor1 = new javax.swing.JLabel();
        labelJudulSaldo = new javax.swing.JLabel();
        labelSaldoUser = new javax.swing.JLabel();
        labelRp = new javax.swing.JLabel();
        buttonTopUp2 = new javax.swing.JButton();
        panelTopUp = new javax.swing.JPanel();
        panelTopTopUp = new javax.swing.JPanel();
        panelBtnMenu3 = new javax.swing.JPanel();
        labelIcon3 = new javax.swing.JLabel();
        labelMenu3 = new javax.swing.JLabel();
        iconTopUp1 = new javax.swing.JLabel();
        iconTopUp2 = new javax.swing.JLabel();
        labelDecor2 = new javax.swing.JLabel();
        labelJudulTopUp = new javax.swing.JLabel();
        labelJumlahTopUp = new javax.swing.JLabel();
        textFieldJumlahTopUp = new javax.swing.JTextField();
        buttonTambahTopUp = new javax.swing.JButton();
        labelValidasiTopUp = new javax.swing.JLabel();
        labelRp1 = new javax.swing.JLabel();
        panelProfil = new javax.swing.JPanel();
        panelEditProfil = new javax.swing.JPanel();
        labelNamaProfil1 = new javax.swing.JLabel();
        labelAlamatProfil1 = new javax.swing.JLabel();
        labelJenisKendaraanProfil1 = new javax.swing.JLabel();
        labelNoHpProfil1 = new javax.swing.JLabel();
        labelEmailProfil1 = new javax.swing.JLabel();
        buttonSaveEmail = new javax.swing.JButton();
        buttonEditNama = new javax.swing.JButton();
        buttonSaveNama = new javax.swing.JButton();
        buttonEditAlamat = new javax.swing.JButton();
        buttonSaveAlamat = new javax.swing.JButton();
        buttonEditJenisKendaraan = new javax.swing.JButton();
        buttonSaveJenisKendaraan = new javax.swing.JButton();
        buttonEditNoHp = new javax.swing.JButton();
        buttonSaveNoHp = new javax.swing.JButton();
        buttonEditEmail = new javax.swing.JButton();
        labelNamaProfil = new javax.swing.JLabel();
        labelAlamatProfil = new javax.swing.JLabel();
        labelJenisKendaraanProfil = new javax.swing.JLabel();
        labelNoHpProfil = new javax.swing.JLabel();
        labelEmailProfil = new javax.swing.JLabel();
        textFieldEditNama = new javax.swing.JTextField();
        textFieldEditEmail = new javax.swing.JTextField();
        textFieldEditAlamat = new javax.swing.JTextField();
        textFieldEditNoHp = new javax.swing.JTextField();
        comboBoxJenisKendaraan2 = new javax.swing.JComboBox<>();
        panelTopProfil = new javax.swing.JPanel();
        panelBtnMenu4 = new javax.swing.JPanel();
        labelIcon4 = new javax.swing.JLabel();
        labelMenu4 = new javax.swing.JLabel();
        iconProfil = new javax.swing.JLabel();
        labelDecor3 = new javax.swing.JLabel();
        panelAbout = new javax.swing.JPanel();
        panelTopAbout = new javax.swing.JPanel();
        panelBtnMenu5 = new javax.swing.JPanel();
        labelIcon5 = new javax.swing.JLabel();
        labelMenu5 = new javax.swing.JLabel();
        iconTopUp3 = new javax.swing.JLabel();
        labelDecor4 = new javax.swing.JLabel();
        labelAbout = new javax.swing.JLabel();
        labelKelompok = new javax.swing.JLabel();
        labelAnggota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("goPERTA");

        panelFrame.setBackground(new java.awt.Color(255, 181, 65));
        panelFrame.setLayout(new java.awt.CardLayout());

        panelWelcome.setBackground(new java.awt.Color(252, 243, 243));
        panelWelcome.setToolTipText("");

        labelWelcome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/goPerta.png"))); // NOI18N
        labelWelcome1.setText("jLabel4");

        labelWelcome2.setFont(new java.awt.Font("Century Gothic", 3, 60)); // NOI18N
        labelWelcome2.setForeground(new java.awt.Color(100, 76, 40));
        labelWelcome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWelcome2.setText("goPERTA");
        labelWelcome2.setToolTipText("");

        javax.swing.GroupLayout panelWelcomeLayout = new javax.swing.GroupLayout(panelWelcome);
        panelWelcome.setLayout(panelWelcomeLayout);
        panelWelcomeLayout.setHorizontalGroup(
                panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelWelcome1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(panelWelcomeLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(labelWelcome2)
                                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelWelcomeLayout.setVerticalGroup(
                panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWelcomeLayout.createSequentialGroup()
                                .addContainerGap(96, Short.MAX_VALUE)
                                .addComponent(labelWelcome2)
                                .addGap(72, 72, 72)
                                .addComponent(labelWelcome1))
        );

        panelFrame.add(panelWelcome, "card3");

        panelUtama.setBackground(new java.awt.Color(255, 181, 65));
        panelUtama.setToolTipText("");
        panelUtama.setLayout(new java.awt.CardLayout());

        panelCreateAccount.setBackground(new java.awt.Color(255, 181, 65));
        panelCreateAccount.setToolTipText("");

        labelCreateAccount.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelCreateAccount.setForeground(new java.awt.Color(100, 76, 40));
        labelCreateAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCreateAccount.setText("CREATE ACCOUNT");

        iconEmail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        iconEmail.setForeground(new java.awt.Color(252, 243, 243));
        iconEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconEmail.png"))); // NOI18N

        textFieldEmail.setBackground(new java.awt.Color(252, 243, 243));
        textFieldEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldEmail.setText("Masukkan email anda"); // NOI18N
        textFieldEmail.setToolTipText("");
        textFieldEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEmailFocusLost(evt);
            }
        });

        iconPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        iconPassword.setForeground(new java.awt.Color(252, 243, 243));
        iconPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconPassword.png"))); // NOI18N

        passwordField.setBackground(new java.awt.Color(252, 243, 243));
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        passwordField.setText("Masukkan password anda");
        passwordField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        buttonNext.setBackground(new java.awt.Color(100, 76, 40));
        buttonNext.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonNext.setForeground(new java.awt.Color(252, 243, 243));
        buttonNext.setText("Next");
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new java.awt.Color(100, 76, 40));
        buttonExit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(252, 243, 243));
        buttonExit.setText("Exit");
        buttonExit.setToolTipText("");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        labelGoPerta.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        labelGoPerta.setForeground(new java.awt.Color(100, 76, 40));
        labelGoPerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta.setText("goPERTA");

        checkBoxShowPassword.setBackground(new java.awt.Color(255, 181, 65));
        checkBoxShowPassword.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        checkBoxShowPassword.setForeground(new java.awt.Color(100, 76, 40));
        checkBoxShowPassword.setText("Show Password");
        checkBoxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowPasswordActionPerformed(evt);
            }
        });

        labelValidasiCreateAccount.setBackground(new java.awt.Color(196, 69, 105));
        labelValidasiCreateAccount.setFont(new java.awt.Font("Century", 2, 12)); // NOI18N
        labelValidasiCreateAccount.setForeground(new java.awt.Color(255, 0, 0));
        labelValidasiCreateAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelValidasiCreateAccount.setText("Email atau password tidak boleh kosong ");
        labelValidasiCreateAccount.setToolTipText("");

        iconGoPerta.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        iconGoPerta.setForeground(new java.awt.Color(100, 76, 40));
        iconGoPerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconGoPerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconFrame32.png"))); // NOI18N
        iconGoPerta.setToolTipText("");

        javax.swing.GroupLayout panelCreateAccountLayout = new javax.swing.GroupLayout(panelCreateAccount);
        panelCreateAccount.setLayout(panelCreateAccountLayout);
        panelCreateAccountLayout.setHorizontalGroup(
                panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCreateAccountLayout.createSequentialGroup()
                                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelCreateAccountLayout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(buttonNext)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(panelCreateAccountLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateAccountLayout.createSequentialGroup()
                                                                .addGap(0, 28, Short.MAX_VALUE)
                                                                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(iconPassword)
                                                                        .addComponent(iconEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(checkBoxShowPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                                                        .addComponent(labelValidasiCreateAccount)
                                                                        .addComponent(textFieldEmail))
                                                                .addGap(20, 20, 20))
                                                        .addGroup(panelCreateAccountLayout.createSequentialGroup()
                                                                .addComponent(labelGoPerta)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(iconGoPerta)))))
                                .addContainerGap())
                        .addComponent(labelCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCreateAccountLayout.setVerticalGroup(
                panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCreateAccountLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelGoPerta)
                                        .addComponent(iconGoPerta))
                                .addGap(56, 56, 56)
                                .addComponent(labelCreateAccount)
                                .addGap(51, 51, 51)
                                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(iconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(iconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBoxShowPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelValidasiCreateAccount)
                                .addGap(17, 17, 17)
                                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonNext)
                                        .addComponent(buttonExit))
                                .addContainerGap(170, Short.MAX_VALUE))
        );

        panelUtama.add(panelCreateAccount, "card2");

        panelIsiDataUser.setBackground(new java.awt.Color(255, 181, 65));

        labelIsiData.setBackground(new java.awt.Color(255, 181, 65));
        labelIsiData.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelIsiData.setForeground(new java.awt.Color(100, 76, 40));
        labelIsiData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIsiData.setText("ISI DATA");

        labelNama.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelNama.setForeground(new java.awt.Color(100, 76, 40));
        labelNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNama.setText("Nama");

        textFieldNoHP.setBackground(new java.awt.Color(252, 243, 243));
        textFieldNoHP.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldNoHP.setText("Masukkan nomor hp anda"); // NOI18N
        textFieldNoHP.setToolTipText("");
        textFieldNoHP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textFieldNoHP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNoHPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNoHPFocusLost(evt);
            }
        });

        textFieldAlamat.setBackground(new java.awt.Color(252, 243, 243));
        textFieldAlamat.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldAlamat.setText("Masukkan alamat anda"); // NOI18N
        textFieldAlamat.setToolTipText("");
        textFieldAlamat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textFieldAlamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldAlamatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldAlamatFocusLost(evt);
            }
        });

        textFieldNama.setBackground(new java.awt.Color(252, 243, 243));
        textFieldNama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldNama.setText("Masukkan nama anda"); // NOI18N
        textFieldNama.setToolTipText("");
        textFieldNama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textFieldNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNamaFocusLost(evt);
            }
        });

        buttonRegister.setBackground(new java.awt.Color(100, 76, 40));
        buttonRegister.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(252, 243, 243));
        buttonRegister.setText("Register");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        buttonKembali1.setBackground(new java.awt.Color(100, 76, 40));
        buttonKembali1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonKembali1.setForeground(new java.awt.Color(252, 243, 243));
        buttonKembali1.setText("Kembali");
        buttonKembali1.setToolTipText("");
        buttonKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembali1ActionPerformed(evt);
            }
        });

        labelAlamat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(100, 76, 40));
        labelAlamat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlamat.setText("Alamat");

        labelJenisKendaraan.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelJenisKendaraan.setForeground(new java.awt.Color(100, 76, 40));
        labelJenisKendaraan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJenisKendaraan.setText("Jenis Kendaraan");
        labelJenisKendaraan.setToolTipText("");

        labelNoHP.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelNoHP.setForeground(new java.awt.Color(100, 76, 40));
        labelNoHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNoHP.setText("No. HP");

        labelValidasiIsiData.setBackground(new java.awt.Color(255, 181, 65));
        labelValidasiIsiData.setFont(new java.awt.Font("Century", 2, 12)); // NOI18N
        labelValidasiIsiData.setForeground(new java.awt.Color(255, 0, 0));
        labelValidasiIsiData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelValidasiIsiData.setText("Data tidak boleh kosong. ");
        labelValidasiIsiData.setToolTipText("");

        comboBoxJenisKendaraan.setBackground(new java.awt.Color(252, 243, 243));
        comboBoxJenisKendaraan.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        comboBoxJenisKendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sepeda Motor", "Mobil", "Truk", "Bus", "Lainnya" }));
        comboBoxJenisKendaraan.setToolTipText("");

        javax.swing.GroupLayout panelIsiDataUserLayout = new javax.swing.GroupLayout(panelIsiDataUser);
        panelIsiDataUser.setLayout(panelIsiDataUserLayout);
        panelIsiDataUserLayout.setHorizontalGroup(
                panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(labelIsiData, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelNama)
                                                        .addComponent(labelJenisKendaraan)
                                                        .addComponent(labelNoHP)
                                                        .addComponent(labelAlamat))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(labelValidasiIsiData)
                                                        .addComponent(textFieldNama)
                                                        .addComponent(textFieldAlamat)
                                                        .addComponent(textFieldNoHP, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                                        .addGroup(panelIsiDataUserLayout.createSequentialGroup()
                                                                .addComponent(buttonRegister)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonKembali1))
                                                        .addComponent(comboBoxJenisKendaraan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(16, Short.MAX_VALUE))
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
                                        .addComponent(labelJenisKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBoxJenisKendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                .addGap(13, 13, 13)
                                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textFieldNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labelValidasiIsiData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelIsiDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonRegister)
                                        .addComponent(buttonKembali1))
                                .addContainerGap(133, Short.MAX_VALUE))
        );

        panelUtama.add(panelIsiDataUser, "card2");

        panelLogin.setBackground(new java.awt.Color(255, 181, 65));

        labelLogin.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(100, 76, 40));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("LOGIN");

        passwordField2.setBackground(new java.awt.Color(252, 243, 243));
        passwordField2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        passwordField2.setText("Masukkan password anda");
        passwordField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        passwordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordField2FocusLost(evt);
            }
        });
        passwordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordField2KeyTyped(evt);
            }
        });

        textFieldEmail2.setBackground(new java.awt.Color(252, 243, 243));
        textFieldEmail2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textFieldEmail2.setText("Masukkan email anda");
        textFieldEmail2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textFieldEmail2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEmail2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEmail2FocusLost(evt);
            }
        });

        iconEmail2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        iconEmail2.setForeground(new java.awt.Color(100, 76, 40));
        iconEmail2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconEmail2.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconEmail.png"))); // NOI18N

        iconPassword2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        iconPassword2.setForeground(new java.awt.Color(100, 76, 40));
        iconPassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconPassword.png"))); // NOI18N

        buttonLogin.setBackground(new java.awt.Color(100, 76, 40));
        buttonLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(252, 243, 243));
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonExit2.setBackground(new java.awt.Color(100, 76, 40));
        buttonExit2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonExit2.setForeground(new java.awt.Color(252, 243, 243));
        buttonExit2.setText("Exit");
        buttonExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExit2ActionPerformed(evt);
            }
        });

        labelValidasiLogin.setFont(new java.awt.Font("Century", 2, 12)); // NOI18N
        labelValidasiLogin.setForeground(new java.awt.Color(255, 0, 0));
        labelValidasiLogin.setText("Email atau password salah ");

        labelGoPerta1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        labelGoPerta1.setForeground(new java.awt.Color(100, 76, 40));
        labelGoPerta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta1.setText("goPERTA");

        checkBoxShowPassword1.setBackground(new java.awt.Color(255, 181, 65));
        checkBoxShowPassword1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        checkBoxShowPassword1.setForeground(new java.awt.Color(100, 76, 40));
        checkBoxShowPassword1.setText("Show Password");
        checkBoxShowPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowPassword1ActionPerformed(evt);
            }
        });

        iconGoPerta1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        iconGoPerta1.setForeground(new java.awt.Color(100, 76, 40));
        iconGoPerta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconGoPerta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconFrame32.png"))); // NOI18N
        iconGoPerta1.setToolTipText("");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
                panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLoginLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(labelGoPerta1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(iconGoPerta1))
                                        .addGroup(panelLoginLayout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(buttonLogin)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(iconEmail2)
                                        .addComponent(iconPassword2))
                                .addGap(18, 18, 18)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelValidasiLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(checkBoxShowPassword1)
                                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textFieldEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
                panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelGoPerta1)
                                        .addComponent(iconGoPerta1))
                                .addGap(56, 56, 56)
                                .addComponent(labelLogin)
                                .addGap(54, 54, 54)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(iconEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(iconPassword2)
                                        .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(checkBoxShowPassword1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelValidasiLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonExit2)
                                        .addComponent(buttonLogin))
                                .addContainerGap(169, Short.MAX_VALUE))
        );

        panelUtama.add(panelLogin, "card2");

        panelMenu.setBackground(new java.awt.Color(255, 181, 65));

        labelGoPerta2.setBackground(new java.awt.Color(255, 181, 65));
        labelGoPerta2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        labelGoPerta2.setForeground(new java.awt.Color(100, 76, 40));
        labelGoPerta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoPerta2.setText("goPERTA");

        buttonIsiMinyak.setBackground(new java.awt.Color(252, 243, 243));
        buttonIsiMinyak.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buttonIsiMinyak.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconFuel.png"))); // NOI18N
        buttonIsiMinyak.setText("Isi Minyak");
        buttonIsiMinyak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIsiMinyak.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonIsiMinyak.setIconTextGap(27);
        buttonIsiMinyak.setInheritsPopupMenu(true);
        buttonIsiMinyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIsiMinyakActionPerformed(evt);
            }
        });

        buttonCekSaldo.setBackground(new java.awt.Color(252, 243, 243));
        buttonCekSaldo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buttonCekSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconSaldo.png"))); // NOI18N
        buttonCekSaldo.setText("Cek Saldo");
        buttonCekSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCekSaldo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonCekSaldo.setIconTextGap(23);
        buttonCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekSaldoActionPerformed(evt);
            }
        });

        buttonTopUp.setBackground(new java.awt.Color(252, 243, 243));
        buttonTopUp.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buttonTopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconTopUp.png"))); // NOI18N
        buttonTopUp.setText("Top Up");
        buttonTopUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTopUp.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonTopUp.setIconTextGap(38);
        buttonTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTopUpActionPerformed(evt);
            }
        });

        buttonProfil.setBackground(new java.awt.Color(252, 243, 243));
        buttonProfil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buttonProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconProfile.png"))); // NOI18N
        buttonProfil.setText("Profil");
        buttonProfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonProfil.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonProfil.setIconTextGap(48);
        buttonProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProfilActionPerformed(evt);
            }
        });

        buttonProfil1.setBackground(new java.awt.Color(252, 243, 243));
        buttonProfil1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buttonProfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconAbout3.png"))); // NOI18N
        buttonProfil1.setText("About");
        buttonProfil1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonProfil1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonProfil1.setIconTextGap(42);
        buttonProfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProfil1ActionPerformed(evt);
            }
        });

        buttonLogout.setBackground(new java.awt.Color(252, 243, 243));
        buttonLogout.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconLogOut.png"))); // NOI18N
        buttonLogout.setText("Logout");
        buttonLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonLogout.setIconTextGap(38);
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
                                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(buttonProfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonTopUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonCekSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(buttonIsiMinyak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonProfil1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(67, 67, 67))
                        .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(labelGoPerta2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
                panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(labelGoPerta2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(buttonIsiMinyak, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonProfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(49, Short.MAX_VALUE))
        );

        panelUtama.add(panelMenu, "card2");

        panelIsiMinyak.setBackground(new java.awt.Color(252, 243, 243));
        panelIsiMinyak.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelTopIsiMinyak.setBackground(new java.awt.Color(255, 181, 65));

        panelBtnMenu1.setBackground(new java.awt.Color(255, 181, 65));
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
        labelIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/menuIcon2.png"))); // NOI18N
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        iconIsiMinyak.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconFuel.png"))); // NOI18N

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

        labelBahanBakar.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        labelBahanBakar.setForeground(new java.awt.Color(100, 76, 40));
        labelBahanBakar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBahanBakar.setText("PILIH JENIS BAHAN BAKAR");

        radioButtonPremium.setBackground(new java.awt.Color(252, 243, 243));
        buttonGroupBahanBakar.add(radioButtonPremium);
        radioButtonPremium.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioButtonPremium.setText("Premium");

        radioButtonPertalite.setBackground(new java.awt.Color(252, 243, 243));
        buttonGroupBahanBakar.add(radioButtonPertalite);
        radioButtonPertalite.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioButtonPertalite.setText("Pertalite");

        radioButtonPertamax.setBackground(new java.awt.Color(252, 243, 243));
        buttonGroupBahanBakar.add(radioButtonPertamax);
        radioButtonPertamax.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioButtonPertamax.setText("Pertamax");

        radioButtonSolar.setBackground(new java.awt.Color(252, 243, 243));
        buttonGroupBahanBakar.add(radioButtonSolar);
        radioButtonSolar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioButtonSolar.setText("Solar");

        labelLiter.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        labelLiter.setForeground(new java.awt.Color(100, 76, 40));
        labelLiter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLiter.setText("LITER BAHAN BAKAR");

        textFieldJumlahLiter.setBackground(new java.awt.Color(252, 243, 243));
        textFieldJumlahLiter.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldJumlahLiter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldJumlahLiter.setText("Masukkan jumlah liter");
        textFieldJumlahLiter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textFieldJumlahLiter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldJumlahLiterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldJumlahLiterFocusLost(evt);
            }
        });

        buttonIsi.setBackground(new java.awt.Color(255, 181, 65));
        buttonIsi.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonIsi.setForeground(new java.awt.Color(100, 76, 40));
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

        labelDecor.setBackground(new java.awt.Color(255, 255, 255));
        labelDecor.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/decor.png"))); // NOI18N

        javax.swing.GroupLayout panelIsiMinyakLayout = new javax.swing.GroupLayout(panelIsiMinyak);
        panelIsiMinyak.setLayout(panelIsiMinyakLayout);
        panelIsiMinyakLayout.setHorizontalGroup(
                panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIsiMinyakLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelIsiMinyakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelBahanBakar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(labelLiter, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGroup(panelIsiMinyakLayout.createSequentialGroup()
                                .addComponent(labelDecor)
                                .addGap(0, 0, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(labelDecor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelUtama.add(panelIsiMinyak, "card2");

        panelCekSaldo.setBackground(new java.awt.Color(252, 243, 243));

        panelTopCekSaldo.setBackground(new java.awt.Color(255, 181, 65));

        panelBtnMenu2.setBackground(new java.awt.Color(255, 181, 65));
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
        labelIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/menuIcon2.png"))); // NOI18N
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        iconSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconSaldo.png"))); // NOI18N

        javax.swing.GroupLayout panelTopCekSaldoLayout = new javax.swing.GroupLayout(panelTopCekSaldo);
        panelTopCekSaldo.setLayout(panelTopCekSaldoLayout);
        panelTopCekSaldoLayout.setHorizontalGroup(
                panelTopCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopCekSaldoLayout.createSequentialGroup()
                                .addComponent(panelBtnMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iconSaldo)
                                .addContainerGap())
        );
        panelTopCekSaldoLayout.setVerticalGroup(
                panelTopCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBtnMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopCekSaldoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        labelDecor1.setBackground(new java.awt.Color(255, 255, 255));
        labelDecor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/decor.png"))); // NOI18N

        labelJudulSaldo.setFont(new java.awt.Font("Century Gothic", 3, 34)); // NOI18N
        labelJudulSaldo.setForeground(new java.awt.Color(100, 76, 40));
        labelJudulSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudulSaldo.setText("SALDO PERTApay");

        labelSaldoUser.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        labelSaldoUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSaldoUser.setText("Saldo User");

        labelRp.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelRp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRp.setText("Rp");

        buttonTopUp2.setBackground(new java.awt.Color(255, 181, 65));
        buttonTopUp2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonTopUp2.setForeground(new java.awt.Color(100, 76, 40));
        buttonTopUp2.setText("TOP UP");
        buttonTopUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTopUp2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCekSaldoLayout = new javax.swing.GroupLayout(panelCekSaldo);
        panelCekSaldo.setLayout(panelCekSaldoLayout);
        panelCekSaldoLayout.setHorizontalGroup(
                panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelTopCekSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCekSaldoLayout.createSequentialGroup()
                                .addGroup(panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelDecor1)
                                        .addGroup(panelCekSaldoLayout.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addComponent(buttonTopUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCekSaldoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelJudulSaldo)
                                        .addGroup(panelCekSaldoLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(labelRp)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelSaldoUser)))
                                .addGap(38, 38, 38))
        );
        panelCekSaldoLayout.setVerticalGroup(
                panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCekSaldoLayout.createSequentialGroup()
                                .addComponent(panelTopCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(labelJudulSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(panelCekSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSaldoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelRp))
                                .addGap(48, 48, 48)
                                .addComponent(buttonTopUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addComponent(labelDecor1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelUtama.add(panelCekSaldo, "card2");

        panelTopUp.setBackground(new java.awt.Color(252, 243, 243));

        panelTopTopUp.setBackground(new java.awt.Color(255, 181, 65));

        panelBtnMenu3.setBackground(new java.awt.Color(255, 181, 65));
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
        labelIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/menuIcon2.png"))); // NOI18N
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        iconTopUp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconTopUp.png"))); // NOI18N

        iconTopUp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconSaldo.png"))); // NOI18N

        javax.swing.GroupLayout panelTopTopUpLayout = new javax.swing.GroupLayout(panelTopTopUp);
        panelTopTopUp.setLayout(panelTopTopUpLayout);
        panelTopTopUpLayout.setHorizontalGroup(
                panelTopTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopTopUpLayout.createSequentialGroup()
                                .addComponent(panelBtnMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iconTopUp2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconTopUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
        );
        panelTopTopUpLayout.setVerticalGroup(
                panelTopTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBtnMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTopTopUpLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelTopTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(iconTopUp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(iconTopUp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        labelDecor2.setBackground(new java.awt.Color(255, 255, 255));
        labelDecor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/decor.png"))); // NOI18N

        labelJudulTopUp.setFont(new java.awt.Font("Century Gothic", 3, 34)); // NOI18N
        labelJudulTopUp.setForeground(new java.awt.Color(100, 76, 40));
        labelJudulTopUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudulTopUp.setText("TOP UP PERTApay");

        labelJumlahTopUp.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        labelJumlahTopUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJumlahTopUp.setText("Jumlah Top Up");
        labelJumlahTopUp.setToolTipText("");

        textFieldJumlahTopUp.setBackground(new java.awt.Color(252, 243, 243));
        textFieldJumlahTopUp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldJumlahTopUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldJumlahTopUp.setText("Masukkan jumlah top up");
        textFieldJumlahTopUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textFieldJumlahTopUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldJumlahTopUpFocusGained(evt);
            }
        });

        buttonTambahTopUp.setBackground(new java.awt.Color(255, 181, 65));
        buttonTambahTopUp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonTambahTopUp.setForeground(new java.awt.Color(100, 76, 40));
        buttonTambahTopUp.setText("TOP UP");
        buttonTambahTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahTopUpActionPerformed(evt);
            }
        });

        labelValidasiTopUp.setBackground(new java.awt.Color(196, 69, 105));
        labelValidasiTopUp.setFont(new java.awt.Font("Century", 2, 12)); // NOI18N
        labelValidasiTopUp.setForeground(new java.awt.Color(255, 0, 0));
        labelValidasiTopUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValidasiTopUp.setText("Mohon input bilangan bulat 1 sampai 1000 ");
        labelValidasiTopUp.setToolTipText("");

        labelRp1.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelRp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRp1.setText("Rp");

        javax.swing.GroupLayout panelTopUpLayout = new javax.swing.GroupLayout(panelTopUp);
        panelTopUp.setLayout(panelTopUpLayout);
        panelTopUpLayout.setHorizontalGroup(
                panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopUpLayout.createSequentialGroup()
                                .addComponent(labelDecor2)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(panelTopTopUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTopUpLayout.createSequentialGroup()
                                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelTopUpLayout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addComponent(buttonTambahTopUp))
                                        .addGroup(panelTopUpLayout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(labelValidasiTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopUpLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopUpLayout.createSequentialGroup()
                                                .addComponent(labelJumlahTopUp)
                                                .addGap(113, 113, 113))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopUpLayout.createSequentialGroup()
                                                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(labelJudulTopUp)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTopUpLayout.createSequentialGroup()
                                                                .addComponent(labelRp1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(textFieldJumlahTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(36, 36, 36))))
        );
        panelTopUpLayout.setVerticalGroup(
                panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopUpLayout.createSequentialGroup()
                                .addComponent(panelTopTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(labelJudulTopUp)
                                .addGap(18, 18, 18)
                                .addComponent(labelJumlahTopUp)
                                .addGap(18, 18, 18)
                                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textFieldJumlahTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelRp1))
                                .addGap(18, 18, 18)
                                .addComponent(labelValidasiTopUp)
                                .addGap(18, 18, 18)
                                .addComponent(buttonTambahTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addComponent(labelDecor2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelUtama.add(panelTopUp, "card2");

        panelProfil.setBackground(new java.awt.Color(252, 243, 243));
        panelProfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelEditProfil.setBackground(new java.awt.Color(252, 243, 243));
        panelEditProfil.setLayout(null);

        labelNamaProfil1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelNamaProfil1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNamaProfil1.setText("Nama");

        panelEditProfil.add(labelNamaProfil1);
        labelNamaProfil1.setBounds(140, 60, 210, 20);

        labelAlamatProfil1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelAlamatProfil1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAlamatProfil1.setText("Alamat");
        panelEditProfil.add(labelAlamatProfil1);
        labelAlamatProfil1.setBounds(140, 130, 210, 33);

        labelJenisKendaraanProfil1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelJenisKendaraanProfil1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelJenisKendaraanProfil1.setText("Jenis Kendaraan");
        panelEditProfil.add(labelJenisKendaraanProfil1);
        labelJenisKendaraanProfil1.setBounds(140, 210, 180, 20);

        labelNoHpProfil1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelNoHpProfil1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNoHpProfil1.setText("No. HP");
        panelEditProfil.add(labelNoHpProfil1);
        labelNoHpProfil1.setBounds(140, 290, 210, 20);

        labelEmailProfil1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelEmailProfil1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEmailProfil1.setText("E-Mail");
        panelEditProfil.add(labelEmailProfil1);
        labelEmailProfil1.setBounds(140, 370, 210, 20);

        buttonSaveEmail.setBackground(new java.awt.Color(255, 181, 65));
        buttonSaveEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonSaveEmail.setForeground(new java.awt.Color(100, 76, 40));
        buttonSaveEmail.setText("Save");
        buttonSaveEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveEmailActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonSaveEmail);
        buttonSaveEmail.setBounds(240, 410, 70, 20);

        buttonEditNama.setBackground(new java.awt.Color(255, 181, 65));
        buttonEditNama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonEditNama.setForeground(new java.awt.Color(100, 76, 40));
        buttonEditNama.setText("Edit");
        buttonEditNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditNamaActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonEditNama);
        buttonEditNama.setBounds(140, 90, 70, 20);

        buttonSaveNama.setBackground(new java.awt.Color(255, 181, 65));
        buttonSaveNama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonSaveNama.setForeground(new java.awt.Color(100, 76, 40));
        buttonSaveNama.setText("Save");
        buttonSaveNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveNamaActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonSaveNama);
        buttonSaveNama.setBounds(240, 90, 70, 20);

        buttonEditAlamat.setBackground(new java.awt.Color(255, 181, 65));
        buttonEditAlamat.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonEditAlamat.setForeground(new java.awt.Color(100, 76, 40));
        buttonEditAlamat.setText("Edit");
        buttonEditAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditAlamatActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonEditAlamat);
        buttonEditAlamat.setBounds(140, 170, 70, 20);

        buttonSaveAlamat.setBackground(new java.awt.Color(255, 181, 65));
        buttonSaveAlamat.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonSaveAlamat.setForeground(new java.awt.Color(100, 76, 40));
        buttonSaveAlamat.setText("Save");
        buttonSaveAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveAlamatActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonSaveAlamat);
        buttonSaveAlamat.setBounds(240, 170, 70, 20);

        buttonEditJenisKendaraan.setBackground(new java.awt.Color(255, 181, 65));
        buttonEditJenisKendaraan.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonEditJenisKendaraan.setForeground(new java.awt.Color(100, 76, 40));
        buttonEditJenisKendaraan.setText("Edit");
        buttonEditJenisKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditJenisKendaraanActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonEditJenisKendaraan);
        buttonEditJenisKendaraan.setBounds(140, 250, 70, 20);

        buttonSaveJenisKendaraan.setBackground(new java.awt.Color(255, 181, 65));
        buttonSaveJenisKendaraan.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonSaveJenisKendaraan.setForeground(new java.awt.Color(100, 76, 40));
        buttonSaveJenisKendaraan.setText("Save");
        buttonSaveJenisKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveJenisKendaraanActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonSaveJenisKendaraan);
        buttonSaveJenisKendaraan.setBounds(240, 250, 70, 20);

        buttonEditNoHp.setBackground(new java.awt.Color(255, 181, 65));
        buttonEditNoHp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonEditNoHp.setForeground(new java.awt.Color(100, 76, 40));
        buttonEditNoHp.setText("Edit");
        buttonEditNoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditNoHpActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonEditNoHp);
        buttonEditNoHp.setBounds(140, 330, 70, 20);

        buttonSaveNoHp.setBackground(new java.awt.Color(255, 181, 65));
        buttonSaveNoHp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonSaveNoHp.setForeground(new java.awt.Color(100, 76, 40));
        buttonSaveNoHp.setText("Save");
        buttonSaveNoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveNoHpActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonSaveNoHp);
        buttonSaveNoHp.setBounds(240, 330, 70, 20);

        buttonEditEmail.setBackground(new java.awt.Color(255, 181, 65));
        buttonEditEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonEditEmail.setForeground(new java.awt.Color(100, 76, 40));
        buttonEditEmail.setText("Edit");
        buttonEditEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditEmailActionPerformed(evt);
            }
        });
        panelEditProfil.add(buttonEditEmail);
        buttonEditEmail.setBounds(140, 410, 70, 20);

        labelNamaProfil.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelNamaProfil.setForeground(new java.awt.Color(100, 76, 40));
        labelNamaProfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNamaProfil.setText(" Nama                    :");
        panelEditProfil.add(labelNamaProfil);
        labelNamaProfil.setBounds(0, 60, 140, 19);

        labelAlamatProfil.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelAlamatProfil.setForeground(new java.awt.Color(100, 76, 40));
        labelAlamatProfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAlamatProfil.setText(" Alamat                  :");
        panelEditProfil.add(labelAlamatProfil);
        labelAlamatProfil.setBounds(0, 130, 131, 33);

        labelJenisKendaraanProfil.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelJenisKendaraanProfil.setForeground(new java.awt.Color(100, 76, 40));
        labelJenisKendaraanProfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelJenisKendaraanProfil.setText(" Jenis Kendaraan  :");
        labelJenisKendaraanProfil.setToolTipText("");
        panelEditProfil.add(labelJenisKendaraanProfil);
        labelJenisKendaraanProfil.setBounds(0, 210, 140, 20);

        labelNoHpProfil.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelNoHpProfil.setForeground(new java.awt.Color(100, 76, 40));
        labelNoHpProfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNoHpProfil.setText(" No. HP                   :");
        panelEditProfil.add(labelNoHpProfil);
        labelNoHpProfil.setBounds(0, 290, 140, 19);

        labelEmailProfil.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelEmailProfil.setForeground(new java.awt.Color(100, 76, 40));
        labelEmailProfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEmailProfil.setText(" E-Mail                    :");
        labelEmailProfil.setToolTipText("");
        panelEditProfil.add(labelEmailProfil);
        labelEmailProfil.setBounds(0, 360, 131, 33);

        textFieldEditNama.setBackground(new java.awt.Color(252, 243, 243));
        textFieldEditNama.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldEditNama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textFieldEditNama.setText("jTextField1");
        textFieldEditNama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textFieldEditNama.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelEditProfil.add(textFieldEditNama);
        textFieldEditNama.setBounds(140, 60, 210, 23);

        textFieldEditEmail.setBackground(new java.awt.Color(252, 243, 243));
        textFieldEditEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldEditEmail.setText("jTextField1");
        textFieldEditEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelEditProfil.add(textFieldEditEmail);
        textFieldEditEmail.setBounds(140, 370, 210, 23);

        textFieldEditAlamat.setBackground(new java.awt.Color(252, 243, 243));
        textFieldEditAlamat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldEditAlamat.setText("jTextField1");
        textFieldEditAlamat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelEditProfil.add(textFieldEditAlamat);
        textFieldEditAlamat.setBounds(140, 140, 210, 23);

        textFieldEditNoHp.setBackground(new java.awt.Color(252, 243, 243));
        textFieldEditNoHp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldEditNoHp.setText("jTextField1");
        textFieldEditNoHp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelEditProfil.add(textFieldEditNoHp);
        textFieldEditNoHp.setBounds(140, 290, 210, 23);

        comboBoxJenisKendaraan2.setBackground(new java.awt.Color(252, 243, 243));
        comboBoxJenisKendaraan2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboBoxJenisKendaraan2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sepeda Motor", "Mobil", "Truk", "Bus", "Lainnya" }));

        panelEditProfil.add(comboBoxJenisKendaraan2);
        comboBoxJenisKendaraan2.setBounds(140, 210, 210, 25);

        panelTopProfil.setBackground(new java.awt.Color(255, 181, 65));
        panelTopProfil.setLayout(null);

        panelBtnMenu4.setBackground(new java.awt.Color(255, 181, 65));
        panelBtnMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtnMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnMenu4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnMenu4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBtnMenu4MousePressed(evt);
            }
        });

        labelIcon4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/menuIcon2.png"))); // NOI18N
        labelIcon4.setToolTipText("");
        labelIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIcon4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelIcon4MousePressed(evt);
            }
        });

        labelMenu4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelMenu4.setText("MENU");
        labelMenu4.setToolTipText("");
        labelMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMenu4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMenu4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnMenu4Layout = new javax.swing.GroupLayout(panelBtnMenu4);
        panelBtnMenu4.setLayout(panelBtnMenu4Layout);
        panelBtnMenu4Layout.setHorizontalGroup(
                panelBtnMenu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBtnMenu4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelIcon4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMenu4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBtnMenu4Layout.setVerticalGroup(
                panelBtnMenu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnMenu4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelBtnMenu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelMenu4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(167, 167, 167))
        );

        panelTopProfil.add(panelBtnMenu4);
        panelBtnMenu4.setBounds(0, 0, 101, 54);

        iconProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconProfile.png"))); // NOI18N
        panelTopProfil.add(iconProfil);
        iconProfil.setBounds(320, 0, 40, 50);

        panelEditProfil.add(panelTopProfil);
        panelTopProfil.setBounds(0, 0, 359, 50);

        labelDecor3.setBackground(new java.awt.Color(252, 243, 243));
        labelDecor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/decor.png"))); // NOI18N

        javax.swing.GroupLayout panelProfilLayout = new javax.swing.GroupLayout(panelProfil);
        panelProfil.setLayout(panelProfilLayout);
        panelProfilLayout.setHorizontalGroup(
                panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelEditProfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDecor3)
        );
        panelProfilLayout.setVerticalGroup(
                panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelProfilLayout.createSequentialGroup()
                                .addComponent(panelEditProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDecor3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelUtama.add(panelProfil, "card2");

        panelAbout.setBackground(new java.awt.Color(252, 243, 243));

        panelTopAbout.setBackground(new java.awt.Color(255, 181, 65));

        panelBtnMenu5.setBackground(new java.awt.Color(255, 181, 65));
        panelBtnMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtnMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnMenu5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnMenu5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBtnMenu5MousePressed(evt);
            }
        });

        labelIcon5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/menuIcon2.png"))); // NOI18N
        labelIcon5.setToolTipText("");
        labelIcon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIcon5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelIcon5MousePressed(evt);
            }
        });

        labelMenu5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelMenu5.setText("MENU");
        labelMenu5.setToolTipText("");
        labelMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMenu5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMenu5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnMenu5Layout = new javax.swing.GroupLayout(panelBtnMenu5);
        panelBtnMenu5.setLayout(panelBtnMenu5Layout);
        panelBtnMenu5Layout.setHorizontalGroup(
                panelBtnMenu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBtnMenu5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelIcon5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMenu5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBtnMenu5Layout.setVerticalGroup(
                panelBtnMenu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnMenu5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelBtnMenu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelIcon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelMenu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        iconTopUp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/iconAbout3.png"))); // NOI18N

        javax.swing.GroupLayout panelTopAboutLayout = new javax.swing.GroupLayout(panelTopAbout);
        panelTopAbout.setLayout(panelTopAboutLayout);
        panelTopAboutLayout.setHorizontalGroup(
                panelTopAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopAboutLayout.createSequentialGroup()
                                .addComponent(panelBtnMenu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iconTopUp3)
                                .addGap(6, 6, 6))
        );
        panelTopAboutLayout.setVerticalGroup(
                panelTopAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBtnMenu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTopAboutLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconTopUp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        labelDecor4.setBackground(new java.awt.Color(252, 243, 243));
        labelDecor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/decor.png"))); // NOI18N

        labelAbout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAbout.setText("jLabel1");
        labelAbout.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelKelompok.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelKelompok.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKelompok.setText("CONTROL-Z");
        labelKelompok.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelKelompok.setIconTextGap(20);

        labelAnggota.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelAnggota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAnggota.setText("jLabel1");
        labelAnggota.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelAboutLayout = new javax.swing.GroupLayout(panelAbout);
        panelAbout.setLayout(panelAboutLayout);
        panelAboutLayout.setHorizontalGroup(
                panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAboutLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelAnggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelAboutLayout.createSequentialGroup()
                                                .addComponent(labelKelompok)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(panelAboutLayout.createSequentialGroup()
                                .addGroup(panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(panelTopAbout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelDecor4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAboutLayout.setVerticalGroup(
                panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAboutLayout.createSequentialGroup()
                                .addComponent(panelTopAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelKelompok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDecor4))
        );

        panelUtama.add(panelAbout, "card11");

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

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {
        if(passwordField.getText().equals("Masukkan password anda")) {
            passwordField.setText("");
            passwordField.setEchoChar('\u25cf');
        }
    }

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {
        String email = textFieldEmail.getText();
        String password = String.valueOf(passwordField.getPassword());

        if(email.equals("Masukkan email anda") || password.equals("Masukkan password anda")) {
            labelValidasiCreateAccount.setVisible(true);
            return;
        }
        else {
            labelValidasiCreateAccount.setVisible(false);
        }
        user = new User(email, password);

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        labelValidasiIsiData.setVisible(false);
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
        String jenisKendaraan = (String) comboBoxJenisKendaraan.getSelectedItem();
        String noHp = textFieldNoHP.getText();

        if(nama.equals("Masukkan nama anda")
                || alamat.equals("Masukkan alamat anda")
                || noHp.equals("Masukkan nomor hp anda")) {

            labelValidasiIsiData.setVisible(true);
            return;
        } else {
            labelValidasiIsiData.setVisible(false);
        }

        user.setNama(nama);
        user.setAlamat(alamat);
        user.setJenisKendaraan(jenisKendaraan);
        user.setNoHp(noHp);

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        passwordField2.setEchoChar((char)0);
        checkBoxShowPassword1.setEnabled(false);
        labelValidasiLogin.setVisible(false);
        panelUtama.add(panelLogin);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void buttonKembali1ActionPerformed(java.awt.event.ActionEvent evt) {
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        labelValidasiIsiData.setVisible(false);
        panelUtama.add(panelCreateAccount);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void passwordField2FocusLost(java.awt.event.FocusEvent evt) {
        if(passwordField2.getText().equals("")) {
            passwordField2.setText("Masukkan password anda");
            passwordField2.setEchoChar((char)0);
        }
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
            labelValidasiLogin.setVisible(true);
        }
    }

    private void buttonExit2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void buttonIsiMinyakActionPerformed(java.awt.event.ActionEvent evt) {
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

        panelUtama.add(panelIsiMinyak);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void buttonProfilActionPerformed(java.awt.event.ActionEvent evt) {
        String nama = user.getNama();
        String alamat = user.getAlamat();
        String jenisKendaraan = user.getJenisKendaraan();
        String email = user.getEmail();
        String noHp = user.getNoHp();

        labelNamaProfil1.setText(nama);
        labelAlamatProfil1.setText(alamat);
        labelJenisKendaraanProfil1.setText(jenisKendaraan);
        labelEmailProfil1.setText(email);
        labelNoHpProfil1.setText(noHp);

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelProfil);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {

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
        ImageIcon icon;
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
            icon = new ImageIcon(getClass().getResource("icons/warning.png"));
            efekSuara("sounds/error.wav");
            JOptionPane.showMessageDialog(this, "Anda belum memilih bahan bakar!", "BAHAN BAKAR", JOptionPane.ERROR_MESSAGE, icon);
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
            labelIsiUlang1.setText("Tangki " + spbu.getTangki().getJenis() + " sedang diisi ulang ");
            // pesan nunggu 5 detik
            efekSuara("sounds/isiTangki.wav");
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    labelIsiUlang.setText("Tangki " + spbu.getTangki().getJenis() + " sudah terisi kembali ");
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
                String dialogKurangSaldo = "Maaf, uang yang Anda miliki kurang Rp" + biayaKurang + ",-\n" +
                        "Apakah Anda ingin menambah uang?";
                icon = new ImageIcon(getClass().getResource("icons/question.png"));
                efekSuara("sounds/question.wav");
                int pilihan = JOptionPane.showConfirmDialog(this, dialogKurangSaldo, "SALDO TIDAK CUKUP", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

                if (pilihan == JOptionPane.YES_OPTION) {
                    resetPanelTopUp();
                    resetPanelIsiMinyak(panelTopUp);
                }
                else if(spbu.cekSaldoUser(user.getSaldo())){
                    int literCukup = user.getSaldo() / spbu.getTangki().getHarga();
                    String dialogKurangiLiter = "Dengan uang yang Anda miliki, Anda hanya dapat mengisi " + literCukup + " liter \n" +
                            "Apakah Anda tetap ingin mengisi?";
                    icon = new ImageIcon(getClass().getResource("icons/question.png"));
                    efekSuara("sounds/question.wav");
                    pilihan = JOptionPane.showConfirmDialog(this, dialogKurangiLiter, "KURANGI LITER", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

                    if (pilihan == JOptionPane.YES_OPTION) {
                        liter = literCukup;
                        biaya = liter * spbu.getTangki().getHarga();
                        spbu.isiMinyak(user, liter, biaya);
                        // pop up berhasil
                        icon = new ImageIcon(getClass().getResource("icons/success.png"));
                        efekSuara("sounds/success.wav");
                        JOptionPane.showMessageDialog(this, "Pengisian Bahan Bakar Berhasil Dilakukan", "STATUS TRANSAKSI", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    else {
                        // pop up gagal
                        icon = new ImageIcon(getClass().getResource("icons/error.png"));
                        efekSuara("sounds/error.wav");
                        JOptionPane.showMessageDialog(this, "Pengisian Bahan Bakar Gagal Dilakukan", "STATUS TRANSAKSI", JOptionPane.ERROR_MESSAGE, icon);
                    }
                    // balek ke panel menu
                    resetPanelIsiMinyak(panelMenu);
                }
                else {
                    icon = new ImageIcon(getClass().getResource("icons/error.png"));
                    efekSuara("sounds/error.wav");
                    JOptionPane.showMessageDialog(this, "Pengisian Bahan Bakar Gagal Dilakukan", "STATUS TRANSAKSI", JOptionPane.ERROR_MESSAGE, icon);
                    resetPanelIsiMinyak(panelMenu);
                }
            }
            else {
                spbu.isiMinyak(user, liter, biaya);
                // pop up berhasil
                icon = new ImageIcon(getClass().getResource("icons/success.png"));
                efekSuara("sounds/success.wav");
                JOptionPane.showMessageDialog(this, "Pengisian Bahan Bakar Berhasil Dilakukan", "STATUS TRANSAKSI", JOptionPane.INFORMATION_MESSAGE, icon);
                // balek ke panel menu
                resetPanelIsiMinyak(panelMenu);
            }
        }
    }

    private void panelBtnMenu1MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu1.setBackground(new Color(230,156,40));
    }

    private void panelBtnMenu1MouseExited(java.awt.event.MouseEvent evt) {
        panelBtnMenu1.setBackground(new Color(255,181,65));
    }

    private void labelIcon1MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu1.setBackground(new Color(230,156,40));
    }

    private void labelMenu1MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu1.setBackground(new Color(230,156,40));
    }

    private void panelBtnMenu1MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu1.setBackground(new Color(255,181,65));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelIcon1MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu1.setBackground(new Color(255,181,65));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelMenu1MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu1.setBackground(new Color(255,181,65));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelIcon2MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu2.setBackground(new Color(230,156,40));
    }

    private void labelIcon2MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu2.setBackground(new Color(255,181,65));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelMenu2MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu2.setBackground(new Color(230,156,40));
    }

    private void labelMenu2MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu2.setBackground(new Color(255,181,65));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void panelBtnMenu2MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu2.setBackground(new Color(230,156,40));
    }

    private void panelBtnMenu2MouseExited(java.awt.event.MouseEvent evt) {
        panelBtnMenu2.setBackground(new Color(255,181,65));
    }

    private void panelBtnMenu2MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu2.setBackground(new Color(255,181,65));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelIcon3MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu3.setBackground(new Color(230,156,40));
    }

    private void labelIcon3MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu3.setBackground(new Color(255,181,65));
        resetPanelTopUp();

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelMenu3MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu3.setBackground(new Color(230,156,40));
    }

    private void labelMenu3MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu3.setBackground(new Color(255,181,65));
        resetPanelTopUp();

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void panelBtnMenu3MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu3.setBackground(new Color(230,156,40));
    }

    private void panelBtnMenu3MouseExited(java.awt.event.MouseEvent evt) {
        panelBtnMenu3.setBackground(new Color(255,181,65));
    }

    private void panelBtnMenu3MousePressed(java.awt.event.MouseEvent evt) {
        resetPanelTopUp();

        panelBtnMenu3.setBackground(new Color(255,181,65));
        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelIcon4MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu4.setBackground(new Color(230,156,40));
    }

    private void labelIcon4MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu4.setBackground(new Color(255,181,65));

        resetPanelProfil();

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelMenu4MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu4.setBackground(new Color(230,156,40));
    }

    private void labelMenu4MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu4.setBackground(new Color(255,181,65));

        resetPanelProfil();

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void panelBtnMenu4MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu4.setBackground(new Color(230,156,40));
    }

    private void panelBtnMenu4MouseExited(java.awt.event.MouseEvent evt) {
        panelBtnMenu4.setBackground(new Color(255,181,65));
    }

    private void panelBtnMenu4MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu4.setBackground(new Color(255,181,65));

        resetPanelProfil();

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {
        if(passwordField.getText().equals("")) {
            passwordField.setText("Masukkan password anda");
            passwordField.setEchoChar((char)0);
        }
    }

    private void checkBoxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        if(checkBoxShowPassword.isSelected()) {
            passwordField.setEchoChar((char)0);
        }
        else {
            passwordField.setEchoChar('\u25cf');
        }
        passwordField.requestFocus();
    }

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {
        if(passwordField.getText().equals("Masukkan password anda") || passwordField.getText().equals("")) {
            checkBoxShowPassword.setEnabled(false);
        } else if(!(passwordField.getText().equals("Masukkan password anda") || passwordField.getText().equals(""))) {
            checkBoxShowPassword.setEnabled(true);
        }
    }

    private void passwordField2FocusGained(java.awt.event.FocusEvent evt) {
        if(passwordField2.getText().equals("Masukkan password anda")) {
            passwordField2.setText("");
            passwordField2.setEchoChar('\u25cf');
        }
    }

    private void passwordField2KeyTyped(java.awt.event.KeyEvent evt) {
        if(passwordField2.getText().equals("Masukkan password anda") || passwordField2.getText().equals("")) {
            checkBoxShowPassword1.setEnabled(false);
        } else if(!(passwordField2.getText().equals("Masukkan password anda") || passwordField2.getText().equals(""))) {
            checkBoxShowPassword1.setEnabled(true);
        }
    }

    private void checkBoxShowPassword1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(checkBoxShowPassword1.isSelected()) {
            passwordField2.setEchoChar((char)0);
        }
        else {
            passwordField2.setEchoChar('\u25cf');
        }
        passwordField2.requestFocus();
    }

    private void labelIcon5MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu5.setBackground(new Color(230,156,40));
    }

    private void labelIcon5MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu5.setBackground(new Color(255,181,65));

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void labelMenu5MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu5.setBackground(new Color(230,156,40));
    }

    private void labelMenu5MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu5.setBackground(new Color(255,181,65));

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void panelBtnMenu5MouseEntered(java.awt.event.MouseEvent evt) {
        panelBtnMenu5.setBackground(new Color(230,156,40));
    }

    private void panelBtnMenu5MouseExited(java.awt.event.MouseEvent evt) {
        panelBtnMenu5.setBackground(new Color(255,181,65));
    }

    private void panelBtnMenu5MousePressed(java.awt.event.MouseEvent evt) {
        panelBtnMenu5.setBackground(new Color(255,181,65));

        panelUtama.removeAll();
        panelUtama.repaint();
        panelUtama.revalidate();

        panelUtama.add(panelMenu);
        panelUtama.repaint();
        panelUtama.revalidate();
    }

    private void resetPanelIsiMinyak(JPanel panelTujuan) {
        textFieldJumlahLiter.setText("Masukkan jumlah liter");
        labelIsiUlang.setText("Mohon tunggu sebentar ");
        labelIsiUlang1.setText("Tangki " + spbu.getTangki().getJenis() + " sedang diisi ulang ");
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

    private void resetPanelProfil() {
        labelNamaProfil1.setVisible(true);
        labelAlamatProfil1.setVisible(true);
        labelJenisKendaraanProfil1.setVisible(true);
        labelEmailProfil1.setVisible(true);
        labelNoHpProfil1.setVisible(true);

        textFieldEditNama.setVisible(false);
        textFieldEditAlamat.setVisible(false);
        comboBoxJenisKendaraan2.setVisible(false);
        textFieldEditEmail.setVisible(false);
        textFieldEditNoHp.setVisible(false);

        buttonSaveNama.setVisible(false);
        buttonSaveAlamat.setVisible(false);
        buttonSaveJenisKendaraan.setVisible(false);
        buttonSaveEmail.setVisible(false);
        buttonSaveNoHp.setVisible(false);
    }

    private void efekSuara(String path) {
        URL url = GUI.class.getResource(path);
        AudioClip clip = Applet.newAudioClip(url);
        clip.play();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
}
