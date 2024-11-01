package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;


import com.pi.ppp.entity.Plan;

public interface PlanDao {
	Plan create(Plan pa);
	Plan update(Plan pa);
	void delete(Long id);
	Optional<Plan> read(Long id);
	List<Plan> readAll();
}
