package com.example.service;

import com.example.entity.Product;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product saveProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}