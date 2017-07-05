package com.aucomonaur.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name="idusuario")
	private Long idUsuario;
	@Column(name="nombrecompleto")
	private String nombreCompleto;
	@Column(name="correo")
	private String correo;
	@Column(name="genero")
	private Integer genero;
	@Column(name="alias")
	private String alias;
	@Column(name="contrasenia")
	private String contrasenia;
	@Column(name="contraseniasalt")
	private String contraseniaSalt;
	@Column(name="idcarrera")
	private Long idCarrera;
	
	public Usuario() {}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getContraseniaSalt() {
		return contraseniaSalt;
	}

	public void setContraseniaSalt(String contraseniaSalt) {
		this.contraseniaSalt = contraseniaSalt;
	}

	public Long getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(Long idCarrera) {
		this.idCarrera = idCarrera;
	}
	
	
	
}
