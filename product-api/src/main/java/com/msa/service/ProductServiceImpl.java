package com.msa.service;

import com.msa.client.ProductFeignClient;
import com.msa.domain.Code;
import com.msa.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductFeignClient productFeignClient;

    @Override
    public Product selectProduct(String productId) {
        Product productInfo =
                Product.builder()
                        .productId("1")
                        .productName("상품1")
                        .type("1")
                        .build();
        Code typeInfo = productFeignClient.selectCode(productInfo.getType());
        if (typeInfo != null) {
            productInfo.setTypeName(typeInfo.getCodeName());
        }

        return productInfo;
    }
}
