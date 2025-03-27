package ventana;

import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Paint {

	private JFrame frmPaint;
	private JTextField código;

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
		
		JPanel lienzo = new JPanel();
		lienzo.setBounds(204, 0, 840, 549);
		lienzo.setBorder(BorderFactory.createTitledBorder("Lienzo"));
		frmPaint.getContentPane().add(lienzo);
		
		JPanel herramientas = new JPanel();
		herramientas.setBackground(new Color(192, 192, 192));
		herramientas.setBounds(0, 0, 205, 682);
		herramientas.setBorder(BorderFactory.createTitledBorder("Herramientas"));
		frmPaint.getContentPane().add(herramientas);
		herramientas.setLayout(null);
		
		JPanel dibujo = new JPanel();
		dibujo.setBackground(new Color(192, 192, 192));
		dibujo.setBounds(10, 20, 185, 254);
		dibujo.setBorder(BorderFactory.createTitledBorder("Dibujo"));
		herramientas.add(dibujo);
		dibujo.setLayout(null);
		
		JButton pincel = new JButton("Pincel");
		pincel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pincel.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Pincel.png")));
		pincel.setBackground(new Color(128, 128, 128));
		pincel.setBounds(33, 47, 122, 21);
		pincel.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		dibujo.add(pincel);
		
		JButton borrador = new JButton("Borrador");
		borrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		borrador.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Borrador.png")));
		borrador.setBackground(new Color(128, 128, 128));
		borrador.setBounds(33, 108, 122, 21);
		borrador.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		dibujo.add(borrador);
		
		JLabel grosor = new JLabel("Grosor");
		grosor.setBounds(69, 161, 45, 13);
		grosor.setHorizontalAlignment(JLabel.CENTER);
		dibujo.add(grosor);
		
		JLabel tamañoGrosor = new JLabel("5");
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
		
		JButton más = new JButton("+");
		más.setBackground(new Color(128, 128, 128));
		más.setBounds(124, 184, 45, 21);
		más.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		dibujo.add(más);
		
		JPanel formas = new JPanel();
		formas.setBackground(new Color(192, 192, 192));
		formas.setBorder(BorderFactory.createTitledBorder("Formas"));
		formas.setBounds(10, 284, 185, 254);
		herramientas.add(formas);
		formas.setLayout(null);
		
		JButton rectángulo = new JButton("Rectángulo");
		rectángulo.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Rectángulo.png")));
		rectángulo.setBackground(new Color(128, 128, 128));
		rectángulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rectángulo.setBounds(32, 52, 122, 21);
		rectángulo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		formas.add(rectángulo);
		
		JButton círculo = new JButton("Círculo");
		círculo.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Círculo.png")));
		círculo.setBackground(new Color(128, 128, 128));
		círculo.setBounds(32, 98, 122, 21);
		círculo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		formas.add(círculo);
		
		JButton triángulo = new JButton("Triángulo");
		triángulo.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Triángulo.png")));
		triángulo.setBackground(new Color(128, 128, 128));
		triángulo.setBounds(32, 144, 122, 21);
		triángulo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		formas.add(triángulo);
		
		JButton línea = new JButton("Línea");
		línea.setIcon(new ImageIcon(Paint.class.getResource("/ventana/Línea.png")));
		línea.setBackground(new Color(128, 128, 128));
		línea.setBounds(32, 187, 122, 21);
		línea.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		formas.add(línea);
		
		JPanel formas_1 = new JPanel();
		formas_1.setBounds(0, 291, 185, 124);
		formas.add(formas_1);
		formas_1.setLayout(null);
		formas_1.setBorder(BorderFactory.createTitledBorder("Formas"));
		formas_1.setBackground(Color.LIGHT_GRAY);
		
		JButton rectángulo_1 = new JButton("Rectángulo");
		rectángulo_1.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		rectángulo_1.setBackground(Color.GRAY);
		rectángulo_1.setBounds(32, 52, 122, 21);
		formas_1.add(rectángulo_1);
		
		JButton círculo_1 = new JButton("Círculo");
		círculo_1.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		círculo_1.setBackground(Color.GRAY);
		círculo_1.setBounds(32, 98, 122, 21);
		formas_1.add(círculo_1);
		
		JButton triángulo_1 = new JButton("Triángulo");
		triángulo_1.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		triángulo_1.setBackground(Color.GRAY);
		triángulo_1.setBounds(32, 144, 122, 21);
		formas_1.add(triángulo_1);
		
		JButton línea_3 = new JButton("Línea");
		línea_3.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		línea_3.setBackground(Color.GRAY);
		línea_3.setBounds(32, 187, 122, 21);
		formas_1.add(línea_3);
		
		JPanel acciones = new JPanel();
		acciones.setLayout(null);
		acciones.setBorder(BorderFactory.createTitledBorder("Acciones"));
		acciones.setBackground(Color.LIGHT_GRAY);
		acciones.setBounds(10, 546, 185, 115);
		herramientas.add(acciones);
		
		JButton limpiarLienzo = new JButton("Limpiar Lienzo");
		limpiarLienzo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		limpiarLienzo.setBackground(Color.GRAY);
		limpiarLienzo.setBounds(32, 33, 122, 21);
		acciones.add(limpiarLienzo);
		
		JButton guardar = new JButton("Guardar");
		guardar.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		guardar.setBackground(Color.GRAY);
		guardar.setBounds(32, 64, 122, 21);
		acciones.add(guardar);
		
		JPanel colores = new JPanel();
		colores.setBackground(new Color(192, 192, 192));
		colores.setBounds(204, 548, 840, 134);
		colores.setBorder(BorderFactory.createTitledBorder("Colores"));
		frmPaint.getContentPane().add(colores);
		colores.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel paleta = new JPanel();
		paleta.setBackground(new Color(192, 192, 192));
		paleta.setBorder(BorderFactory.createTitledBorder("Paleta"));
		colores.add(paleta);
		paleta.setLayout(null);
		
		JPanel caja = new JPanel();
		caja.setBackground(new Color(192, 192, 192));
		caja.setBounds(10, 43, 258, 35);
		paleta.add(caja);
		caja.setLayout(new GridLayout(0, 6, 10, 0));
		
		JButton blanco = new JButton("");
		blanco.setBackground(new Color(255, 255, 255));
		blanco.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(blanco);
		
		JButton negro = new JButton("");
		negro.setBackground(new Color(0, 0, 0));
		negro.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(negro);
		
		JButton gris = new JButton("");
		gris.setBackground(new Color(128, 128, 128));
		gris.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(gris);
		
		JButton azul = new JButton("");
		azul.setBackground(new Color(0, 0, 255));
		azul.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(azul);
		
		JButton rojo = new JButton("");
		rojo.setBackground(new Color(255, 0, 0));
		rojo.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(rojo);
		
		JButton verde = new JButton("");
		verde.setBackground(new Color(0, 255, 0));
		verde.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		caja.add(verde);
		
		JPanel personalizado = new JPanel();
		personalizado.setBackground(new Color(192, 192, 192));
		personalizado.setBorder(BorderFactory.createTitledBorder("Personalizado"));
		colores.add(personalizado);
		personalizado.setLayout(null);
		
		JLabel códigoHexadecimal = new JLabel("Código Hexadecimal");
		códigoHexadecimal.setHorizontalAlignment(SwingConstants.CENTER);
		códigoHexadecimal.setBounds(84, 38, 116, 13);
		personalizado.add(códigoHexadecimal);
		
		código = new JTextField();
		código.setBackground(new Color(192, 192, 192));
		código.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		código.setText("#c0c0c0");
		código.setBounds(82, 61, 122, 19);
		personalizado.add(código);
		código.setColumns(10);
		
		JPanel fondo = new JPanel();
		fondo.setBackground(new Color(192, 192, 192));
		fondo.setBorder(BorderFactory.createTitledBorder("Fondo"));
		colores.add(fondo);
		fondo.setLayout(null);
		
		JButton establecer = new JButton("Establecer");
		establecer.setBorder(BorderFactory.createLineBorder(Color.decode("#bacbdb")));
		establecer.setBackground(Color.GRAY);
		establecer.setBounds(83, 50, 122, 21);
		fondo.add(establecer);
		
	}
}
