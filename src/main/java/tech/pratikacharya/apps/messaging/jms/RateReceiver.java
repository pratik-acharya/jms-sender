package tech.pratikacharya.apps.messaging.jms;

import org.springframework.jms.annotation.JmsListener;
import tech.pratikacharya.apps.messaging.domain.Rate;

/**
 * Created by Pratik Acharya on 5/30/2017.
 */
public class RateReceiver {

    @JmsListener( destination = "$(messaging.jms.rate-queue)")
    public  void processRate(Rate rate){

    }
}
