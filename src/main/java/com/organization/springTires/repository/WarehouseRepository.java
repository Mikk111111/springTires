package com.organization.springTires.repository;

import com.organization.springTires.model.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.beans.Customizer;
import java.util.List;
import java.util.Optional;

public interface WarehouseRepository extends CrudRepository<Warehouse,Integer> {
    //Optional<Warehouse> findByWarehouseTireName(String tireName);
    //Optional<Warehouse> findByWarehouseManufacturer(String manufacturer);
    //Optional<Warehouse> findByWarehouseModel(String model);
    Optional<Warehouse> findByWarehousePrice(double price);
    Optional<Warehouse> findByWarehouseAmount(int amount);

    @Query(value ="SELECT * FROM warehouse WHERE tirename LIKE :name",nativeQuery = true)
    List<Warehouse> getWarehouseTireNameLike(@Param("name") String tireName);
    @Query(value ="SELECT * FROM warehouse WHERE manufacturer LIKE :name",nativeQuery = true)
    List<Warehouse> getWarehouseManufacturerLike(@Param("name") String manufacturer);
    @Query(value ="SELECT * FROM warehouse WHERE model LIKE :model",nativeQuery = true)
    List<Warehouse> getWarehouseModelLike(@Param("model") String model);
    @Query(value ="SELECT * FROM warehouse ORDER BY price ASC")
    List<Warehouse> getWarehousePriceASC(String price);
    @Query(value ="SELECT * FROM warehouse ORDER BY amount DESC")
    List<Warehouse> getWarehouseAmountASC(String amount);
    @Query(value ="SELECT * FROM warehouse ORDER BY amount DESC")
    List<Warehouse> getWarehouseAmountDESC(String amount);

}
