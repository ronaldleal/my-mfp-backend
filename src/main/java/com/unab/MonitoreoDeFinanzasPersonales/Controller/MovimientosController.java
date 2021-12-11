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

import com.unab.MonitoreoDeFinanzasPersonales.Model.Movimientos;
import com.unab.MonitoreoDeFinanzasPersonales.Service.IMovimientosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/movimientos")
public class MovimientosController {
	
	@Autowired
	private IMovimientosService service;
	
	@GetMapping
	public List<Movimientos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Movimientos> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Movimientos save(@RequestBody Movimientos movimientos) {
		return service.save(movimientos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Movimientos update(@PathVariable String id, @RequestBody Movimientos movimientos) {	
		Optional<Movimientos> op = service.findById(id);
		
		Movimientos movimientosUpdate = new Movimientos();
		if (!op.isEmpty()) {		
			movimientosUpdate = op.get();
			String idUpdate = movimientosUpdate.getId();			
			movimientosUpdate= movimientos;
			movimientosUpdate.setId(idUpdate);
			
		}
		return service.save(movimientosUpdate);
				
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
