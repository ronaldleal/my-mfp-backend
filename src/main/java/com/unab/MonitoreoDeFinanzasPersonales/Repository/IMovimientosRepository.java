package com.unab.MonitoreoDeFinanzasPersonales.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Movimientos;

public interface IMovimientosRepository extends MongoRepository<Movimientos, String >{

}
