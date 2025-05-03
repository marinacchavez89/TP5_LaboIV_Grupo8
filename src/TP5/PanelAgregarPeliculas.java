package TP5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class PanelAgregarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JLabel lblID ;
	private JComboBox<Categorias> cbGenero ;
	private JLabel lblGenero ;
	private JLabel lblNombre ;
	private JButton btnAceptar; 
	private JLabel lblIdAutoincremental;
	private static int cont = 1;
	private DefaultListModel<Peliculas> modeloPeliculas; // modelo compartido entre paneles

	public static int devuelveProximoId()
	{
		return  cont++;
	}
	
	/*private static final List <Peliculas> catalogo = new ArrayList<>();
	public PanelAgregarPeliculas() {
		setLayout(null);
		
		lblID = new JLabel("ID");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblID.setBounds(68, 80, 46, 14);
		add(lblID);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(67, 122, 60, 14);
		add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGenero.setBounds(68, 174, 60, 14);
		add(lblGenero);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(179, 120, 163, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		cbGenero = new JComboBox<Categorias>();
		cbGenero.setBounds(179, 171, 163, 22);
		add(cbGenero);
		
		cbGenero.addItem(new Categorias("Seleccione un genero"));
		cbGenero.addItem(new Categorias("Terror"));
		cbGenero.addItem(new Categorias("Accion"));
		cbGenero.addItem(new Categorias("Suspenso"));
		cbGenero.addItem(new Categorias("Romantica"));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!esFormValido())
				{
					return;
				}
				
				int id = devuelveProximoId();
				String nombre = txtNombre.getText().trim();
				Categorias cat = (Categorias) cbGenero.getSelectedItem();
				
				Peliculas peli = new Peliculas(id, nombre, cat);
				catalogo.add(peli);
				lblIdAutoincremental.setText(String.valueOf(cont));
							
			}
		});*/
	// CONSTRUCTOR MODIFICADO: recibe modeloPeliculas como parámetro
		public PanelAgregarPeliculas(DefaultListModel<Peliculas> modeloPeliculas) {
			setLayout(null);
			this.modeloPeliculas = modeloPeliculas;

			
			
			lblID = new JLabel("ID");
			lblID.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblID.setBounds(68, 80, 46, 14);
			add(lblID);
			
			lblNombre = new JLabel("Nombre");
			lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNombre.setBounds(67, 122, 60, 14);
			add(lblNombre);
			
			lblGenero = new JLabel("Genero");
			lblGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblGenero.setBounds(68, 174, 60, 14);
			add(lblGenero);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(179, 120, 163, 20);
			add(txtNombre);
			txtNombre.setColumns(10);
			
			cbGenero = new JComboBox<Categorias>();
			cbGenero.setBounds(179, 171, 163, 22);
			add(cbGenero);
			
			cbGenero.addItem(new Categorias("Seleccione un genero"));
			cbGenero.addItem(new Categorias("Terror"));
			cbGenero.addItem(new Categorias("Accion"));
			cbGenero.addItem(new Categorias("Suspenso"));
			cbGenero.addItem(new Categorias("Romantica"));
			
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!esFormValido())
					{
						return;
					}
					
					int id = devuelveProximoId();
					String nombre = txtNombre.getText().trim();
					Categorias cat = (Categorias) cbGenero.getSelectedItem();
					
					Peliculas peli = new Peliculas(id, nombre, cat);

					// Agrega al modelo compartido
					modeloPeliculas.addElement(peli);

					lblIdAutoincremental.setText(String.valueOf(cont));
					txtNombre.setText("");
					cbGenero.setSelectedIndex(0);
					txtNombre.requestFocus();
				}
			});
		
		
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAceptar.setBounds(82, 223, 89, 23);
		add(btnAceptar);
		
		lblIdAutoincremental = new JLabel(String.valueOf(cont));
		lblIdAutoincremental.setBounds(179, 81, 46, 14);
		add(lblIdAutoincremental);		
	}

	private boolean esFormValido() {
	    if (txtNombre.getText().trim().isEmpty()) {
	        JOptionPane.showMessageDialog(
	            this,
	            "El campo «Nombre» no puede estar vacío.",
	            "Validación",
	            JOptionPane.WARNING_MESSAGE
	        );
	        txtNombre.requestFocus();
	        return false;
	    }
	    if (cbGenero.getSelectedIndex() == 0) {
	        JOptionPane.showMessageDialog(
	            this,
	            "Debe seleccionar un género.",
	            "Validación",
	            JOptionPane.WARNING_MESSAGE
	        );
	        cbGenero.requestFocus();
	        return false;
	    }
	    return true;
	}

}
