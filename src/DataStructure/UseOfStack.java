package DataStructure;

import java.util.Stack;

public class UseOfStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("NY");
        stack.push("GA");
        stack.push("IL");

        if (stack.peek().equalsIgnoreCase("ny")) {
            System.out.println(stack.pop());
        }
        /*while(!stack.empty()){
            System.out.println(stack.pop());
        }*/
        while (!stack.empty()) {


            if (stack.pop().equalsIgnoreCase("NY")) {
                System.out.println("This is NYC");
            } else {
                System.out.println("it aint the right city");
            }


        }
    }
}



