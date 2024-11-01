package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.EstudianteDao;
import com.pi.ppp.entity.Estudiante;
import com.pi.ppp.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	@Autowired
	private EstudianteDao dao;
	
	@Override
	public Estudiante create(Estudiante est) {
		// TODO Auto-generated method stub
		return dao.create(est);
	}

	@Override
	public Estudiante update(Estudiante est) {
		// TODO Auto-generated method stub
		return dao.update(est);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Estudiante> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Estudiante> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
