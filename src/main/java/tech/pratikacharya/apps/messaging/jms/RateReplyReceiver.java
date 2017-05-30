package tech.pratikacharya.apps.messaging.jms;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import tech.pratikacharya.apps.messaging.domain.Rate;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Created by Pratik Acharya on 5/30/2017.
 */
public class RateReplyReceiver {
    public Message<String> processRate(Rate rate){
        return MessageBuilder
                .withPayload("PROCESSED")
                .setHeader("CODE", rate.getCode())
                .setHeader("RATE", rate.getRate())
                .setHeader("ID", UUID.randomUUID().toString())
                .setHeader("DATE", LocalDate.now())
                .build();
    }
}
