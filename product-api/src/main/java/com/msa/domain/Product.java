package com.msa.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
    private String productId;
    private String productName;
    private String type;
    private String typeName; // 공통코드로
}
