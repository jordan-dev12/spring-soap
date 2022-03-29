package com.example.facades;

import javax.jws.WebService;

import com.example.dtos.PartecipanteDto;
import com.example.exeption.PartException;


@WebService(name = "PartecipanteFacadeService", targetNamespace = "http://example.com.facades/")
public interface PartecipanteFacadeService {
	
	public void savePartecipante(PartecipanteDto partecipante) throws PartException;

}
