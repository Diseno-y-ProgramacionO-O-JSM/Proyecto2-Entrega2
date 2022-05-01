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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import consola.ControladorProyectos;
import modelo.Proyecto;


public class Paneles extends JPanel implements ActionListener{

	ControladorProyectos controladorProyectos = new ControladorProyectos();

	private Ventana ventana;
	private JButton opcion1;
	private JButton opcion2;
	private JButton opcion3;
	private JButton opcion4;
	private JButton opcion5;
	private JButton opcion6;
	private JButton opcion7;
	private JButton opcion8;
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel41;
	private JPanel panel42;
	private JPanel panel5;
	private JPanel panel51;
	private JPanel panel52;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	
	JTextField Nombre;
	JTextField Correo;
	JTextField Nombre1;
	JTextField Nombre7;
	JTextField Dueno;
	JTextField Proyecto;
	JTextField Actividades;
	JTextField Proyecto3;
	JTextField Participante3;
	JTextField Proyecto4;
	JTextField Actividad4;
	JTextField Participante4;
	JTextField Descripcion4;
	JComboBox<String> Tipo4;
	JTextField Participante8;
	JTextField Proyecto5;
	JTextField Actividad5;
	JTextField Participante5;
	JTextField Descripcion5;
	JTextField FechaIn5;
	JTextField FechaFin5;
	JTextField HoraInicio;
	JTextField HoraFin;
	JComboBox<String> Tipo5;
	
