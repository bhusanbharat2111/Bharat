package com.josh.java.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.josh.java.collection.comparebleandcomprator.Student;

public class ListWithoutAdd {
	public static void main(String[] args) {
		
		Student[] emp = { new Student(101, "Jeevan", "SocialScience"), new Student(105, "Anirudh", "Physics"),
				new Student(108, "Bharat", "Math"), new Student(103, "Shail", "Computers"),
				new Student(102, "Subhra", "Biology") };
		
		List<Student> list = Arrays.asList(emp);
		System.out.println(list);
		
		List<Integer> listof=List.of(1,2,3,50,4,60,7,8);
		System.out.println(listof);
		System.out.println(listof.getClass());
		
		Map<Integer,String> mapof=Map.of(10,"Raju",1,"Jeevan",15,"Anirudh");
		System.out.println(mapof);
	}

}
