package com.unab.MonitoreoDeFinanzasPersonales.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Usuarios;

public interface IUsuariosRepository extends MongoRepository<Usuarios, String >{

}
