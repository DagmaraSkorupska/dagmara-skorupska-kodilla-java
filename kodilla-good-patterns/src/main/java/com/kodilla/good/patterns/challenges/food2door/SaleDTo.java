package com.kodilla.good.patterns.challenges.food2door;

public class SaleDTo {

    private final Provider provider;
    private final boolean isProcessed;

    public SaleDTo(final Provider provider, final boolean isProcessed) {
        this.provider = provider;
        this.isProcessed = isProcessed;
    }

    public Provider getProvider() {
        return provider;
    }

    public boolean isProcessed() {
        return isProcessed;
    }
}


