class H2{                  // final class H2 ���ϸ� �����ü�� �Ұ�      
	final void aaa(){
		System.out.println("HH");
	}
}

class H3 extends H2{
	/*public void aaa(){
		System.out.println("HHH");
	}  final �� �������̵� �Ұ� */
}
public class Round12_Ex10 {
	public static void main(String ar[]){
		H2 h=new H2();
		H3 hh=new H3();
		
		h.aaa();
		hh.aaa();
	}
}
