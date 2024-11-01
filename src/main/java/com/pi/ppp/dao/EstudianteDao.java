package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Estudiante;

public interface EstudianteDao {
	Estudiante create(Estudiante est);
	Estudiante update(Estudiante est);
	void delete(Long id);
	Optional<Estudiante> read(Long id);
	List<Estudiante> readAll();
}
