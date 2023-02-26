package com.proyecto.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.proyecto.app.models.Producto;
import com.proyecto.app.repository.IProductoDAO;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, String> implements ProductoService{

	@Autowired
    IProductoDAO productoRepository;
    
    @Override
    public CrudRepository<Producto, String> getDao() {
        return productoRepository;
    }  
	
}
