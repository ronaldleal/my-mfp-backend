package com.unab.MonitoreoDeFinanzasPersonales.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Balances;
import com.unab.MonitoreoDeFinanzasPersonales.Repository.IBalancesRepository;
import com.unab.MonitoreoDeFinanzasPersonales.Service.IBalancesService;

@Service
public class BalancesService implements IBalancesService{

	@Autowired
	private IBalancesRepository repository;

	@Override
	public List<Balances> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Balances> findById(String id) {
		return this.repository.findById(id);
	}

	@Override
	public Balances save(Balances balances) {
		return this.repository.save(balances);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);;

	}
	
	

	
	
	
}
