package com.example.services;

import java.util.List;

import com.example.dtos.PartecipanteDto;
import com.example.entities.Partecipante;
import com.example.exeption.PartException;

public interface PartecipanteService {
	
	public boolean savePartecipante(PartecipanteDto partecipante) throws PartException;
	public void assegnaRuolo(Partecipante partecipante, String nameRuolo);
	public void delelePartecipante(int id);
	public List<PartecipanteDto> listGara();
	public PartecipanteDto findByEmail(String nome);
	public void deleteGara(String nome);
	public PartecipanteDto findById(int id);
	
//	public void assegnaRuolo(Partecipante partecipante, String ruolo);

	
	

}
