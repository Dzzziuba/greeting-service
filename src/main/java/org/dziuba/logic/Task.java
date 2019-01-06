package org.dziuba.logic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Roma Dziuba
 */
@Slf4j
@Component
public class Task {
    @Resource(name="greeting")
    String greetingString;

    @Scheduled(fixedRate = 100000)
    public void getGreeting(){
        log.info(greetingString);
    }

}
