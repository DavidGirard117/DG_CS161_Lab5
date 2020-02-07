
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String fn) {
        firstName = fn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
    //person constructor
    public Person(String fn, String ln, int a) {
        setFirstName(fn);
        setLastName(ln);
        setAge(a);

    }//Name = first and last names
    public String getName() {
        return (getFirstName() + " " + getLastName());
    }//Info = Name and age
    public String getInfo() { //
        return (getName() + " " + getAge());
    }//
    public void changeInfo(String fn, String ln, int a) {
        setFirstName(fn);
        setLastName(ln);
        setAge(a);
    }
}



    
