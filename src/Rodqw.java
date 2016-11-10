class OOO{
	protected int x=100;
	//x=400; 이거도 안댐.
}

class PPP extends OOO{
	//super.x=300; 대입이건 초기화건 이건 따로 해줘야하넹 ???
	int y=100;
	PPP(){
		super.x=300;
		this.y=150;
	}
	
	public void disp(){
	System.out.println(x);
	System.out.println(y);
	}
}
public class Rodqw {
	int hhh;
	// 초기화는 바로하던가 매소드 만들어서 하던가해야하군. hhh=300;
	public static void main(String ar[]){
		OOO oo=new OOO();
		PPP pp=new PPP();
		pp.disp();
	}
}
