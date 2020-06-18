package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite {

    @Test //quantityPosts = 0
    public void testCalculateAdvStatistics1(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(3, forumStatistics.getQuantityUsers());
        Assert.assertEquals(0, forumStatistics.getQuantityPosts());
        Assert.assertEquals(0, forumStatistics.getQuantityComments());
        Assert.assertEquals(0, forumStatistics.getAverageQuantityPostsPerUser(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser(),0);

    }

    @Test //quantityPosts = 1000
    public void testCalculateAdvStatistics2(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0, forumStatistics.getQuantityUsers());
        Assert.assertEquals(1000, forumStatistics.getQuantityPosts());
        Assert.assertEquals(0,forumStatistics.getQuantityComments());
        Assert.assertEquals(0, forumStatistics.getAverageQuantityPostsPerUser(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser(),0);
    }

    @Test //quantityComments= 0
    public void testCalculateAdvStatistics3(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0, forumStatistics.getQuantityUsers());
        Assert.assertEquals(0, forumStatistics.getQuantityPosts());
        Assert.assertEquals(0,forumStatistics.getQuantityComments());
        Assert.assertEquals(0, forumStatistics.getAverageQuantityPostsPerUser(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser(),0);
    }

    @Test //quantityComments < quantityPost
    public void testCalculateAdvStatistics4(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("User1");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(1, forumStatistics.getQuantityUsers());
        Assert.assertEquals(1, forumStatistics.getQuantityPosts());
        Assert.assertEquals(0, forumStatistics.getQuantityComments());
        Assert.assertEquals(1, forumStatistics.getAverageQuantityPostsPerUser(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser(),0);
    }

    @Test //quantityComments > quantityPost
    public void testCalculateAdvStatistics5(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0, forumStatistics.getQuantityUsers());
        Assert.assertEquals(5, forumStatistics.getQuantityPosts());
        Assert.assertEquals(10,forumStatistics.getQuantityComments());
        Assert.assertEquals(0, forumStatistics.getAverageQuantityPostsPerUser(),0);
        Assert.assertEquals(2, forumStatistics.getAverageQuantityCommentsPerPost(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser(),0);
    }

    @Test //usersName =0
    public void testCalculateAdvStatistics6(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assert.assertEquals(0, forumStatistics.getQuantityUsers());
        Assert.assertEquals(0, forumStatistics.getQuantityPosts());
        Assert.assertEquals(0, forumStatistics.getQuantityComments());
        Assert.assertEquals(0, forumStatistics.getAverageQuantityPostsPerUser(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser(),0);
    }

    @Test //usersName = 100
    public void testCalculateAdvStatistics7(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersNames = new ArrayList<String>();
        for (int i=0 ; i<100; i++){
            usersNames.add("User"+i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(100, forumStatistics.getQuantityUsers());
        Assert.assertEquals(0, forumStatistics.getQuantityPosts());
        Assert.assertEquals(0,forumStatistics.getQuantityComments());
        Assert.assertEquals( 0,forumStatistics.getAverageQuantityPostsPerUser(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost(),0);
        Assert.assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser(),0);
    }
}
