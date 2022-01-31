package Z2;

import java.util.ArrayList;

import java.util.Iterator;

public class Zadanie2 {
    public static void main(String[] args){
        ArrayList tab = new ArrayList();
        tab.add(5);
        tab.add(3);
        tab.add(4);
        wypiszCoDrugi(tab);
    }
    public static <E, T extends Iterable<E>> void wypiszCoDrugi(T obj){
        int count = 0;
        Iterator<E> iter = obj.iterator();
        while(iter.hasNext()){
            if(count == 0){
                System.out.println(iter.next() + ",");
                count += 1;
            }
            else{
                iter.next();
                count -= 1;
            }

        }
    }
}

