import java.util.Random;

public class MonteCarlo {
    private static final long iterationsTotal = 10_000_000_0;

    public static long getIterationsTotal() {
        return iterationsTotal;
    }

    public double getPiMono() {
        double x, y;
        double radius = 1.0;
        long passed = 0;
        Random rnd = new Random();
        for (int i = 0; i < iterationsTotal; ++i) {
            x = rnd.nextDouble();
            y = rnd.nextDouble();
            if ((x * x + y * y) < radius)
                passed++;
        }
        return ((double) passed / iterationsTotal) * 4.0;

    }

    public double getPiParallel() throws InterruptedException {
        int n = Runtime.getRuntime().availableProcessors();
        long passedTotal = 0, iterationsPerProcess = iterationsTotal / n;
        PiCountThread[] piCountThreads = new PiCountThread[n];
        for (int i = 0; i < n; i++) {
            piCountThreads[i] = new PiCountThread(iterationsPerProcess);
            piCountThreads[i].start();
        }
        for (PiCountThread piCountThread : piCountThreads) {
            piCountThread.join();
            passedTotal += piCountThread.passed;
        }
        return ((double) passedTotal / iterationsTotal) * 4.0;

    }
}
