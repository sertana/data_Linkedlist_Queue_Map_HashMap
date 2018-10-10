package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("FL");
        list.add("AL");
        list.add("CT");
        //System.out.println(list.size());
        //System.out.println(list.get(2));

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        for(Object string:list) {
            System.out.println(string);
        }

    }
    }

