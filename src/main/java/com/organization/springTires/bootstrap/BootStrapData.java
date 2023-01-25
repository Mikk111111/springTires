package com.organization.springTires.bootstrap;

import com.organization.springTires.repository.OrderRepository;
import com.organization.springTires.repository.TireRepository;
import com.organization.springTires.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class BootStrapData implements CommandLineRunner {
    @Autowired
    private OrderRepository orderRepository;
    private TireRepository tireRepository;
    private WarehouseRepository warehouseRepository;
    @Override
    public void run(String... args) throws Exception {

    }
}
