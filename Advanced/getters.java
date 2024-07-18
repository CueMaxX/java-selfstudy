package Advanced;

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("Hi my name is " + name);
    }
    int calculateYearsToRetirement() {
        int yearsleft = 65 - age;
        return yearsleft;
    }

    int getAge() {
        return age;
    }
}

public class getters {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 18;

        p1.speak();
        System.out.println("It's just " + p1.calculateYearsToRetirement() + " years until my retirement!");

        int age = p1.getAge();
    }
}
