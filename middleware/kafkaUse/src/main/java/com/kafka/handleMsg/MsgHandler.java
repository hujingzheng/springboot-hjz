package com.kafka.handleMsg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MsgHandler {

//    //以下两种的方式都可以来接受请求
//    @KafkaListener(topics = { KakfaConstant.topic1 },groupId = KakfaConstant.Consumer_user1)
//    public void handle(String message) {
//        log.info("Consumer_user1开始处理消息:{}",message );
//    }
//
//    @KafkaListener(topics = { KakfaConstant.topic1 },groupId = KakfaConstant.Consumer_user2)
//    public void handle(ConsumerRecord<String, String> record) {
//        log.info("Consumer_user2开始处理消息:{}",record );
//    }
//
//    @KafkaListener(topics = KakfaConstant.topic1,groupId = KakfaConstant.Consumer_user3)
//    public void consumer(ConsumerRecord consumerRecord){
//        Optional<Object> kafkaMassage = Optional.ofNullable(consumerRecord.value());
//        if(kafkaMassage.isPresent()){
//            Object o = kafkaMassage.get();
//            log.info("Consumer_user3开始处理消息:{}",o.toString());
//        }
//    }


}
