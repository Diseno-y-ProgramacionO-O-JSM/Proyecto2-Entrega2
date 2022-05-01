package consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import modelo.Actividad;
import modelo.Participante;
import modelo.Proyecto;
import procesamiento.CreadorTxt;

public class ControladorProyectos {

		HashMap<String, Participante> participantes = new HashMap<>();
		public HashMap<String, Proyecto> proyectos = new HashMap<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		Actividad actividad = null;
		ArrayList<Integer> ListaAbreYCierra = new ArrayList<Integer>();
		
		public void ejecutarAplicacion()
		{
//			System.out.println("PROYECTOS\n");
//			Instant Temporizador = null;
//
//			boolean continuar = true;
//			while (continuar)
//			{
//				try
//				{
//					mostrarMenu();
//					int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opcion"));
//					ListaAbreYCierra.add(opcion_seleccionada);
//					if (opcion_seleccionada == 1)
//						RegistroUsuario();
//						;
//					else if (opcion_seleccionada == 2 )
//						CrearProyecto();
//					else if (opcion_seleccionada == 3 )
//						AgregarParticipante();
//					else if (opcion_seleccionada == 4 )
//						Temporizador=IniciarActividad();
//					else if (opcion_seleccionada == 5 )
//						RegistrarActividad();
//					else if (opcion_seleccionada == 6 )
//						FinalizarActividad(Temporizador);
//					else if (opcion_seleccionada == 7 )
//						FinalizarProyecto();
//					
//					else if (opcion_seleccionada == 8 ) {
//						if ((ListaAbreYCierra.stream().filter(t->t.equals(4)).count()) == 0 && (ListaAbreYCierra.stream().filter(t->t.equals(5)).count())==0){System.out.println("No se puede generar un reporte porque no se ha completado alguna actividad.");}
//						else if ((ListaAbreYCierra.stream().filter(t->t.equals(4)).count()) == (ListaAbreYCierra.stream().filter(t->t.equals(6)).count()))
//						{GenerarReporte();
//						
//						}
//						else {
//							System.out.println("Hay una actividad en curso");
//						}}
//		
//					else if (opcion_seleccionada == 9)
//					{
//						System.out.println("Saliendo de la aplicacion ...");
//						continuar = false;
//					}
//					else
//					{
//						System.out.println("Por favor seleccione una opcion valida.");
//					}
//				}
//				catch (NumberFormatException e)
//				{
//					System.out.println("Debe seleccionar uno de los numeros de las opciones.");
//				}
//			}
		}
			
			public void mostrarMenu()
			{
				
				
				System.out.println("\nOpciones de la aplicacion\n");
				System.out.println("1. Registrar usuario");
				System.out.println("2. Crear proyecto"); 
				System.out.println("3. Agregar participante al proyecto");
				System.out.println("4. Iniciar actividad");
				System.out.println("5. Registrar actividad fuera de tiempo");
				System.out.println("6. Finalizar actividad");
				System.out.println("7. Finalizar proyecto");
				System.out.println("8. Reporte usuario");
				System.out.println("9. Salir de la aplicacion\n");
			}
			
			
			
			public void RegistroUsuario(String nombre,String correo) {
				
				Random numAleatorio = new Random();
				int id = numAleatorio.nextInt(1000) + 1;
				
				Participante elParticipante = participantes.get(nombre);
				if (elParticipante == null);
					elParticipante = new Participante(nombre, correo, id);
					participantes.put(nombre, elParticipante);
				
			}
			
			public void CrearProyecto(String nombre,String due�o,String descripcion,String tiposs) {
				//Por defecto el que cre� el proyecto queda como due�o
				
					
				Proyecto elProyecto = proyectos.get(nombre);
				if (elProyecto == null)
				{
					
					Participante elParticipante = participantes.get(due�o);
					if (elParticipante == null) {
						System.out.println("No se ha registrado como usuario el participante");}
					else {
						String correo = elParticipante.getCorreo();
						String pattern = "dd-MM-yyyy";
						String fechain = new SimpleDateFormat(pattern).format(new Date());
						String fechafin = null; //Finalizar proyecto						
						
						ArrayList<String> tipos = new ArrayList<String>(Arrays.asList(tiposs.split(",")));					
						
						elProyecto = new Proyecto(nombre, descripcion, elParticipante, correo, fechain, fechafin, tipos);				
						proyectos.put(nombre, elProyecto);
						
						elProyecto.AgregarParticipantes(elParticipante);
						
					}		
				}
				else {
					Participante dueno = elProyecto.getDue�o();
					System.out.println("-Ya existe un proyecto con ese nombre creado por "+ dueno.toString()+"-");
				}
				}
			
			public Instant IniciarActividad(String proy,String nombre,String part,String descripcion,String tipo){
				//Puede ser a nombre de cualquier persona

				
				Proyecto elProyecto = proyectos.get(proy);
				
				if (elProyecto == null) {
					System.out.println("El proyecto no existe");
					}
				else {
					
					HashMap<String, Actividad> map = elProyecto.getActividades();
					Actividad laActividad = map.get(nombre);
					if (laActividad == null) {
					
						Participante elParticipante = participantes.get(part);
						if (elParticipante == null) {
							System.out.println("No se ha registrado como usuario el participante");
							}
						else {
							System.out.println("Elija un tipo de actividad:");
							
							ArrayList<String> Listita =elProyecto.getTiposActividades();
							
							
							for(int i = 0; i < Listita.size(); i++) {
					            System.out.println((i+1) + ": " +Listita.get(i));
					        }
					        
					     
							String pattern = "dd-MM-yyyy";
							String fechain = new SimpleDateFormat(pattern).format(new Date());
							String fechafin = null;
							String horain = LocalTime.now().format(formatter);
							String horafin = null;
							laActividad = new Actividad(nombre, descripcion, tipo, fechain, fechafin, horain,horafin,elParticipante, elProyecto);
							actividad = laActividad;
							map.put(nombre,laActividad);
							elParticipante.agregarActividad(laActividad);
						}
					}
					else {
						
						Participante participante = laActividad.getParticipante();
						String part2 = participante.getNombre();
						if (part.equals(part2)){
							String pattern = "dd-MM-yyyy";
							String fechain = new SimpleDateFormat(pattern).format(new Date());
							laActividad.newFechaIn(fechain);
							String fechafin = null;
							laActividad.newFechaFin(fechafin);
							String horain = LocalTime.now().format(formatter);
							laActividad.newHoraIn(horain);
							String horafin = null;
							laActividad.newHoraFin(horafin);
							actividad = laActividad;
						}
						else {
							System.out.println("El participante que est� realizando esta actividad es otro.");
						}						
					}
				}
			
				Instant Inicial= Actividad.IniciarCronometro();
				return Inicial;			
				}
			
