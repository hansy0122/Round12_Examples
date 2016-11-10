class AH{
	protected int x=100;
	protected int y=200;
	protected int z=10000;
}

class BH extends AH{
	protected int x=300;
	protected int y=400;
	
	public void disp() {
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(this.z);
		System.out.println(super.z);
	}
}
public class Round12_Ex06 {
	public static void main(String ar[]){
		 BH dd=new BH();
		 dd.disp();
	}
}
