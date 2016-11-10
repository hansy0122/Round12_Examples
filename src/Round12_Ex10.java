class H2{                  // final class H2 로하면 상속자체가 불가      
	final void aaa(){
		System.out.println("HH");
	}
}

class H3 extends H2{
	/*public void aaa(){
		System.out.println("HHH");
	}  final 은 오버라이딩 불가 */
}
public class Round12_Ex10 {
	public static void main(String ar[]){
		H2 h=new H2();
		H3 hh=new H3();
		
		h.aaa();
		hh.aaa();
	}
}
