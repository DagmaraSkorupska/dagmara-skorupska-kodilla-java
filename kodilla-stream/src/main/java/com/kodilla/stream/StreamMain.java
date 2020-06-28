package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        LocalDate dateNow = LocalDate.now();
        Map<Integer, ForumUser> thePair = theForum.getList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (dateNow.getYear() - user.getBirthDate().getYear()) >=21)
                .filter(user -> user.getNumberOfPost() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, user -> user));

        System.out.println(thePair);
    }
}
