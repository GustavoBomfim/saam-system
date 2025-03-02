/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.FuncionarioController;
import controller.UsuarioController;
import java.util.Arrays;
import model.dto.FuncionarioDTO;
import model.dto.UsuarioDTO;

/**
 *
 * @author gustavo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        bemVindo = new javax.swing.JLabel();
        logoSaam = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        emailText = new javax.swing.JLabel();
        senhaText = new javax.swing.JLabel();
        entrarBtn = new javax.swing.JButton();
        senhaInput = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        novoPorAqui = new javax.swing.JLabel();
        emailCadastroInput = new javax.swing.JTextField();
        emailText2 = new javax.swing.JLabel();
        senhaText2 = new javax.swing.JLabel();
        nomeText = new javax.swing.JLabel();
        nomeCadastroInput = new javax.swing.JTextField();
        senhaCadastroInput = new javax.swing.JPasswordField();
        cadastreBtn = new javax.swing.JButton();
        jDesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saam System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 80, 162));

        bemVindo.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        bemVindo.setForeground(new java.awt.Color(20, 20, 20));
        bemVindo.setText("Bem vindo");

        logoSaam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saamLogo.png"))); // NOI18N

        emailText.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        emailText.setForeground(new java.awt.Color(40, 40, 40));
        emailText.setText("Email");

        senhaText.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        senhaText.setForeground(new java.awt.Color(40, 40, 40));
        senhaText.setText("Senha");

        entrarBtn.setBackground(new java.awt.Color(30, 80, 162));
        entrarBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        entrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        entrarBtn.setLabel("Entrar");
        entrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(senhaText)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(entrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(senhaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                        .addComponent(emailInput)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailText)
                        .addGap(281, 678, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bemVindo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logoSaam, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logoSaam, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(bemVindo)
                .addGap(46, 46, 46)
                .addComponent(emailText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrarBtn)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(240, 233, 220));

        novoPorAqui.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        novoPorAqui.setForeground(new java.awt.Color(20, 20, 20));
        novoPorAqui.setText("Novo por aqui?");

        emailText2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        emailText2.setForeground(new java.awt.Color(40, 40, 40));
        emailText2.setText("Email");

        senhaText2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        senhaText2.setForeground(new java.awt.Color(40, 40, 40));
        senhaText2.setText("Senha");

        nomeText.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        nomeText.setForeground(new java.awt.Color(40, 40, 40));
        nomeText.setText("Nome");

        cadastreBtn.setBackground(new java.awt.Color(30, 80, 162));
        cadastreBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        cadastreBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastreBtn.setText("Cadastre-se");
        cadastreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastreBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novoPorAqui)
                .addGap(206, 206, 206))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastreBtn)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(senhaText2)
                        .addComponent(senhaCadastroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailCadastroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailText2)
                        .addComponent(nomeCadastroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomeText)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(novoPorAqui)
                .addGap(49, 49, 49)
                .addComponent(nomeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeCadastroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailCadastroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaCadastroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastreBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1553, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jDesktop)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktop)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBtnMouseClicked
        // TODO add your handling code here:
        
        UsuarioDTO dto = new UsuarioDTO(null, emailInput.getText(),
                Arrays.toString(senhaInput.getPassword()));
        UsuarioController usuario = new UsuarioController();
        
        if(usuario.logar(dto)){
        Funcionarios tela = new Funcionarios();
        jDesktop.add(tela);
        tela.setVisible(true);
        
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        }
 
        //this.dispose();
        //tela.setVisible(true);
     
    }//GEN-LAST:event_entrarBtnMouseClicked

    private void cadastreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastreBtnMouseClicked
        // TODO add your handling code here:
        UsuarioController controller = new UsuarioController();
        controller.cadastrarUsuario(new UsuarioDTO(nomeCadastroInput.getText(), 
             emailCadastroInput.getText(), Arrays.toString(senhaCadastroInput.getPassword())));
    }//GEN-LAST:event_cadastreBtnMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemVindo;
    private javax.swing.JButton cadastreBtn;
    private javax.swing.JTextField emailCadastroInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailText;
    private javax.swing.JLabel emailText2;
    private javax.swing.JButton entrarBtn;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoSaam;
    private javax.swing.JTextField nomeCadastroInput;
    private javax.swing.JLabel nomeText;
    private javax.swing.JLabel novoPorAqui;
    private javax.swing.JPasswordField senhaCadastroInput;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaText;
    private javax.swing.JLabel senhaText2;
    // End of variables declaration//GEN-END:variables
}
