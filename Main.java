/**Lab 5
 * David Girard
 * CS 161 Winter 2020
 * 2/6/20
 * Write a program that prints and changes a person's information 
 */
public class Main {

    


public static void main(String[] args) {
    Person p = new Person("Jim", "Doe", 25);
    //Person's name 
    System.out.println(p.getName());
    //Person's name and age
    System.out.println(p.getInfo());
    //Person's updated name and age
    p.changeInfo("James","John", 39);
    System.out.println(p.getInfo());
    }

}
    
/*
Jim Doe
Jim Doe 25
James John 39
*/