package Lab2Level2Task1;

public class InfoDriver {

    public InfoDriver(String driver) {
        Class infoDriver;
        try {
            infoDriver = Class.forName(driver); // код используется в Java для динамической загрузки JDBC драйвера
            System.out.println("Нашел драйвер: " + infoDriver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не нашел драйвер!");
        }
    }


}
