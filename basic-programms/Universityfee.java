public class Universityfee{
public static void main(String[] args){
int fee=125000;
int discountper=10;
        double discount = (fee * discountper) / 100.0;
        double finalFee = fee - discount;

        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );
    }
}
