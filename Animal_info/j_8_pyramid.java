/**
 * This file will show calling different function from main function.
 * Later, class from another file will be used here, see Animal.java file
 */

public class j_8_pyramid {
    public static void main(String[] args){
        System.out.println("Program has started");
        tellSomeThing();
        String basicInfoResult = basicInfo("Java", 100);
        System.out.println(basicInfoResult);

        Animal cat = new Animal(); // Animal object
        cat.animalAge = 43; // Assigning value to no static member variable
        cat.animalName = "Cat"; // Assigning value to no static member variable
        System.out.println(cat.animalAge); // Printing no-static member variable
        Animal.animalInfo(); // calling static function directly with class name
        cat.animalNonStaticInfo(); // calling non static function with object
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
