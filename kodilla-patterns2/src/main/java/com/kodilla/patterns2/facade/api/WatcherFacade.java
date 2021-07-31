package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class WatcherFacade {
    private final static Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + " && args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Order generated for user with number: " + userId + ". Order contains " + order.getItems().size() + " items" + "\nClass: " + object.getClass().getName());
    }

    @AfterThrowing("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logFailureProcessingOrder() {
        LOGGER.info("There were error during processing order");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + " && target(object)")
    public void logSuccessOfProcessingOrder(Object object) {
        LOGGER.info("Order was successfully processed");
    }
}
