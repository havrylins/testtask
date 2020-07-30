package com.eva.testtask.controller;

import com.eva.testtask.model.Product;
import com.eva.testtask.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> findAllByFilterName(@RequestParam(name = "nameFilter") String nameFilter) {
        return productService.getAllProductByFilter(nameFilter);
    }
}
