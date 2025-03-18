package ventana;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;

public class Evaluación_Unidad_2 {

	private JFrame frame;
	private JTextField txtCalle;
	private JTextField textField_1;
	private JTextField txtJhonDoe;
	private JTextField textField_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evaluación_Unidad_2 window = new Evaluación_Unidad_2();
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
	public Evaluación_Unidad_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Java_Icon_2.png"));
		frame.setBounds(0, 0, 485, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Contenido = new JPanel();
		frame.getContentPane().add(Contenido);
		Contenido.setBounds(0, 64, 471, 407);
		Contenido.setLayout(null);
		
		JPanel Datos_Cliente = new JPanel();
		Datos_Cliente.setBounds(10, 10, 451, 83);
		Datos_Cliente.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
		Contenido.add(Datos_Cliente);
		Datos_Cliente.setLayout(null);
		
		JLabel Documento = new JLabel("Documento:");
		Documento.setBounds(10, 33, 76, 13);
		Datos_Cliente.add(Documento);
		
		JLabel Dirección = new JLabel("Dirección:");
		Dirección.setBounds(10, 57, 59, 13);
		Datos_Cliente.add(Dirección);
		
		JLabel Nombres = new JLabel("Nombres:");
		Nombres.setBounds(205, 33, 64, 13);
		Datos_Cliente.add(Nombres);
		
		JLabel Teléfono = new JLabel("Teléfono:");
		Teléfono.setBounds(205, 57, 64, 13);
		Datos_Cliente.add(Teléfono);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setBounds(89, 54, 96, 19);
		Datos_Cliente.add(txtCalle);
		txtCalle.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("123456");
		textField_1.setBounds(89, 30, 96, 19);
		Datos_Cliente.add(textField_1);
		textField_1.setColumns(10);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setColumns(10);
		txtJhonDoe.setBounds(269, 30, 172, 19);
		Datos_Cliente.add(txtJhonDoe);
		
		textField_3 = new JTextField();
		textField_3.setText("5554433");
		textField_3.setColumns(10);
		textField_3.setBounds(269, 54, 172, 19);
		Datos_Cliente.add(textField_3);
		
		JPanel Datos_Factura = new JPanel();
		Datos_Factura.setBounds(10, 95, 451, 55);
		Datos_Factura.setBorder(BorderFactory.createTitledBorder("Datos de factura"));
		Contenido.add(Datos_Factura);
		Datos_Factura.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N° Factura:");
		lblNewLabel.setBounds(10, 32, 72, 13);
		Datos_Factura.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(89, 32, 45, 13);
		Datos_Factura.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha:");
		lblNewLabel_2.setBounds(177, 32, 45, 13);
		Datos_Factura.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2021/50/21");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(240, 32, 71, 13);
		Datos_Factura.add(lblNewLabel_3);
		
		JPanel Opciones = new JPanel();
		Opciones.setBounds(10, 151, 451, 30);
		Opciones.setBorder(BorderFactory.createLineBorder(Color.decode("#b8cfe5")));
		Contenido.add(Opciones);
		Opciones.setLayout(null);
		
		JButton Eliminar = new JButton("Eliminar");
		Eliminar.setMargin(new Insets(2, 2, 2, 2));
		Eliminar.setIcon(new ImageIcon("C:\\Users\\jorge\\git\\Trabajos_Programación_III\\Clase_Ventana\\Eliminar.png"));
		Eliminar.setBounds(356, 1, 85, 26);
		Opciones.add(Eliminar);
		
		JButton Añadir = new JButton("Añadir");
		Añadir.setMargin(new Insets(2, 2, 2, 2));
		Añadir.setIcon(new ImageIcon("C:\\Users\\jorge\\git\\Trabajos_Programación_III\\Clase_Ventana\\Añadir.png"));
		Añadir.setBounds(269, 1, 76, 26);
		Opciones.add(Añadir);
		
		JButton Ver_Listado_Facturas = new JButton("Ver listado de facturas");
		Ver_Listado_Facturas.setMargin(new Insets(2, 2, 2, 2));
		Ver_Listado_Facturas.setIcon(new ImageIcon("C:\\Users\\jorge\\git\\Trabajos_Programación_III\\Clase_Ventana\\Lista.png"));
		Ver_Listado_Facturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Ver_Listado_Facturas.setBounds(10, 1, 167, 26);
		Opciones.add(Ver_Listado_Facturas);
		
		JPanel Tabla = new JPanel();
		Tabla.setBorder(BorderFactory.createLineBorder(Color.decode("#b8cfe5")));
		Tabla.setBounds(10, 184, 451, 106);
		Contenido.add(Tabla);
		Tabla.setLayout(null);
		String[] columnNames = {
				"Producto",
				"Cantidad",
				"Valor",
				"Sub Total"
				};
		
		Object[][] data = {
				{"Agua", 2, 500, 1000.0},
				{"Cereal", 5, 1000, 5000.0},
				{"Leche", 2, 300, 600.0},
				};
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setLocation(2, 2);
		scrollPane.setSize(448, 103);
		Tabla.add(scrollPane);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.setBounds(376, 376, 85, 21);
		Contenido.add(Limpiar);
		
		JButton Finalizar_Factura = new JButton("Finalizar factura");
		Finalizar_Factura.setBounds(232, 376, 134, 21);
		Contenido.add(Finalizar_Factura);
		
		JLabel lblNewLabel_6 = new JLabel("SubTotal:");
		lblNewLabel_6.setBounds(20, 300, 92, 13);
		Contenido.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("% Descuento:");
		lblNewLabel_6_1.setBounds(20, 323, 92, 13);
		Contenido.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("IVA 19%:");
		lblNewLabel_6_1_1.setBounds(20, 346, 92, 13);
		Contenido.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("Total Factura:");
		lblNewLabel_6_1_1_1.setBounds(20, 369, 92, 13);
		Contenido.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("6600.0");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6_2.setBounds(122, 300, 45, 13);
		Contenido.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_1_2 = new JLabel("1254.0");
		lblNewLabel_6_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6_1_1_2.setBounds(122, 346, 45, 13);
		Contenido.add(lblNewLabel_6_1_1_2);
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("7524.0");
		lblNewLabel_6_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6_1_1_1_1.setBounds(122, 369, 45, 13);
		Contenido.add(lblNewLabel_6_1_1_1_1);
		
		textField = new JTextField();
		textField.setText("5");
		textField.setBounds(122, 320, 45, 19);
		Contenido.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(173, 320, 21, 21);
		Contenido.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("Valor descontado:");
		lblNewLabel_6_1_2.setBounds(211, 324, 121, 13);
		Contenido.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("330.0");
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6_2_1.setBounds(333, 323, 45, 13);
		Contenido.add(lblNewLabel_6_2_1);
		
		JPanel Encabezado = new JPanel();
		Encabezado.setBounds(0, 0, 471, 65);
		Encabezado.setBackground(Color.decode("#006699"));
		
		frame.getContentPane().add(Encabezado);
		Encabezado.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(21, 10, 423, 17);
		Encabezado.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("[Sin Base de datos]");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(31, 33, 149, 13);
		Encabezado.add(lblNewLabel_5);
		
		JPanel Final = new JPanel();
		Final.setBounds(0, 471, 471, 10);
		Final.setBackground(Color.decode("#006699"));
		frame.getContentPane().add(Final);
	}
}
