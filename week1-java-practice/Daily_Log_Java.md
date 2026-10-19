- Done: Built a Person class with private fields, a constructor, getters, introduce(), isAdult(), haveBirthday(), toString() and an age check that throws IllegalArgumentException. Compiled with javac and ran with java.
- Done (Learn): Checked Java, Maven and Git versions.
- Done (Build): Created the GitHub repo qa-automation-framework, cloned it, added the week1-java-practice folder, and ran git status (on branch main).

- Learned: A class is a blueprint and an object is made from it. Fields are what it has, methods are what it does. Private fields can only be reached through the class's own methods. toString() with @Override replaces the default text printed for an object. A method that returns a value is different from one that prints. throw stops the program unless try/catch handles it.

- Stuck on: Why the constructor takes parameters but methods like isAdult() don't (the constructor needs starting values passed in, methods use the fields the object already has). Why java PersonDemo.java failed (it runs the first class in the file, so use javac then java). The @Override error (spelling of toString). Why this.age < 0 never caught -5 (the field is still 0 at that point, the parameter holds the value), found with a negative test.

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

New creates object and values will be defaulted to 0, null. when the assignment of parameter to field happens values are assigned to the object and the reference variable is pointing to that object.
