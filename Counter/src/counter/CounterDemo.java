package counter;

public class CounterDemo {
    public static void main(String[] args) {
        // declares a variable; no counter yet contructed
        Counter c;

        // constucts a counter; assigns its reference to c
        c = new Counter();

        // increases its value by one
        c.increment();

        // increases its value by three more
        c.increment(3);

        // will be 4
        int temp = c.getCount();

        // value becomes 0
        c.reset();

        // declares and constructs a counter having a value of 5
        Counter d = new Counter(5);

        // value becomes 6
        d.increment();

        //assigns e to reference the same object as d
        Counter e = d;

        // will be 6(as e and d reference the same number)
        temp = e.getCount();

        // value of e(also known as d) becomes 8
        e.increment(2);
    }

    public static void badReset(Counter c) {
        // reassigns local name c to a new counter
        c = new Counter();
    }

    public static void goodReset(Counter c) {
        // resets the counter sent by the caller
        c.reset();
    }
}
