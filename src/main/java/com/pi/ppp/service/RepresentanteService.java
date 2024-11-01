package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Representante;

public interface RepresentanteService {
	Representante create(Representante re);
	Representante update(Representante re);
	void delete(Long id);
	Optional<Representante> read(Long id);
	List<Representante> readAll();
}
