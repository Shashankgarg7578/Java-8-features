package Stream_API_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API_Examp_01
{
  public static void main(String[] args) {
	
	  //Creating a list type1
    List<Integer> list1 =  List.of(2,3,4,54,6,32,89);
    System.out.println(list1);
    
    System.out.println("**************");
  //Creating a list type2
    List<Integer> list2 = Arrays.asList(23,345,34,231,43);
    
    //Type 1 for filters the List and in filter it "return true or false" only 
    Stream<Integer> stream = list1.stream();
    List<Integer> newlist1 = stream.filter(i -> i%2==0).collect(Collectors.toList());
    System.out.println(newlist1);
  
                                                  //true or false
    List<Integer> newlist2 =  list1.stream().filter(i -> i%2==0).collect(Collectors.toList());
    System.out.println(newlist2);
    
    System.out.println("************");
    //if we are using map so it return the value for example : we want sqare of every number in list
    List<Integer>newlist3 = list1.stream().map(i -> i*i).collect(Collectors.toList());
    System.out.println(newlist3);
    
    //print in next line 
    newlist3.forEach(System.out::println);
    
    System.out.println("******************");
    
    //sorted  the list
    newlist3.stream().sorted().forEach(System.out::println);
    System.out.println("******************");
    
    Integer inte = newlist3.stream().min((x,y) -> x.compareTo(y)).get();
   System.out.println("min "+inte);
    
  }
}
