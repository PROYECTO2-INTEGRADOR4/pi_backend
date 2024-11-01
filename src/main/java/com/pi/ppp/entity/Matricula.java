package com.pi.ppp.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_matricula")
	private Long id_matricula;
	@Column(name = "fecha_matricula")
	@Temporal(TemporalType.DATE)
	private Date fecha_matricula;
	@Column(name = "monto_matricula")
	private int monto_matricula;
	@Column(name = "creditos_matriculados")
	private int creditos_matriculados;
	@Column(name = "estado", length = 1)
	private char estado;
}
