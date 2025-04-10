//PACKAGE

package ventana;

//LIBRERÍAS A INCLUIR

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.BasicStroke;
import javax.imageio.ImageIO;
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
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//CLASE

public class Ventana extends JFrame{
	
	//CREACIÓN DE OBJETOS
	
	//Fuentes personalizadas
	
	Font etiquetas = new Font("Romana", Font.ROMAN_BASELINE, 22);
	
	Font etiquetas2 = new Font("Romana 2", Font.ROMAN_BASELINE, 10);
	
	Font etiquetas3 = new Font("Romana 3", Font.ROMAN_BASELINE, 17);
	
	Random Rand = new Random();

	protected Component frame;

	//CONSTRUCTOR
	
	public Ventana(String title) {
		
		//ATRIBUTOS
		
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("icons8-planeta-24.png"));//Ícono Personalizado
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(510, 550);
		this.setResizable(true);
		//this.setBackground(Color.BLACK);
		this.setLayout(null);
		
		//ACCIÓN AL CERRAR LA APLICACIÓN
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ELEMENTO SOBRE EL QUE SE COLOCARÁ EL ITEM
		
		this.setLocationRelativeTo(null);
		
		//LIMITACIÓN DE LA EDICIÓN DEL TAMAÑO
		
		this.setMinimumSize(new Dimension(400, 400));
		this.setMaximumSize(new Dimension(600, 600));
		
		//BARRA DE MENÚS
		
		//Barra
		
		JMenuBar barra = new JMenuBar();
		
		this.setJMenuBar(barra);
		
		//Opciones en la barra
		
		JMenu menu1 = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Ayuda");
		JMenu menu4 = new JMenu("Cuenta");
		JMenu menu5 = new JMenu("Usuarios");
		
		barra.add(menu1);
		barra.add(menu2);
		barra.add(menu4);
		barra.add(menu5);
		
		//Opciones en menu1
		
		JMenuItem op_new = new JMenuItem("Nuevo");
		JMenuItem op_open = new JMenuItem("Abrir");
		JMenuItem op_save = new JMenuItem("Guardar");
		JMenuItem op_close = new JMenuItem("Cerrar");
		
		menu1.add(op_new);
		menu1.add(op_open);
		menu1.add(op_save);
		menu1.add(op_close);
		
		JMenu menu3 = new JMenu("Segundo nivel");//Submenú en menu1
		menu1.add(menu3);
		
		JMenuItem op_1 = new JMenuItem("Opción 1");
		JMenuItem op_2 = new JMenuItem("Opción 2");
		JMenuItem op_3 = new JMenuItem("Opción 3");
		JMenuItem op_4 = new JMenuItem("Opción 4");
		
		menu3.add(op_1);
		menu3.add(op_2);
		menu3.add(op_3);
		menu3.add(op_4);
		
		//Opciones en menu2
		
		JRadioButtonMenuItem op_help = new JRadioButtonMenuItem ("Manual de usuario");
		
		JCheckBoxMenuItem op_support = new JCheckBoxMenuItem ("Soporte");
		
