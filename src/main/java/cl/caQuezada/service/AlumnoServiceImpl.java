package cl.caQuezada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.caQuezada.model.Alumno;
import cl.caQuezada.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public void save(Alumno alumno) {
		alumnoRepository.save(alumno);		
	}

	@Override
	public List<Alumno> findAll() {
		return alumnoRepository.findAll();
	}

}
