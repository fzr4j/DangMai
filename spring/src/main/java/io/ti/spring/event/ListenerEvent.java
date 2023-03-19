package io.ti.spring.event;

import org.springframework.context.ApplicationEvent;

public class ListenerEvent  extends ApplicationEvent {

    public static final String EVENT_SYNC = "sync";

    public static final String EVENT_ASYNC = "async";

    private String name;

    public ListenerEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
