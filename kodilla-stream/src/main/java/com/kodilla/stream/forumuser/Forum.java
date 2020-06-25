package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(1, "adax", 'M', 1998, 4,12, 45 ));
        theForumUserList.add(new ForumUser(2, "wojak", 'M', 2002, 6,1, 1 ));
        theForumUserList.add(new ForumUser(3, "rrrr", 'K', 1990, 12,6, 11 ));
    }
    public List<ForumUser> getList(){
        return new ArrayList<>(theForumUserList);
    }
}
