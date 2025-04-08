package ventana;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Teclado implements KeyListener{

	private JFrame frame;
	
	JPanel panelTablero;
	
	JLabel etiquetaCronómetro;
	
	Timer cronómetro;
	
	int centésimas = 0;
	
	private int x = 377, y = 230;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado window = new Teclado();
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
	public Teclado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//VENTANA
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//CRONÓMETRO
		
		JPanel panelCronómetro;
		panelCronómetro = new JPanel();
		panelCronómetro.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panelCronómetro, BorderLayout.NORTH);
		
		etiquetaCronómetro = new JLabel("|Tiempo: 00:00:00:00|");//Etiqueta del tiempo
		etiquetaCronómetro.setForeground(new Color(0, 0, 0));
		etiquetaCronómetro.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCronómetro.add(etiquetaCronómetro);
		
		int delay = 10;//Retraso del cronómetro
		
        ActionListener taskPerformer = new ActionListener() {
        	
        	@Override
            public void actionPerformed(ActionEvent evt) {
            	
                centésimas++;//Aumenta en 1 centésima cada 10 ms
                actualizarEtiquetaCronómetro();
                
            }
            
        };

        cronómetro = new Timer(delay, taskPerformer);
        		
        cronómetro.start();//Inicia el temporizador
		
		JPanel panelReiniciar = new JPanel();
		panelReiniciar.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panelReiniciar, BorderLayout.SOUTH);
		
		//REINICIAR
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setPreferredSize(new Dimension(80, 25));
		reiniciar.setBackground(Color.ORANGE);
		reiniciar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panelReiniciar.add(reiniciar);
		
		//TABLERO
		
		panelTablero = new PaintPanel();
		panelTablero.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panelTablero, BorderLayout.CENTER);
		panelTablero.addKeyListener(this);
		panelTablero.setFocusable(true);
		
	}
	
	class PaintPanel extends JPanel {
		
		public PaintPanel() {
			this.setBackground(new Color(0, 0, 0));
		}
		
		@Override
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.ORANGE);
			g2.fillRect(x, y, 35, 35);
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println(e.getKeyCode());
		
		if (e.getKeyCode() == 87) {//w
			y -= 5;
			
			panelTablero.repaint();
		}
		if (e.getKeyCode() == 83) {//s
			y += 5;
			
			panelTablero.repaint();
		}
		if (e.getKeyCode() == 65) {//a
			x -= 5;
			
			panelTablero.repaint();
		}
		if (e.getKeyCode() == 68) {//d
			x += 5;
			
			panelTablero.repaint();
		}
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void actualizarEtiquetaCronómetro() {
    	
		int horas = (centésimas / 360000);
        int minutos = (centésimas / 6000) % 60;
        int segundos = (centésimas / 100) % 60;
        int cent = centésimas % 100;

        String tiempo = String.format("|Tiempo: %02d:%02d:%02d:%02d|", horas, minutos, segundos, cent);
        etiquetaCronómetro.setText(tiempo);
        
    }

}
