package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.servicio.EstudianteServicio;

import java.util.*;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando la aplicación...");
		// Levantar la fabrica de spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicación Finalizada...");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl+"Ejecutando el método run de Spring..."+nl);
		var salir = false;
		var consola = new Scanner(System.in);
		while(!salir){
			mostrarMenu();
			salir = ejecutarOpciones(consola);
			logger.info(nl);
		} // Fin cilo while
	}

	private void mostrarMenu(){
		logger.info(nl);
		logger.info("""
				****** Sistema de Estudiantes ******
				1. Listar Estudiantes
				2. Buscar Estudiante
				3. Agregar Estudiante
				4. Modificar Estudiante
				5. Eliminar Estudiante
				6. Salir
				Elija una opción:""");
	}

	private boolean ejecutarOpciones(Scanner consola){
		var opcion = Integer.parseInt(consola.nextLine());
		var salir = false;
		switch (opcion) {
			case 1 ->{// Listar estudiantes
				logger.info(nl+"Listado de estudiantes: "+nl);
				List<Estudiantes2022> estudiantes = estudianteServicio.listarEstudiantes();
				estudiantes.forEach((estudiante -> logger.info(estudiante.toString()+nl)));
			}
			case 2 -> { // Buscar estudiante por id
				logger.info("Digite el id del estudiante a buscar: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				Estudiantes2022 estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if(estudiante != null){
					logger.info("Estudiante encontrado: "+ estudiante + nl);
				} else {
					logger.info("Estudiante No encontrado: "+nl);
				}
			}
			case 3 -> { // Agregar estudiante
				logger.info("Agregar Estudiante: "+nl);
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				var apellido = consola.nextLine();
				logger.info("Teléfono: ");
				var telefono = consola.nextLine();
				logger.info("Email: ");
				var email = consola.nextLine();
				// Crear el objeto estudiante sin el id
				var estudiante = new Estudiantes2022();
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				estudiante.setTelefono(telefono);
				estudiante.setEmail(email);
				estudianteServicio.guardarEstudiante(estudiante);
				logger.info("Estudiante guardado: "+estudiante+nl);
			}
			case 4 -> { // Modificar estudiante
				logger.info("Modificar estudiante: "+nl);
				logger.info("Ingrese el id del estudiante: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				// buscamos el estudiante a modificar
				Estudiantes2022 estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if(estudiante != null){
					logger.info("Nombre: ");
					var nombre = consola.nextLine();
					logger.info("Apellido: ");
					var apellido = consola.nextLine();
					logger.info("Teléfono: ");
					var telefono = consola.nextLine();
					logger.info("Email: ");
					var email = consola.nextLine();
					estudiante.setNombre(nombre);
					estudiante.setApellido(apellido);
					estudiante.setTelefono(telefono);
					estudiante.setEmail(email);
					estudianteServicio.guardarEstudiante(estudiante);
					logger.info("Estudiante modificado: "+estudiante+nl);
				} else {
					logger.info("Estudiante no encontrado con el id: "+idEstudiante+nl);
				}
			}
		} // Fin switch
		return salir;
	}
}