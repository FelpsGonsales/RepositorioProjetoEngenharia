package Gui;
import DAOs.Conectar;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GUITestePews extends JFrame {

    private JPanel panelTecnico;
    private JComboBox<String> comboTecnico;
    private JList<String> listMedico;

    public GUITestePews() {
        setTitle("Questionário - Seleção de Entidades");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1, 10, 10)); // Layout com espaçamento

        // Painel para seleção múltipla de médicos
        JPanel panelMedico = new JPanel(new BorderLayout());
        JLabel labelMedico = new JLabel("Selecione Médico(s): ");
        listMedico = new JList<>();
        listMedico.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Permitir seleção múltipla sem SHIFT
        carregarDadosJList(listMedico, "SELECT crm, nome_medico FROM medico");
        JScrollPane scrollMedico = new JScrollPane(listMedico);
        panelMedico.add(labelMedico, BorderLayout.NORTH);
        panelMedico.add(scrollMedico, BorderLayout.CENTER);

        // Painel para seleção de enfermeira
        JPanel panelEnfermeira = criarPainelComboBox("Enfermeiras", "SELECT cip, nome_enfermeira FROM enfermeira");

        // Painel para seleção de técnico
        panelTecnico = new JPanel(new FlowLayout());
        JCheckBox checkTecnico = new JCheckBox("Incluir Técnico(a)");
        comboTecnico = new JComboBox<>();
        comboTecnico.setEnabled(false); // Inicialmente desabilitado
        comboTecnico.addItem("Selecione um técnico");
        carregarDadosComboBox(comboTecnico, "SELECT identificador, nome_tecnico FROM tecnico_enfermagem");
        panelTecnico.add(checkTecnico);
        panelTecnico.add(comboTecnico);

        // Ação para mostrar/esconder o combo de técnico
        checkTecnico.addActionListener(e -> comboTecnico.setEnabled(checkTecnico.isSelected()));

        // Painel para seleção de paciente
        JPanel panelPaciente = criarPainelComboBox("Pacientes", "SELECT idpaciente, nome_paciente FROM paciente");

        // Adicionar painéis à janela
        add(panelMedico);
        add(panelEnfermeira);
        add(panelTecnico);
        add(panelPaciente);

        // Botão para confirmar o questionário
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(e -> confirmarSelecoes());
        add(btnConfirmar);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel criarPainelComboBox(String titulo, String query) {
        JPanel panel = new JPanel(new FlowLayout());
        JLabel label = new JLabel(titulo + ": ");
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Selecione " + titulo.toLowerCase());
        carregarDadosComboBox(comboBox, query);
        panel.add(label);
        panel.add(comboBox);
        return panel;
    }

    private void carregarDadosComboBox(JComboBox<String> comboBox, String query) {
        try (Connection conn = Conectar.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String valor = rs.getInt(1) + " - " + rs.getString(2); // Combina ID e nome
                comboBox.addItem(valor);
            }
            if (comboBox.getItemCount() == 1) { // Se não há itens além do "Selecione"
                comboBox.addItem("Nenhum cadastro disponível");
                comboBox.setEnabled(false);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
    }

    private void carregarDadosJList(JList<String> list, String query) {
        DefaultListModel<String> model = new DefaultListModel<>();
        try (Connection conn = Conectar.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String valor = rs.getInt(1) + " - " + rs.getString(2); // Combina ID e nome
                model.addElement(valor);
            }
            if (model.isEmpty()) { // Se não há registros
                model.addElement("Nenhum cadastro disponível");
                list.setEnabled(false);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
        list.setModel(model);
    }

    private void confirmarSelecoes() {
        // Obter médicos selecionados
        List<String> medicosSelecionados = new ArrayList<>(listMedico.getSelectedValuesList());
        if (medicosSelecionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione pelo menos um médico.");
            return;
        }

        // Exibir as seleções como exemplo
        StringBuilder resultado = new StringBuilder("Médicos selecionados:\n");
        for (String medico : medicosSelecionados) {
            resultado.append(medico).append("\n");
        }
        JOptionPane.showMessageDialog(this, resultado.toString());
    }

    public static void main(String[] args) {
        new GUITestePews();
    }
}
