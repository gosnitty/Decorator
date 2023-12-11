package adapter.Task2;

import java.time.LocalDate;

public interface User {
    String getEmail();
    Country getCountry();
    LocalDate getLastActiveTime();
}
