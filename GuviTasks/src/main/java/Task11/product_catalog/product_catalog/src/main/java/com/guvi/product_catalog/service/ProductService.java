package com.guvi.product_catalog.service;
import com.guvi.product_catalog.model.Product;
import com.guvi.product_catalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public Product addProduct(String name, double price, String category) {
        Product product = Product.builder()
                .name(name)
                .price(price)
                .category(category)
                .build();
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
