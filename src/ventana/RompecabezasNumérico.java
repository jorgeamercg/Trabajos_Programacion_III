//PACKAGE

package ventana;

//LIBRERÍAS A INCLUIR

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

//CLASE

public class RompecabezasNumérico {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RompecabezasNumérico window = new RompecabezasNumérico();
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
	public RompecabezasNumérico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//FRAME
		
		frame = new JFrame();
		frame.setTitle("Rompecabezas Numérico");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Gato.class.getResource("/ventana/Saturno.png")));//Ícono de ventana personalizado
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//MARCO SUPERIOR
		
		JPanel marcoSuperior = new JPanel();//Panel
		marcoSuperior.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(marcoSuperior, BorderLayout.NORTH);
		
		//MARCO DE LA DERECHA
		
		JPanel marcoDerecha = new JPanel();//Panel
		marcoDerecha.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(marcoDerecha, BorderLayout.EAST);
		
		//MARCO INFERIOR
		
		JPanel marcoInferior = new JPanel();//Panel
		marcoInferior.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(marcoInferior, BorderLayout.SOUTH);
		
		JButton reiniciar = new JButton("Reiniciar");//Botón Reiniciar
		reiniciar.setPreferredSize(new Dimension(80, 25));
		reiniciar.setBackground(Color.ORANGE);
		reiniciar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		marcoInferior.add(reiniciar);
		
		//MARCO DE LA IZQUIERDA
		
		JPanel marcoIzquierda = new JPanel();//Panel
		marcoIzquierda.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(marcoIzquierda, BorderLayout.WEST);
		
		//TABLERO
		
		JPanel tablero = new JPanel();//Panel
		tablero.setBackground(new Color(0, 0, 0));
		tablero.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		tablero.setLayout(new GridLayout(4, 4, 10, 10));
		
		JButton btnNewButton = new JButton("1");//Botón 1
		btnNewButton.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");//Botón 2
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");//Botón 3
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");//Botón 4
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");//Botón 5
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");//Botón 6
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");//Botón 7
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");//Botón 8
		btnNewButton_7.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");//Botón 9
		btnNewButton_8.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("10");//Botón 10
		btnNewButton_9.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("11");//Botón 11
		btnNewButton_10.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("12");//Botón 12
		btnNewButton_11.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("13");//Botón 13
		btnNewButton_12.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14");//Botón 14
		btnNewButton_13.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15");//Botón 15
		btnNewButton_14.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");//Botón 16
		btnNewButton_15.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_15);
		
	}

}
