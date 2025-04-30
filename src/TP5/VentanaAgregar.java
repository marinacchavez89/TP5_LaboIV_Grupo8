package TP5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class VentanaAgregar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JLabel lblID ;
	private JLabel lblNombre ;
	private JLabel lblGenero ;
	private JComboBox<Categorias> cbGenero ;
	private JButton btnAceptar ;

	public VentanaAgregar() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("Peliculas");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblID = new JLabel("ID");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(73, 48, 46, 14);
		contentPane.add(lblID);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(75, 92, 76, 14);
		contentPane.add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGenero.setBounds(74, 134, 58, 24);
		contentPane.add(lblGenero);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(197, 91, 154, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		cbGenero = new JComboBox<Categorias>();
		cbGenero.setBounds(198, 137, 153, 22);
		contentPane.add(cbGenero);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAceptar.setBounds(73, 196, 113, 23);
		contentPane.add(btnAceptar);
	}
}
