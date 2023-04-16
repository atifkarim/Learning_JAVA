/**
 * @Author: MD Atif Bin Karim
 * @Date:   01-01-1970 01:00:00
 * @Last Modified by:   MD Atif Bin Karim
 * @Last Modified time: 16-04-2023 12:54:36
 */

// Without any specifier class is private in Java. Insane
class Parent {
    public int age;

    Parent(int age_) {
        this.age = age_;
    }

    // Without static type you can use "this" keyword
    public void displayAge()
    {
        System.out.println("Parent class: Value of age: " + this.age);
    }

    // Printing age variable directly
    public void displayAgeMore()
    {
        System.out.println("Parent class: Value of age without this: " + age);
    }
}

class Child extends Parent{

    // Private member variable of child class
    private int childage;
    private String childname;

    // Constructor of Child class
    public Child(int age_, String childname_){

        // Remember, at first call or set super.
        // Calling constructor of parent class
        super(age_);

        // set private member of child class in it's constructor 
        childname = childname_;
    }

    // This function calls the function from Parent class
    public void displayAgeChild()
    {
        System.out.print("Child class: ");
        displayAge();
    }

    // Set method for childage variable
    public void childAge(int childage_)
    {
        childage = childage_;
    }

    // Get method for childage variable
    public int childAge(){
        return childage;
    }

    // Get method for childname variable
    public String childName(){
        System.out.print("Child class: childname: ");
        return childname;
    }
}

public class Sample_Inherit {

    public static void main(String[] args) {
        Parent par_obj = new Parent(20);
        par_obj.displayAge();
        par_obj.displayAgeMore();

        Child chl_obj = new Child(12, "BD");
        chl_obj.displayAgeChild();

        // Calling set get method of child age
        chl_obj.childAge(5);
        System.out.println("childage: " + chl_obj.childAge());
        
        // calling get methid of child class to get childname
        System.out.println(chl_obj.childName());
        
    }

}
