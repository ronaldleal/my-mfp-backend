package com.unab.MonitoreoDeFinanzasPersonales.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Movimientos;
import com.unab.MonitoreoDeFinanzasPersonales.Repository.IMovimientosRepository;
import com.unab.MonitoreoDeFinanzasPersonales.Service.IMovimientosService;

@Service
public class MovimientosService implements IMovimientosService{

	@Autowired
	private IMovimientosRepository repository;

	@Override
	public List<Movimientos> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Movimientos> findById(String id) {
		return this.repository.findById(id);
	}

	@Override
	public Movimientos save(Movimientos movimientos) {
		return this.repository.save(movimientos);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
		
	}
	
}
