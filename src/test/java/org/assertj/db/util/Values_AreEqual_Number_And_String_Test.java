package org.assertj.db.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.assertj.db.error.AssertJDBException;
import org.junit.Test;

/**
 * Tests on {@code areEqual} method for {@code Number}s and {@code String}s.
 * 
 * @author Régis Pouiller
 * 
 */
public class Values_AreEqual_Number_And_String_Test {

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code Float}s.
   */
  @Test
  public void test_are_equal_for_float_and_string() {
    assertThat(Values.areEqual(1F, "1")).isTrue();
    assertThat(Values.areEqual(2F, "1")).isFalse();
    assertThat(Values.areEqual(1.5F, "1.5")).isTrue();
    assertThat(Values.areEqual(2.5F, "1.5")).isFalse();
  }

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code Double}s.
   */
  @Test
  public void test_are_equal_for_double_and_string() {
    assertThat(Values.areEqual(1D, "1")).isTrue();
    assertThat(Values.areEqual(2D, "1")).isFalse();
    assertThat(Values.areEqual(1.5D, "1.5")).isTrue();
    assertThat(Values.areEqual(2.5D, "1.5")).isFalse();
  }

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code BigInteger}s.
   */
  @Test
  public void test_are_equal_for_biginteger_and_string() {
    assertThat(Values.areEqual(new BigInteger("1"), "1")).isTrue();
    assertThat(Values.areEqual(new BigInteger("2"), "1")).isFalse();
  }

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code BigDecimal}s.
   */
  @Test
  public void test_are_equal_for_bigdecimal_and_string() {
    assertThat(Values.areEqual(new BigDecimal("1"), "1")).isTrue();
    assertThat(Values.areEqual(new BigDecimal("2"), "1")).isFalse();
    assertThat(Values.areEqual(new BigDecimal("1.5"), "1.5")).isTrue();
    assertThat(Values.areEqual(new BigDecimal("2.5"), "1.5")).isFalse();
  }

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code Byte}s.
   */
  @Test
  public void test_are_equal_for_byte_and_string() {
    assertThat(Values.areEqual((byte) 1, "1")).isTrue();
    assertThat(Values.areEqual((byte) 2, "1")).isFalse();
  }

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code Short}s.
   */
  @Test
  public void test_are_equal_for_short_and_string() {
    assertThat(Values.areEqual((short) 1, "1")).isTrue();
    assertThat(Values.areEqual((short) 2, "1")).isFalse();
  }

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code Int}s.
   */
  @Test
  public void test_are_equal_for_int_and_string() {
    assertThat(Values.areEqual((int) 1, "1")).isTrue();
    assertThat(Values.areEqual((int) 2, "1")).isFalse();
  }

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code Long}s.
   */
  @Test
  public void test_are_equal_for_long_and_string() {
    assertThat(Values.areEqual((long) 1, "1")).isTrue();
    assertThat(Values.areEqual((long) 2, "1")).isFalse();
  }

  /**
   * This method tests the {@code areEqual} method for another type of value and {@code AtomicLong}s.
   */
  @Test
  public void test_are_equal_for_atomiclong_and_string() {
    assertThat(Values.areEqual(new AtomicLong(1), "1")).isFalse();
    assertThat(Values.areEqual(new AtomicLong(2), "1")).isFalse();
  }

  /**
   * This method should fail because the expected value ("***") is not parsable to do the comparison.
   */
  @Test(expected = AssertJDBException.class)
  public void should_fail_because_string_is_not_parseable() {
    Values.areEqual(1, "***");
  }

  /**
   * This method should fail because the expected value is null.
   */
  @Test(expected = NullPointerException.class)
  public void should_fail_because_string_is_null_with_float() {
    Values.areEqual(1F, (String) null);
  }

  /**
   * This method should fail because the expected value is null.
   */
  @Test(expected = NullPointerException.class)
  public void should_fail_because_string_is_null_with_double() {
    Values.areEqual(1D, (String) null);
  }

  /**
   * This method should fail because the expected value is null.
   */
  @Test(expected = NullPointerException.class)
  public void should_fail_because_string_is_null_with_byte() {
    Values.areEqual((byte) 1, (String) null);
  }

  /**
   * This method should fail because the expected value is null.
   */
  @Test(expected = NullPointerException.class)
  public void should_fail_because_string_is_null_with_short() {
    Values.areEqual((short) 1, (String) null);
  }

  /**
   * This method should fail because the expected value is null.
   */
  @Test(expected = NullPointerException.class)
  public void should_fail_because_string_is_null_with_int() {
    Values.areEqual((int) 1, (String) null);
  }

  /**
   * This method should fail because the expected value is null.
   */
  @Test(expected = NullPointerException.class)
  public void should_fail_because_string_is_null_with_long() {
    Values.areEqual((long) 1, (String) null);
  }

  /**
   * This method should fail because the expected value is null.
   */
  @Test(expected = NullPointerException.class)
  public void should_fail_because_string_is_null_with_biginteger() {
    Values.areEqual(new BigInteger("1"), (String) null);
  }

  /**
   * This method should fail because the expected value is null.
   */
  @Test(expected = NullPointerException.class)
  public void should_fail_because_string_is_null_with_bigdecimal() {
    Values.areEqual(new BigDecimal("1"), (String) null);
  }
}