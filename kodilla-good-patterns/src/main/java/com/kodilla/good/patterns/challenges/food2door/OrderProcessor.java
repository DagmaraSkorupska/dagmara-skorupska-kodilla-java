package com.kodilla.good.patterns.challenges.food2door;


public class OrderProcessor {

    private final InformationService informationService;
    private final OrderService orderService;


    public OrderProcessor(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public void saleDTo(final FoodOrder foodOrder) {

        boolean isOrdered= orderService.order(foodOrder.getProvider(), foodOrder.getProduct(), foodOrder.getQuantity());

        if (isOrdered) {
            informationService.inform(foodOrder.getProvider(), foodOrder);
            new SaleDTo(foodOrder, true);
        } else {
            new SaleDTo(foodOrder, false);
        }

    }

}

