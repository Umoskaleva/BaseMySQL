package Lab2Level2Task1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InfoStatement {


    public void infoStatementBase() {
        InfoConnection iC = new InfoConnection();
        try {
            Statement st = iC.getConnection().createStatement();
            ResultSet rs = iC.getConnection().getMetaData().getCatalogs();
            while (rs.next()) {
                System.out.println(rs.getString("TABLE_CAT"));
            }
//            st.executeUpdate("CREATE DATABASE db3");
            st.executeUpdate("USE db3");
//            st.executeUpdate("CREATE TABLE persons (id int not null primary key auto_increment, name varchar(64), age int(2))");
//            st.executeUpdate("INSERT INTO persons (name, age) VALUES ('Name6', 20)");
            rs = st.executeQuery("SELECT * FROM persons WHERE age=18 ORDER BY name");
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("age"));
            }
        } catch (SQLException ex) {
            System.out.println(ex + ex.getMessage());
        }
    }
}









