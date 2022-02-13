package com.randomcheck;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomTrial {

    public static void check(){
        // create 3 BigDecimal objects
        BigDecimal bg1, bg2, bg3, div = new BigDecimal(100);

        bg1 = new BigDecimal("100");
        bg2 = new BigDecimal("202");

        // divide bg1 with bg2 with 3 scale
        bg3 = bg1.add(bg2).divide(div, 2, RoundingMode.CEILING);

        String str = "Division result is " +bg3;

        // print bg3 value
        System.out.println( str );


    }

    private static Stream<CheckList> getStream(List<CheckList> list1) {
        return list1.stream();
    }

    private static void checkList(){
        CheckList cl = new CheckList();
        cl.setName("first");
        cl.setValue(1);

        CheckList cl2 = new CheckList();
        cl2.setName("Second");
        cl2.setValue(2);

        CheckList cl3 = new CheckList();
        cl3.setName("Third");
        cl3.setValue(3);

        List<CheckList> list1=new ArrayList<>();
        list1.add(cl);
        list1.add(cl2);
        list1.add(cl3);
        System.out.println(list1.size());
        List<CheckList> collect = getStream(list1).collect(Collectors.toList());
        collect.removeIf(c->c.getValue().equals(2));
        System.out.println(collect.size());
        System.out.println(list1.size());
    }

    public static void main(String[] args) {
        check();
    }
}
