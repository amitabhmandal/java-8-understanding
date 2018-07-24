package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsUnderstanding {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);

        System.out.println(list);

        // Requirement is to filter odd/even numbers without using Streams

        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (Integer l1 : list) {
            //System.out.println("Integer Value = " + l1 + " %2 = " + l1 %2);
            if (l1 % 2 == 0) {
                evenList.add(l1);
            } else {
                oddList.add(l1);
            }

        }
        
        System.out.println("Odd List : " + oddList);
        System.out.println("Even List : " + evenList);

    }

}
