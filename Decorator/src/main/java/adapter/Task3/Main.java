package adapter.Task3;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.authorizate(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
