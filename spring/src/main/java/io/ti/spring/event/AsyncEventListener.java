package io.ti.spring.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AsyncEventListener {

    @EventListener(ListenerEvent.class)
    public void onApplicationEvent(ListenerEvent event){
        if (ListenerEvent.EVENT_ASYNC.equals(event.getName())){
            System.out.println("异步事件监听器。。。");
        }
    }

}
