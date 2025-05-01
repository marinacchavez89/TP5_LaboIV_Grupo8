package TP5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;


public class PanelListarPeliculas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblTitulo;
	private JTextArea textAreaPeliculas;
	private JScrollPane scrollPane;
	
	public PanelListarPeliculas() {
		setLayout(null);

	
		lblTitulo= new JLabel("Peliculas");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);  // Centra el texto en la etiqueta
		lblTitulo.setBounds(20, 20, 200, 20);
		add(lblTitulo);
		
		textAreaPeliculas = new JTextArea();
		textAreaPeliculas.setEditable(false);
		textAreaPeliculas.setFont(new Font("Arial", Font.PLAIN, 14));  // Fuente más legible
		textAreaPeliculas.setLineWrap(true); 
		
		scrollPane = new JScrollPane (textAreaPeliculas);
		scrollPane.setBounds(50, 60, 300, 160);
		
		add(scrollPane);
		
	}
	
}
