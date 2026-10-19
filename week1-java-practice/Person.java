//Class is blueprint. Object is made from it. Fields what it has. Methods is what it does.

public class Person{
    private int age;
    private String name;
    private String city;

    Person(int age, String name, String city){
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be nagative");
        }
        this.age = age;
        this.name = name;
        this.city= city;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name + "," + age + "," + city; 
    }

    public String introduce(){
        return "I am "+name;
    }

    public boolean isAdult(){
        return age>=18;       
    } 

    public int haveBirthday(){
        age++;
        return age;
    }
}
