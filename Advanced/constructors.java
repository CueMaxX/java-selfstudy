package Advanced;

class Machine {
    private String name;
    private int code;

    public Machine(){
        System.out.println("No name given. Assigning default value...");
        name = "default machine";
    }
    public Machine(String name){
        System.out.println("Using given name: " + name);
        this.name = name;
    }
    public Machine(String name, int code){
        this.name = name;
        this.code = code;
    }
}
public class constructors {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        Machine m2 = new Machine("Sam");
        Machine m3 = new Machine("Bob", 4);

    }
}
