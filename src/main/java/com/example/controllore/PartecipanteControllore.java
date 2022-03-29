package com.example.controllore;

import java.time.DateTimeException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.PartecipanteDto;
import com.example.exeption.PartException;
import com.example.facades.PartecipanteFacadeService;

@RestController
public class PartecipanteControllore {
	private Logger logger = Logger.getLogger(PartecipanteControllore.class);
	@Autowired
	private PartecipanteFacadeService partecipanteFacadeService;

	@PostMapping("/addPart")
	public boolean savePartecipante(@RequestBody PartecipanteDto partecipanteDto) throws PartException {

		try {
			
			partecipanteFacadeService.savePartecipante(partecipanteDto);
			
		} catch (PartException e) {

			logger.error(e);
			throw new PartException("errore nel salvatagio del partecipante");
		}

		return true;
	}

}
