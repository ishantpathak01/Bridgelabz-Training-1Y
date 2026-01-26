          import java.util.Scanner;
		  class interest{
		  public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  double principal= sc.nextDouble();
		  double rate =sc.nextDouble();
		  double time=sc.nextDouble();
		  double si= (principal*rate*time)/100;
		  System.out.println(si);
		  sc.close();
		  }
		  }