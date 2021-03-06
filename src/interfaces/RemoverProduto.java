
package interfaces;

import infinitystore.com.JTableRenderer;
import infinitystore.com.LojaAdmin;
import infinitystore.com.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class RemoverProduto extends javax.swing.JFrame {
    private LojaAdmin admin = new LojaAdmin();
    private int[] indices;

    public RemoverProduto() {
        admin.recuperaDados();     
        initComponents();
        tabela.getParent().setBackground(new java.awt.Color(26,26,26));
        tabela.getTableHeader().setUI(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        nomeDoProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(26, 26, 26));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Colunas tabela.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(69, 137, 541, 195);

        nomeDoProduto.setBackground(new java.awt.Color(255, 127, 42));
        nomeDoProduto.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        nomeDoProduto.setForeground(new java.awt.Color(254, 254, 254));
        nomeDoProduto.setBorder(null);
        nomeDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDoProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(nomeDoProduto);
        nomeDoProduto.setBounds(150, 66, 140, 25);

        tabela.setBackground(new java.awt.Color(26, 26, 26));
        tabela.setBorder(null);
        tabela.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        tabela.setForeground(new java.awt.Color(254, 254, 254));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imagem", "Nome", "Marca", "Descrição", "Qtd", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setGridColor(new java.awt.Color(26, 26, 26));
        tabela.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabela.setRequestFocusEnabled(false);
        tabela.setRowHeight(70);
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(5).setResizable(false);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 160, 530, 160);

        jButton1.setBackground(new java.awt.Color(255, 127, 42));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar Produtos - Botão.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 62, 40, 30);

        jButton2.setBackground(new java.awt.Color(26, 26, 26));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar Produtos - Lixeira.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 60, 60, 35);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar Produtos.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -28, 710, 420);

        setSize(new java.awt.Dimension(693, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        tabela.setDefaultRenderer(Object.class, new CellRenderer());
        
        modelo.setNumRows(0);
        
        List<Integer> index = admin.indiceProduto(nomeDoProduto.getText());
        indices = new int[index.size()];
        for(int k=0; k<index.size(); k++){
            indices[k] = index.get(k);
        }
        
        TableColumnModel columnModel = tabela.getColumnModel();
        JTableRenderer renderer = new JTableRenderer();
        columnModel.getColumn(0).setCellRenderer(renderer);
        tabela.setDefaultRenderer(Object.class, new CellRenderer());
        
        List<Produto> produtosAchados = admin.procurarProduto(nomeDoProduto.getText());
        if(produtosAchados.size() > 0){
            for(Produto p: produtosAchados){
                ImageIcon imagem = new ImageIcon(p.getImagem());
                Object[] dados = {imagem, p.getNome(), p.getMarca(), p.getDescricao(), p.getQuantidade(), String.format("R$ %.2f", p.getValor())};
                modelo.addRow(dados);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Produto(s) não encontrado(s)!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        if(tabela.getSelectedRow() != -1){
            admin.removerProduto(indices[tabela.getSelectedRow()]);
            modelo.removeRow(tabela.getSelectedRow());
            admin.gravaDados();
        } else{
            JOptionPane.showMessageDialog(null, "Produto não selecionado!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nomeDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDoProdutoActionPerformed
        jButton1.doClick();
    }//GEN-LAST:event_nomeDoProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeDoProduto;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
