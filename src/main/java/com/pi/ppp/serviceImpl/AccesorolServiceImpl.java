package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.AccesorolDao;
import com.pi.ppp.entity.Accesorol;
import com.pi.ppp.service.AccesorolService;

@Service
public class AccesorolServiceImpl implements AccesorolService{
	@Autowired
	private AccesorolDao dao;
	
	@Override
	public Accesorol create(Accesorol ar) {
		// TODO Auto-generated method stub
		return dao.create(ar);
	}

	@Override
	public Accesorol update(Accesorol ar) {
		// TODO Auto-generated method stub
		return dao.update(ar);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Accesorol> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Accesorol> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
