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
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

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
        System.out.println("Running...");

        System.out.println("\n**********************************\n");

        try {
            orderRepository.findAll().iterator().next();

        }catch (NoSuchElementException e){
            Order order01 = new Order(9, 20.54, 1);
            Order order02 = new Order(15, 30.15, 2);
            orderRepository.saveAll(Arrays.asList(order01, order02));
        }

        orderRepository.findAll().forEach(System.out::println);

        System.out.println("\n**********************************\n");

        try {
            tireRepository.findAll().iterator().next();

        }catch (NoSuchElementException e){
            Tire tire01 = new Tire("tire model 101");
            Tire tire02 = new Tire("tire model 202");
            tireRepository.saveAll(Arrays.asList(tire01, tire02));
        }

        tireRepository.findAll().forEach(System.out::println);

        System.out.println("\n**********************************\n");

        List<Warehouse> warehouseItems = (List<Warehouse>) warehouseRepository.findAll();
        List<Tire> tires = (List<Tire>) tireRepository.findAll();

        AtomicInteger count = new AtomicInteger(1);

        if (warehouseItems.isEmpty()) {

            tires.forEach(
                    tire -> {
                        Warehouse warehouse = new Warehouse(
                                tire,
                                "tire_name_" + count,
                                "manufacture_" + count,
                                "model_"+ count,
                                ((Math.random() * (100.00 - 10.00)) + 10.00),
                                (int)((Math.random() * (100.00 - 10.00)) + 10.00)
                        );

                        warehouseRepository.save(warehouse);
                        count.getAndIncrement();
                    }
            );
        }

        warehouseRepository.findAll().forEach(System.out::println);
    }
}
