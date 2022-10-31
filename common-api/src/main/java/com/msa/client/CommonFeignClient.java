package com.msa.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "cmm-client", 
        url = "${external-api.http-bin}/cmm", 
        configuration = CommonFeignClientConfig.class, 
        fallback = CommonFeignClientFallback.class
//        fallbackFactory = CommonFeignClientFallbackFactory.class
)
public interface CommonFeignClient {

    @GetMapping("/code/list")
    public List<String> selectCodeList();

}
