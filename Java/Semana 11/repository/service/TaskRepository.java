package ar.com.utnfrsr.todoapp.repository;


public interface TaskRepository extends JpaRepository<Task, Long> {

@Modifying //demuestra que la query es de actualización
@Query(value = "UPDATE TASK SET FINISHED=:finished WHERE ID=:id", nativeQuery = true)
public void markTaskAsFinished(@Param("id") Long id, @Param("finished") boolean finished);
}