package com.msa.client;

import com.msa.domain.Code;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "common-api"
//        configuration = CommonFeignClientConfig.class,
//        fallback = CommonFeignClientFallback.class
//        fallbackFactory = CommonFeignClientFallbackFactory.class
)
public interface CommonCodeFeignClient {

    @GetMapping("/cmm/code/list")
    List<Code> selectCodeList();

    @GetMapping("/cmm/code/{codeId}")
    Code getCode(@PathVariable("codeId") String codeId);
}
