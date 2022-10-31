//package com.msa.client;
//
//import java.util.List;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@FeignClient(
//        name = "common-api"
////        configuration = CommonFeignClientConfig.class, 
////        fallback = CommonFeignClientFallback.class
////        fallbackFactory = CommonFeignClientFallbackFactory.class
//)
////@CircuitBreaker(name = "common-api")
//public interface CommonCodeFeignClient {
//
//    @GetMapping("/code/list")
//    public List<String> selectCodeList();
//
//    String selectCode(String codeId);
//
//}
