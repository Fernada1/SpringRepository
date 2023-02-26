package com.proyecto.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.app.models.Producto;

@Repository
public interface IProductoDAO extends MongoRepository<Producto, String>{

}
