package corejavapart1;

public class ImplicitAndExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------Implicit--------");
		System.out.println("s->l");
		byte o=5;
		System.out.println("byte----->short"+o);
       short w=o;
		System.out.println("byte----->short"+w);
        int a=w;
		System.out.println("short--->int"+a);
        long b=a;
		System.out.println("int--->long"+b);
        float  c=b;
		System.out.println("long--->float"+b);
		double d=c;
		System.out.println("float--->double"+b);

		System.out.println("*******Explicit******");
		
		float f=(float) d;
		System.out.println("double----->float"+f);
		long e=(long) d;
        System.out.println("float----->long"+e);
		int s=(int) a;
        System.out.println("long----->int"+s);
        short p=(short)s;
        System.out.println("int---->short"+p);
        byte h=(byte)p;
        System.out.println("short---->byte"+h);



		

	}

}
