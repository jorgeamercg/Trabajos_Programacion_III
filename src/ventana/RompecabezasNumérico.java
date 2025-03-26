//PACKAGE

package ventana;

//LIBRERÍAS A INCLUIR

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.Timer;
import java.awt.Font;

//CLASE

public class RompecabezasNumérico {

	private JFrame frame;
	
	String[] númerosTablero = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", ""};
		   
	List<String> listaNúmerosTablero = Arrays.asList(númerosTablero);
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	JButton btnNewButton_9;
	JButton btnNewButton_10;
	JButton btnNewButton_11;
	JButton btnNewButton_12;
	JButton btnNewButton_13;
	JButton btnNewButton_14;
	JButton btnNewButton_15;
	
	JLabel etiquetaTemporizador;
	
	int centésimas = 0;
	
	Timer temporizador;
	
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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(RompecabezasNumérico.class.getResource("/ventana/Saturno.png")));//Ícono de ventana personalizado
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//MARCO SUPERIOR
		
		JPanel marcoSuperior = new JPanel();//Panel
		marcoSuperior.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(marcoSuperior, BorderLayout.NORTH);
		
		etiquetaTemporizador = new JLabel("|Tiempo: 00:00:00:00|");//Etiqueta del tiempo
		etiquetaTemporizador.setForeground(new Color(0, 0, 0));
		etiquetaTemporizador.setFont(new Font("Tahoma", Font.BOLD, 20));
		marcoSuperior.add(etiquetaTemporizador);
		
		int delay = 10;//Temporizador
		
        ActionListener taskPerformer = new ActionListener() {
        	
        	@Override
            public void actionPerformed(ActionEvent evt) {
            	
                centésimas++;//Aumenta en 1 centésima cada 10ms
                actualizarEtiquetaTemporizador();
                
            }
            
        };

        temporizador = new Timer(delay, taskPerformer);
        		
        temporizador.start();//Inicia el temporizador
		
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
		reiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
		        temporizador.stop();//Detener el temporizador
		        
		        centésimas = 0;//Reiniciar el contador de centésimas
		        
		        actualizarEtiquetaTemporizador();//Actualizar la etiqueta del temporizador
		        
		        temporizador.start();//Iniciar el temporizador
				
				Collections.shuffle(listaNúmerosTablero);//Revolver números en el tablero
				
				btnNewButton.setText(listaNúmerosTablero.get(0));//Reescribir botón 1
				btnNewButton_1.setText(listaNúmerosTablero.get(1));//Reescribir botón 2
				btnNewButton_2.setText(listaNúmerosTablero.get(2));//Reescribir botón 3
				btnNewButton_3.setText(listaNúmerosTablero.get(3));//Reescribir botón 4
				btnNewButton_4.setText(listaNúmerosTablero.get(4));//Reescribir botón 5
				btnNewButton_5.setText(listaNúmerosTablero.get(5));//Reescribir botón 6
				btnNewButton_6.setText(listaNúmerosTablero.get(6));//Reescribir botón 7
				btnNewButton_7.setText(listaNúmerosTablero.get(7));//Reescribir botón 8
				btnNewButton_8.setText(listaNúmerosTablero.get(8));//Reescribir botón 9
				btnNewButton_9.setText(listaNúmerosTablero.get(9));//Reescribir botón 10
				btnNewButton_10.setText(listaNúmerosTablero.get(10));//Reescribir botón 11
				btnNewButton_11.setText(listaNúmerosTablero.get(11));//Reescribir botón 12
				btnNewButton_12.setText(listaNúmerosTablero.get(12));//Reescribir botón 13
				btnNewButton_13.setText(listaNúmerosTablero.get(13));//Reescribir botón 14
				btnNewButton_14.setText(listaNúmerosTablero.get(14));//Reescribir botón 15
				btnNewButton_15.setText(listaNúmerosTablero.get(15));//Reescribir botón 16
				
				}
			
			});
		
		JButton pausar = new JButton("Pausar");//Botón Pausar
		pausar.setPreferredSize(new Dimension(80, 25));
		pausar.setBackground(Color.ORANGE);
		pausar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		marcoInferior.add(pausar);
		pausar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				temporizador.stop();
				
				btnNewButton.setEnabled(false);//Desactiva el botón 1
				btnNewButton_1.setEnabled(false);//Desactiva el botón 2
				btnNewButton_2.setEnabled(false);//Desactiva el botón 3
				btnNewButton_3.setEnabled(false);//Desactiva el botón 4
				btnNewButton_4.setEnabled(false);//Desactiva el botón 5
				btnNewButton_5.setEnabled(false);//Desactiva el botón 6
				btnNewButton_6.setEnabled(false);//Desactiva el botón 7
				btnNewButton_7.setEnabled(false);//Desactiva el botón 8
				btnNewButton_8.setEnabled(false);//Desactiva el botón 9
				btnNewButton_9.setEnabled(false);//Desactiva el botón 10
				btnNewButton_10.setEnabled(false);//Desactiva el botón 11
				btnNewButton_11.setEnabled(false);//Desactiva el botón 12
				btnNewButton_12.setEnabled(false);//Desactiva el botón 13
				btnNewButton_13.setEnabled(false);//Desactiva el botón 14
				btnNewButton_14.setEnabled(false);//Desactiva el botón 15
				btnNewButton_15.setEnabled(false);//Desactiva el botón 16
				
		        pausar.setEnabled(false);//Desactiva el botón "Pausar"
		        reiniciar.setEnabled(false);//Desactiva el botón "Reiniciar"
				 
				}
			
			});
		
		JButton reanudar = new JButton("Reanudar");//Botón Reanudar
		reanudar.setPreferredSize(new Dimension(80, 25));
		reanudar.setBackground(Color.ORANGE);
		reanudar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		marcoInferior.add(reanudar);
		reanudar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				temporizador.start();
				
				btnNewButton.setEnabled(true);//Activa el botón 1
				btnNewButton_1.setEnabled(true);//Activa el botón 2
				btnNewButton_2.setEnabled(true);//Activa el botón 3
				btnNewButton_3.setEnabled(true);//Activa el botón 4
				btnNewButton_4.setEnabled(true);//Activa el botón 5
				btnNewButton_5.setEnabled(true);//Activa el botón 6
				btnNewButton_6.setEnabled(true);//Activa el botón 7
				btnNewButton_7.setEnabled(true);//Activa el botón 8
				btnNewButton_8.setEnabled(true);//Activa el botón 9
				btnNewButton_9.setEnabled(true);//Activa el botón 10
				btnNewButton_10.setEnabled(true);//Activa el botón 11
				btnNewButton_11.setEnabled(true);//Activa el botón 12
				btnNewButton_12.setEnabled(true);//Activa el botón 13
				btnNewButton_13.setEnabled(true);//Activa el botón 14
				btnNewButton_14.setEnabled(true);//Activa el botón 15
				btnNewButton_15.setEnabled(true);//Activa el botón 16
				
		        pausar.setEnabled(true);//Activa el botón "Pausar"
		        reiniciar.setEnabled(true);//Activa el botón "Reiniciar"
				 
				}
			
			});
		
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
		
		Collections.shuffle(listaNúmerosTablero);//Revolver números en el tablero
		
		btnNewButton = new JButton(listaNúmerosTablero.get(0));//Botón 1
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_1.getText().equals("")) {
					 btnNewButton_1.setText(btnNewButton.getText());
					 
					 btnNewButton.setText("");
				 }
				 else if(btnNewButton_4.getText().equals("")) {
					 btnNewButton_4.setText(btnNewButton.getText());
					 
					 btnNewButton.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_1 = new JButton(listaNúmerosTablero.get(1));//Botón 2
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton.getText().equals("")) {
					 btnNewButton.setText(btnNewButton_1.getText());
					 
					 btnNewButton_1.setText("");
				 }
				 else if(btnNewButton_2.getText().equals("")) {
					 btnNewButton_2.setText(btnNewButton_1.getText());
					 
					 btnNewButton_1.setText("");
				 }
				 else if(btnNewButton_5.getText().equals("")) {
					 btnNewButton_5.setText(btnNewButton_1.getText());
					 
					 btnNewButton_1.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_2 = new JButton(listaNúmerosTablero.get(2));//Botón 3
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_1.getText().equals("")) {
					 btnNewButton_1.setText(btnNewButton_2.getText());
					 
					 btnNewButton_2.setText("");
				 }
				 else if(btnNewButton_3.getText().equals("")) {
					 btnNewButton_3.setText(btnNewButton_2.getText());
					 
					 btnNewButton_2.setText("");
				 }
				 else if(btnNewButton_6.getText().equals("")) {
					 btnNewButton_6.setText(btnNewButton_2.getText());
					 
					 btnNewButton_2.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_3 = new JButton(listaNúmerosTablero.get(3));//Botón 4
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_2.getText().equals("")) {
					 btnNewButton_2.setText(btnNewButton_3.getText());
					 
					 btnNewButton_3.setText("");
				 }
				 else if(btnNewButton_7.getText().equals("")) {
					 btnNewButton_7.setText(btnNewButton_3.getText());
					 
					 btnNewButton_3.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_4 = new JButton(listaNúmerosTablero.get(4));//Botón 5
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton.getText().equals("")) {
					 btnNewButton.setText(btnNewButton_4.getText());
					 
					 btnNewButton_4.setText("");
				 }
				 else if(btnNewButton_5.getText().equals("")) {
					 btnNewButton_5.setText(btnNewButton_4.getText());
					 
					 btnNewButton_4.setText("");
				 }
				 else if(btnNewButton_8.getText().equals("")) {
					 btnNewButton_8.setText(btnNewButton_4.getText());
					 
					 btnNewButton_4.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_5 = new JButton(listaNúmerosTablero.get(5));//Botón 6
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_4.getText().equals("")) {
					 btnNewButton_4.setText(btnNewButton_5.getText());
					 
					 btnNewButton_5.setText("");
				 }
				 else if(btnNewButton_1.getText().equals("")) {
					 btnNewButton_1.setText(btnNewButton_5.getText());
					 
					 btnNewButton_5.setText("");
				 }
				 else if(btnNewButton_6.getText().equals("")) {
					 btnNewButton_6.setText(btnNewButton_5.getText());
					 
					 btnNewButton_5.setText("");
				 }
				 else if(btnNewButton_9.getText().equals("")) {
					 btnNewButton_9.setText(btnNewButton_5.getText());
					 
					 btnNewButton_5.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_6 = new JButton(listaNúmerosTablero.get(6));//Botón 7
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_5.getText().equals("")) {
					 btnNewButton_5.setText(btnNewButton_6.getText());
					 
					 btnNewButton_6.setText("");
				 }
				 else if(btnNewButton_2.getText().equals("")) {
					 btnNewButton_2.setText(btnNewButton_6.getText());
					 
					 btnNewButton_6.setText("");
				 }
				 else if(btnNewButton_7.getText().equals("")) {
					 btnNewButton_7.setText(btnNewButton_6.getText());
					 
					 btnNewButton_6.setText("");
				 }
				 else if(btnNewButton_10.getText().equals("")) {
					 btnNewButton_10.setText(btnNewButton_6.getText());
					 
					 btnNewButton_6.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_7 = new JButton(listaNúmerosTablero.get(7));//Botón 8
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_3.getText().equals("")) {
					 btnNewButton_3.setText(btnNewButton_7.getText());
					 
					 btnNewButton_7.setText("");
				 }
				 else if(btnNewButton_6.getText().equals("")) {
					 btnNewButton_6.setText(btnNewButton_7.getText());
					 
					 btnNewButton_7.setText("");
				 }
				 else if(btnNewButton_11.getText().equals("")) {
					 btnNewButton_11.setText(btnNewButton_7.getText());
					 
					 btnNewButton_7.setText("");
				 }
				
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_8 = new JButton(listaNúmerosTablero.get(8));//Botón 9
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_8.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_4.getText().equals("")) {
					 btnNewButton_4.setText(btnNewButton_8.getText());
					 
					 btnNewButton_8.setText("");
				 }
				 else if(btnNewButton_9.getText().equals("")) {
					 btnNewButton_9.setText(btnNewButton_8.getText());
					 
					 btnNewButton_8.setText("");
				 }
				 else if(btnNewButton_12.getText().equals("")) {
					 btnNewButton_12.setText(btnNewButton_8.getText());
					 
					 btnNewButton_8.setText("");
				 }
				
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_9 = new JButton(listaNúmerosTablero.get(9));//Botón 10
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_9.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_8.getText().equals("")) {
					 btnNewButton_8.setText(btnNewButton_9.getText());
					 
					 btnNewButton_9.setText("");
				 }
				 else if(btnNewButton_5.getText().equals("")) {
					 btnNewButton_5.setText(btnNewButton_9.getText());
					 
					 btnNewButton_9.setText("");
				 }
				 else if(btnNewButton_10.getText().equals("")) {
					 btnNewButton_10.setText(btnNewButton_9.getText());
					 
					 btnNewButton_9.setText("");
				 }
				 else if(btnNewButton_13.getText().equals("")) {
					 btnNewButton_13.setText(btnNewButton_9.getText());
					 
					 btnNewButton_9.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_10 = new JButton(listaNúmerosTablero.get(10));//Botón 11
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_10.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_10);
		btnNewButton_10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_9.getText().equals("")) {
					 btnNewButton_9.setText(btnNewButton_10.getText());
					 
					 btnNewButton_10.setText("");
				 }
				 else if(btnNewButton_6.getText().equals("")) {
					 btnNewButton_6.setText(btnNewButton_10.getText());
					 
					 btnNewButton_10.setText("");
				 }
				 else if(btnNewButton_11.getText().equals("")) {
					 btnNewButton_11.setText(btnNewButton_10.getText());
					 
					 btnNewButton_10.setText("");
				 }
				 else if(btnNewButton_14.getText().equals("")) {
					 btnNewButton_14.setText(btnNewButton_10.getText());
					 
					 btnNewButton_10.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_11 = new JButton(listaNúmerosTablero.get(11));//Botón 12
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_11.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_11);
		btnNewButton_11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_10.getText().equals("")) {
					 btnNewButton_10.setText(btnNewButton_11.getText());
					 
					 btnNewButton_11.setText("");
				 }
				 else if(btnNewButton_7.getText().equals("")) {
					 btnNewButton_7.setText(btnNewButton_11.getText());
					 
					 btnNewButton_11.setText("");
				 }
				 else if(btnNewButton_15.getText().equals("")) {
					 btnNewButton_15.setText(btnNewButton_11.getText());
					 
					 btnNewButton_11.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_12 = new JButton(listaNúmerosTablero.get(12));//Botón 13
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_12.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_8.getText().equals("")) {
					 btnNewButton_8.setText(btnNewButton_12.getText());
					 
					 btnNewButton_12.setText("");
				 }
				 else if(btnNewButton_13.getText().equals("")) {
					 btnNewButton_13.setText(btnNewButton_12.getText());
					 
					 btnNewButton_12.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_13 = new JButton(listaNúmerosTablero.get(13));//Botón 14
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_13.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_13);
		btnNewButton_13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_12.getText().equals("")) {
					 btnNewButton_12.setText(btnNewButton_13.getText());
					 
					 btnNewButton_13.setText("");
				 }
				 else if(btnNewButton_9.getText().equals("")) {
					 btnNewButton_9.setText(btnNewButton_13.getText());
					 
					 btnNewButton_13.setText("");
				 }
				 else if(btnNewButton_14.getText().equals("")) {
					 btnNewButton_14.setText(btnNewButton_13.getText());
					 
					 btnNewButton_13.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_14 = new JButton(listaNúmerosTablero.get(14));//Botón 15
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_14.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_14);
		btnNewButton_14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_13.getText().equals("")) {
					 btnNewButton_13.setText(btnNewButton_14.getText());
					 
					 btnNewButton_14.setText("");
				 }
				 else if(btnNewButton_10.getText().equals("")) {
					 btnNewButton_10.setText(btnNewButton_14.getText());
					 
					 btnNewButton_14.setText("");
				 }
				 else if(btnNewButton_15.getText().equals("")) {
					 btnNewButton_15.setText(btnNewButton_14.getText());
					 
					 btnNewButton_14.setText("");
				 }
				 
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
		btnNewButton_15 = new JButton(listaNúmerosTablero.get(15));//Botón 16
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_15.setBackground(new Color(192, 192, 192));
		tablero.add(btnNewButton_15);
		btnNewButton_15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btnNewButton_14.getText().equals("")) {
					 btnNewButton_14.setText(btnNewButton_15.getText());
					 
					 btnNewButton_15.setText("");
				 }
				 else if(btnNewButton_11.getText().equals("")) {
					 btnNewButton_11.setText(btnNewButton_15.getText());
					 
					 btnNewButton_15.setText("");
				 }
				
				 tablero.revalidate();
				 
				 tablero.repaint();
				 
				 verificarGanador();
				 
				}
			
			});
		
	}

    private void actualizarEtiquetaTemporizador() {
    	
        int horas = (centésimas / 360000);
        int minutos = (centésimas / 6000) % 60;
        int segundos = (centésimas / 100) % 60;
        int cent = centésimas % 100;

        String tiempo = String.format("|Tiempo: %02d:%02d:%02d:%02d|", horas, minutos, segundos, cent);
        etiquetaTemporizador.setText(tiempo);
        
    }
    
    private void verificarGanador() {
    	
    	if (btnNewButton.getText().equals("1") &&
			btnNewButton_1.getText().equals("2") &&
			btnNewButton_2.getText().equals("3") &&
			btnNewButton_3.getText().equals("4") &&
			btnNewButton_4.getText().equals("5") &&
			btnNewButton_5.getText().equals("6") &&
			btnNewButton_6.getText().equals("7") &&
			btnNewButton_7.getText().equals("8") &&
			btnNewButton_8.getText().equals("9") &&
			btnNewButton_9.getText().equals("10") &&
			btnNewButton_10.getText().equals("11") &&
			btnNewButton_11.getText().equals("12") &&
			btnNewButton_12.getText().equals("13") &&
			btnNewButton_13.getText().equals("14") &&
			btnNewButton_14.getText().equals("15") &&
			btnNewButton_15.getText().equals("")){
	    		temporizador.stop();
	    		
	    		JOptionPane.showMessageDialog(frame,
					    "Has Completado el Juego, !Felicidades¡",
					    "Verificación de Ganador",
					    JOptionPane.PLAIN_MESSAGE);
			}
    
    }

}
