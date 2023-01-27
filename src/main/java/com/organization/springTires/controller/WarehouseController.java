package com.organization.springTires.controller;

import com.organization.springTires.model.Warehouse;
import com.organization.springTires.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/Warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @GetMapping(path=("/All"))
    public @ResponseBody List<Warehouse> getWarehouseAll(){
        return warehouseService.getWarehouseAll();
    }
    //http://localhost:8080/Warehouse/All
    @GetMapping(path=("/All/{id}"))
    public @ResponseBody Warehouse getWarehouseId(@PathVariable Integer id){
        return warehouseService.getWarehouseByID(id);
    }
    //http://localhost:8080/Warehouse/TireName/1
    @GetMapping(path="/TireName/{name}")
    public @ResponseBody List<Warehouse> getWarehouseTireNameLike(@PathVariable String name){
        return warehouseService.getWarehouseByTireNameLike("%"+name+"%");
    }
    //http://localhost:8080/Warehouse/Manufacturer/manu

    @GetMapping(path="/Manufacturer/{name}")
    public @ResponseBody List<Warehouse> getWarehouseManufacturerLike(@PathVariable String name){
        return warehouseService.getWarehouseByManufacturerLike("%"+name+"%");
    }
}
