package com.unab.MonitoreoDeFinanzasPersonales.Service;

import java.util.List;
import java.util.Optional;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Movimientos;

public interface IMovimientosService {

	public List<Movimientos> all();
	
	public Optional<Movimientos> findById(String id);
	
	public Movimientos save(Movimientos movimientos);
	
	public void delete(String id);
}
