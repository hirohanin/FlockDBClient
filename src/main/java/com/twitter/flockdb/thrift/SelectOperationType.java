/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.twitter.flockdb.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SelectOperationType implements org.apache.thrift.TEnum {
  SimpleQuery(1),
  Intersection(2),
  Union(3),
  Difference(4);

  private final int value;

  private SelectOperationType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SelectOperationType findByValue(int value) { 
    switch (value) {
      case 1:
        return SimpleQuery;
      case 2:
        return Intersection;
      case 3:
        return Union;
      case 4:
        return Difference;
      default:
        return null;
    }
  }
}
