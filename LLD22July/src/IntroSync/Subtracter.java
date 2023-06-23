package IntroSync;

public class Subtracter implements Runnable{
    private Count count;

    public Subtracter(Count count) {
        this.count = count;
    }


    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            count.value -= i;
        }
    }
}
