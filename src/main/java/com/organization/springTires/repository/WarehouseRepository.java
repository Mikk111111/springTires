package com.organization.springTires.repository;

import com.organization.springTires.model.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;


public interface WarehouseRepository extends CrudRepository<Warehouse,Integer> {
    @Query(value ="SELECT * FROM warehouse WHERE tirename LIKE :tar",nativeQuery = true)
    List<Warehouse> getWarehouseTireNameLike(@Param("tar") String tireName);
    @Query(value ="SELECT * FROM warehouse WHERE manufacturer LIKE :manu",nativeQuery = true)
    List<Warehouse> getWarehouseManufacturerLike(@Param("manu") String manufacturer);
}
