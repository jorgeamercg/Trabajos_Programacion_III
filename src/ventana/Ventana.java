//PACKAGE
package ventana;

//LIBRERÍAS A INCLUIR
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//CLASE
public class Ventana extends JFrame{
	
	//CREACIÓN DE OBJETO
	
	//Fuentes personalizadas
	Font etiquetas = new Font("Romana", Font.ROMAN_BASELINE, 22);
	Font etiquetas2 = new Font("Romana", Font.ROMAN_BASELINE, 10);

	//CONSTRUCTOR
	public Ventana(String title) {
		
		//Atributos
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(500, 500);
		
		this.setResizable(true);
		this.setLayout(null);
		
		//Acción al cerrar la aplicación
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Elemento sobre el que se colocará el item
		this.setLocationRelativeTo(null);
		
		//Limitación de la edición del tamaño de la ventana
		this.setMinimumSize(new Dimension(400, 400));
		this.setMaximumSize(new Dimension(600, 600));
		
		/*this.add(this.login());*/
		
		this.add(this.registro());
		
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
		etiqueta2.setBounds(190, 120, 100, 30);
		/*etiqueta2.setSize(80, 30);*/
		/*etiqueta2.setLocation(60, 150);*/
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setOpaque(true);
		login.add(etiqueta2);
		
		JLabel etiqueta3 = new JLabel("Contraseña");
		etiqueta3.setBounds(160, 220, 160, 30);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setOpaque(true);
		login.add(etiqueta3);
		
		//Caja de texto
		JTextField email = new JTextField();
		email.setBounds(110, 170, 260, 30);
		email.setFont(etiquetas2);
		email.setBackground(Color.cyan);
		email.setOpaque(true);
		login.add(email);
		
		//Caja de contraseña
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(110, 270, 260, 30);
		contraseña.setFont(etiquetas);
		contraseña.setBackground(Color.cyan);
		contraseña.setOpaque(true);
		login.add(contraseña);
		
		//Botones
		JButton access = new JButton("Acceder");
		access.setBounds(165, 350, 150, 40);
		access.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		access.setBackground(Color.ORANGE);
		access.setOpaque(true);
		login.add(access);
		
		JButton c_olvidada = new JButton("¿Olvidó su contraseña?");
		c_olvidada.setBounds(227, 310, 143, 20);
		c_olvidada.setFont(etiquetas2);
		c_olvidada.setHorizontalAlignment(JLabel.CENTER);
		c_olvidada.setBackground(new Color(0, 128, 128));
		c_olvidada.setOpaque(true);
		login.add(c_olvidada);
		
		//Casilla de verificación
		JCheckBox recordar;
		recordar = new JCheckBox("Recordarme");
		recordar.setBounds(75, 310, 143, 20);
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
		/*login.setBackground(Color.RED);*/
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
		/*etiqueta2.setSize(80, 30);*/
		/*etiqueta2.setLocation(60, 150);*/
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
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
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

		return registro;
		
	}

}