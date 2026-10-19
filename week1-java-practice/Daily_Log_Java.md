- Done: Built a Person class with private fields, a constructor, getters, introduce(), isAdult(), haveBirthday(), toString() and an age check that throws IllegalArgumentException. Compiled with javac and ran with java.
- Learned: A class is a blueprint and an object is made from it. Fields are what it has, methods are what it does. Private fields can only be reached through the class's own methods. toString() with @Override replaces the default text printed for an object. A method that returns a value is different from one that prints. throw stops the program unless try/catch handles it.
- Stuck on: @Override error (spelling of toString), why java PersonDemo.java failed (it looks at the first class), and what private actually protects. Why the constructor takes parameters but methods like isAdult() don't. Constructor needs the starting values passed in to create the object. Methods use the object's own fields, so they only need parameters for new information (like setAge)

Constructor: parameters are needed

When you write new Person(38, "megha", "uk"), the object doesn’t exist yet and has no values. The constructor needs the values passed in so it can store them:

java
Person(int age, String name, String city){
    this.age = age;     // field = parameter
}

Here age on the right is the parameter (the value coming in), and this.age on the left is the field (what the object keeps).

Methods: parameters are usually not needed

By the time you call p1.isAdult(), the object already exists and already holds its age. The method can read the field directly, so passing it in again is unnecessary:

java
public boolean isAdult(){
    return age >= 18;   // reads the object's own field
}