package corejavapart1;

public class StrBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuffer s=new StringBuffer();
   //System.out.println("String is ----->"+s);
   System.out.println(s.capacity());
   s.insert(0, "hello");
   System.out.println(s.capacity());

   StringBuffer s1=new StringBuffer("hello");

   System.out.println(s1.capacity());
  // System.out.println();
  // System.out.println(s.ensureCapacity(20));
   //System.out.println(s.ensureCapacity(50));
   //s.ensureCapacity(30);
   //s.ensureCapacity(20);
   //s.ensureCapacity(50);


   
   
   //s.append("tanuja");
  // System.out.println("after append the string is"+s);
   //char n=s.charAt(5);
   //System.out.println("charAt----->"+n);
   //int t=s.length();
   //System.out.println("length----->"+t);
   //System.out.println(s.);
   //System.out.println("insert---->"+s.insert(0,"hello"));
   //System.out.println("replace----->"+s.replace(1, 5, "tanu"));
   //System.out.println("reverse---->"+s.reverse());
   
   
   
   


   
	}

}
