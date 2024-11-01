package com.pi.ppp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "campus")
public class Campus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_campus")
	private Long id_campus;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "direccion", length = 100)
	private String direccion;
	@Column(name = "pagina_web", length = 200)
	private String pagina_web;
	@Column(name = "telefono", length = 15)
	private String telefono;
	@Column(name = "estado", length = 1)
	private char estado;
}
