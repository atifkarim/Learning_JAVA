/**
 * @Author: MD Atif Bin Karim
 * @Date:   01-01-1970 01:00:00
 * @Last Modified by:   MD Atif Bin Karim
 * @Last Modified time: 16-04-2023 15:36:00
 * @Brief: This file shows the abstract class property
 */
package Abstract_class;

abstract class Language {
    abstract void printLanguage();

    public void doCommunicate(String name){
        System.out.println("Language class communicates with " + name);
    }
}

class Dialect extends Language{
    public void printLanguage(){
        System.out.println("Hi I am dialect");
    }
}

public class Abstract extends Language{

    public void printLanguage(){
        System.out.println("Hi i am abstract class");
    }
    public static void main(String[] args) {
        Abstract obj = new Abstract();
        obj.printLanguage();
        obj.doCommunicate("Abstract class");

        Dialect dialect = new Dialect();
        dialect.printLanguage();
        dialect.doCommunicate("Dialect class");
    }
}
