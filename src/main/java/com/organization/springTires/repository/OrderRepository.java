package com.organization.springTires.repository;

import com.organization.springTires.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order,Integer> {
//    @Query(value ="SELECT * FROM orders ORDER BY amount ASC")
//    List<Order> getOrderAmountASC();
//    @Query(value ="SELECT * FROM orders ORDER BY amount DESC")
//    List<Order> getOrderAmountDESC();
//    Optional<Order> findByOrderId(int id);
}
