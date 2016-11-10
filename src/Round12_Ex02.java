class AA extends Object{
	int x=10;
}

class BB {
	int y=20;
	AA ap=new AA();
}

class CC {
	int z=30;
	BB bp=new BB();
}
public class Round12_Ex02 {
	public static void main(String ar[]){
		CC cp=new CC();
		System.out.println(cp.z);
		System.out.println(cp.bp.y);
		System.out.println(cp.bp.ap.x);      // 포함 object 의 불편함.
	}
}
