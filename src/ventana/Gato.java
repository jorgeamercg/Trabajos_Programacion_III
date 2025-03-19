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
	
	Boolean turno = true;
	
	JButton  btnNewButton;
	
	JButton  btnNewButton_2;
	
	JButton btnNewButton_3;
	
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setPreferredSize(new Dimension(100, 100));
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton.setText(Jugador);
				btnNewButton.setEnabled(false);
				btnNewButton.verificarGanador();
				
			}
			
		});
		
		JButton btnNewButton_1 = new JButton("");
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton_1.setText(Jugador);
				btnNewButton_1.setEnabled(false);
				btnNewButton_1.verificarGanador();
				
			}
			
		});
		
		JButton btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton_2.setText(Jugador);
				btnNewButton_2.setEnabled(false);
				btnNewButton_2.verificarGanador();
				
			}
			
		});
		
		JButton btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton_3.setText(Jugador);
				btnNewButton_3.setEnabled(false);
				btnNewButton_3.verificarGanador();
				
			}
			
		});
		
		JButton btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton_4.setText(Jugador);
				btnNewButton_4.setEnabled(false);
				btnNewButton_4.verificarGanador();
				
			}
			
		});
		
		JButton btnNewButton_5 = new JButton("");
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton_5.setText(Jugador);
				btnNewButton_5.setEnabled(false);
				btnNewButton_5.verificarGanador();
				
			}
			
		});
		
		JButton btnNewButton_6 = new JButton("");
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton_6.setText(Jugador);
				btnNewButton_6.setEnabled(false);
				btnNewButton_6.verificarGanador();
				
			}
			
		});
		
		JButton btnNewButton_7 = new JButton("");
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton_7.setText(Jugador);
				btnNewButton_7.setEnabled(false);
				btnNewButton_7.verificarGanador();
				
			}
			
		});
		
		JButton btnNewButton_8 = new JButton("");
		panel.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String Jugador = "X";
				
				if (turno) {
					turno = false;
					Jugador = "X";
				}
				else {
					turno = true;
					Jugador = "O";
				}
				
				btnNewButton_8.setText(Jugador);
				btnNewButton_8.setEnabled(false);
				btnNewButton_8.verificarGanador();
				
			}
			
		});
		
	}

	public void verificarGanador() {
		
		if (btnNewButton.getText().equals(btnNewButton_2.getText()).equals(btnNewButton_3.getText())){
			JOptionPane.showMessageDialog(frame,
				    "Has Ganado",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(frame,
				    "Es un Empate",
				    "Verificación de Ganador",
				    JOptionPane.PLAIN_MESSAGE);
		}
			
	}

}