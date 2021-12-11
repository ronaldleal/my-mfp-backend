package com.unab.MonitoreoDeFinanzasPersonales.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Usuarios;
import com.unab.MonitoreoDeFinanzasPersonales.Repository.IUsuariosRepository;
import com.unab.MonitoreoDeFinanzasPersonales.Service.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService{

	@Autowired
	private IUsuariosRepository repository;

	@Override
	public List<Usuarios> all() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Usuarios> findById(String id) {
		return this.repository.findById(id);
	}

	@Override
	public Usuarios save(Usuarios usuarios) {
		return this.repository.save(usuarios);
	}

	@Override
	public void delete(@PathVariable String id) {
		this.repository.deleteById(id);
		
	}
}
