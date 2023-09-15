package com.example.productrepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> findAll() {
      return productRepository.findAll();
    }

    public Product save(NewProduct newProduct) {

        Product product = new Product(UUID.randomUUID().toString(),newProduct.title(),newProduct.price());
        return productRepository.save(product);
    }
}
