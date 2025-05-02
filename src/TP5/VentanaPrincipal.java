package TP5;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
	private JMenuBar JmenuBar;
	private JMenu JMenuPeliculas;
	private JMenuItem JMenuItemAgregar;
	private JMenuItem JMenuItemListar;
	private JPanel contentPane;
	
	public VentanaPrincipal() {
        setTitle("Programa");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
        
        // Agrega el panel a la ventana que se encuentra declarado en la property.
        contentPane = new JPanel();
        getContentPane().add(contentPane);
        contentPane.setLayout(new GridLayout(1, 0, 0, 0));
        
        JmenuBar = new JMenuBar();
        setJMenuBar(JmenuBar);
        
        JMenuPeliculas = new JMenu("Peliculas");
        JmenuBar.add(JMenuPeliculas);
        
        JMenuItemAgregar = new JMenuItem("Agregar");
        JMenuItemAgregar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		contentPane.removeAll();
        		PanelAgregarPeliculas panelAgregarPeli = new PanelAgregarPeliculas();
        		contentPane.add(panelAgregarPeli);
        		contentPane.repaint();
        		contentPane.revalidate();
        	}
        });
       
        JMenuPeliculas.add(JMenuItemAgregar);
                
        JMenuItemListar = new JMenuItem("Listar");
        JMenuItemListar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		contentPane.removeAll();
        		PanelListarPeliculas panelListarPeli = new PanelListarPeliculas();
        		contentPane.add(panelListarPeli);
        		contentPane.repaint();
        		contentPane.revalidate();
        	}        	
        });
      
        JMenuPeliculas.add(JMenuItemListar);
    }
}
