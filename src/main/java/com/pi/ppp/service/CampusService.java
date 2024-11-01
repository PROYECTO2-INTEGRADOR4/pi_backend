package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Campus;

public interface CampusService {
	Campus create(Campus cam);
	Campus update(Campus cam);
	void delete(Long id);
	Optional<Campus> read(Long id);
	List<Campus> readAll();
}
