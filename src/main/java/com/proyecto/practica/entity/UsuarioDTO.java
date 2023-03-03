package com.proyecto.practica.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_usuario")
public class UsuarioDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usu")
	private Integer codUsu;
	
	@Column(name = "nom_usu")
	private String nomUsu;
	
	@Column(name = "pat_usu")
	private String patUsu;
	
	@Column(name = "mat_usu")
	private String matUsu;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fec_nac_usu")
	private Date fecNacUsu;
	
	@Column(name = "est_civil_usu")
	private String estCivilUsu;
	 
	@Column(name = "gen_usu")
	private String genUsu; 
	
	// email
	@Column(name = "ema_usu")
	private String emaUsu; 
	
	// clave
	@Column(name = "pas_usu")
	private String pasUsu;
	
	// getters and setters
	public Integer getCodUsu() {
		return codUsu;
	}

	public void setCodUsu(Integer codUsu) {
		this.codUsu = codUsu;
	}

	public String getNomUsu() {
		return nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	public String getPatUsu() {
		return patUsu;
	}

	public void setPatUsu(String patUsu) {
		this.patUsu = patUsu;
	}

	public String getMatUsu() {
		return matUsu;
	}

	public void setMatUsu(String matUsu) {
		this.matUsu = matUsu;
	}

	public Date getFecNacUsu() {
		return fecNacUsu;
	}

	public void setFecNacUsu(Date fecNacUsu) {
		this.fecNacUsu = fecNacUsu;
	}

	public String getEstCivilUsu() {
		return estCivilUsu;
	}

	public void setEstCivilUsu(String estCivilUsu) {
		this.estCivilUsu = estCivilUsu;
	}

	public String getGenUsu() {
		return genUsu;
	}

	public void setGenUsu(String genUsu) {
		this.genUsu = genUsu;
	}

	public String getEmaUsu() {
		return emaUsu;
	}

	public void setEmaUsu(String emaUsu) {
		this.emaUsu = emaUsu;
	}

	public String getPasUsu() {
		return pasUsu;
	}

	public void setPasUsu(String pasUsu) {
		this.pasUsu = pasUsu;
	}
	
	// constructor empty
	public UsuarioDTO() {
		
	}
}
