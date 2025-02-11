package com.iee.patterns.example.strategy.order.handler.handler;

import com.iee.patterns.example.strategy.order.model.OrderDTO;
import com.iee.patterns.example.strategy.order.annotation.HandlerType;
import org.springframework.stereotype.Component;

@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }
}
