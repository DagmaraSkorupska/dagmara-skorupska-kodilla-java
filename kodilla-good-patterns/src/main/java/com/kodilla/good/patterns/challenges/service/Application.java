package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new SendMailOfInformation(),
                new ProductService(), new ProductRespository());

        productOrderService.process(orderRequest);

            }
        }


