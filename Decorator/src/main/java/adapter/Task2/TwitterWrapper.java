package adapter.Task2;

import java.time.LocalDate;

public class TwitterWrapper implements User {
    public TwitterWrapper(TwitterUser user){
        this.user = user;
    }
    private TwitterUser user;

    @Override
    public String getEmail(){
        return user.getEmail();
    }

    @Override
    public Country getCountry(){
        return user.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveTime(){
        return user.getGetUserActiveTime();
    }
}
