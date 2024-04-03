package Lab2Level2Task1;


public class Main {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    protected static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/?user=root&password=root";

    public static void main(String[] args) {

        InfoDriver iD = new InfoDriver(DRIVER_NAME);
        InfoConnection iC = new InfoConnection(CONNECTION_STRING);
        InfoStatement iS = new InfoStatement();
        iS.infoStatementBase();





    }
}