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

import com.unab.MonitoreoDeFinanzasPersonales.Model.Clientes;
import com.unab.MonitoreoDeFinanzasPersonales.Service.IClientesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/clientes")
public class ClientesController {
	@Autowired
	private IClientesService service;
	
	@GetMapping
	public List<Clientes> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Clientes> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Clientes save(@RequestBody Clientes clientes) {
		return service.save(clientes);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Clientes update(@PathVariable String id, @RequestBody Clientes clientes) {	
		Optional<Clientes> op = service.findById(id);
		
		Clientes clientesUpdate = new Clientes();
		if (!op.isEmpty()) {		
			clientesUpdate = op.get();
			String idUpdate = clientesUpdate.getId();			
			clientesUpdate= clientes;
			clientesUpdate.setId(idUpdate);
			
		}
		return service.save(clientesUpdate);
				
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
