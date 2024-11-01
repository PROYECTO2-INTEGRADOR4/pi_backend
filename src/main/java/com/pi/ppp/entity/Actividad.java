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
@Table(name = "actividad")
public class Actividad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_actividad")
	private Long id_actividad;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "descripcion", length = 150)
	private String descripcion;
	@Column(name = "fecha_actividad")
	@Temporal(TemporalType.DATE)
	private Date fecha_actividad;
	@Column(name = "duracion", length = 50)
	private String duracion;
	@Column(name = "estado", length = 1)
	private char estado;
}
