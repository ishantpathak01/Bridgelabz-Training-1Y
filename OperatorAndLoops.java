public class OperatorAndLoops{
public static void main(String[] args){
int i=0;
System.out.println("Value="+i);
i++;
System.out.println("Value1="+i++);
System.out.println("Value2="+i);
++i;
System.out.println("Value3="+i++);
i++;
int z= i + i++ + ++i +i + ++i +i++;
System.out.println("Value4="+z);
//LOOPS
//for;
for( int j=0;j<10;j++){
	System.out.println("j: "+j);
}
// while
int j=10;
while(j>0){
	System.out.println("j: "+j);
	j--;
}
// do While;
int k=0;
do{
	System.out.println("k:"+k);
		k--;
	}
	while(k>0);
}
}
