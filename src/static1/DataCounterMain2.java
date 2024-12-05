package static1;

public class DataCounterMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 dataA = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 dataB = new Data2("B", counter);
        System.out.println("B count = " + counter.count);
    }
}
