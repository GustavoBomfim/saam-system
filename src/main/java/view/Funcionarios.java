/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.FuncionarioController;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dto.FuncionarioDTO;



/**
 *
 * @author gustavo
 */
public class Funcionarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Funcionarios
     */
    public Funcionarios() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) jTableFuncionarios.getModel();
        jTableFuncionarios.setRowSorter(new TableRowSorter<>(modelo));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnFormulario = new javax.swing.JPanel();
        nomeText = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        data = new javax.swing.JLabel();
        salarioText = new javax.swing.JLabel();
        salarioInput = new javax.swing.JTextField();
        statusCombo = new javax.swing.JComboBox<>();
        statusText = new javax.swing.JLabel();
        dataInput = new javax.swing.JFormattedTextField();
        btnCadastrarFuncionario = new javax.swing.JButton();
        sammLogo = new javax.swing.JLabel();
        jpnConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        btnBuscarFuncionarios = new javax.swing.JButton();
        btnExcluirFuncionarioSelecionado = new javax.swing.JButton();
        btnAtualizarFuncionario = new javax.swing.JButton();
        buscarPorNomeText = new javax.swing.JLabel();
        filtrarNomeInput = new javax.swing.JTextField();
        btnBuscarFuncionarioPorNome = new javax.swing.JButton();
        btnDesativarFuncionario = new javax.swing.JButton();

        jpnFormulario.setBackground(new java.awt.Color(26, 35, 126));

        nomeText.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        nomeText.setForeground(new java.awt.Color(255, 255, 255));
        nomeText.setText("Nome");

        data.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setText("Data de Admissão");

        salarioText.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        salarioText.setForeground(new java.awt.Color(255, 255, 255));
        salarioText.setText("Salário");

        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        statusText.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        statusText.setForeground(new java.awt.Color(255, 255, 255));
        statusText.setText("Status");

        btnCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastrarFuncionario.png"))); // NOI18N
        btnCadastrarFuncionario.setText("Cadastrar Funcionário");
        btnCadastrarFuncionario.setToolTipText("");
        btnCadastrarFuncionario.setActionCommand("Cadastrar Funcionário");
        btnCadastrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarFuncionarioMouseClicked(evt);
            }
        });

        sammLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sammLogo2.png"))); // NOI18N
        sammLogo.setToolTipText("");

        javax.swing.GroupLayout jpnFormularioLayout = new javax.swing.GroupLayout(jpnFormulario);
        jpnFormulario.setLayout(jpnFormularioLayout);
        jpnFormularioLayout.setHorizontalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sammLogo)
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeText)
                            .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataInput, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data))
                        .addGap(25, 25, 25)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salarioText)
                            .addComponent(salarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusText)
                            .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jpnFormularioLayout.setVerticalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sammLogo)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nomeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salarioText)
                            .addComponent(statusText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnCadastrarFuncionario)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jpnConsulta.setBackground(new java.awt.Color(55, 71, 79));

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Data Admissão", "Salário", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFuncionarios);

        btnBuscarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscarTodosFuncionariosIcon.png"))); // NOI18N
        btnBuscarFuncionarios.setToolTipText("");
        btnBuscarFuncionarios.setLabel("Buscar Todos Funcionários");
        btnBuscarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFuncionariosActionPerformed(evt);
            }
        });

        btnExcluirFuncionarioSelecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apagarFuncionarioSelecionadoIcon.png"))); // NOI18N
        btnExcluirFuncionarioSelecionado.setText("Excluir Funcionário Selecionado");
        btnExcluirFuncionarioSelecionado.setActionCommand("Excluir Funcionário Selecionado");
        btnExcluirFuncionarioSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncionarioSelecionadoActionPerformed(evt);
            }
        });

        btnAtualizarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizarFuncionarioSelecionado.png"))); // NOI18N
        btnAtualizarFuncionario.setText("Atualizar Funcionário Selecionado");
        btnAtualizarFuncionario.setToolTipText("");
        btnAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncionarioActionPerformed(evt);
            }
        });

        buscarPorNomeText.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        buscarPorNomeText.setForeground(new java.awt.Color(255, 255, 255));
        buscarPorNomeText.setText("Nome");
        buscarPorNomeText.setToolTipText("");

        filtrarNomeInput.setToolTipText("");

        btnBuscarFuncionarioPorNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscarFuncionarioIcon.jpg"))); // NOI18N
        btnBuscarFuncionarioPorNome.setText("Buscar Funcionário pelo Nome");
        btnBuscarFuncionarioPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFuncionarioPorNomeActionPerformed(evt);
            }
        });

        btnDesativarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/desativarFuncionario.png"))); // NOI18N
        btnDesativarFuncionario.setText("Desativar Funcionário Selecionado");
        btnDesativarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultaLayout.createSequentialGroup()
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnConsultaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcluirFuncionarioSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtualizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDesativarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnConsultaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(buscarPorNomeText)
                        .addGap(18, 18, 18)
                        .addComponent(filtrarNomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscarFuncionarioPorNome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarPorNomeText)
                    .addComponent(filtrarNomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFuncionarioPorNome))
                .addGap(33, 33, 33)
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addGroup(jpnConsultaLayout.createSequentialGroup()
                        .addComponent(btnBuscarFuncionarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirFuncionarioSelecionado)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDesativarFuncionario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioMouseClicked
        // TODO add your handling code here:
        if(nomeInput.getText().isBlank() || dataInput.getText().isBlank() || 
                salarioInput.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos de cadastro.");
        } else {
            try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date parsedDate = sdf.parse(dataInput.getText());

            Date sqlDate = new Date(parsedDate.getTime());

            FuncionarioDTO dto = new FuncionarioDTO(null, nomeInput.getText(), 
                    sqlDate, Double.valueOf(salarioInput.getText()), 
                    statusCombo.getSelectedItem() == "Ativo");

            FuncionarioController funcionarioController = new FuncionarioController();
            funcionarioController.cadastrarFuncionario(dto);
            btnBuscarFuncionariosActionPerformed(null);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de data inválido! Use dd/MM/yyyy.");
            }
        }
    }//GEN-LAST:event_btnCadastrarFuncionarioMouseClicked

    private void btnBuscarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFuncionariosActionPerformed
        // TODO add your handling code here:
        FuncionarioController funcionarioController = new FuncionarioController();
        List<FuncionarioDTO> funcionarios = funcionarioController.buscarFuncionarios();
        
        DefaultTableModel modelo = (DefaultTableModel) jTableFuncionarios.getModel();
        
        if(modelo.getRowCount() > 0){
            while(modelo.getRowCount() > 0){
                modelo.removeRow(0);
            }
        }
        
                
        for (FuncionarioDTO funcionario : funcionarios) {
        Object[] linha = {
            funcionario.getId(),
            funcionario.getNome(), 
            funcionario.getDataDeAdmissao(),
            funcionario.getSalario(),
            funcionario.getStatus() ? "Ativo" : "Inativo"
        };
        modelo.addRow(linha);
        }
        
        jTableFuncionarios.setModel(modelo);

    }//GEN-LAST:event_btnBuscarFuncionariosActionPerformed

    private void btnExcluirFuncionarioSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionarioSelecionadoActionPerformed
        // TODO add your handling code here:
        
        int linhaSelecionada = jTableFuncionarios.getSelectedRow();
        
        if(linhaSelecionada != -1){
            DefaultTableModel modelo = (DefaultTableModel) jTableFuncionarios.getModel();
            
            Long id = Long.valueOf(modelo.getValueAt(linhaSelecionada, 0).toString());
            
            FuncionarioController funcionarioController = new FuncionarioController();
            funcionarioController.excluirFuncionario(id);
 
            modelo.removeRow(jTableFuncionarios.getSelectedRow());

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um funcionário para excluí-lo");
        }

        
        
    }//GEN-LAST:event_btnExcluirFuncionarioSelecionadoActionPerformed

    private void btnBuscarFuncionarioPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFuncionarioPorNomeActionPerformed
        // TODO add your handling code here:
        
        
        if(!filtrarNomeInput.getText().isBlank()){
            FuncionarioController funcionarioController = new FuncionarioController();
            List<FuncionarioDTO> funcionarios = funcionarioController.buscarFuncionarioPorNome(filtrarNomeInput.getText());


            DefaultTableModel modelo = (DefaultTableModel) jTableFuncionarios.getModel();

            if(modelo.getRowCount() > 0){
                while(modelo.getRowCount() > 0){
                    modelo.removeRow(0);
                }
            }


            for (FuncionarioDTO funcionario : funcionarios) {
            Object[] linha = {
                funcionario.getId(),
                funcionario.getNome(), 
                funcionario.getDataDeAdmissao(),
                funcionario.getSalario(),
                funcionario.getStatus() ? "Ativo" : "Inativo"
            };
            modelo.addRow(linha);
            }

            jTableFuncionarios.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "Digite um nome para filtrar");
        }
    }//GEN-LAST:event_btnBuscarFuncionarioPorNomeActionPerformed

    private void btnAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFuncionarioActionPerformed
        // TODO add your handling code here:
        
        int linhaSelecionada = jTableFuncionarios.getSelectedRow();

        if (linhaSelecionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTableFuncionarios.getModel();

            Long id = Long.valueOf(modelo.getValueAt(linhaSelecionada, 0).toString());
            String nome = modelo.getValueAt(linhaSelecionada, 1).toString();
            Date dataDeAdmissao = Date.valueOf(modelo.getValueAt(linhaSelecionada, 2).toString());
            Double salario = Double.valueOf(modelo.getValueAt(linhaSelecionada, 3).toString());
            boolean status = modelo.getValueAt(linhaSelecionada, 4).toString().equals("Ativo");

            FuncionarioDTO funcionario = new FuncionarioDTO(id, nome, dataDeAdmissao, salario, status);

            FuncionarioController funcionarioController = new FuncionarioController();
            funcionarioController.atualizarFuncionario(funcionario);

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um funcionário para atualizar.");
        }
    }//GEN-LAST:event_btnAtualizarFuncionarioActionPerformed

    private void btnDesativarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarFuncionarioActionPerformed
        // TODO add your handling code here:
                int linhaSelecionada = jTableFuncionarios.getSelectedRow();

        if (linhaSelecionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTableFuncionarios.getModel();

            Long id = Long.valueOf(modelo.getValueAt(linhaSelecionada, 0).toString());
           

            FuncionarioController funcionarioController = new FuncionarioController();
            funcionarioController.desativarFuncionario(id);

            btnBuscarFuncionariosActionPerformed(null);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um funcionário para desativar.");
        }
    }//GEN-LAST:event_btnDesativarFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarFuncionario;
    private javax.swing.JButton btnBuscarFuncionarioPorNome;
    private javax.swing.JButton btnBuscarFuncionarios;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnDesativarFuncionario;
    private javax.swing.JButton btnExcluirFuncionarioSelecionado;
    private javax.swing.JLabel buscarPorNomeText;
    private javax.swing.JLabel data;
    private javax.swing.JFormattedTextField dataInput;
    private javax.swing.JTextField filtrarNomeInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JPanel jpnConsulta;
    private javax.swing.JPanel jpnFormulario;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeText;
    private javax.swing.JTextField salarioInput;
    private javax.swing.JLabel salarioText;
    private javax.swing.JLabel sammLogo;
    private javax.swing.JComboBox<String> statusCombo;
    private javax.swing.JLabel statusText;
    // End of variables declaration//GEN-END:variables
}
