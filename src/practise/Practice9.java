package practise;

public class Practice9 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array
		int a[]= {25,47,69,26,36};
		char b[]= {'g','j','t'};
		int c[][]= {{28,47,69},{45,23,39},{24,46,79}};		
		//String 
		String name ="i am Nilesh";
		
		//String array
		String month[]= {"jan","feb","march","april","may"};
		
		//StringBuffer
		StringBuffer last_name= new StringBuffer("my last name is Kirdak ");
		
		System.out.println(name);
		
		String name1 = name.toUpperCase();
		System.out.println(name1);
		
		String name2=name.toLowerCase();
		System.out.println(name2);
		
		StringBuffer last_name_with_first_name = last_name.append("and first_name is Nilesh");
		System.out.println(last_name_with_first_name);
		
	
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
	}

}
