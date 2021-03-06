package fast.cloud.nacos.example.kafka.controller;

import fast.cloud.nacos.example.kafka.producer.SpringStreamMessageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private SpringStreamMessageProducer producer;

    @GetMapping("/hello")
    public void hello(String message) {
        producer.produce(message);
    }
}
