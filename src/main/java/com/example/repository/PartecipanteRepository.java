package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Partecipante;

public interface  PartecipanteRepository extends JpaRepository<Partecipante, Integer> {
	
	
	public Partecipante findByEmail(String email);
	public Partecipante findById(int id);

}
