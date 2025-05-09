package TP5;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PanelListarPeliculas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblTitulo;
	//private JTextArea textAreaPeliculas;
	private JList listaPeliculas;
	private DefaultListModel<Peliculas> modeloPeliculas;
	private JScrollPane scrollPane;
	
	public PanelListarPeliculas(DefaultListModel<Peliculas> modeloPeliculas) {
		this.modeloPeliculas = modeloPeliculas;
		setLayout(null);
	
		lblTitulo= new JLabel("Peliculas");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);  // Centra el texto en la etiqueta
		lblTitulo.setBounds(20, 20, 200, 20);
		add(lblTitulo);
		
		OrdenarPeliculas();
		listaPeliculas = new JList();
		listaPeliculas.setFont(new Font("Arial", Font.PLAIN, 14));
		//asigno el modelo compartido
		listaPeliculas.setModel(modeloPeliculas);
		

		scrollPane = new JScrollPane(listaPeliculas);
		scrollPane.setBounds(50, 60, 300, 160);
		add(scrollPane);
		
	}
	private void OrdenarPeliculas() {
		List <Peliculas> nuevalista = new ArrayList<>();
		for (int i=0; i<modeloPeliculas.getSize();i++)
			nuevalista.add(modeloPeliculas.getElementAt(i));
		
		Collections.sort(nuevalista,Comparator.comparing(Peliculas::getTitulo, String.CASE_INSENSITIVE_ORDER));
		modeloPeliculas.clear();
		nuevalista.forEach(modeloPeliculas::addElement);
		}
	
}
