package com.organization.springTires.service;

import com.organization.springTires.model.Order;
import com.organization.springTires.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrderAll(){
        return (List<Order>) orderRepository.findAll();
    }

    public Order getOrderById(int id){
        return orderRepository.findByOrderId(id).get();
    }
    public List<Order> getOrderByAmountASC(){
        return orderRepository.getOrderAmountASC();
    }
    public List<Order> getOrderByAmountDESC(){
        return orderRepository.getOrderAmountDESC();
    }

}
