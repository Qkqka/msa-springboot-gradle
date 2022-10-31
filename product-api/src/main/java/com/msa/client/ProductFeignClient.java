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
public interface ProductFeignClient {

    @GetMapping("/code/list")
    List<Code> selectCodeList();

    @GetMapping("/code/{codeId}")
    Code selectCode(@PathVariable("codeId") String codeId);
}
