class A1{
	int x=100;
	int y=200;
	
	public void SetXY(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class A2 extends A1{
	public void SetXY(int x,int y){
		super.x=x+100;
		super.y=y+100;
	}
	
	
	
}
public class Round12_Ex07 {

}
