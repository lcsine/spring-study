package com.ydlclass.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener implements ApplicationListener<OderEvent> {


    @Override
    public void onApplicationEvent(OderEvent event) {
        System.out.println(((Order)event.getSource()).getOrderId()+"发邮件:他的订单式"+((Order)event.getSource()).getUsername());
    }


}
