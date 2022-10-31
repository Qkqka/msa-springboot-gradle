package com.msa.client;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.Retryer;

/**
 * CommonFeignClient Config 설정파일
 * - Config 클래스를 생성하고 필요한 각 설정 정보를 아래와 같이 셋팅 가능
 * - 기본 셋팅(추가로 설정하지 않아도 기본 설정됨) : [ Logger , Decoder, Encoder, Contract ]
 * - 추가 세팅 (필요시 추가로 설정해야 됨)       : [Retryer(재요청 횟수 설정), Request.options(타임아웃 설정)]
 * 
 * @author fnfnksb
 * @since 2022 .10 .28
 */
@Configuration
public class CommonFeignClientConfig {

    /**
     * feign 로깅 처리
     * 기본 설정이 NON 으로 FULL 로 지정하여 request, response, header,body, metadata 모두를 로깅한다.
     * 로그 설정에서 @Feign package 를 debug level로 변경해 준다.
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

//    /**
//     * this(100, *SECONDS*.toMillis(1), 5); 기본 밀리세컨드 단위로 되어 있다.
//     * period, ducation, max attempts 로 되어 있으며, 기본 5회 호출 대기시간 100 * 1 mil sec 로 구성되어 있다.
//     * 시작 간격 100밀리초, 최대 간격 3초, 최대 시도 횟수 5
//     * 100밀리초 == 0.1초
//     */
//    @Bean
//    public Retryer retryer(){
//        return new Retryer.Default(10000L, TimeUnit.SECONDS.toMillis(10L), 5);
//    }
}
