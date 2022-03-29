package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Ruolo;
import com.example.repository.RuoloRepository;

@Service
public class RuoloServiceImpl implements RuoloService{
	
	@Autowired
	private RuoloRepository ruoloRepository;

	@Override
	public Ruolo findByNome(String nome) {
		
		return ruoloRepository.findByNome(nome);
	}

}
