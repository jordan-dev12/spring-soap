package com.example.services;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dtos.PartecipanteDto;
import com.example.entities.Partecipante;
import com.example.entities.Ruolo;
import com.example.exeption.PartException;
import com.example.repository.PartecipanteRepository;

@Service
public class PartecipanteServiceImpl implements PartecipanteService {

	private Logger logger = Logger.getLogger(PartecipanteServiceImpl.class);

	@Autowired
	private PartecipanteRepository parteRepository;

	@Autowired
	private RuoloService ruoliService;

	@Override
	public boolean savePartecipante(PartecipanteDto partecipanteDto) throws PartException {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Partecipante part = new Partecipante();

		try {

			part.setDataDiNascita(LocalDate.parse(partecipanteDto.getDataNascita(), formatter));

		} catch (DateTimeException e) {
			System.out.println(e);
			logger.error("errore nel formattagio del ora");
			throw new DateTimeException("errore nel formattaggio del ora");

		}
		part.setCodiceFiscale(partecipanteDto.getCodiceFisacale());
		part.setCognome(partecipanteDto.getCognome());
		part.setEmail(partecipanteDto.getEmail());
		part.setLuogoDiNascita(partecipanteDto.getLuogoNascita());
		part.setNome(partecipanteDto.getNome());
		part.setLuogoResidenza(partecipanteDto.getLuogoDiResidenza());

		// part.setRuoli(partecipante.getRuoli());

		try {

			Set<Ruolo> ruoli = new HashSet<>();
			part.setRuoli(ruoli);
			assegnaRuolo(part, "ROLE_UTENTE");
			parteRepository.save(part);

		} catch (Exception e) {
			logger.error(e + " errore nel salvatagio del partecipante");
			throw new PartException("errore nel salvatagio del partecipante");
		}

		return true;

	}

	@Override
	public void delelePartecipante(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PartecipanteDto> listGara() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PartecipanteDto findByEmail(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGara(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public PartecipanteDto findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assegnaRuolo(Partecipante partecipante, String nameRuolo) {

		Ruolo ruolo = ruoliService.findByNome(nameRuolo);
		partecipante.getRuoli().add(ruolo);

	}

}
