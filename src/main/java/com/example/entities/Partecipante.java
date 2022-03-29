package com.example.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "Partecipante")
public class Partecipante implements Serializable	{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="codiceFiscale")
	private String codiceFiscale;
	
	@Column(name="luogoDiNascita")
	private String luogoDiNascita;
	
	@Column(name="luogoResidenza")
	private String luogoResidenza;
	
	@Column(name="dataDiNascita")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate dataDiNascita;
	
	
	@Column(name="email" ,unique = true, nullable = false)
	private String email;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name ="partecipante_ruolo" ,joinColumns = {
	@JoinColumn(name = "partecipante_id",updatable = true, insertable = false, referencedColumnName = "id") }, 
	inverseJoinColumns = { @JoinColumn(name = "ruolo_id", updatable = true, insertable = false, referencedColumnName = "id") })
	private Set<Ruolo> ruoli;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}


	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}


	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}


	public String getLuogoResidenza() {
		return luogoResidenza;
	}


	public void setLuogoResidenza(String luogoResidenza) {
		this.luogoResidenza = luogoResidenza;
	}


	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}


	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Set<Ruolo> getRuoli() {
		return ruoli;
	}


	public void setRuoli(Set<Ruolo> ruoli) {
		this.ruoli = ruoli;
	}
	
	
	
	

}
