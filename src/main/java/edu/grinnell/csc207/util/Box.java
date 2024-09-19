package edu.grinnell.csc207.util;

import java.util.Arrays;

/**
 * A very simple implementation of dynamic arrays.
 *
 * @param <T>
 *   The type of value stored in the dynamic array.
 */
public class Box<T> {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  T input;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new expandable array.
   */
  @SuppressWarnings({"unchecked"})
  public Box(T val) {
    this.input = (T) val;
  } // SimpleDynamicArray

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  public void set(T val) {
    this.input = val;
  } // set(T)

  public T get() {
    return this.input;
  }
} // class SimpleDynamicArray<T>
