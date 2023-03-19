package io.ti.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventListenerTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventListenerConfig.class);
        context.publishEvent(new ListenerEvent(new EventListenerTest(), ListenerEvent.EVENT_ASYNC));
        context.close();
    }
}
