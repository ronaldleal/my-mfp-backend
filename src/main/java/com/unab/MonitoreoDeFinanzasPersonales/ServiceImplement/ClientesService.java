package com.unab.MonitoreoDeFinanzasPersonales.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Clientes;
import com.unab.MonitoreoDeFinanzasPersonales.Repository.IClientesRepository;
import com.unab.MonitoreoDeFinanzasPersonales.Service.IClientesService;

@Service
public class ClientesService implements IClientesService{

	@Autowired
	private IClientesRepository repository;

	@Override
	public List<Clientes> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Clientes> findById(String id) {
		return this.repository.findById(id);
	}

	@Override
	public Clientes save(Clientes clientes) {
		return this.repository.save(clientes);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);	
	}
	
	
}
