class AAA extends Object{
	int x;
}

class BBB extends AAA {
	int y;
	
	
}

class CCC extends BBB {
	int z=30;
	
	
}
public class Round12_Ex03 {
 public static void main(String ar[]){
	 CCC cp=new CCC();
	 System.out.println(cp.x);
	 System.out.println(cp.y);
	 System.out.println(cp.z);
 }
}
