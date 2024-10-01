package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter {
  int bound;

  public BoundedCounter(int start, int upperBound) {
    super(start);
    this.bound = upperBound;
  } // BoundedCounter()

  @Override
  public void increment() throws Exception {
    if (this.count + 1 > this.bound) {
      throw new Exception("Value: " + this.count + " exceeds bound: " + this.bound);
    } // if

    this.count++;
  } // increment()
} // class BoundedCounter