		JMenuItem Cómo_Crear = new JMenuItem("¿Cómo crear un usuario?");
		Cómo_Crear.addActionListener(new ActionListener() {////ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Cómo crear a un usuario");
				
			}
			
		});
		JMenuItem Cómo_Acceder = new JMenuItem("¿Cómo acceder al sistema?");
		Cómo_Acceder.addActionListener(new ActionListener() {////ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Cómo acceder al sistema");
				
			}
			
		});
		JMenuItem Cómo_Recuperar = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		Cómo_Recuperar.addActionListener(new ActionListener() {////ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Cómo recuperar contraseña");
				
			}
			
		});
		
		menu2.add(op_help);
		menu2.add(op_support);
		menu2.add(Cómo_Crear);
		menu2.add(Cómo_Acceder);
		menu2.add(Cómo_Recuperar);
		
		//Opciones en menu4
		
		JMenuItem Iniciar_Sesión = new JMenuItem("Iniciar sesión");
		Iniciar_Sesión.addActionListener(new ActionListener() {////ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Iniciar sesión");
				
			}
			
		});
		JMenuItem Registrarse = new JMenuItem("Registrarse");
		Registrarse.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Registro");
				
			}
			
		});
		JMenuItem Recuperación = new JMenuItem("Recuperación de cuenta");
		Recuperación.addActionListener(new ActionListener() {////ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Recuperar cuenta");
				
			}
			
		});
		
		menu4.add(Iniciar_Sesión);
		menu4.add(Registrarse);
		menu4.add(Recuperación);
		
		//Opciones en menu5
		JMenuItem Alta = new JMenuItem("Alta");
		Alta.addActionListener(new ActionListener() {////ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Alta de usuario");
				
			}
			
		});
		JMenuItem Baja = new JMenuItem("Baja");
		Baja.addActionListener(new ActionListener() {////ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Baja de usuario");
				
			}
			
		});
		JMenuItem Consultar = new JMenuItem("Consultar");
		Consultar.addActionListener(new ActionListener() {////ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Consultar");
				
			}
			
		});
		
		menu5.add(Alta);
		menu5.add(Baja);
		menu5.add(Consultar);
		
		//INTERFACES
		
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
		
		/*//Interfaz con Layouts
		
		this.add(this.interfazLayouts());*/
		
		/*//Logo de la aplicación
		
		this.add(this.logoAplicación());*/
		
		/*//Recuperación de cuenta
		
		this.add(this.recuperaciónCuenta());*/
		
		/*//Dar de alta a un usuario
		
		this.add(this.altaUsuario());*/
		
		/*//Dar de baja a un usuario
		
		this.add(this.bajaUsuario());*/
		
		/*//Crear a un usuario
		
		this.add(this.cómoCrearUsuario());*/
		
		/*//Cómo acceder al sistema
		
		this.add(this.cómoAccederSistema());*/
		
		/*//Cómo recuperar constraseña
		
		this.add(this.cómoRecuperarContraseña());*/
		
		//Crear botones aleatoriamente
		
		this.add(this.botonesAleatorios());
		
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
		//login.setBackground(Color.RED);
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
		//etiqueta2.setSize(80, 30);
		//etiqueta2.setLocation(60, 150);
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
		//ActionListener
		access.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Boolean validación_email = false, validación_contraseña = false;
				
				//System.out.println("Correcto");
				
				if (email.getText().equals("")) {//validación de llenado de casilla de email
					
					email.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					
				}
				else {
					
					email.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					
					validación_email = true;
					
				}
				
				String passText = new String(contraseña.getPassword());//validación de llenado de casilla de contraseña
				
				if (passText.equals("")) {
					
					contraseña.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					
				}
				else {
					
					contraseña.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					
					validación_contraseña = true;
					
				}
				
				if (validación_email && validación_contraseña) {//Mensajes de alerta
					
					if (email.getText().equals("jorgeamg@gmail.com")) {
						
						if (passText.equals("qwerty")) {
							
							//System.out.println("Acceso permitido: Bienvenido");
							
							JOptionPane.showMessageDialog(frame,
								    "Acceso permitido: Bienvenido",
								    "Acceso",
								    JOptionPane.PLAIN_MESSAGE);
							
						}
						else {
							
							//System.out.println("Contraseña incorrecta: Intente una vez más");
							
							JOptionPane.showMessageDialog(frame,
								    "Contraseña incorrecta: Intente una vez más",
								    "Contraseña",
								    JOptionPane.ERROR_MESSAGE);
							
						}
						
					}
					else {
						
						//System.out.println("Email incorrecto: Escriba uno válido");
						
						JOptionPane.showMessageDialog(frame,
							    "Email incorrecto: Escriba uno válido",
							    "Email",
							    JOptionPane.ERROR_MESSAGE);
						
					}	
				}
				else {
					
					if (validación_email) {
						
						if (email.getText().equals("jorgeamg@gmail.com")) {
							
							//System.out.println("Información faltante: Ingrese una contraseña");
							
							JOptionPane.showMessageDialog(frame,
								    "Información faltante: Ingrese una contraseña",
								    "Información",
								    JOptionPane.ERROR_MESSAGE);
							
						}
						else {
							
							//System.out.println("Email incorrecto: Escriba uno válido");
							
							JOptionPane.showMessageDialog(frame,
								    "Email incorrecto: Escriba uno válido",
								    "Email",
								    JOptionPane.ERROR_MESSAGE);
							
						}
						
					}
					else {
						
						//System.out.println("Información faltante: Ingrese un email");
						
						JOptionPane.showMessageDialog(frame,
							    "Información faltante: Ingrese un email",
							    "Información",
							    JOptionPane.ERROR_MESSAGE);
						
					}
					
				}
				
			}
			
		});
		
		JButton c_olvidada = new JButton("¿Olvidó su contraseña?");
		c_olvidada.setBounds(227, 360, 143, 20);
		c_olvidada.setFont(etiquetas2);
		c_olvidada.setHorizontalAlignment(JLabel.CENTER);
		c_olvidada.setBackground(new Color(0, 128, 128));
		c_olvidada.setOpaque(true);
		login.add(c_olvidada);
		
		JButton registrarse = new JButton("Registrarse");
		registrarse.setBounds(190, 450, 100, 20);
		registrarse.setFont(etiquetas2);
		registrarse.setHorizontalAlignment(JLabel.CENTER);
		registrarse.setBackground(new Color(0, 128, 128));
		registrarse.setOpaque(true);
		login.add(registrarse);
		registrarse.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Registro");
				
			}
			
		});
		
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
		
		//Botones
		
		JButton access = new JButton("Crear cuenta");
		access.setBounds(140, 400, 200, 30);
		access.setFont(etiquetas);
		access.setHorizontalAlignment(JLabel.CENTER);
		access.setBackground(Color.ORANGE);
		access.setOpaque(true);
		registro.add(access);
		//ActionListener
		access.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (email.getText().equals("")) {//validación de llenado de casilla de email
					
					email.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					
				}
				else {
					
					email.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					
				}
				
				if (biografia.getText().equals("")) {//validación de llenado de área de texto: biografía
					
					biografia.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					
				}
				else {
					
					biografia.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					
				}
			}
			
		});
		
		JButton Iniciar_Sesión = new JButton("Iniciar Sesión");
		Iniciar_Sesión.setBounds(190, 435, 100, 20);
		Iniciar_Sesión.setFont(etiquetas2);
		Iniciar_Sesión.setHorizontalAlignment(JLabel.CENTER);
		Iniciar_Sesión.setBackground(Color.WHITE);
		Iniciar_Sesión.setOpaque(true);
		registro.add(Iniciar_Sesión);
		Iniciar_Sesión.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Iniciar sesión");
				
			}
			
		});
		
		JButton volver = new JButton("Volver");
		volver.setBounds(190, 460, 100, 20);
		volver.setFont(etiquetas3);
		volver.setHorizontalAlignment(JLabel.CENTER);
		volver.setBackground(Color.ORANGE);
		registro.add(volver);
		volver.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Regresar a la ventana principal");
				
			}
			
		});

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
		usuarios.setSize(500, 500);
		usuarios.setOpaque(true);
		usuarios.setBackground(new Color(0, 128, 128));
		usuarios.setVisible(true);
		usuarios.setLayout(null);
		
		//Etiquetas
		JLabel etiqueta1 = new JLabel("Usuarios");
		etiqueta1.setSize(160, 40);
		etiqueta1.setLocation(170, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.YELLOW);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		usuarios.add(etiqueta1);
		
		JLabel text1 = new JLabel("Total de usuarios: 35");
		text1.setBounds(15, 110, 200, 30);
		text1.setFont(etiquetas3);
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
		export.setBounds(120, 155, 120, 30);
		export.setBorder(BorderFactory.createLineBorder(Color.black,2));
		usuarios.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(260, 155, 120, 30);
		add.setBorder(BorderFactory.createLineBorder(Color.black,2));
		usuarios.add(add);
		
		JButton volver = new JButton("Volver");
		volver.setBounds(190, 450, 100, 20);
		volver.setFont(etiquetas3);
		volver.setHorizontalAlignment(JLabel.CENTER);
		volver.setBackground(Color.ORANGE);
		usuarios.add(volver);
		volver.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Regresar a la ventana principal");
				
			}
			
		});
		
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
		scrollPane.setSize(485, 200);
		scrollPane.setLocation(5, 200);
		usuarios.add(scrollPane);
		
		usuarios.revalidate();
		
		return usuarios;
		
	}
	
	public JPanel calculadoraLayouts() {
		
		//PANELES
		
		//Calculadora
		
		JPanel calculadora = new JPanel();
		calculadora.setLocation(0, 0);
		calculadora.setSize(500, 500);
		calculadora.setOpaque(true);
		calculadora.setBackground(Color.BLACK);
		calculadora.setVisible(true);
		calculadora.setLayout(new BorderLayout());//BorderLayout
		
		//Pantalla
		
		JPanel pantalla = new JPanel();
		pantalla.setLocation(0, 0);
		pantalla.setSize(500, 100);
		pantalla.setOpaque(true);
		pantalla.setBackground(Color.WHITE);
		pantalla.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
		pantalla.setVisible(true);
		pantalla.setLayout(new FlowLayout());
		
		calculadora.add(pantalla, BorderLayout.NORTH);//Agregar al BorderLayout del panel calculadora
		
		//Teclas
		
		JPanel teclas = new JPanel();
		teclas.setLocation(0, 0);
		teclas.setSize(500, 400);
		teclas.setOpaque(true);
		teclas.setBackground(Color.BLACK);
		teclas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 9));
		teclas.setVisible(true);
		teclas.setLayout(new GridLayout(5, 4, 10, 10));//GridLayout
		
		calculadora.add(teclas, BorderLayout.CENTER);//Agregar al BorderLayout del panel calculadora
		
		//ETIQUETAS
		
		//Pantalla
		
		JLabel pantalla1 = new JLabel("777.0");
		pantalla1.setFont(etiquetas);
		pantalla1.setHorizontalAlignment(JLabel.CENTER);
		pantalla1.setBackground(Color.WHITE);
		pantalla1.setOpaque(true);
		pantalla.add(pantalla1);
		
		//Teclas
		
		JButton b1 = new JButton("CE");
		/*b1.setBounds(21, 75, 107, 70);*/
		b1.setFont(etiquetas);
		b1.setHorizontalAlignment(JLabel.CENTER);
		b1.setBackground(Color.YELLOW);
		b1.setOpaque(true);
		b1.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b1);
		
		JButton b2 = new JButton();
		/*b2.setBounds(133, 75, 107, 70);*/
		b2.setFont(etiquetas);
		b2.setHorizontalAlignment(JLabel.CENTER);
		b2.setBackground(Color.lightGray);
		b2.setOpaque(true);
		b2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b2);
		
		JButton b3 = new JButton();
		/*b3.setBounds(245, 75, 107, 70);*/
		b3.setFont(etiquetas);
		b3.setHorizontalAlignment(JLabel.CENTER);
		b3.setBackground(Color.lightGray);
		b3.setOpaque(true);
		b3.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b3);
		
		JButton b4 = new JButton();
		/*b4.setBounds(357, 75, 107, 70);*/
		b4.setFont(etiquetas);
		b4.setHorizontalAlignment(JLabel.CENTER);
		b4.setBackground(Color.lightGray);
		b4.setOpaque(true);
		b4.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b4);
		
		JButton b5 = new JButton("7");
		/*b5.setBounds(21, 150, 107, 70);*/
		b5.setFont(etiquetas);
		b5.setHorizontalAlignment(JLabel.CENTER);
		b5.setBackground(Color.lightGray);
		b5.setOpaque(true);
		b5.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b5);
		
		JButton b6 = new JButton("8");
		/*b6.setBounds(133, 150, 107, 70);*/
		b6.setFont(etiquetas);
		b6.setHorizontalAlignment(JLabel.CENTER);
		b6.setBackground(Color.lightGray);
		b6.setOpaque(true);
		b6.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b6);
		
		JButton b7 = new JButton("9");
		/*b7.setBounds(245, 150, 107, 70);*/
		b7.setFont(etiquetas);
		b7.setHorizontalAlignment(JLabel.CENTER);
		b7.setBackground(Color.lightGray);
		b7.setOpaque(true);
		b7.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b7);
		
		JButton b8 = new JButton("/");
		/*b8.setBounds(357, 150, 107, 70);*/
		b8.setFont(etiquetas);
		b8.setHorizontalAlignment(JLabel.CENTER);
		b8.setBackground(Color.ORANGE);
		b8.setOpaque(true);
		b8.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b8);
		
		JButton b9 = new JButton("4");
		/*b9.setBounds(21, 225, 107, 70);*/
		b9.setFont(etiquetas);
		b9.setHorizontalAlignment(JLabel.CENTER);
		b9.setBackground(Color.lightGray);
		b9.setOpaque(true);
		b9.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b9);
		
		JButton b10 = new JButton("5");
		/*b10.setBounds(133, 225, 107, 70);*/
		b10.setFont(etiquetas);
		b10.setHorizontalAlignment(JLabel.CENTER);
		b10.setBackground(Color.lightGray);
		b10.setOpaque(true);
		b10.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b10);
		
		JButton b11 = new JButton("6");
		/*b11.setBounds(245, 225, 107, 70);*/
		b11.setFont(etiquetas);
		b11.setHorizontalAlignment(JLabel.CENTER);
		b11.setBackground(Color.lightGray);
		b11.setOpaque(true);
		b11.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b11);
		
		JButton b12 = new JButton("*");
		/*b12.setBounds(357, 225, 107, 70);*/
		b12.setFont(etiquetas);
		b12.setHorizontalAlignment(JLabel.CENTER);
		b12.setBackground(Color.ORANGE);
		b12.setOpaque(true);
		b12.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b12);
		
		JButton b13 = new JButton("1");
		/*b13.setBounds(21, 300, 107, 70);*/
		b13.setFont(etiquetas);
		b13.setHorizontalAlignment(JLabel.CENTER);
		b13.setBackground(Color.lightGray);
		b13.setOpaque(true);
		b13.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b13);
		
		JButton b14 = new JButton("2");
		/*b14.setBounds(133, 300, 107, 70);*/
		b14.setFont(etiquetas);
		b14.setHorizontalAlignment(JLabel.CENTER);
		b14.setBackground(Color.lightGray);
		b14.setOpaque(true);
		b14.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b14);
		
		JButton b15 = new JButton("3");
		/*b15.setBounds(245, 300, 107, 70);*/
		b15.setFont(etiquetas);
		b15.setHorizontalAlignment(JLabel.CENTER);
		b15.setBackground(Color.lightGray);
		b15.setOpaque(true);
		b15.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b15);
		
		JButton b16 = new JButton("-");
		/*b16.setBounds(357, 300, 107, 70);*/
		b16.setFont(etiquetas);
		b16.setHorizontalAlignment(JLabel.CENTER);
		b16.setBackground(Color.ORANGE);
		b16.setOpaque(true);
		b16.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b16);
		
		JButton b17 = new JButton("0");
		/*b17.setBounds(21, 375, 107, 70);*/
		b17.setFont(etiquetas);
		b17.setHorizontalAlignment(JLabel.CENTER);
		b17.setBackground(Color.lightGray);
		b17.setOpaque(true);
		b17.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b17);
		
		JButton b18 = new JButton(".");
		/*b18.setBounds(133, 375, 107, 70);*/
		b18.setFont(etiquetas);
		b18.setHorizontalAlignment(JLabel.CENTER);
		b18.setBackground(Color.lightGray);
		b18.setOpaque(true);
		b18.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b18);
		
		JButton b19 = new JButton("=");
		/*b19.setBounds(245, 375, 107, 70);*/
		b19.setFont(etiquetas);
		b19.setHorizontalAlignment(JLabel.CENTER);
		b19.setBackground(Color.ORANGE);
		b19.setOpaque(true);
		b19.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b19);
		
		JButton b20 = new JButton("+");
		/*b20.setBounds(357, 375, 107, 70);*/
		b20.setFont(etiquetas);
		b20.setHorizontalAlignment(JLabel.CENTER);
		b20.setBackground(Color.ORANGE);
		b20.setOpaque(true);
		b20.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		teclas.add(b20);
		
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
		
		//ETIQUETAS
		
		//Interfaz
		
		JLabel título_interfaz = new JLabel("Interés");
		resultados.setLocation(0, 0);
		resultados.setSize(50, 50);
		Font fuente_título_interfaz = new Font("Romana", Font.BOLD, 20);
		título_interfaz.setFont(fuente_título_interfaz);
		título_interfaz.setForeground(Color.RED);
		título_interfaz.setHorizontalAlignment(JLabel.CENTER);
		título_interfaz.setBackground(Color.lightGray);
		título_interfaz.setOpaque(true);
		interfaz.add(título_interfaz);
		
		//Interés
		
		JLabel título_interés = new JLabel("Calcular Interés");
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
		
		//Resultados
		
		JLabel interés_resultados = new JLabel("Interés:");
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
		
		//BOTONES
		
		//Interés
		
		JButton calcular = new JButton("Calcular");
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
	
	public JPanel logoAplicación() {
		
		//PANEL
		
		//Interfaz
		
		JPanel interfaz = new JPanel();
		interfaz.setBounds(0, 0, 500, 500);
		interfaz.setOpaque(true);
		interfaz.setBackground(new Color(0, 128, 128));
		interfaz.setVisible(true);
		interfaz.setLayout(null);
		
		//ETIQUETAS
		
		//Interfaz
		
		JLabel Nota = new JLabel("Logo de la aplicación");//Nota
		Nota.setBounds(140, 120, 220, 35);
		Font Fuente_Nota = new Font("Romana", Font.BOLD, 20);
		Nota.setFont(Fuente_Nota);
		Nota.setForeground(Color.RED);
		Nota.setHorizontalAlignment(JLabel.CENTER);
		Nota.setBackground(Color.lightGray);
		Nota.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		Nota.setOpaque(true);
		interfaz.add(Nota);
	
		JLabel Logo_Aplicación = new JLabel(new ImageIcon("icons8-planeta-96.png"));//Logo de la aplicación
		Logo_Aplicación.setBounds(200, 180, 96, 96);
		interfaz.add(Logo_Aplicación);
		
		interfaz.revalidate();
		
		return interfaz;
		
	}
	
	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		/*//DISEÑO CON LIBRERÍA GRAPHICS
		
		g2.setColor(Color.red);
		g2.drawRect(80, 80, 400, 400);
		g2.fillRect(200, 200, 200, 200);
		g2.clearRect(220, 220, 50, 50);
		
		g2.setColor(Color.blue);
		g2.fillRoundRect(300, 80, 200, 200, 10, 10);
		
		g2.setColor(Color.green);
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(100, 100, 900, 500);
		
		g2.setStroke(new BasicStroke(5));
		g2.setColor(new Color(229, 114, 126));
		g2.drawOval(400, 400, 90, 90);
		g2.fillOval(400, 450, 75, 150);
		
		g2.setColor(new Color(207, 147, 240));
		g2.drawArc(600, 200, 200, 200, 1, -180);
		g2.fillArc(600, 200, 200, 200, 1, 180);
		
		//g2.setColor(new Color(51, 167, 241, 0.5));//El 0.5 es el Canal Alfa del RGB (transparencia del texto)
		g2.setColor(Color.decode("#33A7F1"));
		g2.setFont(etiquetas);
		g2.drawString("Hola Mundo", 350, 200);
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("icons8-saturno-60.png"));
			
			g2.drawImage(image,
					800,
					250,
					100,
					100, Color.gray, null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		int [] xs = {100, 100, 400};
		int [] ys = {100, 200, 400};
		g2.drawPolygon(xs, ys, 3);
		int [] xs2 = {600, 500, 100};
		int [] ys2 = {600, 200, 150};
		//g2.fillPolygon(xs2, ys2, 3);*/
		
		/*//DIBUJO DE CASA CON CERCO
		
		//Cielo
		
		g2.setColor(new Color(51, 221, 255));
		g2.fillRect(0, 0, 650, 620);
		
		//Sol
		
		g2.setColor(new Color(250, 192, 59));
		g2.fillArc(27, 50, 100, 100, 1, 360);
		
		//Tierra
		
		g2.setColor(new Color(118, 84, 5));//Oscura
		g2.fillRect(0, 590, 650, 30);
		g2.setColor(new Color(193, 137, 10));//Clara
		g2.fillRect(0, 560, 650, 30);
		
		//Pasto
		
		g2.setColor(new Color(43, 188, 11));//Claro
		g2.fillRect(0, 530, 650, 30);
		g2.setColor(new Color(24, 91, 9));//Oscuro
		g2.fillRect(0, 515, 650, 15);
		
		//Cerco
		
		g2.setColor(new Color(147, 98, 11));//Maderos verticales
		g2.fillRect(0, 400, 40, 115);
		g2.fillRect(45, 400, 40, 115);
		g2.fillRect(90, 400, 40, 115);
		g2.fillRect(135, 400, 40, 115);
		g2.fillRect(180, 400, 40, 115);
		g2.fillRect(225, 400, 40, 115);
		g2.fillRect(270, 400, 40, 115);
		g2.fillRect(315, 400, 40, 115);
		g2.fillRect(360, 400, 40, 115);
		g2.fillRect(405, 400, 40, 115);
		g2.fillRect(450, 400, 40, 115);
		g2.fillRect(495, 400, 40, 115);
		g2.fillRect(540, 400, 40, 115);
		g2.fillRect(585, 400, 40, 115);
		g2.fillRect(630, 400, 20, 115);
		g2.setColor(new Color(105, 71, 11));//Maderos horizontales
		g2.fillRect(0, 410, 650, 15);
		g2.fillRect(0, 450, 650, 15);
		g2.fillRect(0, 490, 650, 15);
		
		//Casa
		
		g2.setColor(new Color(250, 233, 125));//Paredes
		g2.fillRect(135, 300, 375, 215);
		g2.setColor(new Color(105, 71, 11));//Marco de la puerta
		g2.fillRect(290, 415, 60, 100);
		g2.setColor(new Color(147, 98, 11));//Puerta
		g2.fillRect(295, 420, 50, 95);
		g2.setColor(Color.white);//Chapa
		g2.fillArc(335, 470, 5, 5, 1, 360);
		g2.setColor(new Color(166, 30, 9));//Marcos externos de las ventanas
		g2.fillRect(170, 370, 90, 60);
		g2.fillRect(380, 370, 90, 60);
		g2.setColor(Color.white);
		g2.fillRect(175, 375, 80, 50);//Ventanas
		g2.fillRect(200, 375, 5, 50);
		g2.fillRect(385, 375, 80, 50);
		g2.setColor(new Color(166, 30, 9));//Marcos internos de las ventanas
		g2.fillRect(213, 375, 5, 50);
		g2.fillRect(423, 375, 5, 50);
		g2.fillRect(170, 398, 90, 2);
		g2.fillRect(380, 398, 90, 2);
		g2.setColor(Color.GRAY);//Chimenea
		g2.fillRect(440, 180, 50, 120);
		g2.setColor(new Color(166, 30, 9));//Techo
		int [] xs = {100, 318, 540};
		int [] ys = {300, 150, 300};
		g2.fillPolygon(xs, ys, 3);*/
		
		/*//DIBUJO DE VIDEOJUEGO MARIO BROS
		
		//Cielo
		
		g2.setColor(Color.decode("#a2f0ff"));
		g2.fillRect(0, 0, 630, 464);
		
		//Piso
		
		g2.setColor(Color.decode("#ff9766"));//Oscuro y con líneas
		g2.fillRect(0, 408, 630, 56);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(7));
		g2.drawLine(0, 427, 60, 465);
		g2.drawLine(40, 427, 100, 465);
		g2.drawLine(80, 427, 140, 465);
		g2.drawLine(120, 427, 180, 465);
		g2.drawLine(160, 427, 220, 465);
		g2.drawLine(200, 427, 260, 465);
		g2.drawLine(240, 427, 300, 465);
		g2.drawLine(280, 427, 340, 465);
		g2.drawLine(320, 427, 380, 465);
		g2.drawLine(360, 427, 420, 465);
		g2.drawLine(400, 427, 460, 465);
		g2.drawLine(440, 427, 500, 465);
		g2.drawLine(480, 427, 540, 465);
		g2.drawLine(520, 427, 580, 465);
		g2.drawLine(560, 427, 620, 465);
		g2.drawLine(600, 427, 660, 465);
		g2.setColor(Color.BLACK);//Claro
		g2.fillRect(0, 408, 630, 17);
		g2.setColor(Color.decode("#ffc0b5"));
		g2.fillRect(0, 411, 630, 11);
		
		//Muro Verde
		
		g2.setColor(Color.BLACK);
		g2.fillRect(530, 288, 120, 120);
		g2.setColor(Color.decode("#00dd5b"));
		g2.fillRect(533, 292, 115, 115);
		g2.setColor(Color.decode("#0a5f1f"));
		g2.fillRect(533, 402, 115, 5);
		g2.setColor(Color.BLACK);
		g2.fillArc(535, 295, 15, 15, 0, 360);
		g2.setColor(Color.decode("#bdcbcd"));
		g2.fillArc(537, 297, 11, 11, 0, 360);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		g2.drawLine(538, 306, 547, 299);
		g2.setColor(Color.BLACK);
		g2.fillArc(535, 390, 15, 15, 0, 360);
		g2.setColor(Color.decode("#bdcbcd"));
		g2.fillArc(537, 392, 11, 11, 0, 360);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		g2.drawLine(538, 401, 547, 394);
		
		//Tubería
		
		g2.setColor(Color.BLACK);
		g2.fillRect(310, 288, 90, 35);
		g2.setColor(Color.decode("#008a00"));
		g2.fillRect(312, 291, 86, 29);
		g2.setColor(Color.BLACK);
		g2.fillRect(315, 322, 81, 86);
		g2.setColor(Color.decode("#008a00"));
		g2.fillRect(317, 323, 77, 84);
		g2.setColor(Color.WHITE);
		g2.fillRect(330, 291, 7, 29);
		g2.setColor(Color.WHITE);
		g2.fillRect(335, 323, 7, 84);
		
		//Mario
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("Mario.png"));
			
			g2.drawImage(image,
					210,
					350,
					35,
					60, null);
		}catch (IOException e) {
			e.printStackTrace();
		}*/
		
		/*//DIBUJO DE VIDEOJUEGO MARIO BROS 2
		
		//Cielo
		
		g2.setColor(Color.decode("#0665c0"));
		g2.fillRect(0, 0, 630, 464);
		
		//Piso
		
		g2.setColor(Color.decode("#cf9e5f"));//Tierra
		g2.fillRect(0, 408, 630, 56);
		g2.setColor(Color.BLACK);//Pasto
		g2.fillRect(0, 408, 630, 17);
		g2.setColor(Color.decode("#18b22a"));
		g2.fillRect(0, 411, 630, 11);
		
		//Tubería
		
		g2.setColor(Color.BLACK);
		g2.fillRect(310, 288, 90, 35);
		g2.setColor(Color.decode("#6e6bb7"));
		g2.fillRect(312, 291, 86, 29);
		g2.setColor(Color.BLACK);
		g2.fillRect(315, 322, 81, 86);
		g2.setColor(Color.decode("#6e6bb7"));
		g2.fillRect(317, 323, 77, 84);
		g2.setColor(Color.WHITE);
		g2.fillRect(330, 291, 7, 29);
		g2.setColor(Color.WHITE);
		g2.fillRect(335, 323, 7, 84);
		
		//Mario
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("Mario.png"));
			
			g2.drawImage(image,
					275,
					350,
					35,
					60, null);
		}catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//this.repaint();
		
	}
	
	public void administrador(String blanco) {
		
		this.getContentPane().removeAll();
		
		if (blanco.equals("Registro")) {
			
			this.add(this.registro());
			
		}
		if (blanco.equals("Iniciar sesión")) {
			
			this.add(this.login());
		}
		if (blanco.equals("Recuperar cuenta")) {
					
			this.add(this.recuperaciónCuenta());
		}
		if (blanco.equals("Alta de usuario")) {
			
			this.add(this.altaUsuario());
		}
		if (blanco.equals("Baja de usuario")) {
			
			this.add(this.bajaUsuario());
		}
		if (blanco.equals("Consultar")) {
			
			this.add(this.usuarios());
		}
		if (blanco.equals("Cómo crear a un usuario")) {
			
			this.add(this.cómoCrearUsuario());
		}
		if (blanco.equals("Cómo acceder al sistema")) {
			
			this.add(this.cómoAccederSistema());
		}
		if (blanco.equals("Cómo recuperar contraseña")) {
			
			this.add(this.cómoRecuperarContraseña());
		}
		if (blanco.equals("Regresar a la ventana principal")) {
			
			this.add(this.ventanaPrincipal());
		}
		
		this.repaint();
		
		this.revalidate();
		
	}

	public JPanel recuperaciónCuenta() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		
		JPanel recuperaciónCuenta = new JPanel();
		recuperaciónCuenta.setLocation(0, 0);
		recuperaciónCuenta.setSize(500, 500);
		recuperaciónCuenta.setOpaque(true);
		recuperaciónCuenta.setBackground(Color.WHITE);
		recuperaciónCuenta.setVisible(true);
		recuperaciónCuenta.setLayout(null);
		
		//Etiquetas
		
		JLabel etiqueta1 = new JLabel("Recuperación de cuenta");
		etiqueta1.setSize(470, 30);
		etiqueta1.setLocation(13, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.GREEN);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		recuperaciónCuenta.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Ingrese su correo electrónico de restablecimiento:");
		etiqueta2.setSize(300, 20);
		etiqueta2.setLocation(90, 100);
		etiqueta2.setFont(etiquetas2);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setBackground(Color.WHITE);
		recuperaciónCuenta.add(etiqueta2);
		
		//Caja de texto
		
		JTextField email = new JTextField();
		email.setBounds(110, 150, 260, 30);
		email.setFont(etiquetas2);
		email.setBackground(Color.cyan);
		email.setOpaque(true);
		recuperaciónCuenta.add(email);
		
		//Botones
		
		JButton enviar = new JButton("Enviar");
		enviar.setBounds(200, 200, 90, 20);
		enviar.setFont(etiquetas3);
		enviar.setHorizontalAlignment(JLabel.CENTER);
		enviar.setBackground(Color.ORANGE);
		recuperaciónCuenta.add(enviar);
		
		JButton volver = new JButton("Volver");
		volver.setBounds(195, 450, 100, 20);
		volver.setFont(etiquetas3);
		volver.setHorizontalAlignment(JLabel.CENTER);
		volver.setBackground(Color.ORANGE);
		recuperaciónCuenta.add(volver);
		volver.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Regresar a la ventana principal");
				
			}
			
		});
		
		recuperaciónCuenta.revalidate();
		
		return recuperaciónCuenta;
		
	}
	
	public JPanel altaUsuario() {
			
		//CREACIÓN DE OBJETOS
		
		//Panel
		
		JPanel altaUsuario = new JPanel();
		altaUsuario.setLocation(0, 0);
		altaUsuario.setSize(500, 500);
		altaUsuario.setOpaque(true);
		altaUsuario.setBackground(Color.WHITE);
		altaUsuario.setVisible(true);
		altaUsuario.setLayout(null);
		
		//Etiquetas
		
		JLabel etiqueta1 = new JLabel("Dar de alta a un usuario");
		etiqueta1.setSize(470, 30);
		etiqueta1.setLocation(13, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.GREEN);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		altaUsuario.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Ingrese el correo electrónico:");
		etiqueta2.setSize(300, 20);
		etiqueta2.setLocation(90, 100);
		etiqueta2.setFont(etiquetas2);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setBackground(Color.WHITE);
		altaUsuario.add(etiqueta2);
		
		//Caja de texto
		
		JTextField email = new JTextField();
		email.setBounds(110, 125, 260, 30);
		email.setFont(etiquetas2);
		email.setBackground(Color.cyan);
		email.setOpaque(true);
		altaUsuario.add(email);
		
		//Botones
		
		JButton alta = new JButton("Dar de alta");
		alta.setBounds(190, 165, 100, 20);
		alta.setFont(etiquetas2);
		alta.setHorizontalAlignment(JLabel.CENTER);
		alta.setBackground(Color.ORANGE);
		altaUsuario.add(alta);
		
		JButton volver = new JButton("Volver");
		volver.setBounds(190, 450, 100, 20);
		volver.setFont(etiquetas3);
		volver.setHorizontalAlignment(JLabel.CENTER);
		volver.setBackground(Color.ORANGE);
		altaUsuario.add(volver);
		volver.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Regresar a la ventana principal");
				
			}
			
		});
		
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
		scrollPane.setSize(485, 200);
		scrollPane.setLocation(5, 200);
		altaUsuario.add(scrollPane);
	
		altaUsuario.revalidate();
		
		return altaUsuario;
	
	}
		
	public JPanel bajaUsuario() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		
		JPanel bajaUsuario = new JPanel();
		bajaUsuario.setLocation(0, 0);
		bajaUsuario.setSize(500, 500);
		bajaUsuario.setOpaque(true);
		bajaUsuario.setBackground(Color.WHITE);
		bajaUsuario.setVisible(true);
		bajaUsuario.setLayout(null);
		
		//Etiquetas
		
		JLabel etiqueta1 = new JLabel("Dar de baja a un usuario");
		etiqueta1.setSize(470, 30);
		etiqueta1.setLocation(13, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.GREEN);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		bajaUsuario.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Ingrese el correo electrónico:");
		etiqueta2.setSize(300, 20);
		etiqueta2.setLocation(90, 100);
		etiqueta2.setFont(etiquetas2);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setBackground(Color.WHITE);
		bajaUsuario.add(etiqueta2);
		
		//Caja de texto
		
		JTextField email = new JTextField();
		email.setBounds(110, 125, 260, 30);
		email.setFont(etiquetas2);
		email.setBackground(Color.cyan);
		email.setOpaque(true);
		bajaUsuario.add(email);
		
		//Botones
		
		JButton baja = new JButton("Dar de baja");
		baja.setBounds(190, 165, 100, 20);
		baja.setFont(etiquetas2);
		baja.setHorizontalAlignment(JLabel.CENTER);
		baja.setBackground(Color.ORANGE);
		bajaUsuario.add(baja);
		
		JButton volver = new JButton("Volver");
		volver.setBounds(190, 450, 100, 20);
		volver.setFont(etiquetas3);
		volver.setHorizontalAlignment(JLabel.CENTER);
		volver.setBackground(Color.ORANGE);
		bajaUsuario.add(volver);
		volver.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Regresar a la ventana principal");
				
			}
			
		});
		
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
		scrollPane.setSize(485, 200);
		scrollPane.setLocation(5, 200);
		bajaUsuario.add(scrollPane);
	
		bajaUsuario.revalidate();
		
		return bajaUsuario;
		
	}
	
	public JPanel cómoCrearUsuario() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		
		JPanel cómoCrearUsuario = new JPanel();
		cómoCrearUsuario.setLocation(0, 0);
		cómoCrearUsuario.setSize(500, 500);
		cómoCrearUsuario.setOpaque(true);
		cómoCrearUsuario.setBackground(Color.WHITE);
		cómoCrearUsuario.setVisible(true);
		cómoCrearUsuario.setLayout(null);
		
		//Etiquetas
		
		JLabel etiqueta1 = new JLabel("Crear a un usuario");
		etiqueta1.setSize(470, 30);
		etiqueta1.setLocation(13, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.GREEN);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		cómoCrearUsuario.add(etiqueta1);
		
		//Área de texto
		
		JTextArea biografia = new JTextArea("Hacer click en el menú: Usuarios, ubicado en la \n"
				+ "barra de navegación; y después en la opción: \n"
				+ "Alta, ahí la interfaz lo guiará \n"
				+ "en el proceso de creación de un usuario.");
		biografia.setBounds(110, 80, 260, 300);
		biografia.setFont(etiquetas2);
		biografia.setBackground(Color.cyan);
		biografia.setOpaque(true);
		cómoCrearUsuario.add(biografia);
		
		//Botones
		
		JButton volver = new JButton("Volver");
		volver.setBounds(190, 450, 100, 20);
		volver.setFont(etiquetas3);
		volver.setHorizontalAlignment(JLabel.CENTER);
		volver.setBackground(Color.ORANGE);
		cómoCrearUsuario.add(volver);
		volver.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Regresar a la ventana principal");
				
			}
			
		});
	
		cómoCrearUsuario.revalidate();
		
		return cómoCrearUsuario;
	
	}
		
	public JPanel cómoAccederSistema() {
	
		//CREACIÓN DE OBJETOS
		
		//Panel
		
		JPanel cómoAccederSistema = new JPanel();
		cómoAccederSistema.setLocation(0, 0);
		cómoAccederSistema.setSize(500, 500);
		cómoAccederSistema.setOpaque(true);
		cómoAccederSistema.setBackground(Color.WHITE);
		cómoAccederSistema.setVisible(true);
		cómoAccederSistema.setLayout(null);
		
		//Etiquetas
		
		JLabel etiqueta1 = new JLabel("Cómo acceder al sistema");
		etiqueta1.setSize(470, 30);
		etiqueta1.setLocation(13, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.GREEN);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		cómoAccederSistema.add(etiqueta1);
		
		//Área de texto
		
		JTextArea biografia = new JTextArea("Hacer click en el menú: Cuenta, ubicado en la \n"
				+ "barra de navegación; y después en la opción: \n"
				+ "Iniciar sesión, ahí la interfaz lo guiará \n"
				+ "en el proceso de acceso al sistema.");
		biografia.setBounds(110, 80, 260, 300);
		biografia.setFont(etiquetas2);
		biografia.setBackground(Color.cyan);
		biografia.setOpaque(true);
		cómoAccederSistema.add(biografia);
		
		//Botones
		
		JButton volver = new JButton("Volver");
		volver.setBounds(190, 450, 100, 20);
		volver.setFont(etiquetas3);
		volver.setHorizontalAlignment(JLabel.CENTER);
		volver.setBackground(Color.ORANGE);
		cómoAccederSistema.add(volver);
		volver.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Regresar a la ventana principal");
				
			}
			
		});

		cómoAccederSistema.revalidate();
		
		return cómoAccederSistema;
		
	}
	
	public JPanel cómoRecuperarContraseña() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		
		JPanel cómoRecuperarContraseña = new JPanel();
		cómoRecuperarContraseña.setLocation(0, 0);
		cómoRecuperarContraseña.setSize(500, 500);
		cómoRecuperarContraseña.setOpaque(true);
		cómoRecuperarContraseña.setBackground(Color.WHITE);
		cómoRecuperarContraseña.setVisible(true);
		cómoRecuperarContraseña.setLayout(null);
		
		//Etiquetas
		
		JLabel etiqueta1 = new JLabel("Cómo recuperar contraseña");
		etiqueta1.setSize(470, 30);
		etiqueta1.setLocation(13, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.GREEN);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		cómoRecuperarContraseña.add(etiqueta1);
		
		//Área de texto
		
		JTextArea biografia = new JTextArea("Hacer click en el menú: Cuenta, ubicado en la \n"
				+ "barra de navegación; y después en la opción: \n"
				+ "Recuperación de cuenta, ahí la interfaz lo guiará \n"
				+ "en el proceso de recuperación de contraseña.");
		biografia.setBounds(110, 80, 260, 300);
		biografia.setFont(etiquetas2);
		biografia.setBackground(Color.cyan);
		biografia.setOpaque(true);
		cómoRecuperarContraseña.add(biografia);
		
		//Botones
		
		JButton volver = new JButton("Volver");
		volver.setBounds(190, 450, 100, 20);
		volver.setFont(etiquetas3);
		volver.setHorizontalAlignment(JLabel.CENTER);
		volver.setBackground(Color.ORANGE);
		cómoRecuperarContraseña.add(volver);
		volver.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				administrador("Regresar a la ventana principal");
				
			}
			
		});

		cómoRecuperarContraseña.revalidate();
		
		return cómoRecuperarContraseña;
		
	}
	
	public JPanel ventanaPrincipal() {
		
		//CREACIÓN DE OBJETOS
		
		//Panel
		
		JPanel ventanaPrincipal = new JPanel();
		ventanaPrincipal.setLocation(0, 0);
		ventanaPrincipal.setSize(500, 500);
		ventanaPrincipal.setOpaque(true);
		ventanaPrincipal.setBackground(Color.WHITE);
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setLayout(null);
		
		//Etiquetas
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(470, 30);
		etiqueta1.setLocation(13, 20);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.lightGray);
		etiqueta1.setOpaque(true);
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.black));
		ventanaPrincipal.add(etiqueta1);
		
		//Área de texto
		
		JTextArea biografia = new JTextArea("Seleccione alguna opción de algún menú \n"
				+ "en la barra de navegación, según la acción \n"
				+ "que desee realizar.");
		biografia.setBounds(110, 80, 260, 300);
		biografia.setFont(etiquetas2);
		biografia.setBackground(Color.cyan);
		biografia.setOpaque(true);
		ventanaPrincipal.add(biografia);

		ventanaPrincipal.revalidate();
		
		return ventanaPrincipal;
		
	}

	public JPanel botonesAleatorios() {
		
		/*//BOTONES ALEATORIOS
		
		JPanel botonesAleatorios = new JPanel ();
		botonesAleatorios.setSize(1000, 600);
		botonesAleatorios.setLocation(0, 0);
		botonesAleatorios.setLayout(null);
		botonesAleatorios.setOpaque(true);
		botonesAleatorios.setBackground(Color.GREEN);
		
		JButton principal = new JButton("Presióname");
		principal.setBounds(170, 205, 150, 80);
		principal.setFont(etiquetas3);
		principal.setHorizontalAlignment(JLabel.CENTER);
		principal.setBackground(Color.ORANGE);
		botonesAleatorios.add(principal);
		principal.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton principal = new JButton("Presióname");
				principal.setSize(Rand.nextInt(150), Rand.nextInt(80));
				principal.setLocation(Rand.nextInt(170), Rand.nextInt(205));
				principal.setHorizontalAlignment(JLabel.CENTER);
				principal.setBackground(new Color(Rand.nextInt(255), Rand.nextInt(255), Rand.nextInt(255)));
				botonesAleatorios.add(principal);
				
				botonesAleatorios.repaint();
				
			}
			
		});*/
		
		/*//ALERTAS EN BOTONES ALEATORIOS
		
		JPanel botonesAleatorios = new JPanel ();
		botonesAleatorios.setSize(1000, 600);
		botonesAleatorios.setLocation(0, 0);
		botonesAleatorios.setLayout(null);
		botonesAleatorios.setOpaque(true);
		botonesAleatorios.setBackground(Color.GREEN);
		
		JButton principal = new JButton("Presióname");
		principal.setBounds(170, 205, 150, 80);
		principal.setFont(etiquetas3);
		principal.setHorizontalAlignment(JLabel.CENTER);
		principal.setBackground(Color.ORANGE);
		botonesAleatorios.add(principal);
		principal.addActionListener(new ActionListener() {//ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton aleatorio = new JButton("Botón: " + Rand.nextInt(255));
				aleatorio.setSize(Rand.nextInt(150), Rand.nextInt(80));
				aleatorio.setLocation(Rand.nextInt(170), Rand.nextInt(205));
				aleatorio.setHorizontalAlignment(JLabel.CENTER);
				aleatorio.setBackground(new Color(Rand.nextInt(255), Rand.nextInt(255), Rand.nextInt(255)));
				botonesAleatorios.add(aleatorio);
				aleatorio.addActionListener(new ActionListener() {//ActionListener
					
					@Override
					public void actionPerformed(ActionEvent f) {
						
						JOptionPane.showMessageDialog(frame,
								((JButton) f.getSource()).getText(),
							    "Nombre del Botón",
							    JOptionPane.PLAIN_MESSAGE);
						
					}
					
				});
				
				botonesAleatorios.repaint();
				
			}
			
		});*/
		
		//ELIMINAR BOTÓN ALEATORIO CON SHOWCONFIRMDIALOG
		
		JPanel botonesAleatorios = new JPanel ();//Se crea un panel
		botonesAleatorios.setSize(1000, 600);//Se le establece el tamaño de la ventana al panel
		botonesAleatorios.setLocation(0, 0);
		botonesAleatorios.setLayout(null);
		botonesAleatorios.setBackground(Color.GREEN);
		
		JButton principal = new JButton("Presióname");//Se crea el botón principal
		principal.setBounds(170, 205, 150, 80);
		principal.setFont(etiquetas3);
		principal.setHorizontalAlignment(JLabel.CENTER);
		principal.setBackground(Color.ORANGE);
		botonesAleatorios.add(principal);
		principal.addActionListener(new ActionListener() {//ActionListener al hacer click al botón principal
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton aleatorio = new JButton("Botón: " + Rand.nextInt(255));//Se crea el botón con nombre aleatorio
				aleatorio.setSize(Rand.nextInt(150), Rand.nextInt(80));//Se establece de manera aleatoria el tamaño del botón
				aleatorio.setLocation(Rand.nextInt(170), Rand.nextInt(205));//Se establece de manera aleatoria la ubicación del botón
				aleatorio.setHorizontalAlignment(JLabel.CENTER);//Se alinea al centro el texto del botón
				aleatorio.setBackground(new Color(Rand.nextInt(255), Rand.nextInt(255), Rand.nextInt(255)));//Se establece de manera aleatoria el color del botón
				botonesAleatorios.add(aleatorio);//Se añade el botón al panel
				aleatorio.addActionListener(new ActionListener() {//ActionListener al hacer click al botón con nombre aleatorio
					
					@Override
					public void actionPerformed(ActionEvent f) {
						
						int Selección = JOptionPane.showConfirmDialog(frame,//Se genera un ShowConfirmDialog
							    ((JButton) f.getSource()).getText() + ": ¿Desea Eliminar el Botón?",
							    "Eliminar el Botón",
							    JOptionPane.YES_NO_OPTION);
						
						if (Selección == JOptionPane.YES_OPTION) {//De acuerdo a la respuesta seleccionada en el ShowConfirmDialog
							botonesAleatorios.remove(aleatorio);//Si es "Sí", se elimina el botón
							
							botonesAleatorios.revalidate();
							
							botonesAleatorios.repaint();
						}
						else {
							((Window) frame).dispose();//Si es "No", se cierra la ventana
						}
						
					}
					
				});
		
				botonesAleatorios.repaint();
				
			}
			
		});
		
		botonesAleatorios.revalidate();
		
		return botonesAleatorios;
		
	}
	
}