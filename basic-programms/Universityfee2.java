import java.util.Scanner;
public class Universityfee2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
  int fee= input.nextInt();
 int discountper= input.nextInt();
        double discount = (fee * discountper) / 100.0;
        double finalFee = fee - discount;

        System.out.println(
            "The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee
        );
    }
}
