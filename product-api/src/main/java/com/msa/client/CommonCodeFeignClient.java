package com.msa.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.msa.domain.Code;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(
        name = "common-api",
//        configuration = CommonFeignClientConfig.class,
//        fallback = CommonFeignClientFallback.class
        fallbackFactory = CommonCodeFeignClientFallbackFactory.class
)
public interface CommonCodeFeignClient {

    @GetMapping("/cmm/code/list")
    List<Code> selectCodeList();

    @CircuitBreaker(name = "common-api", fallbackMethod = "commonCodeFallback")
    @GetMapping("/cmm/code/{codeId}")
    Code getCode(@PathVariable("codeId") String codeId);

    static String commonCodeFallback(Long id, Exception ex) {
        return id + "!!!!!!!!!!!!!!!!!!!commonCodeFallback!!!!!!!!!!!!!!!!!!!" + ex.getMessage();
    }
}
