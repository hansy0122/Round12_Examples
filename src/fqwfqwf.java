class M1{
	private int a=100;
	private void aaa(){
		 System.out.println("����");
	}
}
class M2 extends M1{
	public void aaa(){
		 System.out.println("��");      //�� �ٵ� �������̵��ΰ� �˰����� private �ε� �� Ŭ���� �ۿ��� ��밡���Ѱ���
		// super.aaa(); �� �̰� ��� �Ұ��� --> �� ��������� �Ұ����ϳ� �������̵��� ������. 
	}
	
	
	public void disp(){
		// �����̺� �ʵ�� ���Ұ��� System.out.println(a);
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
