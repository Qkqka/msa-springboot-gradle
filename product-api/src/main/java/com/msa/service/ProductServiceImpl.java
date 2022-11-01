package com.msa.service;

import org.springframework.stereotype.Service;

import com.msa.client.CommonCodeFeignClient;
import com.msa.domain.Code;
import com.msa.domain.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final CommonCodeFeignClient commonCodeFeignClient;

    @Override
    public Product selectProduct(String productId) {
        Product productInfo =
                Product.builder()
                        .productId("1")
                        .productName("상품1")
                        .type("1")
                        .build();
        Code typeInfo = this.commonCodeFeignClient.getCode(productInfo.getType());
        if (typeInfo != null) {
            productInfo.setTypeName(typeInfo.getCodeName());
        }

        return productInfo;
    }
}
