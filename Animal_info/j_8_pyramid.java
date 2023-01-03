/**
 * This file will show calling different function from main function.
 * Later, class from another file will be used here
 */

public class j_8_pyramid {
    public static void main(String[] args){
        System.out.println("Program has started");
        tellSomeThing();
        String basicInfoResult = basicInfo("Java", 100);
        System.out.println(basicInfoResult);
    }

    /**
     * This function prints a string
     * @return void
     */
    public static void tellSomeThing(){
        System.out.println("Java will tell a Story");
    }

    /**
     * This function return a String
     * @param name Person name
     * @param age Person age
     * @return String
     */
    public static String basicInfo(String name, int age){
        return "My name is " + name + " and I am " + age + " years old";
    }
}
