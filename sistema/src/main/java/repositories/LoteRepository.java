package repositories;

import java.util.Map;

import models.Lote;

public class LoteRepository {
	Map<String, Lote> lotes;
	
	public void addLote(Lote lote) {
		lotes.put(lote.getId(), lote);
	}
}
