package com.organization.springTires.bootstrap;

import com.organization.springTires.model.Order;
import com.organization.springTires.model.Tire;
import com.organization.springTires.model.Warehouse;
import com.organization.springTires.repository.OrderRepository;
import com.organization.springTires.repository.TireRepository;
import com.organization.springTires.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private TireRepository tireRepository;

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public void run(String... args) throws Exception {


        System.out.println("\n**********************************\n");
        Order order01 = new Order(9, 20.54, 1);
        Order order02 = new Order(15, 30.15, 2);
        orderRepository.saveAll(Arrays.asList(order01, order02));
        orderRepository.findAll().forEach(System.out::println);

        System.out.println("\n**********************************\n");
        Tire tire01 = new Tire("tire model 101");
        Tire tire02 = new Tire("tire model 202");
        tireRepository.saveAll(Arrays.asList(tire01, tire02));
        tireRepository.findAll().forEach(System.out::println);

        System.out.println("\n**********************************\n");
        Warehouse warehouse01 = new Warehouse(
                "tire name 01","manufacture 01", "model 01", 50.45, 50
        );
        Warehouse warehouse02 = new Warehouse(
                "tire name 02","manufacture 02", "model 02", 50.45, 50
        );
        warehouseRepository.saveAll(Arrays.asList(warehouse01, warehouse02));
        warehouseRepository.findAll().forEach(System.out::println);
    }
}
