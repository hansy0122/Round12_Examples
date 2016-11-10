class G1{
	public void aaa(){
		System.out.println("GG");
		
	}
}

class J1 extends G1{
	public void aaa(){
		super.aaa();
		System.out.println("JJ");
	}
	
}
public class Round12_Ex08 {
	public static void main(String ar[]){
		G1 kk=new G1();
		J1 hh=new J1();
		
		kk.aaa();
		hh.aaa();
		
	}
}
