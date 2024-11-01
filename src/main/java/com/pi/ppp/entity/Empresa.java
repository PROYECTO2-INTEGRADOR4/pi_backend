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
@Table(name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private Long id_empresa;
	@Column(name = "razon_social", length = 150)
	private String razon_social;
	@Column(name = "direccion", length = 500)
	private String direccion;
	@Column(name = "ruc", length = 11)
	private char ruc;
	@Column(name = "telefono", length = 10)
	private char telefono;
	@Column(name = "sector", length = 50)
	private String sector;
	@Column(name = "pagina_web", length = 150)
	private String pagina_web;
	@Column(name = "correo_electronico", length = 100)
	private String correo_electronico;
	@Column(name = "estado", length = 1)
	private char estado;
}
