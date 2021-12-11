package com.unab.MonitoreoDeFinanzasPersonales.Service;

import java.util.List;
import java.util.Optional;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Clientes;

public interface IClientesService {

	public List<Clientes> all();
	
	public Optional<Clientes> findById(String id);
	
	public Clientes save(Clientes clientes);
	
	public void delete(String id);
}
