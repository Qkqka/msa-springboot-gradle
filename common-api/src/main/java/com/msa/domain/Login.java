package com.msa.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Login implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6097038872650790375L;

    private String id;
    private String password;
}
