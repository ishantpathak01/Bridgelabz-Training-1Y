//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("main start\n");

        Mythread mythread=new Mythread();
        Secthread secthread=new Secthread();
        Thirdthread thirdthread =new Thirdthread();
        mythread.setPriority(Thread.MIN_PRIORITY);
        mythread.start();
        secthread.start();
        Thread tt =new Thread(new Thirdthread());
        tt.start();
        StringBuilder s1=new StringBuilder("ABC");
        s1.append("BCD");
        StringBuffer s1=new StringBuffer("ABC");
        s1.append("BCD");

        System.out.printf("main end\n");
        }
    }