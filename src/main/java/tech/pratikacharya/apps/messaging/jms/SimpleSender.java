package tech.pratikacharya.apps.messaging.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Acharya on 5/30/2017.
 */

@Component
public class SimpleSender {

    private JmsTemplate jmsTemplate;

    @Autowired
    public SimpleSender(JmsTemplate jmsTemplate){
        this.jmsTemplate = jmsTemplate;

    }


    public  void sendMessage(String destination, String message){
        this.jmsTemplate.convertAndSend(destination, message );

    }



}
