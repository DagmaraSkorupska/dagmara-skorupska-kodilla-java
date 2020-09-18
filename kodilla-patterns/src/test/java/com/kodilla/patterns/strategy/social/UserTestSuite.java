package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User andrzej = new Millenials("Andrzej Kowalski");
        User ania = new YGeneration("Anna Nowak");
        User z = new ZGeneration("Zenon Martyniuk");

        //When
        String andrzejChooseMedia = andrzej.media();
        System.out.println("Andrzej Nowak choose: " + andrzejChooseMedia);

        String aniaChooseMedia = ania.media();
        System.out.println("Anna Nowak choose: " + aniaChooseMedia);

        String zChooseMedia = z.media();
        System.out.println("Zenon Martyniuk choose: " + zChooseMedia);

        //Then
        Assert.assertEquals("Facebook", andrzejChooseMedia);
        Assert.assertEquals("Twitter", aniaChooseMedia);
        Assert.assertEquals("Snapchat", zChooseMedia);
    }



    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User andrzej = new Millenials("Andrzej Kowalski");
        //When
        String andrzejChooseMedia = andrzej.media();
        System.out.println("Andrzej Nowak choose: " + andrzejChooseMedia);

        andrzej.sharePost(new SnapchatPublisher());
        andrzejChooseMedia = andrzej.media();
        System.out.println("Andrzej Nowak choose now: " + andrzejChooseMedia);

        //Then
        Assert.assertEquals("Snapchat", andrzejChooseMedia);


    }
}
