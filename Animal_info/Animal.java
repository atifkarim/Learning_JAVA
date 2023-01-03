public class Animal {
    int animalAge;
    String animalName;

    public static void animalInfo() {
        System.out.println("Animal's basic Information");
    }

    public void animalNonStaticInfo(){
        System.out.println("Animal's basic Information from non-static function, Name: " + animalName + " Age: " + animalAge);
    }
}
