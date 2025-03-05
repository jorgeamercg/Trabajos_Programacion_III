package ventana;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Mi_Primera_Ventana {

	private JFrame frame;
	private JTextField txtJorgeAlejandro;
	private JTextField txtMercado;
	private JTextField txtGuzm;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mi_Primera_Ventana window = new Mi_Primera_Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mi_Primera_Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 648, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		panel.setBorder(BorderFactory.createLineBorder(new Color(0, 64, 128), 10));
		
		JLabel lblNewLabel = new JLabel("Registro de Usuarios");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 64, 128), 10));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 255));
		panel_2.setBorder(BorderFactory.createTitledBorder("Datos Generales"));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres:");
		lblNewLabel_1.setBounds(70, 20, 87, 13);
		panel_2.add(lblNewLabel_1);
		
		txtJorgeAlejandro = new JTextField();
		txtJorgeAlejandro.setText("Jorge Alejandro");
		txtJorgeAlejandro.setBounds(145, 17, 119, 19);
		panel_2.add(txtJorgeAlejandro);
		txtJorgeAlejandro.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_1_1.setBounds(36, 49, 103, 13);
		panel_2.add(lblNewLabel_1_1);
		
		txtMercado = new JTextField();
		txtMercado.setText("Mercado");
		txtMercado.setColumns(10);
		txtMercado.setBounds(145, 46, 119, 19);
		panel_2.add(txtMercado);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido Materno:");
		lblNewLabel_1_1_1.setBounds(36, 78, 103, 13);
		panel_2.add(lblNewLabel_1_1_1);
		
		txtGuzm = new JTextField();
		txtGuzm.setText("20/01/1996");
		txtGuzm.setColumns(10);
		txtGuzm.setBounds(145, 103, 119, 19);
		panel_2.add(txtGuzm);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1_1_1_1.setBounds(20, 106, 125, 13);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setText("Guzmán");
		textField.setColumns(10);
		textField.setBounds(145, 75, 119, 19);
		panel_2.add(textField);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Sexo:");
		lblNewLabel_1_1_1_1_1.setBounds(91, 141, 34, 13);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBounds(145, 137, 103, 21);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setActionCommand("Femenino");
		rdbtnFemenino.setOpaque(false);
		rdbtnFemenino.setBounds(145, 160, 103, 21);
		panel_2.add(rdbtnFemenino);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Nacionalidad:");
		lblNewLabel_1_1_1_2.setBounds(59, 204, 87, 13);
		panel_2.add(lblNewLabel_1_1_1_2);
		
		String [] nacionalidad = {"México", "Estados Unidos", "Canadá", "Guatemala", "Vanezuela", "Colombia", "Perú", "Brazil", "Argentina"};
		JComboBox comboBox = new JComboBox(nacionalidad);
		comboBox.setBounds(145, 201, 119, 19);
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 0));
		panel_3.setBorder(BorderFactory.createTitledBorder("Perfil del Usuario"));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel(new ImageIcon("usuario.png"));
		label.setBounds(103, 40, 96, 96);
		panel_3.add(label);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(71, 153, 170, 21);
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar Fecha de Nacimiento");
		chckbxMostrarFechaDe.setSelected(true);
		chckbxMostrarFechaDe.setOpaque(false);
		chckbxMostrarFechaDe.setBounds(71, 176, 208, 21);
		panel_3.add(chckbxMostrarFechaDe);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 0));
		panel_4.setBorder(BorderFactory.createTitledBorder("Datos Opcionales"));
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 2, 5, 5));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 128, 0));
		panel_6.setBorder(BorderFactory.createTitledBorder("Descripción"));
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JTextArea txtrHolaEstaEs = new JTextArea();
		txtrHolaEstaEs.setText("Hola, mundo, esta sólo es una prueba del scrollPane:\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.\r\nHola, mundo.");
		txtrHolaEstaEs.setBounds(0, 0, 5, 22);
		
		JScrollPane scrollPane = new JScrollPane(txtrHolaEstaEs);
		scrollPane.setBounds(6, 15, 130, 205);
		panel_6.add(scrollPane);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 128, 0));
		panel_7.setBorder(BorderFactory.createTitledBorder("Preferencias"));
		panel_4.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		String [] deportes = {"Fútbol", "Básquetbol", "Béisbol", "Natación", "Rugby", "Calistenia", "Karate", "Ciclismo", "Rapel", "Kayak", "Senderismo", "Tenis", "Pulseadas", "Gimnasio", "Atletismo", "Pimpón", "Surf", "Skate"};
		JList list = new JList(deportes);
		
		JScrollPane scrollPane_1 = new JScrollPane(list);
		panel_7.add(scrollPane_1, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 128, 255));
		panel_5.setBorder(BorderFactory.createTitledBorder("Acciones"));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(107, 51, 85, 21);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(107, 117, 85, 21);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Salir");
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setBounds(107, 181, 85, 21);
		panel_5.add(btnNewButton_1_1);
	}
}
