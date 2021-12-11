package com.unab.MonitoreoDeFinanzasPersonales.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Balances;
import com.unab.MonitoreoDeFinanzasPersonales.Service.IBalancesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/balances")
public class BalanceController {
	@Autowired
	private IBalancesService service;
	
	@GetMapping
	public List<Balances> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Balances> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Balances save(@RequestBody Balances balances) {
		return service.save(balances);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Balances update(@PathVariable String id, @RequestBody Balances balances) {	
		Optional<Balances> op = service.findById(id);
		
		Balances balancesUpdate = new Balances();
		if (!op.isEmpty()) {		
			balancesUpdate = op.get();
			String idUpdate = balancesUpdate.getId();			
			balancesUpdate= balances;
			balancesUpdate.setId(idUpdate);
			
		}
		return service.save(balancesUpdate);
				
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
