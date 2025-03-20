package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Gato {

	private JFrame frmGato;
	
	Boolean Turno = true;
	
	int Contador_Jugadas = 0;
	
	int Contador_X = 0;
	
	int Contador_O = 0;
	
	JButton btnNewButton;
	
	JButton btnNewButton_1;
	
	JButton btnNewButton_2;
	
	JButton btnNewButton_3;
	
	JButton btnNewButton_4;
	
	JButton btnNewButton_5;
	
	JButton btnNewButton_6;
	
	JButton btnNewButton_7;
	
	JButton btnNewButton_8;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton_9;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gato window = new Gato();
					window.frmGato.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gato() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmGato = new JFrame();
		frmGato.setTitle("Gato");
		frmGato.setIconImage(Toolkit.getDefaultToolkit().getImage(Gato.class.getResource("/ventana/Saturno.png")));//Ícono de ventana personalizado
		frmGato.setBounds(0, 0, 523, 620);
		frmGato.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGato.setResizable(false);//Desactiva el botón maximizar e impide modificar el tamaño de la ventana
		frmGato.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frmGato.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 10, 10));
		panel.setBorder(BorderFactory.createLineBorder(Color.black,5));
		
		btnNewButton = new JButton("");//Botón 1
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setPreferredSize(new Dimension(100, 100));
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				
				btnNewButton.setText(Jugador);
				btnNewButton.setEnabled(false);
				verificarGanador();
			}
			
		});
		
		btnNewButton_1 = new JButton("");//Botón 2
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton_1.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton_1.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton_1.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton_1.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				btnNewButton_1.setText(Jugador);
				btnNewButton_1.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_2 = new JButton("");//Botón 3
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton_2.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton_2.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton_2.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton_2.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				btnNewButton_2.setText(Jugador);
				btnNewButton_2.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_3 = new JButton("");//Botón 4
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton_3.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton_3.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton_3.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton_3.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				btnNewButton_3.setText(Jugador);
				btnNewButton_3.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_4 = new JButton("");//Botón 5
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton_4.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton_4.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton_4.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton_4.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				btnNewButton_4.setText(Jugador);
				btnNewButton_4.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_5 = new JButton("");//Botón 6
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton_5.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton_5.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton_5.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton_5.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				btnNewButton_5.setText(Jugador);
				btnNewButton_5.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_6 = new JButton("");//Botón 7
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton_6.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton_6.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton_6.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton_6.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				btnNewButton_6.setText(Jugador);
				btnNewButton_6.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_7 = new JButton("");//Botón 8
		btnNewButton_7.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton_7.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton_7.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton_7.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton_7.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				btnNewButton_7.setText(Jugador);
				btnNewButton_7.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_8 = new JButton("");//Botón 9
		btnNewButton_8.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					btnNewButton_8.setIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					btnNewButton_8.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/X Corp.png")));
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					btnNewButton_8.setIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					btnNewButton_8.setDisabledIcon(new ImageIcon(Gato.class.getResource("/ventana/Opera Software.png")));
					
					Contador_Jugadas++;
				}
				
				btnNewButton_8.setText(Jugador);
				btnNewButton_8.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#04a4a6"));
		panel_1.setBorder(BorderFactory.createLineBorder(Color.black,10));
		frmGato.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));
		
		lblNewLabel = new JLabel("|Puntaje de X: " + Contador_X + "|");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("|Puntaje de O: " + Contador_O + "|");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		panel_1.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#04a4a6"));
		panel_2.setBorder(BorderFactory.createLineBorder(Color.black,10));
		frmGato.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		btnNewButton_9 = new JButton("Reiniciar");//Botón: Reiniciar
		btnNewButton_9.setPreferredSize(new Dimension(80, 25));
		btnNewButton_9.setBackground(Color.ORANGE);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_2.add(btnNewButton_9);
		btnNewButton_9.setBorder(BorderFactory.createLineBorder(Color.black,5));
		btnNewButton_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				btnNewButton.setText("");//Reiniciar botón 1
				btnNewButton.setIcon(null);
				btnNewButton.setEnabled(true);
				
				btnNewButton_1.setText("");//Reiniciar botón 2
				btnNewButton_1.setIcon(null);
				btnNewButton_1.setEnabled(true);
				
				btnNewButton_2.setText("");//Reiniciar botón 3
				btnNewButton_2.setIcon(null);
				btnNewButton_2.setEnabled(true);
				
				btnNewButton_3.setText("");//Reiniciar botón 4
				btnNewButton_3.setIcon(null);
				btnNewButton_3.setEnabled(true);
				
				btnNewButton_4.setText("");//Reiniciar botón 5
				btnNewButton_4.setIcon(null);
				btnNewButton_4.setEnabled(true);
				
				btnNewButton_5.setText("");//Reiniciar botón 6
				btnNewButton_5.setIcon(null);
				btnNewButton_5.setEnabled(true);
				
				btnNewButton_6.setText("");//Reiniciar botón 7
				btnNewButton_6.setIcon(null);
				btnNewButton_6.setEnabled(true);
				
				btnNewButton_7.setText("");//Reiniciar botón 8
				btnNewButton_7.setIcon(null);
				btnNewButton_7.setEnabled(true);
				
				btnNewButton_8.setText("");//Reiniciar botón 9
				btnNewButton_8.setIcon(null);
				btnNewButton_8.setEnabled(true);
				
				Contador_Jugadas = 0;//Reiniciar contador
				
			}
			
		});
		
	}

	public void verificarGanador() {
		
		Boolean Existe_Ganador = false;
		
		//HORIZONTAL 1
		if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals("X") && btnNewButton_1.getText().equals("X") && btnNewButton_2.getText().equals("X")) {
			Existe_Ganador = true;
			
			Contador_X++;
			
			lblNewLabel.setText("|Puntaje de X: " + Contador_X + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		else if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals("O") && btnNewButton_1.getText().equals("O") && btnNewButton_2.getText().equals("O")) {
			Existe_Ganador = true;
			
			Contador_O++;
			
			lblNewLabel_1.setText("|Puntaje de O: " + Contador_O + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//HORIZONTAL 2
		if (!btnNewButton_3.getText().equals("") && btnNewButton_3.getText().equals("X") && btnNewButton_4.getText().equals("X") && btnNewButton_5.getText().equals("X")) {
			Existe_Ganador = true;
			
			Contador_X++;
			
			lblNewLabel.setText("|Puntaje de X: " + Contador_X + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		else if (!btnNewButton_3.getText().equals("") && btnNewButton_3.getText().equals("O") && btnNewButton_4.getText().equals("O") && btnNewButton_5.getText().equals("O")) {
			Existe_Ganador = true;
			
			Contador_O++;
			
			lblNewLabel_1.setText("|Puntaje de O: " + Contador_O + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//HORIZONTAL 3
		if (!btnNewButton_6.getText().equals("") && btnNewButton_6.getText().equals("X") && btnNewButton_7.getText().equals("X") && btnNewButton_8.getText().equals("X")) {
			Existe_Ganador = true;
			
			Contador_X++;
			
			lblNewLabel.setText("|Puntaje de X: " + Contador_X + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		else if (!btnNewButton_6.getText().equals("") && btnNewButton_6.getText().equals("O") && btnNewButton_7.getText().equals("O") && btnNewButton_8.getText().equals("O")) {
			Existe_Ganador = true;
			
			Contador_O++;
			
			lblNewLabel_1.setText("|Puntaje de O: " + Contador_O + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//VERTICAL 1
		if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals("X") && btnNewButton_3.getText().equals("X") && btnNewButton_6.getText().equals("X")) {
			Existe_Ganador = true;
			
			Contador_X++;
			
			lblNewLabel.setText("|Puntaje de X: " + Contador_X + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		else if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals("O") && btnNewButton_3.getText().equals("O") && btnNewButton_6.getText().equals("O")) {
			Existe_Ganador = true;
			
			Contador_O++;
			
			lblNewLabel_1.setText("|Puntaje de O: " + Contador_O + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//VERTICAL 2
		if (!btnNewButton_1.getText().equals("") && btnNewButton_1.getText().equals("X") && btnNewButton_4.getText().equals("X") && btnNewButton_7.getText().equals("X")) {
			Existe_Ganador = true;
			
			Contador_X++;
			
			lblNewLabel.setText("|Puntaje de X: " + Contador_X + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		else if (!btnNewButton_1.getText().equals("") && btnNewButton_1.getText().equals("O") && btnNewButton_4.getText().equals("O") && btnNewButton_7.getText().equals("O")) {
			Existe_Ganador = true;
			
			Contador_O++;
			
			lblNewLabel_1.setText("|Puntaje de O: " + Contador_O + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//VERTICAL 3
		if (!btnNewButton_2.getText().equals("") && btnNewButton_2.getText().equals("X") && btnNewButton_5.getText().equals("X") && btnNewButton_8.getText().equals("X")) {
			Existe_Ganador = true;
			
			Contador_X++;
			
			lblNewLabel.setText("|Puntaje de X: " + Contador_X + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		else if (!btnNewButton_2.getText().equals("") && btnNewButton_2.getText().equals("O") && btnNewButton_5.getText().equals("O") && btnNewButton_8.getText().equals("O")) {
			Existe_Ganador = true;
			
			Contador_O++;
			
			lblNewLabel_1.setText("|Puntaje de O: " + Contador_O + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//DIAGONAL 1
		if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals("X") && btnNewButton_4.getText().equals("X") && btnNewButton_8.getText().equals("X")) {
			Existe_Ganador = true;
			
			Contador_X++;
			
			lblNewLabel.setText("|Puntaje de X: " + Contador_X + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		else if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals("O") && btnNewButton_4.getText().equals("O") && btnNewButton_8.getText().equals("O")) {
			Existe_Ganador = true;
			
			Contador_O++;
			
			lblNewLabel_1.setText("|Puntaje de O: " + Contador_O + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//DIAGONAL 2
		if (!btnNewButton_2.getText().equals("") && btnNewButton_2.getText().equals("X") && btnNewButton_4.getText().equals("X") && btnNewButton_6.getText().equals("X")) {
			Existe_Ganador = true;
			
			Contador_X++;
			
			lblNewLabel.setText("|Puntaje de X: " + Contador_X + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		else if (!btnNewButton_2.getText().equals("") && btnNewButton_2.getText().equals("O") && btnNewButton_4.getText().equals("O") && btnNewButton_6.getText().equals("O")) {
			Existe_Ganador = true;
			
			Contador_O++;
			
			lblNewLabel_1.setText("|Puntaje de O: " + Contador_O + "|");
			
			JOptionPane.showMessageDialog(frmGato,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//EMPATE
		else if (Contador_Jugadas == 9 && Existe_Ganador == false) {
			JOptionPane.showMessageDialog(frmGato,
				    "Es un Empate",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
			
	}

}