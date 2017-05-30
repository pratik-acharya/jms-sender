package tech.pratikacharya.apps.messaging.jms;

import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by Pratik Acharya on 5/30/2017.
 */
//@Component
public class QueueListener implements MessageListener{
    @Override
    public void onMessage(Message message) {

    }
}
