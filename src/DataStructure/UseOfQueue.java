package DataStructure;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("NY");
        queue.add("GA");
        queue.add("IL");
        System.out.println(queue);
        System.out.println(queue.poll());
        //System.out.println(queue.remove());
        System.out.println(queue.add("VA"));


        Iterator it = queue.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

        for(String string:queue){
            System.out.print(string +" ");
        }
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        }

    }

