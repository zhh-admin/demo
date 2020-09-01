package com.example.demo;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.stream.Collectors.toList;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		String a="zhang";
		String substring = a.substring(1, 3);
		System.out.println(substring);

//		List<String> list=new ArrayList<>();
//		list.add("zhang");
//		list.add("wang");
//		list.add("zhang");
//		for (String str:list) {
//			if ("wang".equals(str)){
//				list.remove(str);
//			}
//			System.out.println(str);
//		}

//		for (int i = 0; i <list.size() ; i++) {
//			if ("wang".equals(list.get(i))){
//				list.remove(i);
//				i=i-1;
//			}
//			System.out.println(list.get(i));
//		}


//		List<String> strings = ImmutableSet.copyOf(Iterables.filter(list, Predicates.not(Predicates.isNull()))).asList();
//		System.out.println(strings);


//准备数据
//		List<String> list = new ArrayList<>();
//		list.add("male");
//		list.add("female");
//		list.add("female");
//		list.add("male");
//
//		//遍历删除增强for循环除去男生
//		for (String student : list) {
//			if ("male".equals(student)) {
//				list.remove(student);//使用集合的删除方法删除
//				break;//或者return
//			}
//		}
//		System.out.println("操作结果:"+ list.toString());
//	}


//		//准备数据
//		List<String> list = new ArrayList<>();
//		list.add("male");
//		list.add("female");
//		list.add("female");
//		list.add("male");
//		List<String> collect = list.stream().distinct().collect(toList());
//		System.out.println(collect);

		//遍历删除,除去男生
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String student = iterator.next();
//			if ("male".equals(student)) {
//				iterator.remove();//使用迭代器的删除方法删除
//			}
//		}
//		list.size();
	}

}
