package com.msa.service;

import java.util.List;

import com.msa.domain.Code;

public interface CommonCodeService {

    List<Code> selectCodeList();

    Code selectCode(String codeId);

}
