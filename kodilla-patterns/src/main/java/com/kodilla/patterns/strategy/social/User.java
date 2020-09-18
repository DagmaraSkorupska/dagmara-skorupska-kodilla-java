package com.kodilla.patterns.strategy.social;

public class User {
    String name;
    protected SocialPublisher choiceSocial;

    public User(String name) {
        this.name = name;
    }

    public String media(){
        return choiceSocial.share();
    }

    public void sharePost(SocialPublisher choiceSocial){
        this.choiceSocial = choiceSocial;

  }

}
