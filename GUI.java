public class GUI extends javax.swing.JFrame
{  
    private javax.swing.JPanel panelFrame;

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
