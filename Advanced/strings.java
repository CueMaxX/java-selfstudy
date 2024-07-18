package Advanced;

public class strings {
    public static void main(String[] args) {
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder();
        sb2.append("My name is Roger.").append(" ").append("I am a skydiver.");


        System.out.printf("Total cost %-10d; quantitiy is %d.\n", 5, 120);

    }
}
