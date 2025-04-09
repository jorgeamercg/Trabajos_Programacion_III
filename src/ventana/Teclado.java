package ventana;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Rectangle;

public class Teclado implements KeyListener{

	private JFrame frame;
	
	JPanel panelTablero;
	
	JLabel etiquetaCronómetro;
	
	Timer cronómetro;
	
	int centésimas = 0;
	
	private Player jugador, sombra;
	
	private ArrayList<Player> obstáculos = new ArrayList<Player>();//Creación de arreglo de obstáculos

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
		
		//JUGADORES
		
		//Jugadores
		
		jugador = new Player (377, 230, 35, 35, Color.ORANGE);//Jugador
		sombra = new Player (377, 230, 35, 35, Color.ORANGE);//Sombra del jugador
		
		//Obstáculos
		
		obstáculos.add(new Player (277, 85, 225, 50, Color.BLUE));//Obstáculo 1: Muro: Arriba
		obstáculos.add(new Player (277, 350, 225, 50, Color.BLUE));//Obstáculo 2: Muro: Abajo
		
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
        		
        cronómetro.start();//Inicia el cronómetro
		
		JPanel panelReiniciar = new JPanel();
		panelReiniciar.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panelReiniciar, BorderLayout.SOUTH);
		
		//REINICIAR
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				jugador.x = 377;//Regresar a la coordenada 'x' inicial
		        
		        jugador.y = 230;//Regresar a la coordenada 'y' inicial
		        
		        panelTablero.repaint();//Repintar tablero
		        
				cronómetro.stop();//Detener el cronómetro
			        
		        centésimas = 0;//Reiniciar el contador de centésimas
		        
		        actualizarEtiquetaCronómetro();//Actualizar la etiqueta del cronómetro
		        
		        cronómetro.start();//Iniciar el cronómetro
		        
		        panelTablero.requestFocusInWindow();//Regresar el foco al tablero
		        //panelTablero.setFocusable(true);
		        //panelTablero.requestFocus();

			}
			
		});
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
			
			g2.setColor(jugador.color);
			g2.fillRect(jugador.x, jugador.y, jugador.anchura, jugador.altura);
			
			for (Player muro : obstáculos) {
				g2.setColor(muro.color);
				g2.fillRect(muro.x + 5, muro.y + 5, muro.anchura - 10, muro.altura - 10);
			}
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		//System.out.println(panelTablero.getWidth());//Obtener el ancho en píxeles del tablero
		//System.out.println(panelTablero.getHeight());//Obtener la altura en píxeles del tablero
		//System.out.println(e.getKeyCode());//Obtener el número de la tecla presionada
		
		Boolean definición = true;
		
		for (Player muro : obstáculos) {
			if (jugador.colisión(muro)) {
				definición = false;
			}
		}
		
		if (!definición) {
		    System.out.println("|Colisión con un obstáculo detectada|");
		}
		
		if(definición) {
			sombra.x = jugador.x;
			
			sombra.y = jugador.y;
		}
		
		if (e.getKeyCode() == 87) {//Tecla: W
			if (definición) {
				jugador.y -= 5;
			}
			else {//Colisión
				jugador.y = sombra.y;
				
				jugador.x = sombra.x;
			}
		}
		
		if (e.getKeyCode() == 83) {//Tecla: S
			if (definición) {
				jugador.y += 5;
			}
			else {//Colisión
				jugador.y = sombra.y;
				
				jugador.x = sombra.x;
			}
		}
		
		if (e.getKeyCode() == 65) {//Tecla: A
			if (definición) {
				jugador.x -= 5;
			}
			else {//Colisión
				jugador.y = sombra.y;
				
				jugador.x = sombra.x;
			}
		}
		
		if (e.getKeyCode() == 68) {//Tecla: D
			if (definición) {
				jugador.x += 5;
			}
			else {//Colisión
				jugador.y = sombra.y;
				
				jugador.x = sombra.x;
			}
		}
		
		panelTablero.repaint();
		
		//EFECTO PORTAL
		
		//Teletransporte horizontal
		
		if (jugador.x > 786) {//Sale por la derecha, aparece por la izquierda
		    jugador.x = -35;
		}
		
		if (jugador.x < -35) {//Sale por la izquierda, aparece por la derecha
		    jugador.x = 786;
		}

		// Teletransporte vertical
		
		if (jugador.y > 499) {//Sale por abajo, aparece por arriba
		    jugador.y = -35;
		}
		
		if (jugador.y < -35) {//Sale por arriba, aparece por abajo
		    jugador.y = 499;
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
	
	class Player {
		
		int x = 0, y = 0, anchura = 0, altura = 0;
		
		Color color = Color.BLACK;
		
		public Player(int x, int y, int anchura, int altura, Color color) {
			
			this.x = x;
			this.y = y;
			this.anchura = anchura;
			this.altura = altura;
			this.color = color;
			
		}
		
		public Boolean colisión (Player blanco){
			
			Rectangle rectángulo1 = new Rectangle(this.x, this.y, this.anchura, this.altura);
			
			Rectangle rectángulo2 = new Rectangle(blanco.x, blanco.y, blanco.anchura, blanco.altura);
			
			return rectángulo1.intersects(rectángulo2);
		
		}
		
	}

}
