package com.organization.springTires.service;

import com.organization.springTires.model.Warehouse;
import com.organization.springTires.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;
    public List<Warehouse> getWarehouseAll(){
        return (List<Warehouse>) warehouseRepository.findAll();
    }
    public Warehouse getWarehouseByID(Integer id){
        return warehouseRepository.findById(id).get();
    }

    public List<Warehouse> getWarehouseByTireNameLike(String tireName){
        return warehouseRepository.getWarehouseTireNameLike(tireName);
    }
    public List<Warehouse> getWarehouseByManufacturerLike(String manufacturer){
        return warehouseRepository.getWarehouseManufacturerLike(manufacturer);
    }
}
