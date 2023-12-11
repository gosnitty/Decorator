package adapter.Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

enum CountryOfTwitter {
    UK, Germany, Spain;
}

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private Country countryOfTwitter;
    private LocalDate lastActiveTime;

    public String getEmail() {
        return null;
    }

    public Country getUserCountry() {
        return null;
    }

    public LocalDate getGetUserActiveTime() {
        return null;
    }
}
