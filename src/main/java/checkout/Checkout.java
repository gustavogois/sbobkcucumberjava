package checkout;

public class Checkout {

    private int runningTotal = 0;

    public void add(Integer count, Integer price) {
        runningTotal += (count * price);
    }

    public int total() {
        return runningTotal;
    }
}
