/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.twitter.flockdb.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectOperation implements org.apache.thrift.TBase<SelectOperation, SelectOperation._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SelectOperation");

  private static final org.apache.thrift.protocol.TField OPERATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("operation_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TERM_FIELD_DESC = new org.apache.thrift.protocol.TField("term", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SelectOperationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SelectOperationTupleSchemeFactory());
  }

  /**
   * 
   * @see SelectOperationType
   */
  public SelectOperationType operation_type; // required
  public QueryTerm term; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SelectOperationType
     */
    OPERATION_TYPE((short)1, "operation_type"),
    TERM((short)2, "term");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OPERATION_TYPE
          return OPERATION_TYPE;
        case 2: // TERM
          return TERM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.TERM};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("operation_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SelectOperationType.class)));
    tmpMap.put(_Fields.TERM, new org.apache.thrift.meta_data.FieldMetaData("term", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, QueryTerm.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SelectOperation.class, metaDataMap);
  }

  public SelectOperation() {
  }

  public SelectOperation(
    SelectOperationType operation_type)
  {
    this();
    this.operation_type = operation_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SelectOperation(SelectOperation other) {
    if (other.isSetOperation_type()) {
      this.operation_type = other.operation_type;
    }
    if (other.isSetTerm()) {
      this.term = new QueryTerm(other.term);
    }
  }

  public SelectOperation deepCopy() {
    return new SelectOperation(this);
  }

  @Override
  public void clear() {
    this.operation_type = null;
    this.term = null;
  }

  /**
   * 
   * @see SelectOperationType
   */
  public SelectOperationType getOperation_type() {
    return this.operation_type;
  }

  /**
   * 
   * @see SelectOperationType
   */
  public SelectOperation setOperation_type(SelectOperationType operation_type) {
    this.operation_type = operation_type;
    return this;
  }

  public void unsetOperation_type() {
    this.operation_type = null;
  }

  /** Returns true if field operation_type is set (has been assigned a value) and false otherwise */
  public boolean isSetOperation_type() {
    return this.operation_type != null;
  }

  public void setOperation_typeIsSet(boolean value) {
    if (!value) {
      this.operation_type = null;
    }
  }

  public QueryTerm getTerm() {
    return this.term;
  }

  public SelectOperation setTerm(QueryTerm term) {
    this.term = term;
    return this;
  }

  public void unsetTerm() {
    this.term = null;
  }

  /** Returns true if field term is set (has been assigned a value) and false otherwise */
  public boolean isSetTerm() {
    return this.term != null;
  }

  public void setTermIsSet(boolean value) {
    if (!value) {
      this.term = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATION_TYPE:
      if (value == null) {
        unsetOperation_type();
      } else {
        setOperation_type((SelectOperationType)value);
      }
      break;

    case TERM:
      if (value == null) {
        unsetTerm();
      } else {
        setTerm((QueryTerm)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATION_TYPE:
      return getOperation_type();

    case TERM:
      return getTerm();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATION_TYPE:
      return isSetOperation_type();
    case TERM:
      return isSetTerm();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SelectOperation)
      return this.equals((SelectOperation)that);
    return false;
  }

  public boolean equals(SelectOperation that) {
    if (that == null)
      return false;

    boolean this_present_operation_type = true && this.isSetOperation_type();
    boolean that_present_operation_type = true && that.isSetOperation_type();
    if (this_present_operation_type || that_present_operation_type) {
      if (!(this_present_operation_type && that_present_operation_type))
        return false;
      if (!this.operation_type.equals(that.operation_type))
        return false;
    }

    boolean this_present_term = true && this.isSetTerm();
    boolean that_present_term = true && that.isSetTerm();
    if (this_present_term || that_present_term) {
      if (!(this_present_term && that_present_term))
        return false;
      if (!this.term.equals(that.term))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SelectOperation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SelectOperation typedOther = (SelectOperation)other;

    lastComparison = Boolean.valueOf(isSetOperation_type()).compareTo(typedOther.isSetOperation_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperation_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operation_type, typedOther.operation_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTerm()).compareTo(typedOther.isSetTerm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTerm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.term, typedOther.term);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SelectOperation(");
    boolean first = true;

    sb.append("operation_type:");
    if (this.operation_type == null) {
      sb.append("null");
    } else {
      sb.append(this.operation_type);
    }
    first = false;
    if (isSetTerm()) {
      if (!first) sb.append(", ");
      sb.append("term:");
      if (this.term == null) {
        sb.append("null");
      } else {
        sb.append(this.term);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SelectOperationStandardSchemeFactory implements SchemeFactory {
    public SelectOperationStandardScheme getScheme() {
      return new SelectOperationStandardScheme();
    }
  }

  private static class SelectOperationStandardScheme extends StandardScheme<SelectOperation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SelectOperation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operation_type = SelectOperationType.findByValue(iprot.readI32());
              struct.setOperation_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TERM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.term = new QueryTerm();
              struct.term.read(iprot);
              struct.setTermIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SelectOperation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operation_type != null) {
        oprot.writeFieldBegin(OPERATION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.operation_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.term != null) {
        if (struct.isSetTerm()) {
          oprot.writeFieldBegin(TERM_FIELD_DESC);
          struct.term.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SelectOperationTupleSchemeFactory implements SchemeFactory {
    public SelectOperationTupleScheme getScheme() {
      return new SelectOperationTupleScheme();
    }
  }

  private static class SelectOperationTupleScheme extends TupleScheme<SelectOperation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SelectOperation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOperation_type()) {
        optionals.set(0);
      }
      if (struct.isSetTerm()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOperation_type()) {
        oprot.writeI32(struct.operation_type.getValue());
      }
      if (struct.isSetTerm()) {
        struct.term.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SelectOperation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.operation_type = SelectOperationType.findByValue(iprot.readI32());
        struct.setOperation_typeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.term = new QueryTerm();
        struct.term.read(iprot);
        struct.setTermIsSet(true);
      }
    }
  }

}

