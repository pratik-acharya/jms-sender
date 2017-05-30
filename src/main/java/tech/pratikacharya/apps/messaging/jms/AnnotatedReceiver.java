package tech.pratikacharya.apps.messaging.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Acharya on 5/30/2017.
 */
@Component
public class AnnotatedReceiver {
    @JmsListener(destination = "${messaging.jms.queue}")
    public  void processMessage(String content){

    }
}
