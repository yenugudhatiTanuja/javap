package corejavapart1;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		//System.out.println("for loop using sum");
		/*for(int j=1;j<10;j++)
		{
			sum=sum+j;
			//System.out.println(sum);
		}
		System.out.println(sum);*/
		/*while(i<10)
		{
			sum=sum+i;
			i++;
		}
       System.out.println(sum);*/
		do
		{
			sum=sum+i;
			i++;
		}while(i<10);
		System.out.println(sum);
	}

}