			public void AgregarParticipante(String proy,String part){
				
				
				Proyecto elProyecto = proyectos.get(proy);
				
				if (elProyecto == null) {
					System.out.println("El proyecto no existe");
					}
				else {
					
					Participante elParticipante = participantes.get(part);
					if (elParticipante == null) {
						System.out.println("No se ha registrado como usuario el participante");
						}
					else {
						Boolean presente = false;
						ArrayList<Participante> participantes = elProyecto.getParticipantes();
						for (int i=0;i<participantes.size();i++) {
							String par = participantes.get(i).getNombre();
							String par1 = elParticipante.getNombre();
							if (par.equals(par1)){
								presente = true;
								System.out.println("El usuario ya es participante de este proyecto");
							}
						}
						if (!presente) {
							elProyecto.AgregarParticipantes(elParticipante);
							}
						}
					}
				
				}
		
			public void RegistrarActividad(String proy,String nombre,String part,String descripcion,String tipo,String fechain,String fechafin,String horain,String horafin) {
				
				
				Proyecto elProyecto = proyectos.get(proy);
				
				if (elProyecto == null) {
					System.out.println("El proyecto no existe");
					}
				else {
					
					HashMap<String, Actividad> map = elProyecto.getActividades();
					Actividad laActividad = map.get(nombre);
					if (laActividad == null) {
						
						
						Participante elParticipante = participantes.get(part);
						if (elParticipante == null) {
							System.out.println("No se ha registrado como usuario el participante");
							}
						else {
						
							System.out.println("Elija un tipo de actividad:");
							
							ArrayList<String> Listita =elProyecto.getTiposActividades();
							
							
							for(int i = 0; i < Listita.size(); i++) {
					            System.out.println((i+1) + ": " +Listita.get(i));
					        }
					        

					        
					        	
								laActividad = new Actividad(nombre, descripcion, tipo, fechain, fechafin, horain,horafin,elParticipante, elProyecto);
								map.put(nombre,laActividad);
								
								laActividad.getTiempoTotal(laActividad.getFecha(),laActividad.getHoraInicio(),laActividad.getFechaFin(),laActividad.getHoraFin());
								elParticipante.agregarActividad(laActividad);
					        
						}
						
					}
					else {
					
						Participante participante = laActividad.getParticipante();
						String part2 = participante.getNombre();
						if (part.equals(part2)){

									
							laActividad.newFechaIn(fechain);
							laActividad.newFechaFin(fechafin);
							laActividad.newHoraIn(horain);
							laActividad.newHoraFin(horafin);
							
							laActividad.getTiempoTotal(laActividad.getFecha(),laActividad.getHoraInicio(),laActividad.getFechaFin(),laActividad.getHoraFin());
							
						}
						else {
							
							System.out.println("El participante que est� realizando esta actividad es otro.");
						}
					}
				}
				
		        
				
				}

			public Proyecto getProyectos(String proy) {
				
				
				Proyecto elProyecto = proyectos.get(proy);
				if (elProyecto != null) {
				return elProyecto;
				}
				else {
					return null;
				}
			}
			public ArrayList<String> getActividades(String proy) {
				Proyecto elProyecto = proyectos.get(proy);
				ArrayList<String> Listita =elProyecto.getTiposActividades();
				return Listita;
			}
			public void FinalizarActividad(Instant HoraIn) {
				
				String pattern = "dd-MM-yyyy";
				String fechafin = new SimpleDateFormat(pattern).format(new Date());
				String horafin = LocalTime.now().format(formatter);				
				actividad.newFechaFin(fechafin);
				actividad.newHoraFin(horafin);
				actividad.getTiempoTotal(actividad.getFecha(),actividad.getHoraInicio(),actividad.getFechaFin(),actividad.getHoraFin());
				
				
			}
			
			public void FinalizarProyecto(String proy) {
				
				
				Proyecto elProyecto = proyectos.get(proy);
				
				if (elProyecto == null) {
					System.out.println("El proyecto no existe");
					}
				else {
					elProyecto.FechaFinal();
					CreadorTxt.txtProyecto(elProyecto);
					}		
				}
			
			
			public void GenerarReporte(String part) {
				
				

					Participante elParticipante = participantes.get(part);
					if (elParticipante == null) {
						System.out.println("No se ha registrado como usuario el participante");
						}
					else {
						CreadorTxt.txtParticipante(elParticipante);
						System.out.println("Se Ha Generado El Reporte");
					}
					
			}
			
			public String input(String mensaje)
			{
				try
				{
					System.out.print(mensaje + ": ");
					BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
					return reader.readLine();
				}
				catch (IOException e)
				{
					System.out.println("Error leyendo de la consola");
					e.printStackTrace();
				}
				return null;
			}
			
			
			
			

}
