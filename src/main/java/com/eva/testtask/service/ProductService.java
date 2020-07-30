package com.eva.testtask.service;

import com.eva.testtask.exception.ThereIsNoSuchProductException;
import com.eva.testtask.model.Product;
import com.eva.testtask.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProductByFilter(String nameFilter) throws ThereIsNoSuchProductException {
        List<Product> all = (List<Product>) productRepo.findAll();
        if (all.isEmpty()) {
            throw new ThereIsNoSuchProductException();
        }
        return ((List<Product>) productRepo.findAll()).stream().filter(c -> !c.getName().matches(nameFilter))
                .collect(Collectors.toList());
    }
}
