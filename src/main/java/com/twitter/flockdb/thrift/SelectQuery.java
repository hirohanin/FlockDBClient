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

public class SelectQuery implements org.apache.thrift.TBase<SelectQuery, SelectQuery._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SelectQuery");

  private static final org.apache.thrift.protocol.TField OPERATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("operations", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("page", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SelectQueryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SelectQueryTupleSchemeFactory());
  }

  public List<SelectOperation> operations; // required
  public Page page; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATIONS((short)1, "operations"),
    PAGE((short)2, "page");

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
        case 1: // OPERATIONS
          return OPERATIONS;
        case 2: // PAGE
          return PAGE;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATIONS, new org.apache.thrift.meta_data.FieldMetaData("operations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SelectOperation.class))));
    tmpMap.put(_Fields.PAGE, new org.apache.thrift.meta_data.FieldMetaData("page", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Page.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SelectQuery.class, metaDataMap);
  }

  public SelectQuery() {
  }

  public SelectQuery(
    List<SelectOperation> operations,
    Page page)
  {
    this();
    this.operations = operations;
    this.page = page;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SelectQuery(SelectQuery other) {
    if (other.isSetOperations()) {
      List<SelectOperation> __this__operations = new ArrayList<SelectOperation>();
      for (SelectOperation other_element : other.operations) {
        __this__operations.add(new SelectOperation(other_element));
      }
      this.operations = __this__operations;
    }
    if (other.isSetPage()) {
      this.page = new Page(other.page);
    }
  }

  public SelectQuery deepCopy() {
    return new SelectQuery(this);
  }

  @Override
  public void clear() {
    this.operations = null;
    this.page = null;
  }

  public int getOperationsSize() {
    return (this.operations == null) ? 0 : this.operations.size();
  }

  public java.util.Iterator<SelectOperation> getOperationsIterator() {
    return (this.operations == null) ? null : this.operations.iterator();
  }

  public void addToOperations(SelectOperation elem) {
    if (this.operations == null) {
      this.operations = new ArrayList<SelectOperation>();
    }
    this.operations.add(elem);
  }

  public List<SelectOperation> getOperations() {
    return this.operations;
  }

  public SelectQuery setOperations(List<SelectOperation> operations) {
    this.operations = operations;
    return this;
  }

  public void unsetOperations() {
    this.operations = null;
  }

  /** Returns true if field operations is set (has been assigned a value) and false otherwise */
  public boolean isSetOperations() {
    return this.operations != null;
  }

  public void setOperationsIsSet(boolean value) {
    if (!value) {
      this.operations = null;
    }
  }

  public Page getPage() {
    return this.page;
  }

  public SelectQuery setPage(Page page) {
    this.page = page;
    return this;
  }

  public void unsetPage() {
    this.page = null;
  }

  /** Returns true if field page is set (has been assigned a value) and false otherwise */
  public boolean isSetPage() {
    return this.page != null;
  }

  public void setPageIsSet(boolean value) {
    if (!value) {
      this.page = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATIONS:
      if (value == null) {
        unsetOperations();
      } else {
        setOperations((List<SelectOperation>)value);
      }
      break;

    case PAGE:
      if (value == null) {
        unsetPage();
      } else {
        setPage((Page)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATIONS:
      return getOperations();

    case PAGE:
      return getPage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATIONS:
      return isSetOperations();
    case PAGE:
      return isSetPage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SelectQuery)
      return this.equals((SelectQuery)that);
    return false;
  }

  public boolean equals(SelectQuery that) {
    if (that == null)
      return false;

    boolean this_present_operations = true && this.isSetOperations();
    boolean that_present_operations = true && that.isSetOperations();
    if (this_present_operations || that_present_operations) {
      if (!(this_present_operations && that_present_operations))
        return false;
      if (!this.operations.equals(that.operations))
        return false;
    }

    boolean this_present_page = true && this.isSetPage();
    boolean that_present_page = true && that.isSetPage();
    if (this_present_page || that_present_page) {
      if (!(this_present_page && that_present_page))
        return false;
      if (!this.page.equals(that.page))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SelectQuery other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SelectQuery typedOther = (SelectQuery)other;

    lastComparison = Boolean.valueOf(isSetOperations()).compareTo(typedOther.isSetOperations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operations, typedOther.operations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPage()).compareTo(typedOther.isSetPage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.page, typedOther.page);
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
    StringBuilder sb = new StringBuilder("SelectQuery(");
    boolean first = true;

    sb.append("operations:");
    if (this.operations == null) {
      sb.append("null");
    } else {
      sb.append(this.operations);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("page:");
    if (this.page == null) {
      sb.append("null");
    } else {
      sb.append(this.page);
    }
    first = false;
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

  private static class SelectQueryStandardSchemeFactory implements SchemeFactory {
    public SelectQueryStandardScheme getScheme() {
      return new SelectQueryStandardScheme();
    }
  }

  private static class SelectQueryStandardScheme extends StandardScheme<SelectQuery> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SelectQuery struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.operations = new ArrayList<SelectOperation>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  SelectOperation _elem18; // required
                  _elem18 = new SelectOperation();
                  _elem18.read(iprot);
                  struct.operations.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setOperationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.page = new Page();
              struct.page.read(iprot);
              struct.setPageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SelectQuery struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operations != null) {
        oprot.writeFieldBegin(OPERATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.operations.size()));
          for (SelectOperation _iter19 : struct.operations)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.page != null) {
        oprot.writeFieldBegin(PAGE_FIELD_DESC);
        struct.page.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SelectQueryTupleSchemeFactory implements SchemeFactory {
    public SelectQueryTupleScheme getScheme() {
      return new SelectQueryTupleScheme();
    }
  }

  private static class SelectQueryTupleScheme extends TupleScheme<SelectQuery> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SelectQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOperations()) {
        optionals.set(0);
      }
      if (struct.isSetPage()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOperations()) {
        {
          oprot.writeI32(struct.operations.size());
          for (SelectOperation _iter20 : struct.operations)
          {
            _iter20.write(oprot);
          }
        }
      }
      if (struct.isSetPage()) {
        struct.page.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SelectQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.operations = new ArrayList<SelectOperation>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            SelectOperation _elem23; // required
            _elem23 = new SelectOperation();
            _elem23.read(iprot);
            struct.operations.add(_elem23);
          }
        }
        struct.setOperationsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.page = new Page();
        struct.page.read(iprot);
        struct.setPageIsSet(true);
      }
    }
  }

}

