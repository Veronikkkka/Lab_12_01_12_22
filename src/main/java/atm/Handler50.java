package atm;

public class Handler50 extends Handler {
    @Override
    public void process(int price) {
        Handler next = getNext();
        if (next == null && price % 50 > 0) {
            throw new IllegalArgumentException();
        } else if (next != null) {
            getNext().process(price % 50);
            System.out.println(price / 50 + " * 50");
        }

    }
}
