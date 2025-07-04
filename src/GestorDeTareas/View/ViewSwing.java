package GestorDeTareas.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSwing extends JDialog implements ActionListener {
    private JTextField txtTitulo, txtDescripcion;
    private JLabel lblNombre, lblTitulo, lblDescripcion;
    private JButton btnCrear;

    private void initComponents(){
        setTitle("Gestor de Tareas");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        lblNombre = new JLabel("Gestor de Tareas");
        lblNombre.setFont(new Font("Arial", Font.BOLD, 18));

        lblTitulo = new JLabel("Titulo de la tarea");
        lblTitulo.setFont(new Font("Arial",Font.ITALIC, 16));
        txtTitulo = new JTextField(10);

        lblDescripcion = new JLabel("Descripcion de la Tarea");
        txtDescripcion = new JTextField(20);

        btnCrear = new JButton("Crear tarea");
        btnCrear.setForeground(Color.GRAY);
    }
    private void setUpLayout(){
    setLayout(new BorderLayout());

    JPanel panelPrincipal = new JPanel(new GridBagLayout());
    panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(8, 8, 8, 8);

    gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 3;
    gbc.anchor = GridBagConstraints.CENTER;
    panelPrincipal.add(lblNombre, gbc);

    gbc.gridwidth=1;gbc.anchor =GridBagConstraints.WEST;
    gbc.gridx = 0; gbc.gridy = 1;
    panelPrincipal.add(lblTitulo, gbc);
    gbc.gridx = 1;
    panelPrincipal.add(txtTitulo, gbc);

    gbc.gridwidth=1;gbc.anchor =GridBagConstraints.WEST;
    gbc.gridx = 1; gbc.gridy = 2;
    panelPrincipal.add(lblDescripcion, gbc);
    gbc.gridx = 2;
    panelPrincipal.add(txtDescripcion, gbc);






    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
