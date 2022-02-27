package com.microservicios.app.futfem.matchdayplayersvisitante.services;

import java.util.List;

import com.microservicios.app.common.services.CommonService;
import com.microservicios.app.futfem.matchdayplayersvisitante.models.entity.MatchdayPlayersVisitante;

public interface MatchdayPlayersVisitanteService extends CommonService<MatchdayPlayersVisitante>{
	
	public List<MatchdayPlayersVisitante> findByPositionmatch(String positionmatch);

	public void eliminarDatos();
}
