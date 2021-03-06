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

public class Metadata implements org.apache.thrift.TBase<Metadata, Metadata._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Metadata");

  private static final org.apache.thrift.protocol.TField SOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("source_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STATE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("state_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField UPDATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("updated_at", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetadataTupleSchemeFactory());
  }

  public long source_id; // required
  public int state_id; // required
  public int count; // required
  public int updated_at; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE_ID((short)1, "source_id"),
    STATE_ID((short)2, "state_id"),
    COUNT((short)3, "count"),
    UPDATED_AT((short)4, "updated_at");

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
        case 1: // SOURCE_ID
          return SOURCE_ID;
        case 2: // STATE_ID
          return STATE_ID;
        case 3: // COUNT
          return COUNT;
        case 4: // UPDATED_AT
          return UPDATED_AT;
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
  private static final int __SOURCE_ID_ISSET_ID = 0;
  private static final int __STATE_ID_ISSET_ID = 1;
  private static final int __COUNT_ISSET_ID = 2;
  private static final int __UPDATED_AT_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("source_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATE_ID, new org.apache.thrift.meta_data.FieldMetaData("state_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UPDATED_AT, new org.apache.thrift.meta_data.FieldMetaData("updated_at", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Metadata.class, metaDataMap);
  }

  public Metadata() {
  }

  public Metadata(
    long source_id,
    int state_id,
    int count,
    int updated_at)
  {
    this();
    this.source_id = source_id;
    setSource_idIsSet(true);
    this.state_id = state_id;
    setState_idIsSet(true);
    this.count = count;
    setCountIsSet(true);
    this.updated_at = updated_at;
    setUpdated_atIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Metadata(Metadata other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.source_id = other.source_id;
    this.state_id = other.state_id;
    this.count = other.count;
    this.updated_at = other.updated_at;
  }

  public Metadata deepCopy() {
    return new Metadata(this);
  }

  @Override
  public void clear() {
    setSource_idIsSet(false);
    this.source_id = 0;
    setState_idIsSet(false);
    this.state_id = 0;
    setCountIsSet(false);
    this.count = 0;
    setUpdated_atIsSet(false);
    this.updated_at = 0;
  }

  public long getSource_id() {
    return this.source_id;
  }

  public Metadata setSource_id(long source_id) {
    this.source_id = source_id;
    setSource_idIsSet(true);
    return this;
  }

  public void unsetSource_id() {
    __isset_bit_vector.clear(__SOURCE_ID_ISSET_ID);
  }

  /** Returns true if field source_id is set (has been assigned a value) and false otherwise */
  public boolean isSetSource_id() {
    return __isset_bit_vector.get(__SOURCE_ID_ISSET_ID);
  }

  public void setSource_idIsSet(boolean value) {
    __isset_bit_vector.set(__SOURCE_ID_ISSET_ID, value);
  }

  public int getState_id() {
    return this.state_id;
  }

  public Metadata setState_id(int state_id) {
    this.state_id = state_id;
    setState_idIsSet(true);
    return this;
  }

  public void unsetState_id() {
    __isset_bit_vector.clear(__STATE_ID_ISSET_ID);
  }

  /** Returns true if field state_id is set (has been assigned a value) and false otherwise */
  public boolean isSetState_id() {
    return __isset_bit_vector.get(__STATE_ID_ISSET_ID);
  }

  public void setState_idIsSet(boolean value) {
    __isset_bit_vector.set(__STATE_ID_ISSET_ID, value);
  }

  public int getCount() {
    return this.count;
  }

  public Metadata setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bit_vector.clear(__COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return __isset_bit_vector.get(__COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bit_vector.set(__COUNT_ISSET_ID, value);
  }

  public int getUpdated_at() {
    return this.updated_at;
  }

  public Metadata setUpdated_at(int updated_at) {
    this.updated_at = updated_at;
    setUpdated_atIsSet(true);
    return this;
  }

  public void unsetUpdated_at() {
    __isset_bit_vector.clear(__UPDATED_AT_ISSET_ID);
  }

  /** Returns true if field updated_at is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdated_at() {
    return __isset_bit_vector.get(__UPDATED_AT_ISSET_ID);
  }

  public void setUpdated_atIsSet(boolean value) {
    __isset_bit_vector.set(__UPDATED_AT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SOURCE_ID:
      if (value == null) {
        unsetSource_id();
      } else {
        setSource_id((Long)value);
      }
      break;

    case STATE_ID:
      if (value == null) {
        unsetState_id();
      } else {
        setState_id((Integer)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Integer)value);
      }
      break;

    case UPDATED_AT:
      if (value == null) {
        unsetUpdated_at();
      } else {
        setUpdated_at((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE_ID:
      return Long.valueOf(getSource_id());

    case STATE_ID:
      return Integer.valueOf(getState_id());

    case COUNT:
      return Integer.valueOf(getCount());

    case UPDATED_AT:
      return Integer.valueOf(getUpdated_at());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SOURCE_ID:
      return isSetSource_id();
    case STATE_ID:
      return isSetState_id();
    case COUNT:
      return isSetCount();
    case UPDATED_AT:
      return isSetUpdated_at();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Metadata)
      return this.equals((Metadata)that);
    return false;
  }

  public boolean equals(Metadata that) {
    if (that == null)
      return false;

    boolean this_present_source_id = true;
    boolean that_present_source_id = true;
    if (this_present_source_id || that_present_source_id) {
      if (!(this_present_source_id && that_present_source_id))
        return false;
      if (this.source_id != that.source_id)
        return false;
    }

    boolean this_present_state_id = true;
    boolean that_present_state_id = true;
    if (this_present_state_id || that_present_state_id) {
      if (!(this_present_state_id && that_present_state_id))
        return false;
      if (this.state_id != that.state_id)
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    boolean this_present_updated_at = true;
    boolean that_present_updated_at = true;
    if (this_present_updated_at || that_present_updated_at) {
      if (!(this_present_updated_at && that_present_updated_at))
        return false;
      if (this.updated_at != that.updated_at)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Metadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Metadata typedOther = (Metadata)other;

    lastComparison = Boolean.valueOf(isSetSource_id()).compareTo(typedOther.isSetSource_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source_id, typedOther.source_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState_id()).compareTo(typedOther.isSetState_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state_id, typedOther.state_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCount()).compareTo(typedOther.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, typedOther.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdated_at()).compareTo(typedOther.isSetUpdated_at());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdated_at()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updated_at, typedOther.updated_at);
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
    StringBuilder sb = new StringBuilder("Metadata(");
    boolean first = true;

    sb.append("source_id:");
    sb.append(this.source_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state_id:");
    sb.append(this.state_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updated_at:");
    sb.append(this.updated_at);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MetadataStandardSchemeFactory implements SchemeFactory {
    public MetadataStandardScheme getScheme() {
      return new MetadataStandardScheme();
    }
  }

  private static class MetadataStandardScheme extends StandardScheme<Metadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Metadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.source_id = iprot.readI64();
              struct.setSource_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state_id = iprot.readI32();
              struct.setState_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UPDATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.updated_at = iprot.readI32();
              struct.setUpdated_atIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Metadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SOURCE_ID_FIELD_DESC);
      oprot.writeI64(struct.source_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STATE_ID_FIELD_DESC);
      oprot.writeI32(struct.state_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATED_AT_FIELD_DESC);
      oprot.writeI32(struct.updated_at);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetadataTupleSchemeFactory implements SchemeFactory {
    public MetadataTupleScheme getScheme() {
      return new MetadataTupleScheme();
    }
  }

  private static class MetadataTupleScheme extends TupleScheme<Metadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Metadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSource_id()) {
        optionals.set(0);
      }
      if (struct.isSetState_id()) {
        optionals.set(1);
      }
      if (struct.isSetCount()) {
        optionals.set(2);
      }
      if (struct.isSetUpdated_at()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSource_id()) {
        oprot.writeI64(struct.source_id);
      }
      if (struct.isSetState_id()) {
        oprot.writeI32(struct.state_id);
      }
      if (struct.isSetCount()) {
        oprot.writeI32(struct.count);
      }
      if (struct.isSetUpdated_at()) {
        oprot.writeI32(struct.updated_at);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Metadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.source_id = iprot.readI64();
        struct.setSource_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.state_id = iprot.readI32();
        struct.setState_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.updated_at = iprot.readI32();
        struct.setUpdated_atIsSet(true);
      }
    }
  }

}

