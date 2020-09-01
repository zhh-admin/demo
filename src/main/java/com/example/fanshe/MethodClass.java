package com.example.fanshe;

import java.lang.reflect.Method;

public class MethodClass {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class<?> stuClass  = Class.forName("com.example.fanshe.dto.Student");
        //2.获取所有公有方法
        System.out.println("**********************获取所有的”公有“方法************************");
        Method[] methodArray = stuClass .getMethods();
        for (Method m:methodArray){
            System.out.println(m);
        }
        System.out.println("***************获取所有的方法，包括私有的*******************");
        Method[] declaredMethods = stuClass.getDeclaredMethods();
        for (Method m:declaredMethods){
            System.out.println(m);
        }

        System.out.println("***************获取公有的show1()方法*******************");
        Method show1 = stuClass.getMethod("show1", String.class);
        System.out.println(show1);

        Object o = stuClass.getConstructor().newInstance();
        show1.invoke(o,"刘德华");

        System.out.println("***************获取私有的show4()方法******************");
        show1 = stuClass.getDeclaredMethod("show4", int.class);
        System.out.println(show1);
        show1.setAccessible(true);//解除私有限定
        Object result = show1.invoke(o, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
        System.out.println("返回值：" + result);
    }
}
