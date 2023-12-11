package adapter.Task2;

import java.time.LocalDate;

public class FacebookWrapper implements User {
    public FacebookWrapper(FacebookUser user){
        this.user = user;
    }
    private FacebookUser user;

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
