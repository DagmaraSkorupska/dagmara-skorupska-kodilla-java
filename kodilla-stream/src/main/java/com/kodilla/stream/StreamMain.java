package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> thePair = theForum.getList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().getYear() <= 2000 )
                .filter(user -> user.getNumberOfPost() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, user -> user));

        System.out.println(thePair);
    }
}
