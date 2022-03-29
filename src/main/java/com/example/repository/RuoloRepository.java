package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Ruolo;

public interface RuoloRepository extends JpaRepository<Ruolo, Integer>{

	
	public Ruolo findByNome(String nome);
}
