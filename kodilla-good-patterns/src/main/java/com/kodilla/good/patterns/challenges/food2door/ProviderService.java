package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class ProviderService implements Provider {
    String name;
    private final String address;
    String product;

    public ProviderService(String name, final String address, String product) {
        this.name = name;
        this.address = address;
        this.product = product;
    }

    public boolean process(Order orderInformation){
        System.out.println("Dostawca: " + orderInformation.getProvider().getName() +
                " Adres: " + orderInformation.getProvider().getAddress() +
                " Zamówiony produkt: " + orderInformation.getProvider().getProduct());
        return true;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProviderService that = (ProviderService) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(address, that.address)) return false;
        return Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }
}
