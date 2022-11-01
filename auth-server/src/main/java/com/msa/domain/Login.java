package com.msa.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Login implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6097038872650790375L;
    private String id;
    private String password;
}
