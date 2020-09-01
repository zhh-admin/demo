package com.example.jihe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListDemo {
    public static void main(String[] args) {
//        List linkedList=new LinkedList<>();
//        Iterator iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            Object next = iterator.next();
//
//        }


        Vector vector=new Vector();
        vector.add("123");
        vector.add(12);
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}
