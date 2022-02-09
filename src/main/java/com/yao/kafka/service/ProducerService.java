package com.yao.kafka.service;

/**
 * Created by yaojian on 2022/2/9 10:44
 *
 * @author
 */
public interface ProducerService {

    void sendMsg(String topic, String message);


}
