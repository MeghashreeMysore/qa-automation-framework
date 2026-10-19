
public class PersonDemo{
    public static void main(String[] args){
        Person p1 = new Person(38,"megha","uk");
        Person p2 = new Person(42,"shwetha","dubai");
        Person p3 = new Person(45,"vinutha","bangalore");

        System.out.println(p1.introduce());
        System.out.println(p1.isAdult());
        System.out.println(p1.getAge());

        try{
            Person bad = new Person(-5,"hacker","uk");
            //System.out.println(bad.getAge());
        } catch (IllegalArgumentException e)
        {
            System.out.println("Caught"+e.getMessage());
        }
        //learning
        System.out.println(p1);
    }
}