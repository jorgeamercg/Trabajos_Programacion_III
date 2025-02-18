//PACKAGE
package ventana;

//LIBRERÍAS A INCLUIR
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
		
		this.add(this.login());
		this.repaint();
		
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
		email.setFont(etiquetas);
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

}