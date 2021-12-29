import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        
        // -------------------------------------------------


        // queues = FIFO data structure. First-In First_Out
        //          A collection designed for holding elements prior to processing
        //          Linear data structure

        //          add      =   enqueue, offer()
        //          remove   =   dequeue, poll()


        // where are queue useful?
        
        // 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer queue (print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, BFS
        // -------------------------------------------------

        // cannot instantiate queues bc its an interface.
        // so using class that implements queue.
        Queue<String> queue = new LinkedList<String>();


        
        queue.offer("karen");
        queue.offer("chad");
        queue.offer("steve");
        queue.offer("harold");
        
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("harold"));


        // System.out.println(queue.peek());
        
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
