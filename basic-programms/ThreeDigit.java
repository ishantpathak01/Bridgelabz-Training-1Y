import java.util.Scanner;
class ThreeDigitAvg{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double first=sc.nextDouble();
double Second=sc.nextDouble();
double third =sc.nextDouble();
double avg= (first+Second+third)/3;
System.out.println(avg);
sc.close();
}
}
