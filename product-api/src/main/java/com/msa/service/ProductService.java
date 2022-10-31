package com.msa.service;

import com.msa.domain.Product;

public interface ProductService {
    Product selectProduct(String productId);
}
