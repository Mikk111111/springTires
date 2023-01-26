package com.organization.springTires.controller;

import com.organization.springTires.model.Order;
import com.organization.springTires.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/Order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping(path=("/All"))
    public @ResponseBody List<Order> getOrderAll(){
        return orderService.getOrderAll();
    }
//    @GetMapping(path=("/All/{id}"))
//    public @ResponseBody Order getOrderId(@PathVariable Integer id){
//        return orderService.getOrderById(id);
//    }
//    @GetMapping(path = "/Amount/ASC")
//    public @ResponseBody List<Order> getOrderAmountASC(){
//        return orderService.getOrderByAmountASC();
//    }
//    @GetMapping(path = "/Amount/DESC")
//    public @ResponseBody List<Order> getOrderAmountDESC(){
//        return orderService.getOrderByAmountDESC();
//    }
}
