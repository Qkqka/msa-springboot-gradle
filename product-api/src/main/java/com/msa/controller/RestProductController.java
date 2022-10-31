package com.msa.controller;

import com.msa.domain.Product;
import com.msa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prd")
@RequiredArgsConstructor
public class RestProductController {
    private final ProductService productService;

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable("productId") String productId) {
        return productService.selectProduct(productId);
    }
}
