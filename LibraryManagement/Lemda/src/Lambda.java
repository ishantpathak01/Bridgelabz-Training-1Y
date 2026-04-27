public class Lambda {

    public static void main(String[] args){
        InterfaceCal Sum=(int a,int b) -> a+b;
        InterfaceCal Product=(int a,int b) -> a*b;
        InterfaceCal Division=(int a,int b) ->a/b;
        System.out.println(Sum.Calculate(4,6));
        System.out.println(Product.Calculate(4,6));
        System.out.println(Division.Calculate(4,6));

    }
}
