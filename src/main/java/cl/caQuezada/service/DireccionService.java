package cl.caQuezada.service;

import java.util.List;

import cl.caQuezada.model.Direccion;

public interface DireccionService {

	void save(Direccion direccion);
	List<Direccion> findAll();
}
