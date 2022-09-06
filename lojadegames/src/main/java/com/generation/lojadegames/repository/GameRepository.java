package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.generation.lojadegames.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	public List <Game> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
		
	}
