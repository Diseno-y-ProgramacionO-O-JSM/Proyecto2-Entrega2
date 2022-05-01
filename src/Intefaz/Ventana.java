package Intefaz;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.Instant;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import consola.ControladorProyectos;
import modelo.Proyecto;

public class Ventana extends JFrame {


	public Ventana() {

		setLayout(new BorderLayout());

		setTitle("Proyectos 3000");

		setSize(600, 555);

		
		// INICIO
		PanelBackground panel = new PanelBackground();

		panel.setOpaque(false);
		panel.setBackground("img/bc.png");

		
		Paneles paneles = new Paneles(this);
		paneles.setOpaque(true);
		
		
		add(panel, BorderLayout.CENTER);

		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		

		}

	
	public static void main(String[] args) {
		new Ventana();
	}
	
	
}
