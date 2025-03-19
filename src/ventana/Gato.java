package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Gato {

	private JFrame frame;
	
	Boolean Turno = true;
	
	int Contador_Jugadas = 0;
	
	JButton btnNewButton;
	
	JButton btnNewButton_1;
	
	JButton btnNewButton_2;
	
	JButton btnNewButton_3;
	
	JButton btnNewButton_4;
	
	JButton btnNewButton_5;
	
	JButton btnNewButton_6;
	
	JButton btnNewButton_7;
	
	JButton btnNewButton_8;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gato window = new Gato();
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
	public Gato() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 523, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 500, 500);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3, 3, 3));
		
		btnNewButton = new JButton("");
		btnNewButton.setPreferredSize(new Dimension(100, 100));
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				
				btnNewButton.setText(Jugador);
				btnNewButton.setEnabled(false);
				verificarGanador();
			}
			
		});
		
		btnNewButton_1 = new JButton("");
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				btnNewButton_1.setText(Jugador);
				btnNewButton_1.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				btnNewButton_2.setText(Jugador);
				btnNewButton_2.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				btnNewButton_3.setText(Jugador);
				btnNewButton_3.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				btnNewButton_4.setText(Jugador);
				btnNewButton_4.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_5 = new JButton("");
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				btnNewButton_5.setText(Jugador);
				btnNewButton_5.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_6 = new JButton("");
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				btnNewButton_6.setText(Jugador);
				btnNewButton_6.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_7 = new JButton("");
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				btnNewButton_7.setText(Jugador);
				btnNewButton_7.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
		btnNewButton_8 = new JButton("");
		panel.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (Turno) {
					Turno = false;
					
					Jugador = "X";
					
					Contador_Jugadas++;
				}
				else {
					Turno = true;
					
					Jugador = "O";
					
					Contador_Jugadas++;
				}
				
				btnNewButton_8.setText(Jugador);
				btnNewButton_8.setEnabled(false);
				verificarGanador();
				
			}
			
		});
		
	}

	public void verificarGanador() {
		
		//EMPATE
		if (Contador_Jugadas == 9) {
			JOptionPane.showMessageDialog(frame,
				    "Es un Empate",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
		//HORIZONTAL 1
		else if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals(btnNewButton_1.getText()) && btnNewButton_1.getText().equals(btnNewButton_2.getText())) {
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		//HORIZONTAL 2
		else if (!btnNewButton_3.getText().equals("") && btnNewButton_3.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_5.getText())) {
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
		//HORIZONTAL 3
		else if (!btnNewButton_6.getText().equals("") && btnNewButton_6.getText().equals(btnNewButton_7.getText()) && btnNewButton_7.getText().equals(btnNewButton_8.getText())) {
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
		//VERTICAL 1
		else if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals(btnNewButton_3.getText()) && btnNewButton_3.getText().equals(btnNewButton_6.getText())) {
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
		//VERTICAL 2
		else if (!btnNewButton_1.getText().equals("") && btnNewButton_1.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_7.getText())) {
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
		//VERTICAL 3
		else if (!btnNewButton_2.getText().equals("") && btnNewButton_2.getText().equals(btnNewButton_5.getText()) && btnNewButton_5.getText().equals(btnNewButton_8.getText())) {
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
		//DIAGONAL 1
		else if (!btnNewButton.getText().equals("") && btnNewButton.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_8.getText())) {
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
		//DIAGONAL 2
		else if (!btnNewButton_2.getText().equals("") && btnNewButton_2.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_6.getText())) {
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
			
	}

}