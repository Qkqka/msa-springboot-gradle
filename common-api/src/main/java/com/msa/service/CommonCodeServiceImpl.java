package com.msa.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.msa.domain.Code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CommonCodeServiceImpl implements CommonCodeService {

    @Override
    public List<Code> selectCodeList() {
        log.info("CommonCodeService.selectCodeList");
        List<Code> codeList = new ArrayList<>();
        codeList.add(Code.builder().codeId("1").codeName("공통").build());
        codeList.add(Code.builder().codeId("2").codeName("공통2").build());
        codeList.add(Code.builder().codeId("3").codeName("공통3").build());
        codeList.add(Code.builder().codeId("4").codeName("공통4").build());
        codeList.add(Code.builder().codeId("5").codeName("공통5").build());
        codeList.add(Code.builder().codeId("6").codeName("공통6").build());
        codeList.add(Code.builder().codeId("7").codeName("공통7").build());
        codeList.add(Code.builder().codeId("8").codeName("공통8").build());
        codeList.add(Code.builder().codeId("9").codeName("공통9").build());
        return codeList;
    }

    @Override
    public Code selectCode(String codeId) throws Exception {
        List<Code> codeList = this.selectCodeList();
        Code codeInfo = codeList.stream().filter(code -> StringUtils.equals(codeId, code.getCodeId())).findAny().get();
        log.info("\n\nCommonCodeService.selectCode: {}", codeInfo);
//        throw new NoSuchMethodException ();
        return codeInfo;
    }
}