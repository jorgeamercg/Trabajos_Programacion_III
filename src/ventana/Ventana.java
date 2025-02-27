//PACKAGE
package ventana;

import java.awt.BorderLayout;
//LIBRERÍAS A INCLUIR
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

//CLASE
public class Ventana extends JFrame{
	
	//CREACIÓN DE OBJETO
	
	//Fuentes personalizadas
	Font etiquetas = new Font("Romana", Font.ROMAN_BASELINE, 22);
	Font etiquetas2 = new Font("Romana 2", Font.ROMAN_BASELINE, 10);
	Font etiquetas3 = new Font("Romana 2", Font.ROMAN_BASELINE, 17);

	//CONSTRUCTOR
	public Ventana(String title) {
		
		//Atributos
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(515, 560);
		
		this.setResizable(true);
		this.setLayout(null);
		
		//Acción al cerrar la aplicación
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Elemento sobre el que se colocará el item
		this.setLocationRelativeTo(null);
		
		//Limitación de la edición del tamaño de la ventana
		this.setMinimumSize(new Dimension(400, 400));
		this.setMaximumSize(new Dimension(600, 600));
		
		//Barra de menús
		JMenuBar barra = new JMenuBar();
		
		JMenu menu1 = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Ayuda");
		
		JMenuItem op_new = new JMenuItem("Nuevo");
		JMenuItem op_open = new JMenuItem("Abrir");
		JMenuItem op_save = new JMenuItem("Guardar");
		JMenuItem op_close = new JMenuItem("Cerrar");
		
		menu1.add(op_new);
		menu1.add(op_open);
		menu1.add(op_save);
		menu1.add(op_close);
		
		JMenu menu3 = new JMenu("Segundo nivel");
		menu1.add(menu3);
		
		JMenuItem op_1 = new JMenuItem("Opción 1");
		JMenuItem op_2 = new JMenuItem("Opción 2");
		JMenuItem op_3 = new JMenuItem("Opción 3");
		JMenuItem op_4 = new JMenuItem("Opción 4");
		
		menu3.add(op_1);
		menu3.add(op_2);
		menu3.add(op_3);
		menu3.add(op_4);
		
		JRadioButtonMenuItem op_help = new JRadioButtonMenuItem ("Manual de usuario");
		JCheckBoxMenuItem op_support = new JCheckBoxMenuItem ("Soporte");
		
		menu2.add(op_help);
		menu2.add(op_support);
		
		barra.add(menu1);
		barra.add(menu2);
		
		this.setJMenuBar(barra);
		
		/*//Iniciar Sesión
		this.add(this.login());*/
		
		/*//Registrarse
		this.add(this.registro());*/
		
		/*//Calculadora
		this.add(this.calculadora());*/
		
		/*//Usuarios
		this.add(this.usuarios());*/
		
		/*//Calculadora con Layouts
		this.add(this.calculadoraLayouts());*/
		
		//Interfaz con Layouts
		this.add(this.interfazLayouts());
		
		this.repaint();
		this.revalidate();
		
	}
	
	//MÉTODOS
	
	//Gráficos
	public JPanel login() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(500, 500);
		login.setOpaque(true);
		/*login.setBackground(Color.RED);*/
		login.setBackground(new Color(0, 128, 128));
		login.setVisible(true);
		login.setLayout(null);
		
