package utn.estudiantes.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
// boilerplate - Código repetitivo
@Data  // Anotación para crear métodos get y set
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor con todos los argumentos
@ToString // Método toString
public class Estudiantes2022 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}