package Expert;
class Machine implements Info{
    private int id = 7;
    public void start(){

        System.out.println("Machine Started");
    }

    public void showInfo(){
        System.out.println("Machine id is: " + id);
    }
}
class Person implements Info{
    private String name;
    public void greet(){
        System.out.println("Hello there!");
    }
    public Person(String name){
        this.name = name;
    }
    public void showInfo(){
        System.out.println("Name is: " + name);
    }
}

interface Info{
    public void showInfo();
}

public class interfaces {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.start();
        m1.showInfo();

        Person p1 = new Person("John");
        p1.greet();
        p1.showInfo();

        Info info1 = new Machine();
        info1.showInfo();
    }
}
