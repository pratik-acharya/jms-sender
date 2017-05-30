package tech.pratikacharya.apps.messaging.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import tech.pratikacharya.apps.messaging.domain.Rate;

/**
 * Created by Pratik Acharya on 5/30/2017.
 */
@Component
public class RateSender {
    private JmsTemplate jmsTemplate;

    @Autowired
    public RateSender(JmsTemplate jmsTemplate){
        this.jmsTemplate = jmsTemplate;

    }

    public void sendCurrency(String destination, Rate rate){
        this.jmsTemplate.convertAndSend(destination, rate);
    }
}
