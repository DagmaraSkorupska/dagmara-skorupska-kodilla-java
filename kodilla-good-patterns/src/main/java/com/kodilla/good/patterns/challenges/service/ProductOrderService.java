package com.kodilla.good.patterns.challenges.service;

public class ProductOrderService {

    private InformationService informationService;
    private BuyService buyService;
    private BuyRespository buyRespository;

    public ProductOrderService(final InformationService informationService, final BuyService buyService,
                               final BuyRespository buyRespository) {
        this.informationService = informationService;
        this.buyService = buyService;
        this.buyRespository = buyRespository;
    }

    public BuyDTo process(final OrderRequest tryBuy) {
        boolean isBought = buyService.sale(tryBuy.getUser(), tryBuy.getWhatBuy(), tryBuy.getWhenBuy(), tryBuy.getWhereBuy());

        if (isBought) {
            informationService.inform(tryBuy.getUser(), tryBuy.getWhatBuy(), tryBuy.getWhenBuy(), tryBuy.getWhereBuy(), isBought);
            buyRespository.createSaleProduct(tryBuy.getUser(), tryBuy.getWhatBuy(), tryBuy.getWhenBuy(), tryBuy.getWhereBuy());
            return new BuyDTo(tryBuy.getUser(), true);
        } else {
            return new BuyDTo(tryBuy.getUser(), false);
        }
    }
}
