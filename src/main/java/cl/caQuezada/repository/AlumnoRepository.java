package cl.caQuezada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.caQuezada.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