	public Paneles(Ventana ventana1) {
		
		this.ventana=ventana1;
		panel1 = new JPanel(new GridBagLayout());
		panel2 = new JPanel(new GridBagLayout());
		panel3 = new JPanel(new GridBagLayout());
		panel4 = new JPanel(new GridBagLayout());
		panel41 = new JPanel(new GridBagLayout());
		panel42 = new JPanel(new GridBagLayout());
		panel5 = new JPanel(new GridBagLayout());
		panel51 = new JPanel(new GridBagLayout());
		panel52 = new JPanel(new GridBagLayout());
		panel6 = new JPanel(new GridBagLayout());
		panel7 = new JPanel(new GridBagLayout());
		panel8 = new JPanel(new GridBagLayout());
		
		panel1.setBackground(Color.PINK);
		panel2.setBackground(Color.decode("#A9FFC6"));
		panel3.setBackground(Color.decode("#FFB67C"));
		panel4.setBackground(Color.decode("#A5CAE8"));
		panel41.setBackground(Color.decode("#A5CAE8"));
		panel42.setBackground(Color.decode("#A5CAE8"));
		panel5.setBackground(Color.decode("#FFF693"));
		panel51.setBackground(Color.decode("#FFF693"));
		panel52.setBackground(Color.decode("#FFF693"));
		panel6.setBackground(Color.decode("#B0FFFA"));
		panel7.setBackground(Color.decode("#BBBABF"));
		panel8.setBackground(Color.decode("#EB7E7B"));
		
		opcion1 = new JButton("Registrar Usuario");
		opcion1.addActionListener(this);
		opcion2 = new JButton("Crear Proyecto");
		opcion2.addActionListener(this);
		opcion3 = new JButton("Agregar Participante");
		opcion3.addActionListener(this);
		opcion4 = new JButton("Iniciar Actividad");
		opcion4.addActionListener(this);
		opcion5 = new JButton("Registrar Actividad");
		opcion5.addActionListener(this);
		opcion6 = new JButton("Finalizar Actividad");
		opcion6.addActionListener(this);
		opcion7 = new JButton("Finalizar Proyecto");
		opcion7.addActionListener(this);
		opcion8 = new JButton("Reporte Usuario");
		opcion8.addActionListener(this);
	
		this.setLayout(new GridLayout(8, 1));

		this.add(opcion1);
		this.add(opcion2);
		this.add(opcion3);
		this.add(opcion4);
		this.add(opcion5);
		this.add(opcion6);
		this.add(opcion7);
		this.add(opcion8);
		
		ventana.add(this,BorderLayout.WEST);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object event = e.getActionCommand();
		System.out.println(event);
		String[] strAr3 = null;

		Instant tiempo = null;
		if (event.equals("Registrar Usuario")) {

			ventana.getContentPane().removeAll();
			Nombre = new JTextField(20);
			Correo = new JTextField(20);

			JLabel nombre = new JLabel("Nombre:");
			JLabel correo = new JLabel("Correo:");
			JLabel info = new JLabel(" Registrar usuario \t        ");

			Font font = new Font("MS Sans Serif", Font.BOLD, 22);
			info.setFont(font);

			JButton boton = new JButton("Registrar");
			boton.addActionListener(this);
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.anchor = GridBagConstraints.FIRST_LINE_END;
			constraints.insets = new Insets(10, 10, 10, 10);

			constraints.gridx = 1;
			constraints.gridy = 0;
			panel1.add(info, constraints);

			constraints.gridx = 0;
			constraints.gridy = 1;
			panel1.add(nombre, constraints);

			constraints.gridx = 1;
			constraints.gridy = 1;
			panel1.add(Nombre, constraints);

			constraints.gridx = 0;
			constraints.gridy = 2;
			panel1.add(correo, constraints);

			constraints.gridx = 1;
			constraints.gridy = 2;
			panel1.add(Correo, constraints);

			constraints.gridx = 0;
			constraints.gridy = 3;
			constraints.gridwidth = 2;
			constraints.anchor = GridBagConstraints.CENTER;
			panel1.add(boton, constraints);

			ventana.getContentPane().add(panel1, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();

		} else if (event.equals("Crear Proyecto")) {

			ventana.getContentPane().removeAll();
			Nombre1 = new JTextField(20);
			Dueno = new JTextField(20);
			Proyecto = new JTextField(20);
			Actividades = new JTextField(20);
			enableDefaultValue(Actividades, "Actividad1,Actividad2,Actividad3...");


			JLabel nombre1 = new JLabel("Nombre proyecto:");
			JLabel dueno = new JLabel("Dueño:");
			JLabel proyecto = new JLabel("Descripcion:");
			JLabel actividades = new JLabel("Actividades:");
			JLabel info1 = new JLabel(" Crear proyecto \t        ");

			Font font1 = new Font("MS Sans Serif", Font.BOLD, 22);
			info1.setFont(font1);

			JButton boton1 = new JButton("Crear");
			boton1.addActionListener(this);
			GridBagConstraints constraints1 = new GridBagConstraints();
			constraints1.anchor = GridBagConstraints.FIRST_LINE_END;
			constraints1.insets = new Insets(10, 10, 10, 10);

			constraints1.gridx = 1;
			constraints1.gridy = 0;
			panel2.add(info1, constraints1);

			constraints1.gridx = 0;
			constraints1.gridy = 1;
			panel2.add(nombre1, constraints1);

			constraints1.gridx = 1;
			constraints1.gridy = 1;
			panel2.add(Nombre1, constraints1);

			constraints1.gridx = 1;
			constraints1.gridy = 2;
			panel2.add(Dueno, constraints1);

			constraints1.gridx = 0;
			constraints1.gridy = 2;
			panel2.add(dueno, constraints1);

			constraints1.gridx = 1;
			constraints1.gridy = 3;
			panel2.add(Proyecto, constraints1);

			constraints1.gridx = 0;
			constraints1.gridy = 3;
			panel2.add(proyecto, constraints1);

			constraints1.gridx = 1;
			constraints1.gridy = 4;
			panel2.add(Actividades, constraints1);

			constraints1.gridx = 0;
			constraints1.gridy = 4;
			panel2.add(actividades, constraints1);

			constraints1.gridx = 0;
			constraints1.gridy = 5;
			constraints1.gridwidth = 2;
			constraints1.anchor = GridBagConstraints.CENTER;
			panel2.add(boton1, constraints1);
			ventana.getContentPane().add(panel2, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();

		} else if (event.equals("Agregar Participante")) {

			ventana.getContentPane().removeAll();
			Proyecto3 = new JTextField(20);
			Participante3 = new JTextField(20);

			JLabel proyecto3 = new JLabel("Nombre Proyecto:");
			JLabel participante3 = new JLabel("Nombre Participante:");
			JLabel info3 = new JLabel(" Agregar Participante \t  ");

			Font font3 = new Font("MS Sans Serif", Font.BOLD, 22);
			info3.setFont(font3);

			JButton boton3 = new JButton("Agregar");
			boton3.addActionListener(this);
			GridBagConstraints constraints3 = new GridBagConstraints();
			constraints3.anchor = GridBagConstraints.FIRST_LINE_END;
			constraints3.insets = new Insets(10, 10, 10, 10);

			constraints3.gridx = 1;
			constraints3.gridy = 0;
			panel3.add(info3, constraints3);

			constraints3.gridx = 0;
			constraints3.gridy = 1;
			panel3.add(proyecto3, constraints3);

			constraints3.gridx = 1;
			constraints3.gridy = 1;
			panel3.add(Proyecto3, constraints3);

			constraints3.gridx = 0;
			constraints3.gridy = 2;
			panel3.add(participante3, constraints3);

			constraints3.gridx = 1;
			constraints3.gridy = 2;
			panel3.add(Participante3, constraints3);

			constraints3.gridx = 0;
			constraints3.gridy = 3;
			constraints3.gridwidth = 2;
			constraints3.anchor = GridBagConstraints.CENTER;
			panel3.add(boton3, constraints3);
			ventana.getContentPane().add(panel3, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();

		} else if (event.equals("Iniciar Actividad")) {

			ventana.getContentPane().removeAll();
			Proyecto4 = new JTextField(20);
			Actividad4 = new JTextField(20);
			Participante4 = new JTextField(20);
			Descripcion4 = new JTextField(20);
			Tipo4 = new javax.swing.JComboBox<String>(new String[] {"Opciones..."}) ;

			JLabel proyecto4 = new JLabel("Nombre proyecto:");
			JLabel actividad4 = new JLabel("Nombre Actividad:");
			JLabel participante4 = new JLabel("Participante:");
			JLabel descripcion4 = new JLabel("Descripcion:");
			JLabel tipo4 = new JLabel("Tipo:");

			JLabel info4 = new JLabel("Iniciar Actividad");

			Font font4 = new Font("MS Sans Serif", Font.BOLD, 22);
			info4.setFont(font4);

			JButton boton4 = new JButton("Iniciar");
			boton4.addActionListener(this);

			JButton boton44 = new JButton("Verificar");
			boton44.addActionListener(this);

			GridBagConstraints constraints4 = new GridBagConstraints();
			constraints4.anchor = GridBagConstraints.FIRST_LINE_END;
			constraints4.insets = new Insets(10, 10, 10, 10);

			constraints4.gridx = 1;
			constraints4.gridy = 0;
			constraints4.anchor = GridBagConstraints.CENTER;
			panel4.add(info4, constraints4);

			constraints4.gridx = 0;
			constraints4.gridy = 1;
			panel4.add(proyecto4, constraints4);

			constraints4.gridx = 1;
			constraints4.gridy = 1;
			panel4.add(Proyecto4, constraints4);

			constraints4.gridx = 1;
			constraints4.gridy = 4;
			panel4.add(Actividad4, constraints4);

			constraints4.gridx = 0;
			constraints4.gridy = 4;
			panel4.add(actividad4, constraints4);

			constraints4.gridx = 1;
			constraints4.gridy = 5;
			panel4.add(Participante4, constraints4);

			constraints4.gridx = 0;
			constraints4.gridy = 5;
			panel4.add(participante4, constraints4);

			constraints4.gridx = 1;
			constraints4.gridy = 6;
			panel4.add(Descripcion4, constraints4);

			constraints4.gridx = 0;
			constraints4.gridy = 6;
			panel4.add(descripcion4, constraints4);

			constraints4.gridx = 1;
			constraints4.gridy = 7;
			constraints4.anchor = GridBagConstraints.CENTER;
			panel4.add(Tipo4, constraints4);

			constraints4.gridx = 0;
			constraints4.gridy = 7;
			panel4.add(tipo4, constraints4);

			constraints4.gridx = 0;
			constraints4.gridy = 3;
			constraints4.gridwidth = 2;
			constraints4.anchor = GridBagConstraints.CENTER;

			panel4.add(boton44, constraints4);
			constraints4.gridx = 0;
			constraints4.gridy = 8;
			constraints4.gridwidth = 2;
			constraints4.anchor = GridBagConstraints.CENTER;

			panel4.add(boton4, constraints4);

			ventana.getContentPane().add(panel4, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();

		} else if (event.equals("Registrar Actividad")) {

			
			ventana.getContentPane().removeAll();
			Proyecto5 = new JTextField(18);
			Actividad5 = new JTextField(18);
			Participante5 = new JTextField(18);
			Descripcion5 = new JTextField(18);
			FechaIn5 = new JTextField(18);
			FechaFin5 = new JTextField(18);
			Tipo5 = new javax.swing.JComboBox<String>(new String[] {"Opciones..."});
			HoraInicio = new JTextField(18);
			HoraFin = new JTextField(18);
			enableDefaultValue(HoraFin, "HH:mm:");
			enableDefaultValue(HoraInicio, "HH:mm");
			enableDefaultValue(FechaIn5, "dd-MM-yyyy");
			enableDefaultValue(FechaFin5, "dd-MM-yyyy");
			JLabel proyecto5 = new JLabel("Nombre proyecto:");
			JLabel actividad5 = new JLabel("Nombre Actividad:");
			JLabel participante5 = new JLabel("Participante:");
			JLabel descripcion5 = new JLabel("Descripcion:");
			JLabel fechain5 = new JLabel("Fecha Inicio:");
			JLabel fechafin5 = new JLabel("Fecha Fin:");
			JLabel horain = new JLabel("Hora Inicio:");
			JLabel horafin = new JLabel("Hora Fin:");
			JLabel tipo5 = new JLabel("Tipo:");

			JLabel info5 = new JLabel("Registar Actividad");

			Font font5 = new Font("MS Sans Serif", Font.BOLD, 22);
			info5.setFont(font5);

			JButton boton5 = new JButton("Registrar ");
			boton5.addActionListener(this);

			JButton boton55 = new JButton("Verificar ");
			boton55.addActionListener(this);

			GridBagConstraints constraints5 = new GridBagConstraints();
			constraints5.anchor = GridBagConstraints.FIRST_LINE_END;
			constraints5.insets = new Insets(10, 10, 10, 10);

			constraints5.gridx = 1;
			constraints5.gridy = 0;
			constraints5.anchor = GridBagConstraints.CENTER;
			panel5.add(info5, constraints5);

			constraints5.gridx = 0;
			constraints5.gridy = 1;
			panel5.add(proyecto5, constraints5);

			constraints5.gridx = 1;
			constraints5.gridy = 1;
			panel5.add(Proyecto5, constraints5);

			constraints5.gridx = 1;
			constraints5.gridy = 4;
			panel5.add(Actividad5, constraints5);

			constraints5.gridx = 0;
			constraints5.gridy = 4;
			panel5.add(actividad5, constraints5);

			constraints5.gridx = 1;
			constraints5.gridy = 5;
			panel5.add(Participante5, constraints5);

			constraints5.gridx = 0;
			constraints5.gridy = 5;
			panel5.add(participante5, constraints5);

			constraints5.gridx = 1;
			constraints5.gridy = 6;
			panel5.add(Descripcion5, constraints5);

			constraints5.gridx = 0;
			constraints5.gridy = 6;
			panel5.add(descripcion5, constraints5);

			constraints5.gridx = 1;
			constraints5.gridy = 7;
			constraints5.anchor = GridBagConstraints.CENTER;
			panel5.add(Tipo5, constraints5);

			constraints5.gridx = 0;
			constraints5.gridy = 7;
			panel5.add(tipo5, constraints5);
			
			constraints5.gridx = 1;
			constraints5.gridy = 8;
			panel5.add(FechaIn5, constraints5);

			constraints5.gridx = 0;
			constraints5.gridy = 8;
			panel5.add(fechain5, constraints5);
			constraints5.gridx = 1;
			constraints5.gridy = 9;
			panel5.add(FechaFin5, constraints5);

			constraints5.gridx = 0;
			constraints5.gridy = 9;
			panel5.add(fechafin5, constraints5);
			
			constraints5.gridx = 1;
			constraints5.gridy = 10;
			panel5.add(HoraInicio, constraints5);
			constraints5.gridx = 0;
			constraints5.gridy = 10;
			panel5.add(horain, constraints5);
			constraints5.gridx = 0;
			constraints5.gridy = 11;
			panel5.add(horafin, constraints5);
			constraints5.gridx = 1;
			constraints5.gridy = 11;
			panel5.add(HoraFin, constraints5);

			constraints5.gridx = 0;
			constraints5.gridy = 3;
			constraints5.gridwidth = 2;
			constraints5.anchor = GridBagConstraints.CENTER;

			panel5.add(boton55, constraints5);
			constraints5.gridx = 0;
			constraints5.gridy = 12;
			constraints5.gridwidth = 2;
			constraints5.anchor = GridBagConstraints.CENTER;

			panel5.add(boton5, constraints5);

			
			
			ventana.getContentPane().add(panel5, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();

		} else if (event.equals("Finalizar Actividad")) {

			ventana.getContentPane().removeAll();
			JLabel titulo6 = new JLabel("Finalizar actividad");

			Font font6 = new Font("MS Sans Serif", Font.BOLD, 22);
			
			titulo6.setFont(font6);

			JButton boton6 = new JButton("Finalizar actividad en curso");
			boton6.addActionListener(this);
			GridBagConstraints constraints6 = new GridBagConstraints();
			constraints6.anchor = GridBagConstraints.FIRST_LINE_END;
			constraints6.insets = new Insets(10, 10, 10, 10);
			constraints6.gridx = 0;
			constraints6.gridy = 3;
			constraints6.gridwidth = 2;
			constraints6.anchor = GridBagConstraints.CENTER;
			panel6.add(boton6, constraints6);

			constraints6.gridx = 1;
			constraints6.gridy = 0;
			constraints6.gridwidth = 2;
			constraints6.anchor = GridBagConstraints.CENTER;
			panel6.add(titulo6, constraints6);
			ventana.getContentPane().add(panel6, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();

		} else if (event.equals("Finalizar Proyecto")) {

			ventana.getContentPane().removeAll();
			JLabel titulo7 = new JLabel("Finalizar proyecto");
			Font font7 = new Font("MS Sans Serif", Font.BOLD, 22);
			titulo7.setFont(font7);
			JLabel nombre7 = new JLabel("Nombre del proyecto: ");
			Nombre7 = new JTextField(20);

			JButton boton7 = new JButton("Finalizar proyecto");
			boton7.addActionListener(this);
			GridBagConstraints constraints7 = new GridBagConstraints();
			constraints7.anchor = GridBagConstraints.FIRST_LINE_END;
			constraints7.insets = new Insets(10, 10, 10, 10);

			constraints7.gridx = 1;
			constraints7.gridy = 0;
			constraints7.anchor = GridBagConstraints.CENTER;

			panel7.add(titulo7, constraints7);

			constraints7.gridx = 0;
			constraints7.gridy = 1;
			panel7.add(nombre7, constraints7);

			constraints7.gridx = 1;
			constraints7.gridy = 1;
			panel7.add(Nombre7, constraints7);

			constraints7.gridx = 0;
			constraints7.gridy = 3;
			constraints7.gridwidth = 2;
			constraints7.anchor = GridBagConstraints.CENTER;
			panel7.add(boton7, constraints7);
			ventana.getContentPane().add(panel7, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();

		} else if (event.equals("Reporte Usuario")) {

			ventana.getContentPane().removeAll();
			Participante8 = new JTextField(20);

			JLabel participante8 = new JLabel("Nombre Participante:");

			JLabel info8 = new JLabel(" Reporte usuario \t  ");

			Font font8 = new Font("MS Sans Serif", Font.BOLD, 22);
			info8.setFont(font8);

			JButton boton8 = new JButton("Generar");
			boton8.addActionListener(this);
			GridBagConstraints constraints8 = new GridBagConstraints();
			constraints8.anchor = GridBagConstraints.FIRST_LINE_END;
			constraints8.insets = new Insets(10, 10, 10, 10);

			constraints8.gridx = 1;
			constraints8.gridy = 0;
			panel8.add(info8, constraints8);

			constraints8.gridx = 0;
			constraints8.gridy = 2;
			panel8.add(participante8, constraints8);

			constraints8.gridx = 1;
			constraints8.gridy = 2;
			panel8.add(Participante8, constraints8);

			constraints8.gridx = 0;
			constraints8.gridy = 3;
			constraints8.gridwidth = 2;
			constraints8.anchor = GridBagConstraints.CENTER;
			panel8.add(boton8, constraints8);

			ventana.getContentPane().add(panel8, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();
			}
		else if (event.equals("Registrar")) {

			String name = Nombre.getText();
			String mail = Correo.getText();
			controladorProyectos.RegistroUsuario(name, mail);
			System.out.println(name);
			System.out.println(mail);
			Nombre.setText(null);
			Correo.setText(null);

		} else if (event.equals("Crear")) {

			String name = Nombre1.getText();
			String dueno = Dueno.getText();
			String proyecto = Proyecto.getText();
			String actividades = Actividades.getText();
			controladorProyectos.CrearProyecto(name, dueno, proyecto, actividades);
			Nombre1.setText(null);
			Dueno.setText(null);
			Proyecto.setText(null);
			Actividades.setText(null);

		} else if (event.equals("Agregar")) {

			String name = Proyecto3.getText();
			String dueno = Participante3.getText();
			controladorProyectos.AgregarParticipante(name, dueno);
			Proyecto3.setText(null);
			Participante3.setText(null);

		}

		else if (event.equals("Verificar")) {
			String proyecto = Proyecto4.getText();
			System.out.println(proyecto);
			
		
			Proyecto elProyecto = controladorProyectos.getProyectos(proyecto);
			if (elProyecto != null)
			{
			
				ArrayList<String> lista = controladorProyectos.getActividades(proyecto);
				ventana.getContentPane().removeAll();
				System.out.println(lista);
	
			
				strAr3 = new String[lista.size()];
				for (int i = 0; i < strAr3.length; i++) {
					strAr3[i] = lista.get(i);
				}
	
				Actividad4 = new JTextField(20);
				Participante4 = new JTextField(20);
				Descripcion4 = new JTextField(20);
				Tipo4 = new javax.swing.JComboBox<String>(strAr3);
	
				JLabel actividad4 = new JLabel("Nombre Actividad:");
				JLabel participante4 = new JLabel("Participante:");
				JLabel descripcion4 = new JLabel("Descripcion:");
				JLabel tipo4 = new JLabel("Tipo:");
				JLabel info4 = new JLabel("Iniciar Actividad");
				JLabel info44 = new JLabel("Se ha encontrado el proyecto exitosamente");
	
				Font font4 = new Font("MS Sans Serif", Font.BOLD, 22);
				info4.setFont(font4);
	
				JButton boton4 = new JButton("Iniciar");
				boton4.addActionListener(this);
	
				JButton boton44 = new JButton("Verificar");
				boton44.addActionListener(this);
	
				GridBagConstraints constraints4 = new GridBagConstraints();
				constraints4.anchor = GridBagConstraints.FIRST_LINE_END;
				constraints4.insets = new Insets(10, 10, 10, 10);
	
				constraints4.gridx = 1;
				constraints4.gridy = 0;
				constraints4.anchor = GridBagConstraints.CENTER;
				panel41.add(info4, constraints4);
	
				constraints4.gridx = 1;
				constraints4.gridy = 4;
				panel41.add(Actividad4, constraints4);
	
				constraints4.gridx = 0;
				constraints4.gridy = 4;
				panel41.add(actividad4, constraints4);
	
				constraints4.gridx = 1;
				constraints4.gridy = 5;
				panel41.add(Participante4, constraints4);
	
				constraints4.gridx = 0;
				constraints4.gridy = 5;
				panel41.add(participante4, constraints4);
	
				constraints4.gridx = 1;
				constraints4.gridy = 6;
				panel41.add(Descripcion4, constraints4);
	
				constraints4.gridx = 0;
				constraints4.gridy = 6;
				panel41.add(descripcion4, constraints4);
	
				constraints4.gridx = 1;
				constraints4.gridy = 7;
				constraints4.anchor = GridBagConstraints.CENTER;
				panel41.add(Tipo4, constraints4);
	
				constraints4.gridx = 0;
				constraints4.gridy = 7;
				panel41.add(tipo4, constraints4);
	
				constraints4.gridx = 0;
				constraints4.gridy = 3;
				constraints4.gridwidth = 2;
				constraints4.anchor = GridBagConstraints.CENTER;
				panel41.add(info44, constraints4);
	
				constraints4.gridx = 0;
				constraints4.gridy = 8;
				constraints4.gridwidth = 2;
				constraints4.anchor = GridBagConstraints.CENTER;
	
				panel41.add(boton4, constraints4);
	
				ventana.getContentPane().add(panel41, BorderLayout.CENTER);
				ventana.getContentPane().add(this, BorderLayout.WEST);
	
				ventana.getContentPane().revalidate();
				ventana.getContentPane().repaint();

			}
			else {
				
				ventana.getContentPane().removeAll();
				Proyecto4 = new JTextField(20);
				Actividad4 = new JTextField(20);
				Participante4 = new JTextField(20);
				Descripcion4 = new JTextField(20);
				Tipo4 = new javax.swing.JComboBox<String>(new String[] {"Opciones..."});

				JLabel error = new JLabel("-El proyecto no existe-");
				JLabel proyecto4 = new JLabel("Nombre proyecto:");
				JLabel actividad4 = new JLabel("Nombre Actividad:");
				JLabel participante4 = new JLabel("Participante:");
				JLabel descripcion4 = new JLabel("Descripcion:");
				JLabel tipo4 = new JLabel("Tipo:");

				JLabel info4 = new JLabel("Iniciar Actividad");

				Font font4 = new Font("MS Sans Serif", Font.BOLD, 22);
				info4.setFont(font4);

				JButton boton4 = new JButton("Iniciar");
				boton4.addActionListener(this);

				JButton boton44 = new JButton("Verificar");
				boton44.addActionListener(this);

				GridBagConstraints constraints4 = new GridBagConstraints();
				constraints4.anchor = GridBagConstraints.FIRST_LINE_END;
				constraints4.insets = new Insets(10, 10, 10, 10);

				constraints4.gridx = 1;
				constraints4.gridy = 0;
				constraints4.anchor = GridBagConstraints.CENTER;
				panel42.add(info4, constraints4);

				constraints4.gridx = 1;
				constraints4.gridy = 1;
				constraints4.anchor = GridBagConstraints.CENTER;
				panel42.add(error, constraints4);
				
				constraints4.gridx = 0;
				constraints4.gridy = 2;
				panel42.add(proyecto4, constraints4);

				constraints4.gridx = 1;
				constraints4.gridy = 2;
				panel42.add(Proyecto4, constraints4);

				constraints4.gridx = 1;
				constraints4.gridy = 5;
				panel42.add(Actividad4, constraints4);

				constraints4.gridx = 0;
				constraints4.gridy = 5;
				panel42.add(actividad4, constraints4);

				constraints4.gridx = 1;
				constraints4.gridy = 6;
				panel42.add(Participante4, constraints4);

				constraints4.gridx = 0;
				constraints4.gridy = 6;
				panel42.add(participante4, constraints4);

				constraints4.gridx = 1;
				constraints4.gridy = 7;
				panel42.add(Descripcion4, constraints4);

				constraints4.gridx = 0;
				constraints4.gridy = 7;
				panel42.add(descripcion4, constraints4);

				constraints4.gridx = 1;
				constraints4.gridy = 8;
				constraints4.anchor = GridBagConstraints.CENTER;
				panel42.add(Tipo4, constraints4);

				constraints4.gridx = 0;
				constraints4.gridy = 8;
				panel42.add(tipo4, constraints4);

				constraints4.gridx = 0;
				constraints4.gridy = 4;
				constraints4.gridwidth = 2;
				constraints4.anchor = GridBagConstraints.CENTER;
				panel42.add(boton44, constraints4);
				
				constraints4.gridx = 0;
				constraints4.gridy = 9;
				constraints4.gridwidth = 2;
				constraints4.anchor = GridBagConstraints.CENTER;
				panel42.add(boton4, constraints4);

				ventana.getContentPane().add(panel42, BorderLayout.CENTER);
				ventana.getContentPane().add(this, BorderLayout.WEST);
				ventana.getContentPane().revalidate();
				ventana.getContentPane().repaint();
			}
		}
		else if (event.equals("Iniciar")) {
			String proy = Proyecto4.getText();
			String part = Participante4.getText();
			String descripcion = Descripcion4.getText();
			String nombre = Actividad4.getText();
			String EleccionAct = (String) Tipo4.getSelectedItem();
			
			tiempo = controladorProyectos.IniciarActividad(proy,nombre,part, descripcion, EleccionAct);
			Proyecto4.setText(null);
			Participante4.setText(null);
			Descripcion4.setText(null);
			Actividad4.setText(null);
			Tipo4.setSelectedItem(null);
			ventana.getContentPane().removeAll();
			ventana.getContentPane().add(panel4, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();
		}
		
		else if (event.equals("Verificar ")) {
			
			String proyecto = Proyecto5.getText();
			System.out.println(proyecto);
					
			Proyecto elProyecto = controladorProyectos.getProyectos(proyecto);
			if (elProyecto != null)
			{
				ArrayList<String> lista = controladorProyectos.getActividades(proyecto);
				ventana.getContentPane().removeAll();
				System.out.println(lista);

			
				strAr3 = new String[lista.size()];
				for (int i = 0; i < strAr3.length; i++) {
					strAr3[i] = lista.get(i);
				}
				
				Actividad5 = new JTextField(18);
				Participante5 = new JTextField(18);
				Descripcion5 = new JTextField(18);
				FechaIn5 = new JTextField(18);
				FechaFin5 = new JTextField(18);
				Tipo5 = new javax.swing.JComboBox<String>(strAr3 );
				HoraInicio = new JTextField(18);
				HoraFin = new JTextField(18);
				enableDefaultValue(HoraFin, "HH:mm");
				enableDefaultValue(HoraInicio, "HH:mm");
				enableDefaultValue(FechaIn5, "dd-MM-yyyy");
				enableDefaultValue(FechaFin5, "dd-MM-yyyy");
				JLabel actividad5 = new JLabel("Nombre Actividad:");
				JLabel participante5 = new JLabel("Participante:");
				JLabel descripcion5 = new JLabel("Descripcion:");
				JLabel fechain5 = new JLabel("Fecha Inicio:");
				JLabel fechafin5 = new JLabel("Fecha Fin:");
				JLabel horain = new JLabel("Hora Inicio:");
				JLabel horafin = new JLabel("Hora Fin:");
				JLabel tipo5 = new JLabel("Tipo:");
				JLabel info55 = new JLabel("Se ha encontrado el proyecto exitosamente");


				JLabel info5 = new JLabel("Registar Actividad");

				Font font5 = new Font("MS Sans Serif", Font.BOLD, 22);
				info5.setFont(font5);

				JButton boton5 = new JButton("Registrar ");
				boton5.addActionListener(this);

				GridBagConstraints constraints5 = new GridBagConstraints();
				constraints5.anchor = GridBagConstraints.FIRST_LINE_END;
				constraints5.insets = new Insets(10, 10, 10, 10);

				constraints5.gridx = 1;
				constraints5.gridy = 0;
				constraints5.anchor = GridBagConstraints.CENTER;
				panel51.add(info5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 1;
				constraints5.anchor = GridBagConstraints.CENTER;
				panel51.add(info55, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 4;
				panel51.add(Actividad5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 4;
				panel51.add(actividad5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 5;
				panel51.add(Participante5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 5;
				panel51.add(participante5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 6;
				panel51.add(Descripcion5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 6;
				panel51.add(descripcion5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 7;
				constraints5.anchor = GridBagConstraints.CENTER;
				panel51.add(Tipo5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 7;
				panel51.add(tipo5, constraints5);
				
				constraints5.gridx = 1;
				constraints5.gridy = 8;
				panel51.add(FechaIn5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 8;
				panel51.add(fechain5, constraints5);
				constraints5.gridx = 1;
				constraints5.gridy = 9;
				panel51.add(FechaFin5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 9;
				panel51.add(fechafin5, constraints5);
				
				constraints5.gridx = 1;
				constraints5.gridy = 10;
				panel51.add(HoraInicio, constraints5);
				constraints5.gridx = 0;
				constraints5.gridy = 10;
				panel51.add(horain, constraints5);
				constraints5.gridx = 0;
				constraints5.gridy = 11;
				panel51.add(horafin, constraints5);
				constraints5.gridx = 1;
				constraints5.gridy = 11;
				panel51.add(HoraFin, constraints5);

				;
				constraints5.gridx = 0;
				constraints5.gridy = 12;
				constraints5.gridwidth = 2;
				constraints5.anchor = GridBagConstraints.CENTER;

				panel51.add(boton5, constraints5);

				
				
				ventana.getContentPane().add(panel51, BorderLayout.CENTER);
				ventana.getContentPane().add(this, BorderLayout.WEST);
				ventana.getContentPane().revalidate();
				ventana.getContentPane().repaint();

				
				
			}
			else {
				ventana.getContentPane().removeAll();
				Proyecto5 = new JTextField(18);
				Actividad5 = new JTextField(18);
				Participante5 = new JTextField(18);
				Descripcion5 = new JTextField(18);
				FechaIn5 = new JTextField(18);
				FechaFin5 = new JTextField(18);
				Tipo5 = new javax.swing.JComboBox<String>(new String[] {"Opciones..."});
				HoraInicio = new JTextField(18);
				HoraFin = new JTextField(18);
				enableDefaultValue(HoraFin, "HH:mm");
				enableDefaultValue(HoraInicio, "HH:mm");
				enableDefaultValue(FechaIn5, "dd-MM-yyyy");
				enableDefaultValue(FechaFin5, "dd-MM-yyyy");

				JLabel proyecto5 = new JLabel("Nombre proyecto:");
				JLabel actividad5 = new JLabel("Nombre Actividad:");
				JLabel participante5 = new JLabel("Participante:");
				JLabel descripcion5 = new JLabel("Descripcion:");
				JLabel fechain5 = new JLabel("Fecha Inicio:");
				JLabel fechafin5 = new JLabel("Fecha Fin:");
				JLabel horain = new JLabel("Hora Inicio:");
				JLabel horafin = new JLabel("Hora Fin:");
				JLabel tipo5 = new JLabel("Tipo:");
				JLabel error = new JLabel("-El proyecto no existe-");

				JLabel info5 = new JLabel("Registar Actividad");

				Font font5 = new Font("MS Sans Serif", Font.BOLD, 22);
				info5.setFont(font5);

				JButton boton5 = new JButton("Registrar ");
				boton5.addActionListener(this);

				JButton boton55 = new JButton("Verificar ");
				boton55.addActionListener(this);

				GridBagConstraints constraints5 = new GridBagConstraints();
				constraints5.anchor = GridBagConstraints.FIRST_LINE_END;
				constraints5.insets = new Insets(10, 10, 10, 10);

				constraints5.gridx = 1;
				constraints5.gridy = 0;
				constraints5.anchor = GridBagConstraints.CENTER;
				panel52.add(info5, constraints5);
				
				constraints5.gridx = 0;
				constraints5.gridy = 3;
				panel52.add(error, constraints5);


				constraints5.gridx = 0;
				constraints5.gridy = 1;
				panel52.add(proyecto5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 1;
				panel52.add(Proyecto5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 4;
				panel52.add(Actividad5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 4;
				panel52.add(actividad5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 5;
				panel52.add(Participante5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 5;
				panel52.add(participante5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 6;
				panel52.add(Descripcion5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 6;
				panel52.add(descripcion5, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 7;
				constraints5.anchor = GridBagConstraints.CENTER;
				panel52.add(Tipo5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 7;
				panel52.add(tipo5, constraints5);
				
				constraints5.gridx = 1;
				constraints5.gridy = 8;
				panel52.add(FechaIn5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 8;
				panel52.add(fechain5, constraints5);
				constraints5.gridx = 1;
				constraints5.gridy = 9;
				panel52.add(FechaFin5, constraints5);

				constraints5.gridx = 0;
				constraints5.gridy = 9;
				panel52.add(fechafin5, constraints5);
				
				constraints5.gridx = 1;
				constraints5.gridy = 10;
				panel52.add(HoraInicio, constraints5);
				constraints5.gridx = 0;
				constraints5.gridy = 10;
				panel52.add(horain, constraints5);
				constraints5.gridx = 0;
				constraints5.gridy = 11;
				panel52.add(horafin, constraints5);
				constraints5.gridx = 1;
				constraints5.gridy = 11;
				panel52.add(HoraFin, constraints5);

				constraints5.gridx = 1;
				constraints5.gridy = 3;
				constraints5.gridwidth = 2;
				constraints5.anchor = GridBagConstraints.CENTER;

				panel52.add(boton55, constraints5);
				constraints5.gridx = 0;
				constraints5.gridy = 12;
				constraints5.gridwidth = 2;
				constraints5.anchor = GridBagConstraints.CENTER;

				panel52.add(boton5, constraints5);

				
				
				ventana.getContentPane().add(panel52, BorderLayout.CENTER);
				ventana.getContentPane().add(this, BorderLayout.WEST);
				ventana.getContentPane().revalidate();
				ventana.getContentPane().repaint();
			}

		}
		else if (event.equals("Registrar ")) {
			
			String proy = Proyecto5.getText();
			String activ=Actividad5.getText();
			String part = Participante5.getText();
			String descripcion = Descripcion5.getText();
			String fechain = FechaIn5.getText();
			String fechafin = FechaFin5.getText();
			String EleccionAct = (String) Tipo5.getSelectedItem();
			String horain = HoraInicio.getText();
			String horafin = HoraFin.getText();
			controladorProyectos.RegistrarActividad(proy,activ,part,descripcion,EleccionAct,fechain,fechafin,horain,horafin);
			Proyecto5.setText(null);
			Participante5.setText(null);
			Descripcion5.setText(null);
			Actividad5.setText(null);
			FechaIn5.setText(null);
			FechaFin5.setText(null);
			HoraInicio.setText(null);
			HoraFin.setText(null);
		
			
			ventana.getContentPane().removeAll();
			ventana.getContentPane().add(panel5, BorderLayout.CENTER);
			ventana.getContentPane().add(this, BorderLayout.WEST);
			ventana.getContentPane().revalidate();
			ventana.getContentPane().repaint();
			
		}
		else if (event.equals("Finalizar actividad en curso")) {
			controladorProyectos.FinalizarActividad(tiempo);
			
		
		}
		else if(event.equals("Finalizar proyecto")) {
			String nombre=Nombre7.getText();
			controladorProyectos.FinalizarProyecto(nombre);
			Nombre7.setText(null);
			
		}
		else if(event.equals("Generar")) {
			String nombre=Participante8.getText();
			controladorProyectos.GenerarReporte(nombre);
			Participante8.setText(null);

		}
	}
		
		public static void enableDefaultValue(final JTextField tf, final String defaultValue) {
			tf.setText(defaultValue);
			tf.setForeground(Color.gray);	
			
			tf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tf.getText().equals(defaultValue)) {
					tf.setForeground(Color.black);
					tf.setText("");
				}
				super.focusGained(e);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (tf.getText().equals("")) {
					tf.setForeground(Color.gray);
					tf.setText(defaultValue);
				}
				super.focusLost(e);
			}
			});
		}
}
