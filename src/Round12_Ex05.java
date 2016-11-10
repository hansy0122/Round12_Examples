class DH{
	protected int x=100;
	protected int y=200;

}

class EH extends DH{
	private int z=300;
	public void disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
public class Round12_Ex05 {
	public static void main(String ar[]){
	EH hh=new EH();
	hh.disp();
	}

}
