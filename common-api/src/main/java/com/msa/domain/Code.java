package com.msa.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Code implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7155796367851436982L;
    private String codeId;
    private String codeName;
}
