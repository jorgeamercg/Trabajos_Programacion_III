//PACKAGE
package ventana;

//LIBRERÍAS A INCLUIR
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//CLASE
public class Ventana extends JFrame{
	
	//CREACIÓN DE OBJETO
	
	//Fuente personalizada
	Font etiquetas = new Font("Romana", Font.ROMAN_BASELINE, 22);

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
		
		//esto es un cambio
		
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
		JLabel etiqueta1 = new JLabel("BIENVENIDO");
		etiqueta1.setSize(160, 40);
		etiqueta1.setLocation(160, 10);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setBackground(Color.YELLOW);
		etiqueta1.setOpaque(true);
		login.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Usuario");
		etiqueta2.setBounds(60, 150, 160, 30);
		/*etiqueta2.setSize(80, 30);*/
		/*etiqueta2.setLocation(60, 150);*/
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setOpaque(true);
		login.add(etiqueta2);
		
		//Caja de texto
		JTextField email = new JTextField();
		email.setBounds(60, 200, 260, 30);
		email.setFont(etiquetas);
		email.setBackground(Color.cyan);
		email.setOpaque(true);
		login.add(email);
		
		//Botón
		JButton access = new JButton("Acceder");
		access.setBounds(60, 300, 260, 60);
		access.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		access.setBackground(Color.ORANGE);
		access.setOpaque(true);
		login.add(access);
		
		login.revalidate();
		
		return login;
		
	}

}