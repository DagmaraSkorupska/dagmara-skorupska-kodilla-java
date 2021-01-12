package com.kodilla.patterns2.observer.forum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEricsonn = new ForumUser("Ivone Ericsonn");
        ForumUser tomCruz = new ForumUser("Tom Cruz");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(tomCruz);
        javaToolsForum.registerObserver(tomCruz);
        javaToolsForum.registerObserver(ivoneEricsonn);

        //When
        javaHelpForum.addPost("Hello");
        javaHelpForum.addPost("by");
        javaHelpForum.addPost("ABC");
        javaToolsForum.addPost("what are you doing");
        javaToolsForum.addPost("1, 2, 3");

        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(5, tomCruz.getUpdateCount());
        assertEquals(2, ivoneEricsonn.getUpdateCount());
    }
}