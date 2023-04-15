/**
 * @Author: MD Atif Bin Karim
 * @Date:   01-01-1970 01:00:00
 * @Last Modified by:   MD Atif Bin Karim
 * @Last Modified time: 16-04-2023 01:43:05
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
        System.out.println("Value of age: " + this.age);
    }

    public void displayAge_more()
    {
        System.out.println("Value of age without this: " + age);
    }
}

class Child extends Parent{
    public Child(int age_){
        super(age_);
    }

    public void displayAge_Child()
    {
        System.out.print("Age of child is ");
        displayAge();
    }
}

public class Sample_Inherit {

    public static void main(String[] args) {
        Parent par_obj = new Parent(20);
        par_obj.displayAge();
        par_obj.displayAge_more();

        Child chl_obj = new Child(12);
        chl_obj.displayAge_Child();
    }

}
