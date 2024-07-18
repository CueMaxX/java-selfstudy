package Advanced;

class Frog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
public class setters {
    public static void main(String[] args) {
        Frog f1 = new Frog();
    f1.setName("John");
    f1.setAge(2);
    System.out.print("Its " + f1.getName() + "; ");
    System.out.println(f1.getAge() + " years old.");
    }
}
