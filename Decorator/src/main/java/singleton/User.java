package singleton;

public class User {
    private int id;
    private String name;
    private String email;

    public void save(){
        Connection connection = Connection.getConnection();
        String query = "insert into user (email, name) values ('ya.prytula@ucu.edu.ua', 'Yaroslav')";
        connection.executeQuery(query);
    }
}
