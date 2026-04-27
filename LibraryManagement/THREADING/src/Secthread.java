public class Secthread extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <= 20; i++) {
            System.out.println(i);
        }
}
    }
