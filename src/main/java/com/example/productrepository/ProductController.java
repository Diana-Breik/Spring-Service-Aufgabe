package com.example.productrepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts(){
      return this.productService.findAll();
    }

    @PostMapping("/newProduct")
    public Product addProduct(@RequestBody NewProduct newProduct){
      return productService.save(newProduct);
    }

}
