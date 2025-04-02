package ventana;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Paint implements MouseListener, MouseMotionListener{

	private JFrame frmPaint;
	
	private JTextField código;
	
	private PaintPanel lienzo;
	
	private ArrayList<Point> puntos = new ArrayList<Point>();
	private ArrayList<Figura> figuras = new ArrayList<Figura>();
	
	List<Trazo> listaDePuntos = new ArrayList<>();
	
	int tamaño = 0;

	private Color color = Color.BLACK;//El color es negro por defecto
	
	private boolean pincelActivo = false;//Interruptor del pincel
	private boolean borradorActivo = false;//Interruptor del borrador
	private boolean rectánguloActivo = false;//Interruptor del rectángulo
	private boolean círculoActivo = false;//Interruptor del círculo
	private boolean triánguloActivo = false;//Interruptor del triángulo
	private boolean líneaActiva = false;//Interruptor de la línea
	
	JButton pincel, borrador, rectángulo, círculo, triángulo, línea;//variables globales para botones de herramientas

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
					window.frmPaint.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaint = new JFrame();
		frmPaint.setTitle("Paint");
		frmPaint.setIconImage(Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/ventana/Saturno.png")));//Ícono de ventana personalizado
		frmPaint.setBounds(100, 100, 1058, 719);
		frmPaint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaint.getContentPane().setLayout(null);
		
		//LIENZO
		
		lienzo = new PaintPanel();
		lienzo.setBounds(204, 0, 840, 549);
		lienzo.setBorder(BorderFactory.createTitledBorder("Lienzo"));
		frmPaint.getContentPane().add(lienzo);
		lienzo.addMouseListener(this);
		lienzo.addMouseMotionListener(this);
		
		//HERRAMIENTAS
		
		JPanel herramientas = new JPanel();
		herramientas.setBackground(new Color(192, 192, 192));
		herramientas.setBounds(0, 0, 205, 682);
		herramientas.setBorder(BorderFactory.createTitledBorder("Herramientas"));
		frmPaint.getContentPane().add(herramientas);
		herramientas.setLayout(null);
		
		//Dibujo
		
		JPanel dibujo = new JPanel();
		dibujo.setBackground(new Color(192, 192, 192));
		dibujo.setBounds(10, 20, 185, 254);
		dibujo.setBorder(BorderFactory.createTitledBorder("Dibujo"));
		herramientas.add(dibujo);
		dibujo.setLayout(null);
		
		//Pincel
		
		pincel = new JButton("Pincel");
		pincel.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Pincel.png")));
		pincel.setBackground(new Color(128, 128, 128));
		pincel.setBounds(33, 47, 122, 21);
		pincel.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		dibujo.add(pincel);
		pincel.addActionListener(new ActionListener() {
			
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	pincelActivo = !pincelActivo;//Cambia entre activo/inactivo
		        pincel.setBackground(pincelActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		        borradorActivo = false;//Apagar el interruptor del borrador
		        borrador.setBackground(borradorActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	rectánguloActivo = false;//Apagar el interruptor del rectángulo
		    	rectángulo.setBackground(rectánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	círculoActivo = false;//Apagar el interruptor del círculo
		    	círculo.setBackground(círculoActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	triánguloActivo = false;//Apagar el interruptor del triángulo
		    	triángulo.setBackground(triánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	líneaActiva = false;//Apagar el interruptor de la línea
		    	línea.setBackground(líneaActiva ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    }
		    
		});
		
		//Borrador
		
		borrador = new JButton("Borrador");
		borrador.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				borradorActivo = !borradorActivo;//Cambia entre activo/inactivo
		        borrador.setBackground(borradorActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		        
		        pincelActivo = false;//Apagar el interruptor del pincel
		        pincel.setBackground(pincelActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	rectánguloActivo = false;//Apagar el interruptor del rectángulo
		    	rectángulo.setBackground(rectánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	círculoActivo = false;//Apagar el interruptor del círculo
		    	círculo.setBackground(círculoActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	triánguloActivo = false;//Apagar el interruptor del triángulo
		    	triángulo.setBackground(triánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	líneaActiva = false;//Apagar el interruptor de la línea
		    	línea.setBackground(líneaActiva ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
				
			}
			
		});
		borrador.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Borrador.png")));
		borrador.setBackground(new Color(128, 128, 128));
		borrador.setBounds(33, 108, 122, 21);
		borrador.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		dibujo.add(borrador);
		
		//Grosor
		
		JLabel grosor = new JLabel("Grosor");
		grosor.setBounds(69, 161, 45, 13);
		grosor.setHorizontalAlignment(JLabel.CENTER);
		dibujo.add(grosor);
		
		JLabel tamañoGrosor = new JLabel("" + tamaño);
		tamañoGrosor.setMaximumSize(new Dimension(5, 21));
		tamañoGrosor.setMinimumSize(new Dimension(5, 21));
		tamañoGrosor.setPreferredSize(new Dimension(5, 21));
		tamañoGrosor.setBackground(new Color(192, 192, 192));
		tamañoGrosor.setBounds(69, 184, 45, 21);
		tamañoGrosor.setHorizontalAlignment(JLabel.CENTER);
		tamañoGrosor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tamañoGrosor.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		dibujo.add(tamañoGrosor);
		
		JButton menos = new JButton("-");
		menos.setBackground(new Color(128, 128, 128));
		menos.setBounds(14, 184, 45, 21);
		menos.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		dibujo.add(menos);
		menos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tamaño>0) {
					tamaño--;
				}
				
				tamañoGrosor.setText("" + tamaño);
				
				tamañoGrosor.revalidate();
				 
				tamañoGrosor.repaint();
				  
			}
			
		});
		
		JButton más = new JButton("+");
		más.setBackground(new Color(128, 128, 128));
		más.setBounds(124, 184, 45, 21);
		más.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		dibujo.add(más);
		más.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				tamaño++;
				
				tamañoGrosor.setText("" + tamaño);
				 
				tamañoGrosor.revalidate();
				 
				tamañoGrosor.repaint();
				  
			}
			
		});
		
		//FORMAS
		
		JPanel formas = new JPanel();
		formas.setBackground(new Color(192, 192, 192));
		formas.setBorder(BorderFactory.createTitledBorder("Formas"));
		formas.setBounds(10, 284, 185, 254);
		herramientas.add(formas);
		formas.setLayout(null);
		
		//Rectángulo
		
		rectángulo = new JButton("Rectángulo");
		rectángulo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				rectánguloActivo = !rectánguloActivo;//Cambia entre activo/inactivo
		        rectángulo.setBackground(rectánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		        
		        borradorActivo = false;//Apagar el interruptor del borrador
		        borrador.setBackground(borradorActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	pincelActivo = false;//Apagar el interruptor del pincel
		    	pincel.setBackground(pincelActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	círculoActivo = false;//Apagar el interruptor del círculo
		    	círculo.setBackground(círculoActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	triánguloActivo = false;//Apagar el interruptor del triángulo
		    	triángulo.setBackground(triánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	líneaActiva = false;//Apagar el interruptor de la línea
		    	línea.setBackground(líneaActiva ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		        
			}
			
		});
		rectángulo.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Rectángulo.png")));
		rectángulo.setBackground(new Color(128, 128, 128));
		rectángulo.setBounds(32, 52, 122, 21);
		rectángulo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		formas.add(rectángulo);
		
		//Círculo
		
		círculo = new JButton("Círculo");
		círculo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				círculoActivo = !círculoActivo;//Cambia entre activo/inactivo
		        círculo.setBackground(círculoActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		        
		        borradorActivo = false;//Apagar el interruptor del borrador
		        borrador.setBackground(borradorActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	rectánguloActivo = false;//Apagar el interruptor del rectángulo
		    	rectángulo.setBackground(rectánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	pincelActivo = false;//Apagar el interruptor del pincel
		    	pincel.setBackground(pincelActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	triánguloActivo = false;//Apagar el interruptor del triángulo
		    	triángulo.setBackground(triánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	líneaActiva = false;//Apagar el interruptor de la línea
		    	línea.setBackground(líneaActiva ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado 
				
			}
			
		});
		círculo.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Círculo.png")));
		círculo.setBackground(new Color(128, 128, 128));
		círculo.setBounds(32, 98, 122, 21);
		círculo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		formas.add(círculo);
		
		//Triángulo
		
		triángulo = new JButton("Triángulo");
		triángulo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				triánguloActivo = !triánguloActivo;//Cambia entre activo/inactivo	
		        triángulo.setBackground(triánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		        
		        borradorActivo = false;//Apagar el interruptor del borrador
		        borrador.setBackground(borradorActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	rectánguloActivo = false;//Apagar el interruptor del rectángulo
		    	rectángulo.setBackground(rectánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	círculoActivo = false;//Apagar el interruptor del círculo
		    	círculo.setBackground(círculoActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	pincelActivo = false;//Apagar el interruptor del pincel
		    	pincel.setBackground(pincelActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	líneaActiva = false;//Apagar el interruptor de la línea
		    	línea.setBackground(líneaActiva ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
				
			}
			
		});
		triángulo.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Triángulo.png")));
		triángulo.setBackground(new Color(128, 128, 128));
		triángulo.setBounds(32, 144, 122, 21);
		triángulo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		formas.add(triángulo);
		
		//Línea
		
		línea = new JButton("Línea");
		línea.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				líneaActiva = !líneaActiva;//Cambia entre activo/inactivo		    	
		        línea.setBackground(líneaActiva ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		        
		        borradorActivo = false;//Apagar el interruptor del borrador
		        borrador.setBackground(borradorActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	rectánguloActivo = false;//Apagar el interruptor del rectángulo
		    	rectángulo.setBackground(rectánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	círculoActivo = false;//Apagar el interruptor del círculo
		    	círculo.setBackground(círculoActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	triánguloActivo = false;//Apagar el interruptor del triángulo
		    	triángulo.setBackground(triánguloActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
		    	
		    	pincelActivo = false;//Apagar el interruptor del pincel
		    	pincel.setBackground(pincelActivo ? Color.decode("#04a4a6") : new Color(128, 128, 128));//Cambia el color del botón para indicar el estado
				
			}
			
		});
		línea.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Línea.png")));
		línea.setBackground(new Color(128, 128, 128));
		línea.setBounds(32, 187, 122, 21);
		línea.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		formas.add(línea);
		
		//ACCIONES
		
		JPanel acciones = new JPanel();
		acciones.setLayout(null);
		acciones.setBorder(BorderFactory.createTitledBorder("Acciones"));
		acciones.setBackground(Color.LIGHT_GRAY);
		acciones.setBounds(10, 546, 185, 115);
		herramientas.add(acciones);
		
		//Limpiar lienzo
		
		JButton limpiarLienzo = new JButton("Limpiar Lienzo");
		limpiarLienzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				puntos.clear();
				listaDePuntos.clear();
				figuras.clear();
				
				lienzo.repaint();
				
			}
		});
		limpiarLienzo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		limpiarLienzo.setBackground(Color.GRAY);
		limpiarLienzo.setBounds(32, 33, 122, 21);
		acciones.add(limpiarLienzo);
		
		//Guardar
		
		JButton guardar = new JButton("Guardar");
		guardar.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		guardar.setBackground(Color.GRAY);
		guardar.setBounds(32, 64, 122, 21);
		acciones.add(guardar);
		
		//COLORES
		
		JPanel colores = new JPanel();
		colores.setBackground(new Color(192, 192, 192));
		colores.setBounds(204, 548, 840, 134);
		colores.setBorder(BorderFactory.createTitledBorder("Colores"));
		frmPaint.getContentPane().add(colores);
		colores.setLayout(new GridLayout(1, 3, 0, 0));
		
		//Paleta
		
		JPanel paleta = new JPanel();
		paleta.setBackground(new Color(192, 192, 192));
		paleta.setBorder(BorderFactory.createTitledBorder("Paleta"));
		colores.add(paleta);
		paleta.setLayout(null);
		
		JPanel caja = new JPanel();///Caja de colores
		caja.setBackground(new Color(192, 192, 192));
		caja.setBounds(10, 43, 258, 35);
		paleta.add(caja);
		caja.setLayout(new GridLayout(0, 6, 10, 0));
		
		JButton blanco = new JButton("");//Color blanco
		blanco.setBackground(new Color(255, 255, 255));
		blanco.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(blanco);
		blanco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				color = Color.WHITE;
				  
			}
			
		});
		
		JButton negro = new JButton("");//Color negro
		negro.setBackground(new Color(0, 0, 0));
		negro.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(negro);
		negro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 color = Color.BLACK;
				  
			}
			
		});
		
		JButton gris = new JButton("");//Color gris
		gris.setBackground(new Color(128, 128, 128));
		gris.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(gris);
		gris.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				color = Color.GRAY;
				  
			}
			
		});
		
		JButton azul = new JButton("");//Color azul
		azul.setBackground(new Color(0, 0, 255));
		azul.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(azul);
		azul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				color = Color.BLUE;
				  
			}
			
		});
		
		
		JButton rojo = new JButton("");//Color rojo
		rojo.setBackground(new Color(255, 0, 0));
		rojo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(rojo);
		rojo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 color = Color.RED;
				  
			}
			
		});
		
		JButton verde = new JButton("");//Color verde
		verde.setBackground(new Color(0, 255, 0));
		verde.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(verde);
		verde.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				color = Color.GREEN;
				  
			}
			
		});
		
		//Personalizado
		
		JPanel personalizado = new JPanel();
		personalizado.setBackground(new Color(192, 192, 192));
		personalizado.setBorder(BorderFactory.createTitledBorder("Personalizado"));
		colores.add(personalizado);
		personalizado.setLayout(null);
		
		JLabel códigoHexadecimal = new JLabel("Código Hexadecimal");//Color personalizado con un código hexadecimal
		códigoHexadecimal.setHorizontalAlignment(SwingConstants.CENTER);
		códigoHexadecimal.setBounds(82, 22, 122, 19);
		personalizado.add(códigoHexadecimal);
		
		código = new JTextField();
		código.setBackground(new Color(192, 192, 192));
		código.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		código.setText("#c0c0c0");
		código.setBounds(82, 51, 122, 19);
		personalizado.add(código);
		código.setColumns(10);
		
		JButton establecer_color_personalizado = new JButton("Establecer");//Establecer color personalizado
		establecer_color_personalizado.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		establecer_color_personalizado.setBackground(Color.GRAY);
		establecer_color_personalizado.setBounds(82, 80, 122, 19);
		personalizado.add(establecer_color_personalizado);
		
		//Fondo
		
		JPanel fondo = new JPanel();
		fondo.setBackground(new Color(192, 192, 192));
		fondo.setBorder(BorderFactory.createTitledBorder("Fondo"));
		colores.add(fondo);
		fondo.setLayout(null);
		
		JButton establecer_color_fondo = new JButton("Establecer");//Establecer color de fondo del lienzo
		establecer_color_fondo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lienzo.setBackground(color);
				
			}
		});
		establecer_color_fondo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		establecer_color_fondo.setBackground(Color.GRAY);
		establecer_color_fondo.setBounds(83, 50, 122, 21);
		fondo.add(establecer_color_fondo);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (rectánguloActivo) {//Sólo dibujar si el rectángulo está activo
			figuras.add(new Figura(e.getX(),e.getY(),80,80));
			
			lienzo.repaint();
	    }
		else if (círculoActivo) {//Sólo dibujar si el círculo está activo
			lienzo.repaint();
			
			figuras.add(new Figura(e.getX(),e.getY(),80,80));
	    }
		else if (triánguloActivo) {//Sólo dibujar si el triángulo está activo
			lienzo.repaint();
			
			figuras.add(new Figura(e.getX(),e.getY(),80,80));
	    }
		/*else if (líneaActiva) {//Sólo dibujar si la línea está activa
			lienzo.repaint();
			
			puntos.add(e.getPoint());
	    }*/
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		if (!puntos.isEmpty()) {
	        listaDePuntos.add(new Trazo(new ArrayList<>(puntos), color, tamaño));//Guardar trazo con color y grosor
	        
	        puntos.clear();
	    }
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		if (pincelActivo) {//Sólo dibujar si el pincel está activo
			lienzo.repaint();
			
			puntos.add(e.getPoint());
	    }
		else if (borradorActivo) {//Sólo borrar si el borrador está activo
			lienzo.repaint();
			
			puntos.add(e.getPoint());
	    }
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
		
	}
	
	class PaintPanel extends JPanel{
		
		public PaintPanel()
		{
			
			this.setBackground(color.WHITE);//Color de fondo del lienzo
			
		}
		
		@Override
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
		    Graphics2D g2 = (Graphics2D) g;
	
		    if (pincelActivo) {
		    	for (Trazo trazo : listaDePuntos) {//Dibujar trazos anteriores con sus propiedades guardadas
			        g2.setColor(trazo.color_trazo);
			        g2.setStroke(new BasicStroke(trazo.grosor));
			        
			        for (int i = 1; i < trazo.puntos.size(); i++) {
			            Point p1 = trazo.puntos.get(i - 1);
			            Point p2 = trazo.puntos.get(i);
			            
			            g2.drawLine(p1.x, p1.y, p2.x, p2.y);
			        }
			    }
		
			    g2.setColor(color);//Dibujar el trazo actual con la configuración actual
			    g2.setStroke(new BasicStroke(tamaño));
			    
			    for (int i = 1; i < puntos.size(); i++) {
			        Point p1 = puntos.get(i - 1);
			        Point p2 = puntos.get(i);
			        
			        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
			    }
		    }
		    else if (borradorActivo) {
		    	for (Trazo trazo : listaDePuntos) {//Dibujar borrados anteriores con sus propiedades guardadas
		    		g2.setColor(trazo.color_trazo);
			        g2.setStroke(new BasicStroke(trazo.grosor));
			        
			        for (int i = 1; i < trazo.puntos.size(); i++) {
			            Point p1 = trazo.puntos.get(i - 1);
			            Point p2 = trazo.puntos.get(i);
			            
			            g2.drawLine(p1.x, p1.y, p2.x, p2.y);
			        }
			    }
		    	
			    g2.setColor(color);//Dibujar el borrado actual con la configuración actual
			    g2.setStroke(new BasicStroke(tamaño));
			    
			    for (int i = 1; i < puntos.size(); i++) {
			    	color = lienzo.getBackground();
			        Point p1 = puntos.get(i - 1);
			        Point p2 = puntos.get(i);
			        
			        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
			    }
		    }
	       
	   }
		
	}

	class Trazo {
		
	    List<Point> puntos;
	    
	    Color color_trazo;
	    
	    int grosor;

	    public Trazo(List<Point> puntos, Color color_trazo, int grosor) {
	    	
	        this.puntos = puntos;//Almacena los puntos de un trazo
	        
	        this.color_trazo = color;//Almacena el color de un trazo
	        
	        this.grosor = grosor;//Almacena el grosor de un trazo
	        
	    }
	    
	}
	
	class Figura {
		
		public int x, y, w, h;
		
		public Figura(int x, int y, int w, int h) {
			
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			
		}
		
	}
	
}
