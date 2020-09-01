package com.example.demo;


import com.google.common.base.Splitter;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoTest {
    public static void main(String[] args) {
        String strProducts="...";
//        List<String> strings = Splitter.on(",").splitToList(strProducts);
//        List<Integer> collect = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
//        Collections.sort(collect,(x,y)->y-x);
//        System.out.println(collect.get(0));

      System.out.println(Optional.of(strProducts).orElse("hihao"));

        //        List<Integer> collect = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
//        Collections.sort(strings.stream().map(Integer::parseInt).collect(Collectors.toList()));

//        List<String> a=new ArrayList<>();
//        List<String> b=new ArrayList<>();
//        a.add("a");
//        a.add("b");
//        a.add("c");
//        a.add("d");
//        a.add("e");
//
//        b.add("a");
//        b.add("b");
//        b.add("c");
//        b.add("d");
//
//        List<String> reduce2 = a.stream().filter(item -> !b.contains(item)).collect(toList());
//        System.out.println("---差集 reduce2 (list2 - list1)---");
//        reduce2.parallelStream().forEach(System.out :: println);
//
//        List<String> listAllDistinct = a.stream().distinct().collect(toList());
//        System.out.println("---得到去重并集 listAllDistinct---");
//        listAllDistinct.parallelStream().forEachOrdered(System.out :: println);
    }
}
