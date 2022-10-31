package com.msa.service;

import com.msa.domain.Code;

import java.util.List;

public interface CommonCodeService {

    List<Code> selectCodeList();

    String selectCode(String codeId);

}
