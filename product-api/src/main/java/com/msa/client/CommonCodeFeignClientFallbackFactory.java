package com.msa.client;

import java.util.List;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.msa.domain.Code;

import lombok.extern.slf4j.Slf4j;


/**
 * common-api circuitbreaker
 * 
 * Fallback
 * - 실행을 실패(Exception)하는 경우에 대신 실행되게하는 프로세스
 * 
 * FallbackFactory
 * fallback의 원인에 접근
 */
@Slf4j
@Component
public class CommonCodeFeignClientFallbackFactory implements FallbackFactory<CommonCodeFeignClient> {

    @Override
    public CommonCodeFeignClient create(Throwable cause) {
        return new CommonCodeFeignClient() {
            @Override
            public List<Code> selectCodeList() {
                log.debug("ERROR!!!!!!!!: {}", cause.getMessage());
                return null;
            }

            @Override
            public Code getCode(String codeId) {
                log.debug("ERROR!!!!!!!!: {}", cause.getMessage());
                return null;
            }
        };
    }

}
