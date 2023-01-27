package com.organization.springTires.repository;

import com.organization.springTires.model.Tire;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TireRepository extends CrudRepository<Tire,String> {
    @Query(value ="SELECT * FROM tires WHERE modelspecs LIKE :modelSpecs",nativeQuery = true)
    List<Tire> getTireSpecsLike(@Param("model") String modelSpecs);
}
