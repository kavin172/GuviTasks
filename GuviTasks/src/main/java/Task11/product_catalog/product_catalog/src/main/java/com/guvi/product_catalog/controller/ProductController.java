package com.guvi.product_catalog.controller;

import com.guvi.product_catalog.model.Product;
import com.guvi.product_catalog.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/add-product")
    public String addProductPage() {
        return "addProduct";
    }

    @PostMapping("/add-product")
    public String addProduct(@RequestParam String name, @RequestParam Double price, @RequestParam String category) {
        productService.addProduct(name, price, category);
        return "redirect:/";
    }

    @GetMapping("/display-products")
    public String displayProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "displayProducts";
    }
}
