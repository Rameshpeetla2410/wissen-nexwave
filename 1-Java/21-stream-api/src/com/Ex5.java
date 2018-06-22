package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.model.Employee;

public class Ex5 {

	public static void main(String[] args) {

		IntStream intStream = IntStream.of(12, 34, 56, 78);

		// boolean b=intStream
		// .allMatch(n->n<100);
		// .anyMatch(n->n>50);
		// .noneMatch(n->n>100);
		
		// System.out.println(b);

		// ---------------------------------------------------
//
//		Stream<Employee> employeeStream=Stream.of(Employee.SOME);
//		
//		Employee[] lowProfileEmployees=employeeStream
//		.filter(e->e.getSalary()<2000)
//		.toArray(Employee[]::new);
//		
//		for(Employee e:lowProfileEmployees) {
//			System.out.println(e);
//		}
//		
		//--------------------------------------------------------
		
//		Stream<Employee> employeeStream=Stream.of(Employee.SOME);
//
//		long count=employeeStream
//		.filter(e->e.getSalary()<2000)
//		.count();
//		System.out.println(count);
		
		//---------------------------------------------------------
		
//		
//		Stream<Employee> employeeStream=Stream.of(Employee.SOME);
//
//	 Optional<Employee> optional=employeeStream
//		.filter(e->e.getSalary()<2000)
//		.findFirst();
//	 
//	 System.out.println(optional.orElse(null));

		//----------------------------------------------------------
//		
//
//	 Stream<Employee> employeeStream=Stream.of(Employee.SOME);
//
//	 Optional<Employee> optional=employeeStream
//		.min((e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
//	 
//	 System.out.println(optional.orElse(null));
	 
	 //------------------------------------------------------------

	 List<String> menu=new ArrayList<>();
	 menu.add("idly");
	 menu.add("vada");
	 menu.add("poori");
		
	 // Imperative style  ( statefull )
		 
	//	 String out="";  // mutable variable
	//	 for(String item:menu) {
	//		 //
	//		 out+=item +" ";
	//	 }
	//	 System.out.println(out);
			
	 
	 // Functional style ( stateless )
		 
	//	Optional<String> optional= menu
	//	 .stream()
	//	 .reduce((item,acc)->item+" "+acc);
	//	 
	//	System.out.println(optional.get());
	 
	 
	 //------------------------------------------------------------
	 
//	 String m=menu
//		 .stream()
//		 .map(i->i.toUpperCase())
//		 .collect(Collectors.joining(" ", " Today spl ", "!"));
//			 
//	 System.out.println(m);
	 
	 //------------------------------------------------------------
	 
	 
	 Stream<Employee> stream=Stream.of(Employee.SOME);
	 
	TreeSet<Employee> employees=stream.filter(e->e.getSalary()<2000)
	 //.collect(Collectors.toSet());
	  .collect(Collectors.toCollection(()->new TreeSet<Employee>(Comparator.comparingDouble(Employee::getSalary))));
	 
	System.out.println(employees);
	 
		
	}

}
