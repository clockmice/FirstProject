package com.academy;

import java.util.List;

public interface GameRepository {

    List<User> ListUsers();
    User findUser(long userID);
    public void saveName(String name);
    public void saveStartTime(long startTime);

}


