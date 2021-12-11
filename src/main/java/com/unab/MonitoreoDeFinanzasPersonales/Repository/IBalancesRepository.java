package com.unab.MonitoreoDeFinanzasPersonales.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.MonitoreoDeFinanzasPersonales.Model.Balances;


public interface IBalancesRepository extends MongoRepository<Balances, String >{

}