		//Etiquetas
		JLabel etiqueta1 = new JLabel("Iniciar Sesión");
		etiqueta1.setSize(160, 40);
		etiqueta1.setLocation(160, 35);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.YELLOW);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		login.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Email");
		etiqueta2.setBounds(190, 170, 100, 30);
		/*etiqueta2.setSize(80, 30);*/
		/*etiqueta2.setLocation(60, 150);*/
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setOpaque(true);
		login.add(etiqueta2);
		
		JLabel etiqueta3 = new JLabel("Contraseña");
		etiqueta3.setBounds(160, 270, 160, 30);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setOpaque(true);
		login.add(etiqueta3);
		
		JLabel usuario = new JLabel(new ImageIcon("usuario.png"));//Tipo imagen
		usuario.setBounds(192, 75, 96, 96);
		login.add(usuario);
		
		JLabel correo = new JLabel(new ImageIcon("correo.png"));//Tipo imagen
		correo.setBounds(375, 224, 24, 24);
		login.add(correo);
		
		JLabel pass = new JLabel(new ImageIcon("pass.png"));//Tipo imagen
		pass.setBounds(375, 324, 24, 24);
		login.add(pass);
		
		//Caja de texto
		JTextField email = new JTextField();
		email.setBounds(110, 220, 260, 30);
		email.setFont(etiquetas2);
		email.setBackground(Color.cyan);
		email.setOpaque(true);
		login.add(email);
		
		//Caja de contraseña
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(110, 320, 260, 30);
		contraseña.setFont(etiquetas);
		contraseña.setBackground(Color.cyan);
		contraseña.setOpaque(true);
		login.add(contraseña);
		
		//Botones
		JButton access = new JButton("Acceder");
		access.setBounds(165, 390, 150, 40);
		access.setFont(etiquetas);
		access.setHorizontalAlignment(JLabel.CENTER);
		access.setBackground(Color.ORANGE);
		access.setOpaque(true);
		login.add(access);
		access.addMouseListener(new java.awt.event.MouseAdapter() {//Cambio de color al pasar el mouse (hover)
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        access.setBackground(Color.GREEN);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        access.setBackground(Color.ORANGE);
		    }
		});
		
		JButton c_olvidada = new JButton("¿Olvidó su contraseña?");
		c_olvidada.setBounds(227, 360, 143, 20);
		c_olvidada.setFont(etiquetas2);
		c_olvidada.setHorizontalAlignment(JLabel.CENTER);
		c_olvidada.setBackground(new Color(0, 128, 128));
		c_olvidada.setOpaque(true);
		login.add(c_olvidada);
		
		//Casilla de verificación
		JCheckBox recordar;
		recordar = new JCheckBox("Recordarme");
		recordar.setBounds(75, 360, 143, 20);
		recordar.setFont(etiquetas2);
		recordar.setHorizontalAlignment(JLabel.CENTER);
		recordar.setBackground(new Color(0, 128, 128));
		recordar.setOpaque(true);
		login.add(recordar);
		
		login.revalidate();
		
		return login;
		
	}
	
	public JPanel registro() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		JPanel registro = new JPanel();
		registro.setLocation(0, 0);
		registro.setSize(500, 500);
		registro.setOpaque(true);
		registro.setBackground(Color.WHITE);
		registro.setVisible(true);
		registro.setLayout(null);
		
		//Etiquetas
		JLabel etiqueta1 = new JLabel("Registrarse");
		etiqueta1.setSize(160, 30);
		etiqueta1.setLocation(160, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.GREEN);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		registro.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Email");
		etiqueta2.setBounds(190, 65, 100, 30);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setBackground(Color.YELLOW);
		etiqueta2.setOpaque(true);
		etiqueta2.setBorder(BorderFactory.createLineBorder(Color.black));
		registro.add(etiqueta2);
		
		JLabel etiqueta3 = new JLabel("Biografía");
		etiqueta3.setBounds(160, 130, 160, 30);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setOpaque(true);
		registro.add(etiqueta3);
		
		JLabel etiqueta4 = new JLabel("Preferencias");
		etiqueta4.setBounds(160, 240, 160, 30);
		etiqueta4.setFont(etiquetas);
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		etiqueta4.setBackground(Color.WHITE);
		etiqueta4.setOpaque(true);
		registro.add(etiqueta4);
		
		JLabel etiqueta5 = new JLabel("Términos");
		etiqueta5.setBounds(160, 300, 160, 30);
		etiqueta5.setFont(etiquetas);
		etiqueta5.setHorizontalAlignment(JLabel.CENTER);
		etiqueta5.setBackground(Color.YELLOW);
		etiqueta5.setOpaque(true);
		etiqueta5.setBorder(BorderFactory.createLineBorder(Color.black));
		registro.add(etiqueta5);
		
		//Caja de texto
		JTextField email = new JTextField();
		email.setBounds(110, 100, 260, 30);
		email.setFont(etiquetas2);
		email.setBackground(Color.cyan);
		email.setOpaque(true);
		registro.add(email);
		
		//Área de texto
		JTextArea biografia = new JTextArea();
		biografia.setBounds(110, 160, 260, 80);
		biografia.setFont(etiquetas2);
		biografia.setBackground(Color.cyan);
		biografia.setOpaque(true);
		registro.add(biografia);
		
		//Botón
		JButton access = new JButton("Crear cuenta");
		access.setBounds(140, 400, 200, 30);
		access.setFont(etiquetas);
		access.setHorizontalAlignment(JLabel.CENTER);
		access.setBackground(Color.ORANGE);
		access.setOpaque(true);
		registro.add(access);
		
		//Casillas de verificación
		ButtonGroup deportes = new ButtonGroup();
		
		JCheckBox futbol;
		futbol = new JCheckBox("Fútbol");
		futbol.setBounds(110, 275, 80, 20);
		futbol.setFont(etiquetas2);
		futbol.setHorizontalAlignment(JLabel.CENTER);
		futbol.setBackground(Color.lightGray);
		futbol.setOpaque(true);
		registro.add(futbol);
		
		JCheckBox beisbol;
		beisbol = new JCheckBox("Béisbol");
		beisbol.setBounds(200, 275, 80, 20);
		beisbol.setFont(etiquetas2);
		beisbol.setHorizontalAlignment(JLabel.CENTER);
		beisbol.setBackground(Color.lightGray);
		beisbol.setOpaque(true);
		registro.add(beisbol);
		
		JCheckBox basquetbol;
		basquetbol = new JCheckBox("Básquetbol", true);
		basquetbol.setBounds(290, 275, 80, 20);
		basquetbol.setFont(etiquetas2);
		basquetbol.setHorizontalAlignment(JLabel.CENTER);
		basquetbol.setBackground(Color.lightGray);
		basquetbol.setOpaque(true);
		basquetbol.setBorderPainted(true);
		basquetbol.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		registro.add(basquetbol);
		
		deportes.add(futbol);
		deportes.add(beisbol);
		deportes.add(basquetbol);
		
		//Caja de opciones
		String [] colonias_dataset = {"Centro", "Villas del Encanto", "Pedregal", "Agua Escondida", "Balandra", "Camino real"};
		
		JComboBox colonias = new JComboBox(colonias_dataset);
		colonias.setLocation(110, 365);
		colonias.setSize(260, 20);
		registro.add(colonias);
		
		registro.revalidate();
		
		//Botones radiales
		ButtonGroup terminos = new ButtonGroup();
		
		JRadioButton terms1 = new JRadioButton("Acepto los términos", true);
		terms1.setLocation(105, 335);
		terms1.setSize(120, 20);
		terms1.setFont(etiquetas2);
		terms1.setBackground(Color.lightGray);
		terms1.setBorderPainted(true);
		terms1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		registro.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("No acepto los términos");
		terms2.setLocation(235, 335);
		terms2.setSize(140, 20);
		terms2.setFont(etiquetas2);
		terms2.setBackground(Color.lightGray);
		registro.add(terms2);
		
		terminos.add(terms1);
		terminos.add(terms2);

		registro.revalidate();
		
		return registro;
		
	}
	
	public JPanel calculadora() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		JPanel calculadora = new JPanel();
		calculadora.setLocation(0, 0);
		calculadora.setSize(500, 500);
		calculadora.setOpaque(true);
		calculadora.setBackground(Color.BLACK);
		calculadora.setVisible(true);
		calculadora.setLayout(null);
		
		//Etiqueta
		JLabel pantalla = new JLabel("777.0");
		pantalla.setBounds(21, 20, 443, 50);
		pantalla.setFont(etiquetas);
		pantalla.setHorizontalAlignment(JLabel.CENTER);
		pantalla.setBackground(Color.WHITE);
		pantalla.setOpaque(true);
		calculadora.add(pantalla);
		
		//Botones
		JButton b1 = new JButton("CE");
		b1.setBounds(21, 75, 107, 70);
		b1.setFont(etiquetas);
		b1.setHorizontalAlignment(JLabel.CENTER);
		b1.setBackground(Color.YELLOW);
		b1.setOpaque(true);
		b1.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b1);
		
		JButton b2 = new JButton();
		b2.setBounds(133, 75, 107, 70);
		b2.setFont(etiquetas);
		b2.setHorizontalAlignment(JLabel.CENTER);
		b2.setBackground(Color.lightGray);
		b2.setOpaque(true);
		b2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b2);
		
		JButton b3 = new JButton();
		b3.setBounds(245, 75, 107, 70);
		b3.setFont(etiquetas);
		b3.setHorizontalAlignment(JLabel.CENTER);
		b3.setBackground(Color.lightGray);
		b3.setOpaque(true);
		b3.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b3);
		
		JButton b4 = new JButton();
		b4.setBounds(357, 75, 107, 70);
		b4.setFont(etiquetas);
		b4.setHorizontalAlignment(JLabel.CENTER);
		b4.setBackground(Color.lightGray);
		b4.setOpaque(true);
		b4.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b4);
		
		JButton b5 = new JButton("7");
		b5.setBounds(21, 150, 107, 70);
		b5.setFont(etiquetas);
		b5.setHorizontalAlignment(JLabel.CENTER);
		b5.setBackground(Color.lightGray);
		b5.setOpaque(true);
		b5.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b5);
		
		JButton b6 = new JButton("8");
		b6.setBounds(133, 150, 107, 70);
		b6.setFont(etiquetas);
		b6.setHorizontalAlignment(JLabel.CENTER);
		b6.setBackground(Color.lightGray);
		b6.setOpaque(true);
		b6.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b6);
		
		JButton b7 = new JButton("9");
		b7.setBounds(245, 150, 107, 70);
		b7.setFont(etiquetas);
		b7.setHorizontalAlignment(JLabel.CENTER);
		b7.setBackground(Color.lightGray);
		b7.setOpaque(true);
		b7.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b7);
		
		JButton b8 = new JButton("/");
		b8.setBounds(357, 150, 107, 70);
		b8.setFont(etiquetas);
		b8.setHorizontalAlignment(JLabel.CENTER);
		b8.setBackground(Color.ORANGE);
		b8.setOpaque(true);
		b8.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b8);
		
		JButton b9 = new JButton("4");
		b9.setBounds(21, 225, 107, 70);
		b9.setFont(etiquetas);
		b9.setHorizontalAlignment(JLabel.CENTER);
		b9.setBackground(Color.lightGray);
		b9.setOpaque(true);
		b9.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b9);
		
		JButton b10 = new JButton("5");
		b10.setBounds(133, 225, 107, 70);
		b10.setFont(etiquetas);
		b10.setHorizontalAlignment(JLabel.CENTER);
		b10.setBackground(Color.lightGray);
		b10.setOpaque(true);
		b10.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b10);
		
		JButton b11 = new JButton("6");
		b11.setBounds(245, 225, 107, 70);
		b11.setFont(etiquetas);
		b11.setHorizontalAlignment(JLabel.CENTER);
		b11.setBackground(Color.lightGray);
		b11.setOpaque(true);
		b11.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b11);
		
		JButton b12 = new JButton("*");
		b12.setBounds(357, 225, 107, 70);
		b12.setFont(etiquetas);
		b12.setHorizontalAlignment(JLabel.CENTER);
		b12.setBackground(Color.ORANGE);
		b12.setOpaque(true);
		b12.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b12);
		
		JButton b13 = new JButton("1");
		b13.setBounds(21, 300, 107, 70);
		b13.setFont(etiquetas);
		b13.setHorizontalAlignment(JLabel.CENTER);
		b13.setBackground(Color.lightGray);
		b13.setOpaque(true);
		b13.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b13);
		
		JButton b14 = new JButton("2");
		b14.setBounds(133, 300, 107, 70);
		b14.setFont(etiquetas);
		b14.setHorizontalAlignment(JLabel.CENTER);
		b14.setBackground(Color.lightGray);
		b14.setOpaque(true);
		b14.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b14);
		
		JButton b15 = new JButton("3");
		b15.setBounds(245, 300, 107, 70);
		b15.setFont(etiquetas);
		b15.setHorizontalAlignment(JLabel.CENTER);
		b15.setBackground(Color.lightGray);
		b15.setOpaque(true);
		b15.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b15);
		
		JButton b16 = new JButton("-");
		b16.setBounds(357, 300, 107, 70);
		b16.setFont(etiquetas);
		b16.setHorizontalAlignment(JLabel.CENTER);
		b16.setBackground(Color.ORANGE);
		b16.setOpaque(true);
		b16.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b16);
		
		JButton b17 = new JButton("0");
		b17.setBounds(21, 375, 107, 70);
		b17.setFont(etiquetas);
		b17.setHorizontalAlignment(JLabel.CENTER);
		b17.setBackground(Color.lightGray);
		b17.setOpaque(true);
		b17.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b17);
		
		JButton b18 = new JButton(".");
		b18.setBounds(133, 375, 107, 70);
		b18.setFont(etiquetas);
		b18.setHorizontalAlignment(JLabel.CENTER);
		b18.setBackground(Color.lightGray);
		b18.setOpaque(true);
		b18.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b18);
		
		JButton b19 = new JButton("=");
		b19.setBounds(245, 375, 107, 70);
		b19.setFont(etiquetas);
		b19.setHorizontalAlignment(JLabel.CENTER);
		b19.setBackground(Color.ORANGE);
		b19.setOpaque(true);
		b19.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b19);
		
		JButton b20 = new JButton("+");
		b20.setBounds(357, 375, 107, 70);
		b20.setFont(etiquetas);
		b20.setHorizontalAlignment(JLabel.CENTER);
		b20.setBackground(Color.ORANGE);
		b20.setOpaque(true);
		b20.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		calculadora.add(b20);
		
		/*calculadora.setLayout(new GridLayout(5, 4, 10, 10));*/
		
		calculadora.revalidate();
		
		return calculadora;
		
	}
	
	public JPanel usuarios() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		JPanel usuarios = new JPanel();
		usuarios.setLocation(0, 0);
		usuarios.setSize(1000, 500);
		usuarios.setOpaque(true);
		usuarios.setBackground(new Color(0, 128, 128));
		usuarios.setVisible(true);
		usuarios.setLayout(null);
		
		//Etiquetas
		JLabel etiqueta1 = new JLabel("Usuarios");
		etiqueta1.setSize(160, 40);
		etiqueta1.setLocation(420, 10);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.YELLOW);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		usuarios.add(etiqueta1);
		
		JLabel text1 = new JLabel("Total de usuarios: 35");
		text1.setBounds(50, 110, 250, 40);
		text1.setFont(etiquetas);
		text1.setHorizontalAlignment(JLabel.CENTER);
		text1.setBackground(Color.ORANGE);
		text1.setOpaque(true);
		text1.setBorder(BorderFactory.createLineBorder(Color.black));
		usuarios.add(text1);
		
		JLabel widget = new JLabel();
		widget.setBounds(30, 60, 220, 100);
		widget.setOpaque(true);
		widget.setBorder(BorderFactory.createLineBorder(Color.black,2));
		login().add(widget);
		
		//Botones
		JButton export = new JButton("Exportar");
		export.setBounds(690, 110, 120, 40);
		export.setBorder(BorderFactory.createLineBorder(Color.black,2));
		usuarios.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(820, 110, 120, 40);
		add.setBorder(BorderFactory.createLineBorder(Color.black,2));
		usuarios.add(add);
		
		//Tabla
		String[] columnNames = {
				"First Name",
				"Last Name",
				"Game",
				"Age",
				"Vegetarian"
				};
		
		Object[][] data = {
				{"Kathy", "Smith", "Snowboarding", 1995, true},
				{"John", "Doe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "Snowboarding", 1995, true},
				{"John", "Doe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "Snowboarding", 1995, true},
				{"John", "Doe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "Snowboarding", 1995, true},
				{"John", "Doe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "Snowboarding", 1995, true},
				{"John", "Doe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "Snowboarding", 1995, true},
				{"John", "Doe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "Snowboarding", 1995, true},
				{"John", "Doe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				};
		
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(930, 200);
		scrollPane.setLocation(30, 200);
		usuarios.add(scrollPane);
		
		usuarios.revalidate();
		
		return usuarios;
		
	}
	
	public JPanel calculadoraLayouts() {
		
		//CREACIÓN DE OBJETOS
		
		//Paneles
		JPanel calculadora = new JPanel();
		calculadora.setLocation(0, 0);
		calculadora.setSize(500, 500);
		calculadora.setOpaque(true);
		calculadora.setBackground(Color.BLACK);
		calculadora.setVisible(true);
		calculadora.setLayout(new BorderLayout());//BorderLayout
		
		JPanel pantalla = new JPanel();
		pantalla.setLocation(0, 0);
		pantalla.setSize(500, 100);
		pantalla.setOpaque(true);
		pantalla.setBackground(Color.WHITE);
		pantalla.setVisible(true);
		pantalla.setLayout(new FlowLayout());
		
		JPanel teclas = new JPanel();
		teclas.setLocation(0, 0);
		teclas.setSize(500, 400);
		teclas.setOpaque(true);
		teclas.setBackground(Color.BLACK);
		teclas.setVisible(true);
		teclas.setLayout(new GridLayout(5, 4));//GridLayout
		
		//Pantalla
		JLabel pantalla1 = new JLabel("777.0");
		//pantalla1.setBounds(21, 20, 443, 50);
		pantalla1.setFont(etiquetas);
		pantalla1.setHorizontalAlignment(JLabel.CENTER);
		pantalla1.setBackground(Color.WHITE);
		pantalla1.setOpaque(true);
		pantalla.add(pantalla1);
		calculadora.add(pantalla, BorderLayout.NORTH);//BorderLayout
		
		//Teclas
		JButton b1 = new JButton("CE");
		//b1.setBounds(21, 75, 107, 70);
		b1.setFont(etiquetas);
		b1.setHorizontalAlignment(JLabel.CENTER);
		b1.setBackground(Color.YELLOW);
		b1.setOpaque(true);
		b1.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b1);
		
		JButton b2 = new JButton();
		//b2.setBounds(133, 75, 107, 70);
		b2.setFont(etiquetas);
		b2.setHorizontalAlignment(JLabel.CENTER);
		b2.setBackground(Color.lightGray);
		b2.setOpaque(true);
		b2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b2);
		
		JButton b3 = new JButton();
		//b3.setBounds(245, 75, 107, 70);
		b3.setFont(etiquetas);
		b3.setHorizontalAlignment(JLabel.CENTER);
		b3.setBackground(Color.lightGray);
		b3.setOpaque(true);
		b3.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b3);
		
		JButton b4 = new JButton();
		//b4.setBounds(357, 75, 107, 70);
		b4.setFont(etiquetas);
		b4.setHorizontalAlignment(JLabel.CENTER);
		b4.setBackground(Color.lightGray);
		b4.setOpaque(true);
		b4.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b4);
		
		JButton b5 = new JButton("7");
		//b5.setBounds(21, 150, 107, 70);
		b5.setFont(etiquetas);
		b5.setHorizontalAlignment(JLabel.CENTER);
		b5.setBackground(Color.lightGray);
		b5.setOpaque(true);
		b5.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b5);
		
		JButton b6 = new JButton("8");
		//b6.setBounds(133, 150, 107, 70);
		b6.setFont(etiquetas);
		b6.setHorizontalAlignment(JLabel.CENTER);
		b6.setBackground(Color.lightGray);
		b6.setOpaque(true);
		b6.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b6);
		
		JButton b7 = new JButton("9");
		//b7.setBounds(245, 150, 107, 70);
		b7.setFont(etiquetas);
		b7.setHorizontalAlignment(JLabel.CENTER);
		b7.setBackground(Color.lightGray);
		b7.setOpaque(true);
		b7.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b7);
		
		JButton b8 = new JButton("/");
		//b8.setBounds(357, 150, 107, 70);
		b8.setFont(etiquetas);
		b8.setHorizontalAlignment(JLabel.CENTER);
		b8.setBackground(Color.ORANGE);
		b8.setOpaque(true);
		b8.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b8);
		
		JButton b9 = new JButton("4");
		//b9.setBounds(21, 225, 107, 70);
		b9.setFont(etiquetas);
		b9.setHorizontalAlignment(JLabel.CENTER);
		b9.setBackground(Color.lightGray);
		b9.setOpaque(true);
		b9.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b9);
		
		JButton b10 = new JButton("5");
		//b10.setBounds(133, 225, 107, 70);
		b10.setFont(etiquetas);
		b10.setHorizontalAlignment(JLabel.CENTER);
		b10.setBackground(Color.lightGray);
		b10.setOpaque(true);
		b10.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b10);
		
		JButton b11 = new JButton("6");
		//b11.setBounds(245, 225, 107, 70);
		b11.setFont(etiquetas);
		b11.setHorizontalAlignment(JLabel.CENTER);
		b11.setBackground(Color.lightGray);
		b11.setOpaque(true);
		b11.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b11);
		
		JButton b12 = new JButton("*");
		//b12.setBounds(357, 225, 107, 70);
		b12.setFont(etiquetas);
		b12.setHorizontalAlignment(JLabel.CENTER);
		b12.setBackground(Color.ORANGE);
		b12.setOpaque(true);
		b12.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b12);
		
		JButton b13 = new JButton("1");
		//b13.setBounds(21, 300, 107, 70);
		b13.setFont(etiquetas);
		b13.setHorizontalAlignment(JLabel.CENTER);
		b13.setBackground(Color.lightGray);
		b13.setOpaque(true);
		b13.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b13);
		
		JButton b14 = new JButton("2");
		//b14.setBounds(133, 300, 107, 70);
		b14.setFont(etiquetas);
		b14.setHorizontalAlignment(JLabel.CENTER);
		b14.setBackground(Color.lightGray);
		b14.setOpaque(true);
		b14.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b14);
		
		JButton b15 = new JButton("3");
		//b15.setBounds(245, 300, 107, 70);
		b15.setFont(etiquetas);
		b15.setHorizontalAlignment(JLabel.CENTER);
		b15.setBackground(Color.lightGray);
		b15.setOpaque(true);
		b15.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b15);
		
		JButton b16 = new JButton("-");
		//b16.setBounds(357, 300, 107, 70);
		b16.setFont(etiquetas);
		b16.setHorizontalAlignment(JLabel.CENTER);
		b16.setBackground(Color.ORANGE);
		b16.setOpaque(true);
		b16.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b16);
		
		JButton b17 = new JButton("0");
		//b17.setBounds(21, 375, 107, 70);
		b17.setFont(etiquetas);
		b17.setHorizontalAlignment(JLabel.CENTER);
		b17.setBackground(Color.lightGray);
		b17.setOpaque(true);
		b17.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b17);
		
		JButton b18 = new JButton(".");
		//b18.setBounds(133, 375, 107, 70);
		b18.setFont(etiquetas);
		b18.setHorizontalAlignment(JLabel.CENTER);
		b18.setBackground(Color.lightGray);
		b18.setOpaque(true);
		b18.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b18);
		
		JButton b19 = new JButton("=");
		//b19.setBounds(245, 375, 107, 70);
		b19.setFont(etiquetas);
		b19.setHorizontalAlignment(JLabel.CENTER);
		b19.setBackground(Color.ORANGE);
		b19.setOpaque(true);
		b19.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b19);
		
		JButton b20 = new JButton("+");
		b20.setBounds(357, 375, 107, 70);
		b20.setFont(etiquetas);
		b20.setHorizontalAlignment(JLabel.CENTER);
		b20.setBackground(Color.ORANGE);
		b20.setOpaque(true);
		b20.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b20);
		
		calculadora.add(teclas, BorderLayout.CENTER);//BorderLayout
		
		calculadora.revalidate();
		
		return calculadora;
		
	}
	
	public JPanel interfazLayouts() {
		
		//PANELES
		
		//Interfaz
		
		JPanel interfaz = new JPanel();
		interfaz.setLocation(0, 0);
		interfaz.setSize(500, 500);
		interfaz.setOpaque(true);
		interfaz.setBackground(Color.lightGray);
		interfaz.setVisible(true);
		
		//Interés

		JPanel interés = new JPanel();
		interfaz.setLocation(0, 0);
		interfaz.setSize(500, 500);
		interés.setOpaque(true);
		interés.setBackground(Color.GREEN);
		interés.setVisible(true);
		interés.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		interés.setLayout(new BorderLayout());//BorderLayout
		interfaz.add(interés);
		
		JPanel interés_título = new JPanel();
		interés_título.setOpaque(true);
		interés_título.setBackground(Color.GREEN);
		interés_título.setVisible(true);
		interés_título.setLayout(new FlowLayout(FlowLayout.LEFT));
		interés.add(interés_título, BorderLayout.NORTH);//Agregar a BorderLayout del panel interés
		
		JPanel interés_contenido = new JPanel();
		interés_contenido.setOpaque(true);
		interés_contenido.setBackground(Color.GREEN);
		interés_contenido.setVisible(true);
		interés_contenido.setLayout(new GridLayout(3, 2, 5, 5));//GridLayout
		interés.add(interés_contenido, BorderLayout.CENTER);//Agregar a BorderLayout del panel interés
		
		JPanel interés_botones = new JPanel();
		interés_botones.setOpaque(true);
		interés_botones.setBackground(Color.GREEN);
		interés_botones.setVisible(true);
		interés_botones.setLayout(new FlowLayout(FlowLayout.CENTER));
		interés.add(interés_botones, BorderLayout.SOUTH);//Agregar a BorderLayout del panel interés
		
		//Resultados
		
		JPanel resultados = new JPanel();
		resultados.setLocation(100, 100);
		resultados.setSize(500, 100);
		resultados.setOpaque(true);
		resultados.setBackground(Color.YELLOW);
		resultados.setVisible(true);
		resultados.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		resultados.setLayout(new GridLayout(2, 2));//GridLayout
		interfaz.add(resultados);
		
		//Etiquetas
		
		JLabel título_interfaz = new JLabel("Interés");//Interfaz
		resultados.setLocation(0, 0);
		resultados.setSize(50, 50);
		Font fuente_título_interfaz = new Font("Romana", Font.BOLD, 20);
		título_interfaz.setFont(fuente_título_interfaz);
		título_interfaz.setForeground(Color.RED);
		título_interfaz.setHorizontalAlignment(JLabel.CENTER);
		título_interfaz.setBackground(Color.lightGray);
		título_interfaz.setOpaque(true);
		interfaz.add(título_interfaz);
		
		JLabel título_interés = new JLabel("Calcular Interés");//Interés
		Font fuente_título_interés = new Font("Romana", Font.BOLD, 17);
		título_interés.setFont(fuente_título_interés);
		título_interés.setHorizontalAlignment(JLabel.CENTER);
		título_interés.setBackground(Color.GREEN);
		título_interés.setOpaque(true);
		interés_título.add(título_interés);
		
		JLabel capital = new JLabel("Capital:");
		capital.setFont(etiquetas3);
		capital.setHorizontalAlignment(JLabel.CENTER);
		capital.setBackground(Color.GREEN);
		capital.setOpaque(true);
		interés_contenido.add(capital);
		
		JLabel capital_texto = new JLabel("1500");
		capital_texto.setFont(etiquetas3);
		capital_texto.setHorizontalAlignment(JLabel.LEFT);
		capital_texto.setBackground(Color.WHITE);
		capital_texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		capital_texto.setOpaque(true);
		interés_contenido.add(capital_texto);
		
		JLabel tiempo = new JLabel("Tiempo:");
		tiempo.setFont(etiquetas3);
		tiempo.setHorizontalAlignment(JLabel.CENTER);
		tiempo.setBackground(Color.GREEN);
		tiempo.setOpaque(true);
		interés_contenido.add(tiempo);
		
		JLabel tiempo_texto = new JLabel("2");
		tiempo_texto.setFont(etiquetas3);
		tiempo_texto.setHorizontalAlignment(JLabel.LEFT);
		tiempo_texto.setBackground(Color.WHITE);
		tiempo_texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		tiempo_texto.setOpaque(true);
		interés_contenido.add(tiempo_texto);
		
		JLabel tasa_interés = new JLabel("Tasa interés:");
		tasa_interés.setFont(etiquetas3);
		tasa_interés.setHorizontalAlignment(JLabel.CENTER);
		tasa_interés.setBackground(Color.GREEN);
		tasa_interés.setOpaque(true);
		interés_contenido.add(tasa_interés);
		
		JLabel tasa_interés_texto = new JLabel("0.1");
		tasa_interés_texto.setFont(etiquetas3);
		tasa_interés_texto.setHorizontalAlignment(JLabel.LEFT);
		tasa_interés_texto.setBackground(Color.WHITE);
		tasa_interés_texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		tasa_interés_texto.setOpaque(true);
		interés_contenido.add(tasa_interés_texto);
		
		JLabel interés_resultados = new JLabel("Interés:");//Resultados
		interés_resultados.setFont(etiquetas3);
		interés_resultados.setHorizontalAlignment(JLabel.CENTER);
		interés_resultados.setBackground(Color.YELLOW);
		interés_resultados.setOpaque(true);
		resultados.add(interés_resultados);
		
		JLabel interés_texto = new JLabel("315.0000000000002");
		interés_texto.setFont(etiquetas3);
		interés_texto.setHorizontalAlignment(JLabel.LEFT);
		interés_texto.setBackground(Color.WHITE);
		interés_texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		interés_texto.setOpaque(true);
		resultados.add(interés_texto);
		
		JLabel monto = new JLabel("Monto:");
		monto.setFont(etiquetas3);
		monto.setHorizontalAlignment(JLabel.CENTER);
		monto.setBackground(Color.YELLOW);
		monto.setOpaque(true);
		monto.add(capital);
		
		JLabel monto_texto = new JLabel("1815.0000000000002");
		monto_texto.setFont(etiquetas3);
		monto_texto.setHorizontalAlignment(JLabel.LEFT);
		monto_texto.setBackground(Color.WHITE);
		monto_texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		monto_texto.setOpaque(true);
		resultados.add(monto_texto);
		
		//Botones
		
		JButton calcular = new JButton("Calcular");//Interés
		calcular.setFont(etiquetas3);
		calcular.setForeground(Color.WHITE);
		calcular.setHorizontalAlignment(JLabel.CENTER);
		calcular.setBackground(Color.BLACK);
		calcular.setOpaque(true);
		interés_botones.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(etiquetas3);
		cancelar.setForeground(Color.WHITE);
		cancelar.setHorizontalAlignment(JLabel.CENTER);
		cancelar.setBackground(Color.BLACK);
		cancelar.setOpaque(true);
		interés_botones.add(cancelar);
		
		interfaz.revalidate();
		
		return interfaz;
	}
	
}