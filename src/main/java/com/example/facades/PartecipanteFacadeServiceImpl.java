package com.example.facades;

import java.time.DateTimeException;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dtos.PartecipanteDto;
import com.example.exeption.PartException;
import com.example.services.PartecipanteService;


@WebService(endpointInterface = "com.example.facades.PartecipanteFacadeService", serviceName = "PartecipanteFacadeService", targetNamespace = "http://example.com.facades/")
@Component

public class PartecipanteFacadeServiceImpl implements PartecipanteFacadeService{
	
	
	private Logger logger = Logger.getLogger(PartecipanteFacadeServiceImpl.class);
	
	@Autowired
	private PartecipanteService partecipanteService;

	@Override
	public void savePartecipante(PartecipanteDto partecipante) throws PartException{
		
		
		try {
			 partecipanteService.savePartecipante(partecipante);
		} catch (PartException e) {
			
			logger.error("errore nel salvataggio del partecipante ");
			throw new PartException("errore nel salvatagio del partecipante");
	      
		}
		catch (DateTimeException e) {
			System.out.println(e);
			logger.error("errore nel formattagio del ora");
			throw new PartException("errore nel formattaggio del ora");

		}
		
	//	 partecipanteService.savePartecipante(partecipante);
		
	}

}
