package adapter.Task3;

public class Authorization {
    public boolean authorizate(DataBase db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
