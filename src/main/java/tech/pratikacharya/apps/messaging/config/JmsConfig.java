package tech.pratikacharya.apps.messaging.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.ConnectionFactory;
import javax.jms.MessageListener;

/**
 * Created by Pratik Acharya on 5/30/2017.
 */
@Configuration
@EnableConfigurationProperties(JmsProperties.class)
public class JmsConfig {

    //@Bean
    public DefaultMessageListenerContainer customMessageListenerContainer(ConnectionFactory connectionFactory,
                                                                          MessageListener queueListener,
                                                                          @Value("${messaging.jms.queue}") final String destinationName){
        DefaultMessageListenerContainer listenerContainer = new DefaultMessageListenerContainer();
        listenerContainer.setConnectionFactory(connectionFactory);
        listenerContainer.setDestinationName(destinationName);
        listenerContainer.setMessageListener(queueListener);
        return listenerContainer;

    }

    /*
    This is necessary when you want to send an Object without using Serializable
     */
    @Bean
    public MessageConverter jacksonJmsMessageConverter(){
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_class_"); // This value can be anything, it will save the JSON class name and it must be the same for sender/receiver
        return converter;
    }
}
