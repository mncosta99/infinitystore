
package interfaces;

import infinitystore.com.LojaAdmin;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {
    private LojaAdmin admin = new LojaAdmin();
    
    public Interface() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeDeUsuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        visita = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Infinity Store");
        setBackground(new java.awt.Color(225, 27, 42));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeDeUsuario.setBackground(new java.awt.Color(26, 26, 26));
        nomeDeUsuario.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        nomeDeUsuario.setForeground(new java.awt.Color(254, 254, 254));
        nomeDeUsuario.setBorder(null);
        getContentPane().add(nomeDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 144, 180, 20));

        senha.setBackground(new java.awt.Color(26, 26, 26));
        senha.setForeground(new java.awt.Color(254, 254, 254));
        senha.setBorder(null);
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 193, 180, 20));

        entrar.setBackground(new java.awt.Color(26, 26, 26));
        entrar.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        entrar.setForeground(new java.awt.Color(240, 180, 44));
        entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Entrar.png"))); // NOI18N
        entrar.setBorder(null);
        entrar.setBorderPainted(false);
        entrar.setContentAreaFilled(false);
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.setFocusPainted(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 238, 90, 30));

        jButton2.setBackground(new java.awt.Color(26, 26, 26));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastrar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 275, -1, -1));

        visita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Visite-nos.png"))); // NOI18N
        visita.setBorderPainted(false);
        visita.setContentAreaFilled(false);
        visita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visita.setFocusPainted(false);
        visita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitaActionPerformed(evt);
            }
        });
        getContentPane().add(visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 26, -1, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/entradas.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -40, 700, 440));

        setSize(new java.awt.Dimension(693, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        admin.recuperaDados();
        int entrada = admin.EntrarUsuario(nomeDeUsuario.getText(), senha.getText());
        if(entrada == -1){
            Administrador telaAdmin = new Administrador();
            telaAdmin.setVisible(true);
            this.dispose();
        } else if(entrada >= 0){
            Usuario telaUser = new Usuario();
            telaUser.setVisible(true);
            telaUser.setUser(entrada);
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Verifique o nome de usuário ou senha e tente novamente.");
        }
    }//GEN-LAST:event_entrarActionPerformed
    
    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        entrar.doClick();
    }//GEN-LAST:event_senhaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void visitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitaActionPerformed
        // TODO add your handling code here:
        Usuario telaUser = new Usuario();
        telaUser.setVisible(true);
        telaUser.setUser(-1);
        this.dispose();
    }//GEN-LAST:event_visitaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton entrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField nomeDeUsuario;
    private javax.swing.JPasswordField senha;
    private javax.swing.JButton visita;
    // End of variables declaration//GEN-END:variables
}
