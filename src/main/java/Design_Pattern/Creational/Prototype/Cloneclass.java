package main.java.Design_Pattern.Creational.Prototype;

public class Cloneclass {
    String name;
    String password;

    public Cloneclass(){

    }

    public  Cloneclass(Cloneclass c){
            this.name=c.getName();
            this.password=c.getPassword();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Cloneclass clone()  {
        return new Cloneclass(this);
    }
}
