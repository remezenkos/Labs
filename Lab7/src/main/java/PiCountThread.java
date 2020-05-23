import java.util.Random;

public class PiCountThread extends Thread {
    long passed;
    private long iterationsPerProcess;

    public PiCountThread(long iterationsPerProcess) {
        this.iterationsPerProcess = iterationsPerProcess;
    }


    public void run() {
        Random rnd = new Random();
        double x, y;
        double radius = 1.0;
        passed = 0;
        for (int i = 0; i < iterationsPerProcess; i++) {
            x = rnd.nextDouble();
            y = rnd.nextDouble();
            if ((x * x + y * y) < radius)
                passed++;
        }
    }
}
