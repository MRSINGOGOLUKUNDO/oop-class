class Person2 {
    String name;
    int age;
    String Location;
    float Height;
    Person2 (String name, int age, String Location, float Height) {
        this.name = name;
        this.age = age;
        this.Location = Location;
        this.Height = Height;
    }
    void showDetails() {
        System.out.println(name + " Is " + age + " Years old. He lives in " + Location + " and is " + Height +
                           " meters tall ");
    }

}
public class Person1 {
    public static void main(String[] args) {
        Person2[] p ={
               new Person2("Lukundo Singogo", 26, "Ndola City", 1.7f),
               new Person2("Lanstone Simbeye", 30, "Lusaka City", 2.1f)
        };
        for(Person2 people : p){
            people.showDetails();
        }
    }
}
