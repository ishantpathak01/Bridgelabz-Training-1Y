   import java.util.Scanner;

    class Cylinder{
   public static void main(String arg[]){
   Scanner sc = new Scanner(System.in);
   double radius=sc.nextDouble();
   double height =sc.nextDouble();
   double volume= 3.14959*radius*radius*height;
   System.out.println(volume);
   sc.close();
}
}