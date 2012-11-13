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

public class Edge implements org.apache.thrift.TBase<Edge, Edge._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Edge");

  private static final org.apache.thrift.protocol.TField SOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("source_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField DESTINATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("destination_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("position", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField UPDATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("updated_at", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField STATE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("state_id", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EdgeTupleSchemeFactory());
  }

  public long source_id; // required
  public long destination_id; // required
  public long position; // required
  public int updated_at; // required
  public int count; // required
  public int state_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE_ID((short)1, "source_id"),
    DESTINATION_ID((short)2, "destination_id"),
    POSITION((short)3, "position"),
    UPDATED_AT((short)4, "updated_at"),
    COUNT((short)5, "count"),
    STATE_ID((short)6, "state_id");

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
        case 2: // DESTINATION_ID
          return DESTINATION_ID;
        case 3: // POSITION
          return POSITION;
        case 4: // UPDATED_AT
          return UPDATED_AT;
        case 5: // COUNT
          return COUNT;
        case 6: // STATE_ID
          return STATE_ID;
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
  private static final int __DESTINATION_ID_ISSET_ID = 1;
  private static final int __POSITION_ISSET_ID = 2;
  private static final int __UPDATED_AT_ISSET_ID = 3;
  private static final int __COUNT_ISSET_ID = 4;
  private static final int __STATE_ID_ISSET_ID = 5;
  private BitSet __isset_bit_vector = new BitSet(6);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("source_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DESTINATION_ID, new org.apache.thrift.meta_data.FieldMetaData("destination_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.POSITION, new org.apache.thrift.meta_data.FieldMetaData("position", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATED_AT, new org.apache.thrift.meta_data.FieldMetaData("updated_at", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATE_ID, new org.apache.thrift.meta_data.FieldMetaData("state_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Edge.class, metaDataMap);
  }

  public Edge() {
  }

  public Edge(
    long source_id,
    long destination_id,
    long position,
    int updated_at,
    int count,
    int state_id)
  {
    this();
    this.source_id = source_id;
    setSource_idIsSet(true);
    this.destination_id = destination_id;
    setDestination_idIsSet(true);
    this.position = position;
    setPositionIsSet(true);
    this.updated_at = updated_at;
    setUpdated_atIsSet(true);
    this.count = count;
    setCountIsSet(true);
    this.state_id = state_id;
    setState_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Edge(Edge other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.source_id = other.source_id;
    this.destination_id = other.destination_id;
    this.position = other.position;
    this.updated_at = other.updated_at;
    this.count = other.count;
    this.state_id = other.state_id;
  }

  public Edge deepCopy() {
    return new Edge(this);
  }

  @Override
  public void clear() {
    setSource_idIsSet(false);
    this.source_id = 0;
    setDestination_idIsSet(false);
    this.destination_id = 0;
    setPositionIsSet(false);
    this.position = 0;
    setUpdated_atIsSet(false);
    this.updated_at = 0;
    setCountIsSet(false);
    this.count = 0;
    setState_idIsSet(false);
    this.state_id = 0;
  }

  public long getSource_id() {
    return this.source_id;
  }

  public Edge setSource_id(long source_id) {
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

  public long getDestination_id() {
    return this.destination_id;
  }

  public Edge setDestination_id(long destination_id) {
    this.destination_id = destination_id;
    setDestination_idIsSet(true);
    return this;
  }

  public void unsetDestination_id() {
    __isset_bit_vector.clear(__DESTINATION_ID_ISSET_ID);
  }

  /** Returns true if field destination_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDestination_id() {
    return __isset_bit_vector.get(__DESTINATION_ID_ISSET_ID);
  }

  public void setDestination_idIsSet(boolean value) {
    __isset_bit_vector.set(__DESTINATION_ID_ISSET_ID, value);
  }

  public long getPosition() {
    return this.position;
  }

  public Edge setPosition(long position) {
    this.position = position;
    setPositionIsSet(true);
    return this;
  }

  public void unsetPosition() {
    __isset_bit_vector.clear(__POSITION_ISSET_ID);
  }

  /** Returns true if field position is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition() {
    return __isset_bit_vector.get(__POSITION_ISSET_ID);
  }

  public void setPositionIsSet(boolean value) {
    __isset_bit_vector.set(__POSITION_ISSET_ID, value);
  }

  public int getUpdated_at() {
    return this.updated_at;
  }

  public Edge setUpdated_at(int updated_at) {
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

  public int getCount() {
    return this.count;
  }

  public Edge setCount(int count) {
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

  public int getState_id() {
    return this.state_id;
  }

  public Edge setState_id(int state_id) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SOURCE_ID:
      if (value == null) {
        unsetSource_id();
      } else {
        setSource_id((Long)value);
      }
      break;

    case DESTINATION_ID:
      if (value == null) {
        unsetDestination_id();
      } else {
        setDestination_id((Long)value);
      }
      break;

    case POSITION:
      if (value == null) {
        unsetPosition();
      } else {
        setPosition((Long)value);
      }
      break;

    case UPDATED_AT:
      if (value == null) {
        unsetUpdated_at();
      } else {
        setUpdated_at((Integer)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Integer)value);
      }
      break;

    case STATE_ID:
      if (value == null) {
        unsetState_id();
      } else {
        setState_id((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE_ID:
      return Long.valueOf(getSource_id());

    case DESTINATION_ID:
      return Long.valueOf(getDestination_id());

    case POSITION:
      return Long.valueOf(getPosition());

    case UPDATED_AT:
      return Integer.valueOf(getUpdated_at());

    case COUNT:
      return Integer.valueOf(getCount());

    case STATE_ID:
      return Integer.valueOf(getState_id());

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
    case DESTINATION_ID:
      return isSetDestination_id();
    case POSITION:
      return isSetPosition();
    case UPDATED_AT:
      return isSetUpdated_at();
    case COUNT:
      return isSetCount();
    case STATE_ID:
      return isSetState_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Edge)
      return this.equals((Edge)that);
    return false;
  }

  public boolean equals(Edge that) {
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

    boolean this_present_destination_id = true;
    boolean that_present_destination_id = true;
    if (this_present_destination_id || that_present_destination_id) {
      if (!(this_present_destination_id && that_present_destination_id))
        return false;
      if (this.destination_id != that.destination_id)
        return false;
    }

    boolean this_present_position = true;
    boolean that_present_position = true;
    if (this_present_position || that_present_position) {
      if (!(this_present_position && that_present_position))
        return false;
      if (this.position != that.position)
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

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Edge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Edge typedOther = (Edge)other;

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
    lastComparison = Boolean.valueOf(isSetDestination_id()).compareTo(typedOther.isSetDestination_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestination_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.destination_id, typedOther.destination_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPosition()).compareTo(typedOther.isSetPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.position, typedOther.position);
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
    StringBuilder sb = new StringBuilder("Edge(");
    boolean first = true;

    sb.append("source_id:");
    sb.append(this.source_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("destination_id:");
    sb.append(this.destination_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("position:");
    sb.append(this.position);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updated_at:");
    sb.append(this.updated_at);
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state_id:");
    sb.append(this.state_id);
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

  private static class EdgeStandardSchemeFactory implements SchemeFactory {
    public EdgeStandardScheme getScheme() {
      return new EdgeStandardScheme();
    }
  }

  private static class EdgeStandardScheme extends StandardScheme<Edge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Edge struct) throws org.apache.thrift.TException {
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
          case 2: // DESTINATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.destination_id = iprot.readI64();
              struct.setDestination_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.position = iprot.readI64();
              struct.setPositionIsSet(true);
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
          case 5: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STATE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state_id = iprot.readI32();
              struct.setState_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Edge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SOURCE_ID_FIELD_DESC);
      oprot.writeI64(struct.source_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DESTINATION_ID_FIELD_DESC);
      oprot.writeI64(struct.destination_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(POSITION_FIELD_DESC);
      oprot.writeI64(struct.position);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATED_AT_FIELD_DESC);
      oprot.writeI32(struct.updated_at);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STATE_ID_FIELD_DESC);
      oprot.writeI32(struct.state_id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EdgeTupleSchemeFactory implements SchemeFactory {
    public EdgeTupleScheme getScheme() {
      return new EdgeTupleScheme();
    }
  }

  private static class EdgeTupleScheme extends TupleScheme<Edge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Edge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSource_id()) {
        optionals.set(0);
      }
      if (struct.isSetDestination_id()) {
        optionals.set(1);
      }
      if (struct.isSetPosition()) {
        optionals.set(2);
      }
      if (struct.isSetUpdated_at()) {
        optionals.set(3);
      }
      if (struct.isSetCount()) {
        optionals.set(4);
      }
      if (struct.isSetState_id()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetSource_id()) {
        oprot.writeI64(struct.source_id);
      }
      if (struct.isSetDestination_id()) {
        oprot.writeI64(struct.destination_id);
      }
      if (struct.isSetPosition()) {
        oprot.writeI64(struct.position);
      }
      if (struct.isSetUpdated_at()) {
        oprot.writeI32(struct.updated_at);
      }
      if (struct.isSetCount()) {
        oprot.writeI32(struct.count);
      }
      if (struct.isSetState_id()) {
        oprot.writeI32(struct.state_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Edge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.source_id = iprot.readI64();
        struct.setSource_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.destination_id = iprot.readI64();
        struct.setDestination_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.position = iprot.readI64();
        struct.setPositionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.updated_at = iprot.readI32();
        struct.setUpdated_atIsSet(true);
      }
      if (incoming.get(4)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.state_id = iprot.readI32();
        struct.setState_idIsSet(true);
      }
    }
  }

}
