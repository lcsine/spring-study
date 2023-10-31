package com.ydlclass.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component

public class EmailListener2  {
    @EventListener
    public void sendEmail(OderEvent event) {
        System.out.println(((Order)event.getSource()).getOrderId()+"发邮件:他的订单式"+((Order)event.getSource()).getUsername());
    }


}
