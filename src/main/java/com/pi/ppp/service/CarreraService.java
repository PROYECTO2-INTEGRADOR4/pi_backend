package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Carrera;

public interface CarreraService {
	Carrera create(Carrera ca);
	Carrera update(Carrera ca);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();
}
