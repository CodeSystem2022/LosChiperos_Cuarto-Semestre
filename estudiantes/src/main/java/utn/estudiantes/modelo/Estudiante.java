package utn.estudiantes.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
// boilerplate - Código repetitivo
@Data  // Anotación para crear métodos get y set
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor con todos los argumentos
@ToString // Método toString
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}