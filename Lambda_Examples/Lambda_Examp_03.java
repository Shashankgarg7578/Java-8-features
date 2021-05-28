package Lambda_Examples;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

class Data {
		private String name;
	 
		public Data(String name) {
			super();
			this.name = name;
		}
	 
		public String getName() {
			return name;
		}
	 
		@Override
		public String toString() {
			return "Data [name=" + name + "]";
		}
	 
	}
	 
	public class  Lambda_Examp_03  {
	 
		public static void main(String[] args) {
			List<Data> list = new ArrayList<>();
			list.add(new Data("Chaand"));
			list.add(new Data("Ed"));
			list.add(new Data("Angelica"));
			list.add(new Data("Maqbul"));
			list.add(new Data("John"));
	 
			
			//use this method  for sort elements in assending order 
/*			Collections.sort(list, new Comparator<Data>() 
			{
	            	public int compare(Data o1, Data o2) 
	            	{
					return o1.getName().compareTo(o2.getName());
				    }
			});
			
*/	 
			//	this line is same as upper Collection1 method
			Collections.sort(list,(Data o1, Data o2)-> o1.getName().compareTo(o2.getName()));
			
			//this line same as upper Collection2 methods
			Collections.sort(list, (Data o1, Data o2) -> 
			{
				return o1.getName().compareTo(o2.getName());	
			});
			
			
			for (Data data : list)
			{
				System.out.println(data.getName());
			}
			
			
         	 System.out.println("************");
			
         	 
         	 //Use this method for Sort the data in length of name
	        Collections.sort(list, (Data o1, Data o2) -> 
	        {
				if(o1.getName().length() < o2.getName().length()){
					return -1;
				}else if(o1.getName().length() > o2.getName().length()){
					return 1;
				}else{
					return 0;
				}
			});
	          
	       for (Data data : list) 
	       {
	  		 System.out.println(data.getName());
	  	   }
	       
	       
		}
	}