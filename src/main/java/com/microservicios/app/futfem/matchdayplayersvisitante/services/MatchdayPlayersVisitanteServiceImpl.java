package com.microservicios.app.futfem.matchdayplayersvisitante.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicios.app.common.services.CommonServiceImpl;
import com.microservicios.app.futfem.matchdayplayersvisitante.models.entity.MatchdayPlayersVisitante;
import com.microservicios.app.futfem.matchdayplayersvisitante.models.repository.MatchdayPlayerRepository;

@Service
public class MatchdayPlayersVisitanteServiceImpl extends CommonServiceImpl<MatchdayPlayersVisitante, MatchdayPlayerRepository> implements MatchdayPlayersVisitanteService {

	public List<MatchdayPlayersVisitante> findByPositionmatch(String positionmatch){
		return repository.findByPositionmatch(positionmatch);
	}
	
	public void eliminarDatos(){
		repository.deleteAll();
	}
}
