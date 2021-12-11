package com.unab.MonitoreoDeFinanzasPersonales.Service;

import java.util.List;
import java.util.Optional;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Balances;


public interface IBalancesService {

	public List<Balances> all();
	
	public Optional<Balances> findById(String id);
	
	public Balances save(Balances balances);
	
	public void delete(String id);

}
