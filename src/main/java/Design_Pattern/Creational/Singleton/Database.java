package main.java.Design_Pattern.Creational.Singleton;

public class Database {
    private static final Database database=new Database();

    String data;
    private Database(){
    }

    public static Database getInstance(){
        return database;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data: "+database.data;
    }
}
