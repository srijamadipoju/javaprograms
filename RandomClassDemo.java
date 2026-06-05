import java.util.Random;
Class RandomClassDemo{
		public static void main(String args[])
		{
			Random r=new Random();
			int a=r.nextInt();
			int b=r.nextInt();
			int c=a+b;
			System.out.println("a=%d\n",a);
			System.out.println("b=%d\n",b);
			System.out.println(c);
		}
}