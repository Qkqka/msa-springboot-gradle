//package com.msa.client;
//
//import java.util.Collections;
//import java.util.List;
//
//import org.springframework.stereotype.Component;
//
//import lombok.extern.slf4j.Slf4j;
//
//
///**
// * common-api circuitbreaker
// * 
// * Fallback
// * - 실행을 실패(Exception)하는 경우에 대신 실행되게하는 프로세스
// */
//@Slf4j
//@Component
//public class CommonFeignClientFallback implements CommonCodeFeignClient {
//
//    @Override
//    public List<String> selectCodeList() {
//        // 외부 통신에러시 필요한 후속 조치를 여기서 설정
//        log.debug("1feignClient를 이용한 공통코드목록 호출에 문제가 있습니다.");
//        return Collections.emptyList();
//    }
//
//}
