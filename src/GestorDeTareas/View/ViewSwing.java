package GestorDeTareas.View;

import GestorDeTareas.Model.Task;
import GestorDeTareas.Model.TaskManager;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ViewSwing extends JFrame implements ActionListener {
    private TaskManager taskManager;
    private JTextField txtTitulo, txtDescripcion;
    private JLabel lblNombre, lblTitulo, lblDescripcion, lblStats;
    private JButton btnCrear, btnCompletar, btnConsultar, btnActualizar, btnEliminar;
    private JTable tablaaTareas;
    private DefaultTableModel modeloTabla;
    private JScrollPane scrollPane;

    public ViewSwing() {
        this.taskManager = new TaskManager();
        initComponents();
        setUpLayout();
        actualizarTabla();
        actualizarEstadisticas();
    }

    private void initComponents() {
        setTitle("Gestor de Tareas - Interfaz Gráfica");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblNombre = new JLabel("🗂️ Gestor de Tareas");
        lblNombre.setFont(new Font("Arial", Font.BOLD, 24));
        lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
        lblNombre.setForeground(new Color(33, 150, 243));

        lblTitulo = new JLabel("Título de la tarea:");
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 14));

        lblDescripcion = new JLabel("Descripción de la tarea:");
        lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 14));

        lblStats = new JLabel("Estadísticas: Total: 0 | Completadas: 0 | Pendientes: 0");
        lblStats.setFont(new Font("Arial", Font.ITALIC, 12));
        lblStats.setForeground(new Color(102, 102, 102));

        txtTitulo = new JTextField(20);
        txtTitulo.setFont(new Font("Arial", Font.PLAIN, 14));

        txtDescripcion = new JTextField(20);
        txtDescripcion.setFont(new Font("Arial", Font.PLAIN, 14));

        btnCrear = new JButton("✅ Crear Tarea");
        btnCrear.setFont(new Font("Arial", Font.BOLD, 12));
        btnCrear.setBackground(new Color(76, 175, 80));
        btnCrear.setForeground(Color.WHITE);
        btnCrear.setFocusPainted(false);
        btnCrear.addActionListener(this);

        btnCompletar = new JButton("✔️ Completar Tarea");
        btnCompletar.setFont(new Font("Arial", Font.BOLD, 12));
        btnCompletar.setBackground(new Color(33, 150, 243));
        btnCompletar.setForeground(Color.WHITE);
        btnCompletar.setFocusPainted(false);
        btnCompletar.addActionListener(this);

        btnConsultar = new JButton("🔍 Consultar Tarea");
        btnConsultar.setFont(new Font("Arial", Font.BOLD, 12));
        btnConsultar.setBackground(new Color(156, 39, 176));
        btnConsultar.setForeground(Color.WHITE);
        btnConsultar.setFocusPainted(false);
        btnConsultar.addActionListener(this);

        btnActualizar = new JButton("📝 Actualizar Tarea");
        btnActualizar.setFont(new Font("Arial", Font.BOLD, 12));
        btnActualizar.setBackground(new Color(255, 152, 0));
        btnActualizar.setForeground(Color.WHITE);
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(this);

        btnEliminar = new JButton("🗑️ Eliminar Tarea");
        btnEliminar.setFont(new Font("Arial", Font.BOLD, 12));
        btnEliminar.setBackground(new Color(244, 67, 54));
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(this);


        String[] columnas = {"ID", "Título", "Descripción", "Estado"};
        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tablaaTareas = new JTable(modeloTabla);
        tablaaTareas.setFont(new Font("Arial", Font.PLAIN, 12));
        tablaaTareas.setRowHeight(25);
        tablaaTareas.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tablaaTareas.getTableHeader().setBackground(new Color(224, 224, 224));
        tablaaTareas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        scrollPane = new JScrollPane(tablaaTareas);
        scrollPane.setPreferredSize(new Dimension(750, 300));
    }

    private void setUpLayout() {
        setLayout(new BorderLayout());

        JPanel panelTitulo = new JPanel(new FlowLayout());
        panelTitulo.setBackground(Color.WHITE);
        panelTitulo.add(lblNombre);
        panelTitulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JPanel panelEntrada = new JPanel(new GridBagLayout());
        panelEntrada.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(33, 150, 243), 2),
                "Nueva Tarea",
                0, 0, new Font("Arial", Font.BOLD, 14), new Color(33, 150, 243)
        ));
        panelEntrada.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        gbc.gridx = 0; gbc.gridy = 0; gbc.anchor = GridBagConstraints.WEST;
        panelEntrada.add(lblTitulo, gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;
        panelEntrada.add(txtTitulo, gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.fill = GridBagConstraints.NONE;
        panelEntrada.add(lblDescripcion, gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;
        panelEntrada.add(txtDescripcion, gbc);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE; gbc.anchor = GridBagConstraints.CENTER;
        panelEntrada.add(btnCrear, gbc);

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.setBackground(Color.WHITE);
        panelBotones.add(btnCompletar);
        panelBotones.add(btnConsultar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);

        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setBackground(Color.WHITE);
        panelSuperior.add(panelEntrada, BorderLayout.NORTH);
        panelSuperior.add(panelBotones, BorderLayout.SOUTH);

        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.setBackground(Color.WHITE);
        panelInferior.add(lblStats);

        add(panelTitulo, BorderLayout.NORTH);
        add(panelSuperior, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBackground(Color.WHITE);
        panelPrincipal.add(panelTitulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new BorderLayout());
        panelCentral.setBackground(Color.WHITE);
        panelCentral.add(panelSuperior, BorderLayout.NORTH);
        panelCentral.add(scrollPane, BorderLayout.CENTER);
        panelCentral.add(panelInferior, BorderLayout.SOUTH);

        panelPrincipal.add(panelCentral, BorderLayout.CENTER);

        setContentPane(panelPrincipal);
    }

    private void actualizarTabla() {
        modeloTabla.setRowCount(0);
        List<Task> tareas = taskManager.getAllTasks();

        for (Task tarea : tareas) {
            Object[] fila = {
                    tarea.getId(),
                    tarea.getTitle(),
                    tarea.getDescription(),
                    tarea.isPerformed() ? "✅ Completada" : "⏳ Pendiente"
            };
            modeloTabla.addRow(fila);
        }
    }

    private void actualizarEstadisticas() {
        int total = taskManager.getTaskCount();
        int completadas = taskManager.getCompletedTaskCount();
        int pendientes = taskManager.getPendingTaskCount();

        lblStats.setText(String.format(
                "📊 Estadísticas: Total: %d | Completadas: %d | Pendientes: %d",
                total, completadas, pendientes
        ));
    }

    private void crearTarea() {
        String titulo = txtTitulo.getText().trim();
        String descripcion = txtDescripcion.getText().trim();

        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "El título no puede estar vacío",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "La descripción no puede estar vacía",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Task nuevaTarea = new Task(titulo, descripcion);
        taskManager.addTask(nuevaTarea);

        JOptionPane.showMessageDialog(this,
                "✅ Tarea creada exitosamente con ID: " + nuevaTarea.getId(),
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);

        txtTitulo.setText("");
        txtDescripcion.setText("");
        actualizarTabla();
        actualizarEstadisticas();
    }

    private void completarTarea() {
        int filaSeleccionada = tablaaTareas.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione una tarea de la lista",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = (Integer) modeloTabla.getValueAt(filaSeleccionada, 0);
        Task tarea = taskManager.getTaskById(id);

        if (tarea == null) {
            JOptionPane.showMessageDialog(this,
                    "No se encontró la tarea seleccionada",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tarea.isPerformed()) {
            JOptionPane.showMessageDialog(this,
                    "La tarea ya está completada",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro de que desea completar la tarea '" + tarea.getTitle() + "'?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            taskManager.completeTask(id);
            JOptionPane.showMessageDialog(this,
                    "✅ Tarea completada exitosamente: " + tarea.getTitle(),
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
            actualizarTabla();
            actualizarEstadisticas();
        }
    }

    private void eliminarTarea() {
        int filaSeleccionada = tablaaTareas.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione una tarea de la lista",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = (Integer) modeloTabla.getValueAt(filaSeleccionada, 0);
        Task tarea = taskManager.getTaskById(id);

        if (tarea == null) {
            JOptionPane.showMessageDialog(this,
                    "No se encontró la tarea seleccionada",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro de que desea eliminar la tarea '" + tarea.getTitle() + "'?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (taskManager.removeTask(id)) {
                JOptionPane.showMessageDialog(this,
                        "🗑️ Tarea eliminada exitosamente",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla();
                actualizarEstadisticas();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Error al eliminar la tarea",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void consultarTarea() {
        if (taskManager.getTaskCount() == 0) {
            JOptionPane.showMessageDialog(this,
                    "No hay tareas registradas para consultar",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String input = JOptionPane.showInputDialog(this,
                "Ingrese el ID de la tarea a consultar:",
                "Consultar Tarea",
                JOptionPane.QUESTION_MESSAGE);

        if (input == null || input.trim().isEmpty()) {
            return;
        }

        try {
            int id = Integer.parseInt(input.trim());
            Task tarea = taskManager.getTaskById(id);

            if (tarea == null) {
                JOptionPane.showMessageDialog(this,
                        "No se encontró una tarea con el ID: " + id,
                        "Tarea no encontrada",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            String mensaje = String.format(
                    "🔍 DETALLES DE LA TAREA\n\n" +
                            "ID: %d\n" +
                            "Título: %s\n" +
                            "Descripción: %s\n" +
                            "Estado: %s\n" +
                            "Fecha de creación: %s",
                    tarea.getId(),
                    tarea.getTitle(),
                    tarea.getDescription(),
                    tarea.isPerformed() ? "✅ Completada" : "⏳ Pendiente",
                    "No disponible"
            );

            JOptionPane.showMessageDialog(this,
                    mensaje,
                    "Consulta de Tarea - ID: " + id,
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese un número válido",
                    "Error de formato",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarTarea() {
        int filaSeleccionada = tablaaTareas.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione una tarea de la lista para actualizar",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = (Integer) modeloTabla.getValueAt(filaSeleccionada, 0);
        Task tarea = taskManager.getTaskById(id);

        if (tarea == null) {
            JOptionPane.showMessageDialog(this,
                    "No se encontró la tarea seleccionada",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tarea.isPerformed()) {
            JOptionPane.showMessageDialog(this,
                    "No se puede actualizar una tarea completada",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        JDialog dialogoActualizar = new JDialog(this, "Actualizar Tarea - ID: " + id, true);
        dialogoActualizar.setLayout(new BorderLayout());
        dialogoActualizar.setSize(500, 350);
        dialogoActualizar.setLocationRelativeTo(this);
        dialogoActualizar.setResizable(true);

        JPanel panelFormulario = new JPanel(new GridBagLayout());
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);


        JLabel lblTituloActualizar = new JLabel("Nuevo título:");
        lblTituloActualizar.setFont(new Font("Arial", Font.BOLD, 14));

        JTextField txtTituloActualizar = new JTextField(tarea.getTitle());
        txtTituloActualizar.setFont(new Font("Arial", Font.PLAIN, 14));
        txtTituloActualizar.setPreferredSize(new Dimension(300, 30));

        JLabel lblDescripcionActualizar = new JLabel("Nueva descripción:");
        lblDescripcionActualizar.setFont(new Font("Arial", Font.BOLD, 14));

        JTextArea txtDescripcionActualizar = new JTextArea(tarea.getDescription(), 6, 25);
        txtDescripcionActualizar.setWrapStyleWord(true);
        txtDescripcionActualizar.setLineWrap(true);
        txtDescripcionActualizar.setFont(new Font("Arial", Font.PLAIN, 14));
        txtDescripcionActualizar.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        JScrollPane scrollDescripcion = new JScrollPane(txtDescripcionActualizar);
        scrollDescripcion.setPreferredSize(new Dimension(300, 120));
        scrollDescripcion.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        gbc.gridx = 0; gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.NONE;
        panelFormulario.add(lblTituloActualizar, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        panelFormulario.add(txtTituloActualizar, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        panelFormulario.add(lblDescripcionActualizar, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panelFormulario.add(scrollDescripcion, gbc);

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

        JButton btnGuardar = new JButton("💾 Guardar Cambios");
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
        btnGuardar.setBackground(new Color(76, 175, 80));
        btnGuardar.setForeground(Color.WHITE);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setPreferredSize(new Dimension(140, 35));

        JButton btnCancelar = new JButton("❌ Cancelar");
        btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
        btnCancelar.setBackground(new Color(244, 67, 54));
        btnCancelar.setForeground(Color.WHITE);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setPreferredSize(new Dimension(120, 35));

        btnGuardar.addActionListener(e -> {
            String nuevoTitulo = txtTituloActualizar.getText().trim();
            String nuevaDescripcion = txtDescripcionActualizar.getText().trim();

            if (nuevoTitulo.isEmpty()) {
                JOptionPane.showMessageDialog(dialogoActualizar,
                        "El título no puede estar vacío",
                        "Error de Validación",
                        JOptionPane.ERROR_MESSAGE);
                txtTituloActualizar.requestFocus();
                return;
            }

            if (nuevaDescripcion.isEmpty()) {
                JOptionPane.showMessageDialog(dialogoActualizar,
                        "La descripción no puede estar vacía",
                        "Error de Validación",
                        JOptionPane.ERROR_MESSAGE);
                txtDescripcionActualizar.requestFocus();
                return;
            }

            tarea.setTitle(nuevoTitulo);
            tarea.setDescription(nuevaDescripcion);

            JOptionPane.showMessageDialog(this,
                    "✅ Tarea actualizada exitosamente",
                    "Actualización Exitosa",
                    JOptionPane.INFORMATION_MESSAGE);

            actualizarTabla();
            dialogoActualizar.dispose();
        });

        btnCancelar.addActionListener(e -> dialogoActualizar.dispose());

        panelBotones.add(btnGuardar);
        panelBotones.add(btnCancelar);

        dialogoActualizar.add(panelFormulario, BorderLayout.CENTER);
        dialogoActualizar.add(panelBotones, BorderLayout.SOUTH);

        dialogoActualizar.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCrear) {
            crearTarea();
        } else if (e.getSource() == btnCompletar) {
            completarTarea();
        } else if (e.getSource() == btnConsultar) {
            consultarTarea();
        } else if (e.getSource() == btnActualizar) {
            actualizarTarea();  // Fix: Call the correct method
        } else if (e.getSource() == btnEliminar) {
            eliminarTarea();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ViewSwing().setVisible(true);
        });
    }
}
