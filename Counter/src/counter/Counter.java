package counter;


public class Counter {
    // a simple integer instance variable
    private int count;

    //a default constructor (count is 0)
    public Counter() {}

    //an alternate constructor
    public Counter(int initial) {count = initial;}

    // an accessor method
    public int getCount() {return count;}

    // an update method
    public void increment() {count++;}

    // an update method
    public void increment(int delta) {count += delta;}

    // an update method
    public void reset() {count = 0;}
    
    // intializing a variable
    String title = "Data Structures & Algorithms";

    // concatination
    String term = "over" + "load";

    int j = 8;

    // using of the integer wrapper class
    Integer a = new Integer(12);

    // implicit call to a.intValue()
    int k = a;

    // a is automatically unboxed before the addition
    int m = j + a;

    // result is automatically boxed before assignment
    a = 3 * m;

    // contructor accepts a String
    Integer b = new Integer("-135");

    // using static method of Integer class
    int n = Integer.parseInt("2013");


}
