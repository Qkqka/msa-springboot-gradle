package com.msa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CommonCodeServiceImpl implements CommonCodeService {

    @Override
    public List<String> selectCodeList() {
        log.info("CommonCodeService.selectCodeList");
        List<String> codeList = new ArrayList<>();
        return codeList;
    }

    @Override
    public String selectCode(String codeId) {
        return null;
    }
}