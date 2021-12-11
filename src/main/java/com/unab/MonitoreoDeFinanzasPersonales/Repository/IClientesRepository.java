package com.unab.MonitoreoDeFinanzasPersonales.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Clientes;

public interface IClientesRepository extends MongoRepository<Clientes, String >{

}
