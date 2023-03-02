package corejavapart1;

public class StrBuilOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuilder sb=new StringBuilder("Hello World");
   System.out.println("length---->"+sb.length());
   System.out.println("capacity---->"+sb.capacity());
   System.out.println("insert---->"+sb.insert(0, "tanuja"));
   System.out.println("replace--->"+sb.replace(1, 3, "zeba"));
   System.out.println("delete---->"+sb.delete(1, 4));
   System.out.println("reverse----->"+sb.reverse());
   System.out.println("append---->"+sb.append("orange"));
   sb.ensureCapacity(20);
   System.out.println("capacity---->"+sb.capacity());
   StringBuilder sb1=new StringBuilder();
   System.out.println("capacity---->"+sb1.capacity());
   sb1.ensureCapacity(20);
   System.out.println("ensure capacity---->"+sb1.capacity());
   sb1.ensureCapacity(35);
   System.out.println("ensure capacity1---->"+sb1.capacity());



   

   
   
	}

}
