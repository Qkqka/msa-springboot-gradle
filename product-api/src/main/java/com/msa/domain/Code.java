package com.msa.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Code {
    private String codeId;
    private String codeName;
}
