package cl.caQuezada.service;

import java.util.List;

import cl.caQuezada.model.Alumno;

public interface AlumnoService {

	void save(Alumno alumno);
	List<Alumno> findAll();
}
