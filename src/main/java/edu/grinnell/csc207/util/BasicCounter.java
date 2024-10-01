package edu.grinnell.csc207.util;

import edu.grinnell.csc207.util.Counter;

public class BasicCounter implements Counter {
  int count;
  int start;

  public BasicCounter(int startVal) {
    this.start = startVal;
    this.count = startVal;
  }

  /**
   * Count something.
   *
   * @throws Exception
   *   When the count gets too large.
   */
  public void increment() throws Exception {
    this.count++;
  }

  /**
   * Reset the counter.
   */
  public void reset() {
    this.count = this.start;
  }

  /**
   * Get the value of the counter.
   *
   * @return the current value of the counter
   */
  public int get() {
    return this.count;
  }

  public String toString() {
    return ("[" + this.count + "]");
  }
}
