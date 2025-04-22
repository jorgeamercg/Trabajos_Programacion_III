package ventana;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.FlowLayout;

public class Laberinto implements KeyListener {

	private JFrame frame;
	
	JPanel panelTablero;
	
	JLabel etiquetaCronómetro;
	
	Timer cronómetro;
	
	int centésimas = 0;
	
	private Player jugador, sombra;
	
	private ArrayList<Player> muros = new ArrayList<Player>();//Creación de arreglo de obstáculos
	
	Timer cronómetroMovimientoAutomático;
	
	int últimaTeclaPresionada = 0;
	
	private Player meta;
	
	boolean nivel = true;
	
	JPanel panelEtiquetas;
	
	JLabel etiquetaNivel;
	
	private BufferedImage texturaFondo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laberinto window = new Laberinto();
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
	public Laberinto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//VENTANA
		
		frame = new JFrame();
		frame.setTitle("Laberinto");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ventana/Saturno.png")));//Ícono de ventana personalizado
		frame.setSize(714, 801);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ETIQUETAS
	
		panelEtiquetas = new JPanel();
		panelEtiquetas.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panelEtiquetas, BorderLayout.NORTH);
		
		//Nivel
		
		etiquetaNivel = new JLabel("Nivel 1");//Etiqueta del nivel actual
		etiquetaNivel.setForeground(new Color(0, 0, 0));
		etiquetaNivel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelEtiquetas.add(etiquetaNivel);
		
		//Cronómetro
		
		etiquetaCronómetro = new JLabel("|Tiempo: 00:00:00:00|");//Etiqueta del tiempo
		etiquetaCronómetro.setForeground(new Color(0, 0, 0));
		etiquetaCronómetro.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelEtiquetas.add(etiquetaCronómetro);
		
		int retraso = 10;//Retraso del cronómetro del juego
		
        ActionListener cronómetroAction = new ActionListener() {
        	
        	@Override
            public void actionPerformed(ActionEvent evt) {
            	
                centésimas++;//Aumenta en 1 centésima cada 10 ms
                actualizarEtiquetaCronómetro();
                
            }
            
        };

        cronómetro = new Timer(retraso, cronómetroAction);
        		
        //cronómetro.start();//Iniciar el cronómetro automáticamente (sin presionar ninguna tecla)
        
        //BOTONES
		
		JPanel panelBotones = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelBotones.getLayout();
		flowLayout.setHgap(20);
		panelBotones.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		//Reiniciar
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (nivel) {//Nivel 1
					jugador.x = 15;//Regresar a la coordenada 'x' inicial
			        jugador.y = 15;//Regresar a la coordenada 'y' inicial
			        
			        sombra.x = 15;//Regresar a la coordenada 'x' inicial
			        sombra.y = 15;//Regresar a la coordenada 'y' inicial
				}
				else {//Nivel 2
					jugador.x = 15;//Regresar a la coordenada 'x' inicial
			        jugador.y = 15;//Regresar a la coordenada 'y' inicial
			        
			        sombra.x = 15;//Regresar a la coordenada 'x' inicial
			        sombra.y = 15;//Regresar a la coordenada 'y' inicial
				}
				
		        panelTablero.repaint();//Repintar tablero
		        
				cronómetro.stop();//Detener el cronómetro del juego
				
				centésimas = 0;//Reiniciar el contador de centésimas del cronómetro del juego
				
				cronómetroMovimientoAutomático.stop();//Detener el cronómetro del movimiento automático del jugador
			        
		        últimaTeclaPresionada = 0;//Reiniciar el movimiento automático del jugador
		        
		        actualizarEtiquetaCronómetro();//Actualizar la etiqueta del cronómetro del juego
		        
		        //cronómetro.start();//Iniciar el cronómetro automáticamente (sin presionar ninguna tecla)
		        
		        panelTablero.requestFocusInWindow();//Regresar el foco al tablero

			}
		});
		reiniciar.setPreferredSize(new Dimension(80, 25));
		reiniciar.setBackground(Color.ORANGE);
		reiniciar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panelBotones.add(reiniciar);
		
		//Nivel 1
		
		JButton nivel1 = new JButton("Nivel 1");
		nivel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cronómetro.stop();//Detener el cronómetro del juego
				
				centésimas = 0;//Reiniciar el contador de centésimas del cronómetro del juego
				
				cronómetroMovimientoAutomático.stop();//Detener el cronómetro del movimiento automático del jugador
			        
		        últimaTeclaPresionada = 0;//Reiniciar el movimiento automático del jugador
		        
		        actualizarEtiquetaCronómetro();//Actualizar la etiqueta del cronómetro del juego
		        
		        //cronómetro.start();//Iniciar el cronómetro automáticamente (sin presionar ninguna tecla)
		        
		        panelTablero.requestFocusInWindow();//Regresar el foco al tablero
				
				nivel = true;
				
				seleccionarNivel();//Iniciar el juego
				
			}
		});
		nivel1.setPreferredSize(new Dimension(80, 25));
		nivel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		nivel1.setBackground(Color.ORANGE);
		panelBotones.add(nivel1);
		
		//Nivel 2
		
		JButton nivel2 = new JButton("Nivel 2");
		nivel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cronómetro.stop();//Detener el cronómetro del juego
				
				centésimas = 0;//Reiniciar el contador de centésimas del cronómetro del juego
				
				cronómetroMovimientoAutomático.stop();//Detener el cronómetro del movimiento automático del jugador
			        
		        últimaTeclaPresionada = 0;//Reiniciar el movimiento automático del jugador
		        
		        actualizarEtiquetaCronómetro();//Actualizar la etiqueta del cronómetro del juego
		        
		        //cronómetro.start();//Iniciar el cronómetro automáticamente (sin presionar ninguna tecla)
		        
		        panelTablero.requestFocusInWindow();//Regresar el foco al tablero
				
				nivel = false;
				
				seleccionarNivel();//Iniciar el juego
				
			}
		});
		nivel2.setPreferredSize(new Dimension(80, 25));
		nivel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		nivel2.setBackground(Color.ORANGE);
		panelBotones.add(nivel2);
		
		//TABLERO
		
		panelTablero = new PaintPanel();
		panelTablero.setBackground(Color.WHITE);
		frame.getContentPane().add(panelTablero, BorderLayout.CENTER);
		panelTablero.addKeyListener(this);
		panelTablero.setFocusable(true);
		
		try {
			texturaFondo = ImageIO.read(getClass().getResource("/ventana/Textura de Fuego.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//MOVIMIENTO AUTÓMATICO DEL JUGADOR
		
		int retrasoMovimientoAutomático = 5;//Retraso del cronómetro del movimiento automático del jugador
		
        ActionListener movimientoAutomático = new ActionListener() {
        	
        	@Override
            public void actionPerformed(ActionEvent evt) {
            	
                //System.out.println("|Movimiento automático del jugador verificado|");
                
                ActualizarMovimiento();
                
            }
            
        };

        cronómetroMovimientoAutomático = new Timer(retrasoMovimientoAutomático, movimientoAutomático);
        
        //INICIAR EL JUEGO
        
        seleccionarNivel();
		
	}
	
	class PaintPanel extends JPanel {
		
		public PaintPanel() {
			this.setBackground(Color.WHITE);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D) g;
			
			//Dibujar la textura del piso de laberinto
	        if (texturaFondo != null) {
	            for (int x = 0; x < getWidth(); x += texturaFondo.getWidth()) {
	                for (int y = 0; y < getHeight(); y += texturaFondo.getHeight()) {
	                    g2.drawImage(texturaFondo, x, y, this);
	                }
	            }
	        }
			
			//Dibujar al jugador
			g2.setColor(jugador.color);
			g2.fillRect(jugador.x, jugador.y, jugador.anchura, jugador.altura);
			
			//Dibujar la meta
			g2.setColor(meta.color);
			g2.fillRect(meta.x, meta.y, meta.anchura, meta.altura);
			
			//Dibujar los muros
			for (Player muro : muros) {
				g2.setColor(muro.color);
				g2.fillRect(muro.x, muro.y, muro.anchura, muro.altura);//Efecto normal
				//g2.fillRect(muro.x + 5, muro.y + 5, muro.anchura - 10, muro.altura - 10);//Efecto rebote
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
		
		cronómetro.start();//Iniciar el cronómetro del juego sólo al presionar una tecla
		
		cronómetroMovimientoAutomático.start();//Iniciar el cronómetro del movimiento automático del jugador sólo al presionar una tecla
		
		últimaTeclaPresionada = e.getKeyCode();//Iniciar el movimiento automático del jugador sólo al presionar una tecla
		
		ActualizarMovimiento();//Ejecutar el método para actualizar el movimiento del jugador
		
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
		
		public Boolean colisión (Player blanco) {
			
			Rectangle rectángulo1 = new Rectangle(this.x, this.y, this.anchura, this.altura);
			
			Rectangle rectángulo2 = new Rectangle(blanco.x, blanco.y, blanco.anchura, blanco.altura);
			
			return rectángulo1.intersects(rectángulo2);
		
		}
		
	}
	
	public void ActualizarMovimiento() {
		
		//Guardar posición anterior del jugador
	    sombra.x = jugador.x;
	    sombra.y = jugador.y;

	    //Movimiento de 1 píxel cada vez
	    if (últimaTeclaPresionada == 87) {//W
	        jugador.y -= 1;
	    }
	    if (últimaTeclaPresionada == 83) {//S
	        jugador.y += 1;
	    }
	    if (últimaTeclaPresionada == 65) {//A
	        jugador.x -= 1;
	    }
	    if (últimaTeclaPresionada == 68) {//D
	        jugador.x += 1;
	    }

	    //Detectar colisión
	    boolean colisión = false;
	    
	    for (Player muro : muros) {
	        if (jugador.colisión(muro)) {
	            colisión = true;
	            break;
	        }
	    }

	    //Si hay colisión con muros, volver a la sombra y detener el movimiento
	    if (colisión) {
	        jugador.x = sombra.x;
	        jugador.y = sombra.y;
	        últimaTeclaPresionada = 0;
	    }
	    
	    //Si hay colisión con la meta
	    if (jugador.colisión(meta)) {
	        cronómetroMovimientoAutomático.stop();//Detener movimiento automático
	        
	        cronómetro.stop();//Detener el cronómetro
	        
	        //Mostrar el tiempo final en ventana emergente
	        JOptionPane.showMessageDialog(frame, "Meta Alcanzada: " + etiquetaCronómetro.getText(), "Nivel Completado", JOptionPane.INFORMATION_MESSAGE);
	        
	        últimaTeclaPresionada = 0;//Detiene el movimiento
	        
	        return;//Evita que el jugador siga avanzando
	    }

	    panelTablero.repaint();
		
	}
	
	private void seleccionarNivel() {
		
		muros.clear();//Limpia los muros anteriores

		if (nivel) {//Nivel 1
			//Etiqueta del nivel actual
			
			etiquetaNivel.setText("Nivel 1");
			
			panelEtiquetas.repaint();
			
			//Jugador
			
			jugador = new Player(15, 15, 15, 15, Color.BLUE);
			sombra = new Player(15, 15, 15, 15, Color.BLUE);
			
			//Meta
			
			meta = new Player(651, 602, 34, 34, Color.GREEN);
			
			//Muros
			
			muros.add(new Player(0, 15, 15, 670, Color.DARK_GRAY));//Muro 1
			muros.add(new Player(0, 0, 700, 15, Color.DARK_GRAY));//Muro 2
			muros.add(new Player(685, 15, 15, 670, Color.DARK_GRAY));//Muro 3
			muros.add(new Player(0, 685, 700, 15, Color.DARK_GRAY));//Muro 4
			muros.add(new Player(49, 15, 15, 57, Color.DARK_GRAY));//Muro 5
			muros.add(new Player(64, 57, 52, 15, Color.DARK_GRAY));//Muro 6
			muros.add(new Player(101, 72, 15, 101, Color.DARK_GRAY));//Muro 7
			muros.add(new Player(116, 158, 40, 15, Color.DARK_GRAY));//Muro 8
			muros.add(new Player(156, 112, 15, 383, Color.DARK_GRAY));//Muro 9
			muros.add(new Player(51, 318, 105, 15, Color.DARK_GRAY));//Muro 10
			muros.add(new Player(51, 272, 15, 46, Color.DARK_GRAY));//Muro 11
			muros.add(new Player(15, 102, 36, 15, Color.DARK_GRAY));//Muro 12
			muros.add(new Player(51, 102, 15, 128, Color.DARK_GRAY));//Muro 13
			muros.add(new Player(66, 215, 51, 15, Color.DARK_GRAY));//Muro 14
			muros.add(new Player(102, 230, 15, 42, Color.DARK_GRAY));//Muro 15
			muros.add(new Player(15, 370, 86, 15, Color.DARK_GRAY));//Muro 16
			muros.add(new Player(101, 370, 15, 275, Color.DARK_GRAY));//Muro 17
			muros.add(new Player(51, 425, 15, 108, Color.DARK_GRAY));//Muro 18
			muros.add(new Player(15, 533, 51, 15, Color.DARK_GRAY));//Muro 19
			muros.add(new Player(57, 584, 44, 15, Color.DARK_GRAY));//Muro 20
			muros.add(new Player(49, 637, 15, 48, Color.DARK_GRAY));//Muro 21
			muros.add(new Player(171, 213, 49, 15, Color.DARK_GRAY));//Muro 22
			muros.add(new Player(171, 372, 107, 15, Color.DARK_GRAY));//Muro 23
			muros.add(new Player(171, 480, 254, 15, Color.DARK_GRAY));//Muro 24
			muros.add(new Player(116, 532, 100, 15, Color.DARK_GRAY));//Muro 25
			muros.add(new Player(259, 495, 15, 104, Color.DARK_GRAY));//Muro 26
			muros.add(new Player(156, 584, 104, 15, Color.DARK_GRAY));//Muro 27
			muros.add(new Player(156, 599, 15, 44, Color.DARK_GRAY));//Muro 28
			muros.add(new Player(317, 15, 15, 39, Color.DARK_GRAY));//Muro 29
			muros.add(new Player(162, 54, 170, 15, Color.DARK_GRAY));//Muro 30
			muros.add(new Player(210, 69, 15, 45, Color.DARK_GRAY));//Muro 31
			muros.add(new Player(210, 633, 15, 52, Color.DARK_GRAY));//Muro 32
			muros.add(new Player(225, 633, 107, 15, Color.DARK_GRAY));//Muro 33
			muros.add(new Player(317, 532, 15, 101, Color.DARK_GRAY));//Muro 34
			muros.add(new Player(332, 532, 51, 15, Color.DARK_GRAY));//Muro 35
			muros.add(new Player(368, 547, 15, 97, Color.DARK_GRAY));//Muro 36
			muros.add(new Player(425, 370, 15, 275, Color.DARK_GRAY));//Muro 37
			muros.add(new Player(332, 370, 93, 15, Color.DARK_GRAY));//Muro 38
			muros.add(new Player(317, 318, 15, 108, Color.DARK_GRAY));//Muro 39
			muros.add(new Player(218, 426, 160, 15, Color.DARK_GRAY));//Muro 40
			muros.add(new Player(259, 318, 58, 15, Color.DARK_GRAY));//Muro 41
			muros.add(new Player(259, 172, 15, 147, Color.DARK_GRAY));//Muro 42
			muros.add(new Player(210, 268, 49, 15, Color.DARK_GRAY));//Muro 43
			muros.add(new Player(210, 283, 15, 43, Color.DARK_GRAY));//Muro 44
			muros.add(new Player(216, 157, 116, 15, Color.DARK_GRAY));//Muro 45
			muros.add(new Player(317, 122, 15, 35, Color.DARK_GRAY));//Muro 46
			muros.add(new Player(270, 107, 170, 15, Color.DARK_GRAY));//Muro 47
			muros.add(new Player(425, 67, 15, 40, Color.DARK_GRAY));//Muro 48
			muros.add(new Player(374, 52, 207, 15, Color.DARK_GRAY));//Muro 49
			muros.add(new Player(581, 52, 15, 49, Color.DARK_GRAY));//Muro 50
			muros.add(new Player(581, 101, 55, 15, Color.DARK_GRAY));//Muro 51
			muros.add(new Player(636, 57, 15, 154, Color.DARK_GRAY));//Muro 52
			muros.add(new Player(589, 211, 62, 15, Color.DARK_GRAY));//Muro 53
			muros.add(new Player(440, 529, 47, 15, Color.DARK_GRAY));//Muro 54
			muros.add(new Player(472, 494, 15, 35, Color.DARK_GRAY));//Muro 55
			muros.add(new Player(472, 479, 171, 15, Color.DARK_GRAY));//Muro 56
			muros.add(new Player(475, 579, 15, 106, Color.DARK_GRAY));//Muro 57
			muros.add(new Player(490, 579, 57, 15, Color.DARK_GRAY));//Muro 58
			muros.add(new Player(532, 532, 15, 47, Color.DARK_GRAY));//Muro 59
			muros.add(new Player(547, 532, 96, 15, Color.DARK_GRAY));//Muro 60
			muros.add(new Player(585, 547, 15, 47, Color.DARK_GRAY));//Muro 61
			muros.add(new Player(636, 587, 49, 15, Color.DARK_GRAY));//Muro 62
			muros.add(new Player(636, 602, 15, 49, Color.DARK_GRAY));//Muro 63
			muros.add(new Player(532, 636, 104, 15, Color.DARK_GRAY));//Muro 64
			muros.add(new Player(493, 425, 192, 15, Color.DARK_GRAY));//Muro 65
			muros.add(new Player(585, 377, 15, 48, Color.DARK_GRAY));//Muro 66
			muros.add(new Player(478, 333, 15, 107, Color.DARK_GRAY));//Muro 67
			muros.add(new Player(389, 318, 104, 15, Color.DARK_GRAY));//Muro 68
			muros.add(new Player(425, 220, 15, 99, Color.DARK_GRAY));//Muro 69
			muros.add(new Player(375, 283, 15, 50, Color.DARK_GRAY));//Muro 70
			muros.add(new Player(332, 268, 58, 15, Color.DARK_GRAY));//Muro 71
			muros.add(new Player(317, 230, 15, 53, Color.DARK_GRAY));//Muro 72
			muros.add(new Player(317, 215, 51, 15, Color.DARK_GRAY));//Muro 73
			muros.add(new Player(368, 177, 15, 53, Color.DARK_GRAY));//Muro 74
			muros.add(new Player(368, 162, 108, 15, Color.DARK_GRAY));//Muro 75
			muros.add(new Player(476, 122, 15, 55, Color.DARK_GRAY));//Muro 76
			muros.add(new Player(476, 107, 57, 15, Color.DARK_GRAY));//Muro 77
			muros.add(new Player(532, 107, 15, 156, Color.DARK_GRAY));//Muro 78
			muros.add(new Player(547, 160, 42, 15, Color.DARK_GRAY));//Muro 79
			muros.add(new Player(476, 263, 170, 15, Color.DARK_GRAY));//Muro 80
			muros.add(new Player(476, 220, 15, 43, Color.DARK_GRAY));//Muro 81
			muros.add(new Player(527, 318, 158, 15, Color.DARK_GRAY));//Muro 82
			muros.add(new Player(636, 333, 15, 48, Color.DARK_GRAY));//Muro 83
			muros.add(new Player(527, 333, 15, 48, Color.DARK_GRAY));//Muro 84
			
		} else {//Nivel 2
			//Etiqueta del nivel actual
			
			etiquetaNivel.setText("Nivel 2");
			
			panelEtiquetas.repaint();
			
			//Jugador
			
			jugador = new Player(15, 15, 15, 15, Color.BLUE);
			sombra = new Player(15, 15, 15, 15, Color.BLUE);
			
			//Meta
			
			meta = new Player(545, 651, 34, 34, Color.GREEN);
			
			//Muros
			
			muros.add(new Player(0, 15, 15, 670, Color.DARK_GRAY));//Muro 1
			muros.add(new Player(0, 0, 700, 15, Color.DARK_GRAY));//Muro 2
			muros.add(new Player(685, 15, 15, 670, Color.DARK_GRAY));//Muro 3
			muros.add(new Player(0, 685, 700, 15, Color.DARK_GRAY));//Muro 4
			muros.add(new Player(15, 51, 44, 15, Color.DARK_GRAY));//Muro 5
			muros.add(new Player(15, 265, 89, 15, Color.DARK_GRAY));//Muro 6
			muros.add(new Player(52, 322, 15, 210, Color.DARK_GRAY));//Muro 7
			muros.add(new Player(52, 531, 59, 15, Color.DARK_GRAY));//Muro 8
			muros.add(new Player(105, 640, 15, 45, Color.DARK_GRAY));//Muro 9
			muros.add(new Player(52, 585, 15, 61, Color.DARK_GRAY));//Muro 10
			muros.add(new Player(67, 585, 90, 15, Color.DARK_GRAY));//Muro 11
			muros.add(new Player(215, 655, 15, 30, Color.DARK_GRAY));//Muro 12
			muros.add(new Player(171, 640, 59, 15, Color.DARK_GRAY));//Muro 13
			muros.add(new Player(157, 478, 15, 177, Color.DARK_GRAY));//Muro 14
			muros.add(new Player(111, 478, 46, 15, Color.DARK_GRAY));//Muro 15
			muros.add(new Player(67, 427, 147, 15, Color.DARK_GRAY));//Muro 16
			muros.add(new Player(214, 427, 15, 172, Color.DARK_GRAY));//Muro 17
			muros.add(new Player(229, 531, 43, 15, Color.DARK_GRAY));//Muro 18
			muros.add(new Player(229, 584, 51, 15, Color.DARK_GRAY));//Muro 19
			muros.add(new Player(265, 599, 15, 53, Color.DARK_GRAY));//Muro 20
			muros.add(new Player(280, 637, 51, 15, Color.DARK_GRAY));//Muro 21
			muros.add(new Player(316, 493, 15, 144, Color.DARK_GRAY));//Muro 22
			muros.add(new Player(105, 15, 15, 90, Color.DARK_GRAY));//Muro 23
			muros.add(new Player(52, 105, 212, 15, Color.DARK_GRAY));//Muro 24
			muros.add(new Player(52, 120, 15, 98, Color.DARK_GRAY));//Muro 25
			muros.add(new Player(156, 58, 15, 47, Color.DARK_GRAY));//Muro 26
			muros.add(new Player(208, 15, 15, 43, Color.DARK_GRAY));//Muro 27
			muros.add(new Player(104, 173, 15, 205, Color.DARK_GRAY));//Muro 28
			muros.add(new Player(104, 158, 52, 15, Color.DARK_GRAY));//Muro 29
			muros.add(new Player(156, 158, 15, 59, Color.DARK_GRAY));//Muro 30
			muros.add(new Player(119, 316, 53, 15, Color.DARK_GRAY));//Muro 31
			muros.add(new Player(157, 331, 15, 56, Color.DARK_GRAY));//Muro 32
			muros.add(new Player(172, 372, 92, 15, Color.DARK_GRAY));//Muro 33
			muros.add(new Player(264, 372, 15, 113, Color.DARK_GRAY));//Muro 34
			muros.add(new Player(210, 120, 15, 145, Color.DARK_GRAY));//Muro 35
			muros.add(new Player(166, 265, 105, 15, Color.DARK_GRAY));//Muro 36
			muros.add(new Player(211, 280, 15, 36, Color.DARK_GRAY));//Muro 37
			muros.add(new Player(211, 316, 105, 15, Color.DARK_GRAY));//Muro 38
			muros.add(new Player(316, 211, 15, 167, Color.DARK_GRAY));//Muro 39
			muros.add(new Player(264, 211, 52, 15, Color.DARK_GRAY));//Muro 40
			muros.add(new Player(264, 66, 15, 54, Color.DARK_GRAY));//Muro 41
			muros.add(new Player(264, 51, 215, 15, Color.DARK_GRAY));//Muro 42
			muros.add(new Player(479, 51, 15, 175, Color.DARK_GRAY));//Muro 43
			muros.add(new Player(333, 102, 107, 15, Color.DARK_GRAY));//Muro 44
			muros.add(new Player(318, 102, 15, 56, Color.DARK_GRAY));//Muro 45
			muros.add(new Player(271, 158, 113, 15, Color.DARK_GRAY));//Muro 46
			muros.add(new Player(369, 173, 15, 305, Color.DARK_GRAY));//Muro 47
			muros.add(new Player(279, 427, 90, 15, Color.DARK_GRAY));//Muro 48
			muros.add(new Player(316, 478, 168, 15, Color.DARK_GRAY));//Muro 49
			muros.add(new Player(425, 493, 15, 153, Color.DARK_GRAY));//Muro 50
			muros.add(new Player(374, 539, 15, 146, Color.DARK_GRAY));//Muro 51
			muros.add(new Player(425, 117, 15, 215, Color.DARK_GRAY));//Muro 52
			muros.add(new Player(494, 157, 98, 15, Color.DARK_GRAY));//Muro 53
			muros.add(new Player(494, 211, 143, 15, Color.DARK_GRAY));//Muro 54
			muros.add(new Player(440, 264, 152, 15, Color.DARK_GRAY));//Muro 55
			muros.add(new Player(531, 273, 15, 48, Color.DARK_GRAY));//Muro 56
			muros.add(new Player(530, 651, 15, 34, Color.DARK_GRAY));//Muro 57
			muros.add(new Player(530, 636, 114, 15, Color.DARK_GRAY));//Muro 58
			muros.add(new Player(583, 591, 15, 45, Color.DARK_GRAY));//Muro 59
			muros.add(new Player(538, 51, 147, 15, Color.DARK_GRAY));//Muro 60
			muros.add(new Player(538, 105, 99, 15, Color.DARK_GRAY));//Muro 61
			muros.add(new Player(637, 105, 15, 227, Color.DARK_GRAY));//Muro 62
			muros.add(new Player(583, 317, 54, 15, Color.DARK_GRAY));//Muro 63
			muros.add(new Player(643, 372, 42, 15, Color.DARK_GRAY));//Muro 64
			muros.add(new Player(583, 332, 15, 100, Color.DARK_GRAY));//Muro 65
			muros.add(new Player(425, 372, 158, 15, Color.DARK_GRAY));//Muro 66
			muros.add(new Player(478, 322, 15, 50, Color.DARK_GRAY));//Muro 67
			muros.add(new Player(425, 387, 15, 50, Color.DARK_GRAY));//Muro 68
			muros.add(new Player(440, 422, 105, 15, Color.DARK_GRAY));//Muro 69
			muros.add(new Player(530, 437, 15, 94, Color.DARK_GRAY));//Muro 70
			muros.add(new Player(478, 531, 159, 15, Color.DARK_GRAY));//Muro 71
			muros.add(new Player(478, 546, 15, 100, Color.DARK_GRAY));//Muro 72
			muros.add(new Player(493, 585, 51, 15, Color.DARK_GRAY));//Muro 73
			muros.add(new Player(637, 431, 15, 160, Color.DARK_GRAY));//Muro 74
			muros.add(new Player(591, 477, 46, 15, Color.DARK_GRAY));//Muro 75
			
		}
		
		panelTablero.repaint();//Repintar tablero con los elementos del nivel seleccionado
		
	}

}
