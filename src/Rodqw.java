class OOO{
	protected int x=100;
	//x=400; �̰ŵ� �ȴ�.
}

class PPP extends OOO{
	//super.x=300; �����̰� �ʱ�ȭ�� �̰� ���� ������ϳ� ???
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
	// �ʱ�ȭ�� �ٷ��ϴ��� �żҵ� ���� �ϴ����ؾ��ϱ�. hhh=300;
	public static void main(String ar[]){
		OOO oo=new OOO();
		PPP pp=new PPP();
		pp.disp();
	}
}
