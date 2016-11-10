class D{
	 int a,b,c,d,e,f;
	public D(){
		a=100;b=200;c=300;d=400;e=500;f=600;
	}
	public D(int c){
		this();
		this.c=c;
	}
}

class E extends D{
	 int g,h,i;
	public E(){
		super(12344);
		g=700;h=800;i=900;
	}
	
}



public class Round12_Ex04 {
	public static void main(String ar[]){
		E ep=new E();
		System.out.println(ep.a);
		System.out.println(ep.b);
		System.out.println(ep.c);
		System.out.println(ep.d);
		System.out.println(ep.e);
		System.out.println(ep.f);
		System.out.println(ep.g);
		System.out.println(ep.h);
		System.out.println(ep.i);
	}
}
