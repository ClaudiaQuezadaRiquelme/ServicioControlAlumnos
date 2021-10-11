package cl.caQuezada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.caQuezada.model.Direccion;
import cl.caQuezada.repository.DireccionRepository;

@Service
public class DireccionServiceImpl implements DireccionService {
	
	@Autowired
	private DireccionRepository direccionRepository;

	@Override
	public void save(Direccion direccion) {
		direccionRepository.save(direccion);
	}

	@Override
	public List<Direccion> findAll() {
		return direccionRepository.findAll();
	}

}
