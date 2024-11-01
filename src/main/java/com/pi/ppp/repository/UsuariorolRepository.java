package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Usuariorol;

@Repository
public interface UsuariorolRepository extends JpaRepository<Usuariorol, Long>{

}
