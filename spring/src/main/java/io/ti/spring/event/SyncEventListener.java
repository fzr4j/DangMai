package io.ti.spring.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SyncEventListener implements ApplicationListener<ListenerEvent> {

    @Override
    public void onApplicationEvent(ListenerEvent event) {
        if (ListenerEvent.EVENT_SYNC.equals(event.getName())){
            log.info("同步事件监听器");
        }
    }
}
