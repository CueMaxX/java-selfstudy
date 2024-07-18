package Expert;
class Plant{
    public void grow(){
        System.out.println("Plant growing");
    }
}
class Tree extends Plant{
    @Override
    public void grow(){
        System.out.println("Tree growing");
    }
    public void shedLeaves(){
        System.out.println("Leaves shedding.");
    }
}
public class polymorph {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree1 = new Tree();

        Plant plant2 = tree1;
        plant2.grow(); //Tree growing :D -> which code is being executed depends on the reference

        tree1.shedLeaves();
        //plant2.shedLeaves(); //Doesn't work :( -> which methods are available depends on the type

        doGrow(tree1); //where ever a parent class is expected, I can also use the child class




    }
    public static void doGrow(Plant plant){
        plant.grow();
    }
}
