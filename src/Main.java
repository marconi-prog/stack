import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //array
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        //List
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("naruto");
        ninjasList.add("sasuke");
        ninjasList.add("sakura");
        //stack
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.add("naruto");
        ninjasStack.push("sasuke");
        ninjasStack.push("sakura");
        System.out.println("minha stack " + ninjasStack);
        ninjasStack.pop();
        System.out.println("minha stack depois do pop " + ninjasStack);
        System.out.println("minha stack peek " + ninjasStack.peek());
        System.out.println("tamanho da stack " + ninjasStack.size());

    }
}