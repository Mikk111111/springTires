package com.organization.springTires.repository;

import com.organization.springTires.model.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface WarehouseRepository extends CrudRepository<Warehouse,Integer> {
    @Query(value ="SELECT * FROM warehouse WHERE tirename LIKE :name",nativeQuery = true)
    Warehouse getWarehouseTireNameLike(@Param("name") String tireName);
    @Query(value ="SELECT * FROM warehouse WHERE manufacturer LIKE :name",nativeQuery = true)
    Warehouse getWarehouseManufacturerLike(@Param("name") String manufacturer);
    @Query(value ="SELECT * FROM warehouse WHERE model LIKE :model",nativeQuery = true)
    Warehouse getWarehouseModelLike(@Param("model") String model);
    @Query(value ="SELECT * FROM warehouse ORDER BY price ASC")
    List<Warehouse> getWarehousePriceASC();
    @Query(value ="SELECT * FROM warehouse ORDER BY price DESC")
    List<Warehouse> getWarehousePriceDESC();
    @Query(value ="SELECT * FROM warehouse ORDER BY amount ASC")
    List<Warehouse> getWarehouseAmountASC();
    @Query(value ="SELECT * FROM warehouse ORDER BY amount DESC")
    List<Warehouse> getWarehouseAmountDESC();

}
