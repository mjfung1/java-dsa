import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        


        // stack =  LIFO data structure. Last-In First-Out
        //          stores objects into a sort of "vertical tower"
        //          push() to add to the top
        //          pop() to remove from the top


        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)


        Stack<String> stack = new Stack<>();
        stack.push("javascript");
        stack.push("java");
        stack.push("python");
        stack.push("ruby");


        String language = stack.pop();
        // System.out.println(language);
        // System.out.println(stack);
        // System.out.println(stack.peek());
        // System.out.println(stack.size());
        // System.out.println(stack.empty());

        System.out.println(stack.search("ruby"));

        // for (int i = 0; i < 1000000000; i++) {
        //     stack.push("kotlin");
        // }
    }
}
