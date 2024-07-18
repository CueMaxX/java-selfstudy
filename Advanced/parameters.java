package Advanced;

class Robot {
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance){
        System.out.println("Moving distance " + distance + " meters in direction: " + direction);
    }
}
public class parameters {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Hi, I am Sam.");
        sam.jump(10);
        sam.move("West", 12.2);
    }
}
