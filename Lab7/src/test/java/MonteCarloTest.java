
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MonteCarloTest {

//    @Test
//    public void testGetPiMono() {
//        long start = System.currentTimeMillis();
//        System.out.println("Mono Pi: " + new MonteCarlo().getPiMono());
//        long finish = System.currentTimeMillis();
//        System.out.println("ITERATIONS " + new MonteCarlo().getIterationsTotal());
//        System.out.println("TIME " + (finish - start) + "ms");
//        System.out.println("-----------------------------------------------------------------");
//    }

    @Test
    public void testGetPiParallel() throws InterruptedException {
        long start, finish;
        start = System.currentTimeMillis();
        System.out.println("Parallel Pi is: " + new MonteCarlo().getPiParallel());
        finish = System.currentTimeMillis();
        System.out.println("ITERATIONS " + new MonteCarlo().getIterationsTotal());
        System.out.println("TIME " + (finish - start) + "ms");
        System.out.println("------------------------------");
    }
}



