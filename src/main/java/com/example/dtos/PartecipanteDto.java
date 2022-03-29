package com.example.dtos;

import java.io.Serializable;
import java.util.Set;

import com.example.entities.Ruolo;

import lombok.Data;


@Data
public class PartecipanteDto implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cognome;
	private String email;
	private String luogoNascita;
	private String luogoDiResidenza;
	private String codiceFisacale;
	private String dataNascita;
	private Set<Ruolo> ruoli;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public String getLuogoDiResidenza() {
		return luogoDiResidenza;
	}
	public void setLuogoDiResidenza(String luogoDiResidenza) {
		this.luogoDiResidenza = luogoDiResidenza;
	}
	public String getCodiceFisacale() {
		return codiceFisacale;
	}
	public void setCodiceFisacale(String codiceFisacale) {
		this.codiceFisacale = codiceFisacale;
	}

	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public Set<Ruolo> getRuoli() {
		return ruoli;
	}
	public void setRuoli(Set<Ruolo> ruoli) {
		this.ruoli = ruoli;
	}
	
	
	
	

}
