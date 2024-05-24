package main.java.Design_Pattern.Creational.Class_Builders;

//Builder
public class User {

    String firstName;
    String lastName;
    String email;
    String age;

    
    public User(UserBuilder userBuilder){
        this.firstName= userBuilder.firstName;
        this.lastName= userBuilder.lastName;
        this.email=userBuilder.email;
        this.age=userBuilder.age;
    } 
    
    
    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class UserBuilder{

        String firstName;
        String lastName;
        String email;
        String age;

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;

        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(String age) {
            this.age = age;
            return this;
        }
        
        public User build(){
            return new User(this);
        }
        
        
    }


}

