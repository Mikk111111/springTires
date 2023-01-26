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
    @GetMapping(path=("/All/{id}"))
    public @ResponseBody Warehouse getWarehouseId(@PathVariable Integer id){
        return warehouseService.getWarehouseByID(id);
    }
    @GetMapping(path="/TireName/{name}")
    public @ResponseBody Warehouse getWarehouseTireNameLike(@PathVariable String name){
        return  warehouseService.getWarehouseByTireNameLike("%"+name+"%");
    }
    @GetMapping(path="/Manufacturer/{name}")
    public @ResponseBody Warehouse getWarehouseManufacturerLike(@PathVariable String name){
        return  warehouseService.getWarehouseByManufacturerLike("%"+name+"%");
    }
    @GetMapping(path="/Model/{name}")
    public @ResponseBody Warehouse getWarehouseModelLike(@PathVariable String name){
        return  warehouseService.getWarehouseByModelLike("%"+name+"%");
    }
    @GetMapping(path=("/Price/ASC"))
    public @ResponseBody List<Warehouse> getWarehousePriceASC(){
        return warehouseService.getWarehouseByPriceASC();
    }
    @GetMapping(path=("/Price/DESC"))
    public @ResponseBody List<Warehouse> getWarehousePriceDESC(){
        return warehouseService.getWarehouseByPriceDESC();
    }
    @GetMapping(path=("/Amount/ASC"))
    public @ResponseBody List<Warehouse> getWarehouseAmountASC(){
        return warehouseService.getWarehouseByAmountASC();
    }
    @GetMapping(path=("/Amount/DESC"))
    public @ResponseBody List<Warehouse> getWarehouseAmountDESC(){
        return warehouseService.getWarehouseByAmountDESC();
    }


}
