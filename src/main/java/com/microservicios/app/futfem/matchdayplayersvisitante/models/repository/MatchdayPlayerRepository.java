package com.microservicios.app.futfem.matchdayplayersvisitante.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.futfem.matchdayplayersvisitante.models.entity.MatchdayPlayersVisitante;

public interface MatchdayPlayerRepository extends CrudRepository<MatchdayPlayersVisitante, Long> {
	
	@Query("select mpl from MatchdayPlayersVisitante mpl where mpl.positionmatch = ?1 ")  
	public List<MatchdayPlayersVisitante> findByPositionmatch(String positionmatch );

}
