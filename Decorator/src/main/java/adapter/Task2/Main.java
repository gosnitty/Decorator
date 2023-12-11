package adapter.Task2;

import java.time.LocalDate;

public class Main {
    public User login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new FacebookWrapper(new FacebookUser("dobosevych", Country.Ukraine, LocalDate.of(2021, 11,11)));
        } else if (loginMethod.equals("facebook")) {
            return new TwitterWrapper(new TwitterUser("dobosevych", Country.USA, LocalDate.of(2021, 11,11)));
        }
        return null;
    }
}