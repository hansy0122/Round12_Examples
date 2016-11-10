class M1{
	private int a=100;
	private void aaa(){
		 System.out.println("따봉");
	}
}
class M2 extends M1{
	public void aaa(){
		 System.out.println("굿");      //흠 근데 오버라이딩인건 알겠지만 private 인데 왜 클래스 밖에서 사용가능한거지
		// super.aaa(); 또 이건 사용 불가능 --> 즉 직접사용은 불가능하나 오버라이딩은 가능함. 
	}
	
	
	public void disp(){
		// 프라이빗 필드는 사용불가능 System.out.println(a);
	}
	
}
public class fqwfqwf extends M2 {
	public static void main(String ar[]){
		M1 x1=new M1();
		M2 x2=new M2();
		
		//x1.aaa();
		x2.aaa();
		
	}

}
