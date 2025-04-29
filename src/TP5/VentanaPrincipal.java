package TP5;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {
	private JMenuBar JmenuBar;
	private JMenu JMenuPeliculas;
	private JMenuItem JMenuItemAgregar;
	private JMenuItem JMenuItemListar;
	
	public VentanaPrincipal() {
        setTitle("Programa");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
        
        JmenuBar = new JMenuBar();
        setJMenuBar(JmenuBar);
        
        JMenuPeliculas = new JMenu("Peliculas");
        JmenuBar.add(JMenuPeliculas);
        
        JMenuItemAgregar = new JMenuItem("Agregar");
       
        JMenuPeliculas.add(JMenuItemAgregar);
                
        JMenuItemListar = new JMenuItem("Listar");
        JMenuPeliculas.add(JMenuItemListar);
    }
}
