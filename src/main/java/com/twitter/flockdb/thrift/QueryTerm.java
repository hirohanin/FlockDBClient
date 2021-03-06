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

public class QueryTerm implements org.apache.thrift.TBase<QueryTerm, QueryTerm._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryTerm");

  private static final org.apache.thrift.protocol.TField SOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("source_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField GRAPH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("graph_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField IS_FORWARD_FIELD_DESC = new org.apache.thrift.protocol.TField("is_forward", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField DESTINATION_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("destination_ids", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STATE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("state_ids", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryTermStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryTermTupleSchemeFactory());
  }

  public long source_id; // required
  public int graph_id; // required
  public boolean is_forward; // required
  public ByteBuffer destination_ids; // optional
  public List<Integer> state_ids; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE_ID((short)1, "source_id"),
    GRAPH_ID((short)2, "graph_id"),
    IS_FORWARD((short)3, "is_forward"),
    DESTINATION_IDS((short)4, "destination_ids"),
    STATE_IDS((short)5, "state_ids");

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
        case 2: // GRAPH_ID
          return GRAPH_ID;
        case 3: // IS_FORWARD
          return IS_FORWARD;
        case 4: // DESTINATION_IDS
          return DESTINATION_IDS;
        case 5: // STATE_IDS
          return STATE_IDS;
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
  private static final int __GRAPH_ID_ISSET_ID = 1;
  private static final int __IS_FORWARD_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);
  private _Fields optionals[] = {_Fields.DESTINATION_IDS,_Fields.STATE_IDS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("source_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GRAPH_ID, new org.apache.thrift.meta_data.FieldMetaData("graph_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_FORWARD, new org.apache.thrift.meta_data.FieldMetaData("is_forward", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DESTINATION_IDS, new org.apache.thrift.meta_data.FieldMetaData("destination_ids", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.STATE_IDS, new org.apache.thrift.meta_data.FieldMetaData("state_ids", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryTerm.class, metaDataMap);
  }

  public QueryTerm() {
  }

  public QueryTerm(
    long source_id,
    int graph_id,
    boolean is_forward)
  {
    this();
    this.source_id = source_id;
    setSource_idIsSet(true);
    this.graph_id = graph_id;
    setGraph_idIsSet(true);
    this.is_forward = is_forward;
    setIs_forwardIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryTerm(QueryTerm other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.source_id = other.source_id;
    this.graph_id = other.graph_id;
    this.is_forward = other.is_forward;
    if (other.isSetDestination_ids()) {
      this.destination_ids = org.apache.thrift.TBaseHelper.copyBinary(other.destination_ids);
;
    }
    if (other.isSetState_ids()) {
      List<Integer> __this__state_ids = new ArrayList<Integer>();
      for (Integer other_element : other.state_ids) {
        __this__state_ids.add(other_element);
      }
      this.state_ids = __this__state_ids;
    }
  }

  public QueryTerm deepCopy() {
    return new QueryTerm(this);
  }

  @Override
  public void clear() {
    setSource_idIsSet(false);
    this.source_id = 0;
    setGraph_idIsSet(false);
    this.graph_id = 0;
    setIs_forwardIsSet(false);
    this.is_forward = false;
    this.destination_ids = null;
    this.state_ids = null;
  }

  public long getSource_id() {
    return this.source_id;
  }

  public QueryTerm setSource_id(long source_id) {
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

  public int getGraph_id() {
    return this.graph_id;
  }

  public QueryTerm setGraph_id(int graph_id) {
    this.graph_id = graph_id;
    setGraph_idIsSet(true);
    return this;
  }

  public void unsetGraph_id() {
    __isset_bit_vector.clear(__GRAPH_ID_ISSET_ID);
  }

  /** Returns true if field graph_id is set (has been assigned a value) and false otherwise */
  public boolean isSetGraph_id() {
    return __isset_bit_vector.get(__GRAPH_ID_ISSET_ID);
  }

  public void setGraph_idIsSet(boolean value) {
    __isset_bit_vector.set(__GRAPH_ID_ISSET_ID, value);
  }

  public boolean isIs_forward() {
    return this.is_forward;
  }

  public QueryTerm setIs_forward(boolean is_forward) {
    this.is_forward = is_forward;
    setIs_forwardIsSet(true);
    return this;
  }

  public void unsetIs_forward() {
    __isset_bit_vector.clear(__IS_FORWARD_ISSET_ID);
  }

  /** Returns true if field is_forward is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_forward() {
    return __isset_bit_vector.get(__IS_FORWARD_ISSET_ID);
  }

  public void setIs_forwardIsSet(boolean value) {
    __isset_bit_vector.set(__IS_FORWARD_ISSET_ID, value);
  }

  public byte[] getDestination_ids() {
    setDestination_ids(org.apache.thrift.TBaseHelper.rightSize(destination_ids));
    return destination_ids == null ? null : destination_ids.array();
  }

  public ByteBuffer bufferForDestination_ids() {
    return destination_ids;
  }

  public QueryTerm setDestination_ids(byte[] destination_ids) {
    setDestination_ids(destination_ids == null ? (ByteBuffer)null : ByteBuffer.wrap(destination_ids));
    return this;
  }

  public QueryTerm setDestination_ids(ByteBuffer destination_ids) {
    this.destination_ids = destination_ids;
    return this;
  }

  public void unsetDestination_ids() {
    this.destination_ids = null;
  }

  /** Returns true if field destination_ids is set (has been assigned a value) and false otherwise */
  public boolean isSetDestination_ids() {
    return this.destination_ids != null;
  }

  public void setDestination_idsIsSet(boolean value) {
    if (!value) {
      this.destination_ids = null;
    }
  }

  public int getState_idsSize() {
    return (this.state_ids == null) ? 0 : this.state_ids.size();
  }

  public java.util.Iterator<Integer> getState_idsIterator() {
    return (this.state_ids == null) ? null : this.state_ids.iterator();
  }

  public void addToState_ids(int elem) {
    if (this.state_ids == null) {
      this.state_ids = new ArrayList<Integer>();
    }
    this.state_ids.add(elem);
  }

  public List<Integer> getState_ids() {
    return this.state_ids;
  }

  public QueryTerm setState_ids(List<Integer> state_ids) {
    this.state_ids = state_ids;
    return this;
  }

  public void unsetState_ids() {
    this.state_ids = null;
  }

  /** Returns true if field state_ids is set (has been assigned a value) and false otherwise */
  public boolean isSetState_ids() {
    return this.state_ids != null;
  }

  public void setState_idsIsSet(boolean value) {
    if (!value) {
      this.state_ids = null;
    }
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

    case GRAPH_ID:
      if (value == null) {
        unsetGraph_id();
      } else {
        setGraph_id((Integer)value);
      }
      break;

    case IS_FORWARD:
      if (value == null) {
        unsetIs_forward();
      } else {
        setIs_forward((Boolean)value);
      }
      break;

    case DESTINATION_IDS:
      if (value == null) {
        unsetDestination_ids();
      } else {
        setDestination_ids((ByteBuffer)value);
      }
      break;

    case STATE_IDS:
      if (value == null) {
        unsetState_ids();
      } else {
        setState_ids((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE_ID:
      return Long.valueOf(getSource_id());

    case GRAPH_ID:
      return Integer.valueOf(getGraph_id());

    case IS_FORWARD:
      return Boolean.valueOf(isIs_forward());

    case DESTINATION_IDS:
      return getDestination_ids();

    case STATE_IDS:
      return getState_ids();

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
    case GRAPH_ID:
      return isSetGraph_id();
    case IS_FORWARD:
      return isSetIs_forward();
    case DESTINATION_IDS:
      return isSetDestination_ids();
    case STATE_IDS:
      return isSetState_ids();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryTerm)
      return this.equals((QueryTerm)that);
    return false;
  }

  public boolean equals(QueryTerm that) {
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

    boolean this_present_graph_id = true;
    boolean that_present_graph_id = true;
    if (this_present_graph_id || that_present_graph_id) {
      if (!(this_present_graph_id && that_present_graph_id))
        return false;
      if (this.graph_id != that.graph_id)
        return false;
    }

    boolean this_present_is_forward = true;
    boolean that_present_is_forward = true;
    if (this_present_is_forward || that_present_is_forward) {
      if (!(this_present_is_forward && that_present_is_forward))
        return false;
      if (this.is_forward != that.is_forward)
        return false;
    }

    boolean this_present_destination_ids = true && this.isSetDestination_ids();
    boolean that_present_destination_ids = true && that.isSetDestination_ids();
    if (this_present_destination_ids || that_present_destination_ids) {
      if (!(this_present_destination_ids && that_present_destination_ids))
        return false;
      if (!this.destination_ids.equals(that.destination_ids))
        return false;
    }

    boolean this_present_state_ids = true && this.isSetState_ids();
    boolean that_present_state_ids = true && that.isSetState_ids();
    if (this_present_state_ids || that_present_state_ids) {
      if (!(this_present_state_ids && that_present_state_ids))
        return false;
      if (!this.state_ids.equals(that.state_ids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(QueryTerm other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QueryTerm typedOther = (QueryTerm)other;

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
    lastComparison = Boolean.valueOf(isSetGraph_id()).compareTo(typedOther.isSetGraph_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGraph_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.graph_id, typedOther.graph_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_forward()).compareTo(typedOther.isSetIs_forward());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_forward()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_forward, typedOther.is_forward);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDestination_ids()).compareTo(typedOther.isSetDestination_ids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestination_ids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.destination_ids, typedOther.destination_ids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState_ids()).compareTo(typedOther.isSetState_ids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState_ids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state_ids, typedOther.state_ids);
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
    StringBuilder sb = new StringBuilder("QueryTerm(");
    boolean first = true;

    sb.append("source_id:");
    sb.append(this.source_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("graph_id:");
    sb.append(this.graph_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_forward:");
    sb.append(this.is_forward);
    first = false;
    if (isSetDestination_ids()) {
      if (!first) sb.append(", ");
      sb.append("destination_ids:");
      if (this.destination_ids == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.destination_ids, sb);
      }
      first = false;
    }
    if (isSetState_ids()) {
      if (!first) sb.append(", ");
      sb.append("state_ids:");
      if (this.state_ids == null) {
        sb.append("null");
      } else {
        sb.append(this.state_ids);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QueryTermStandardSchemeFactory implements SchemeFactory {
    public QueryTermStandardScheme getScheme() {
      return new QueryTermStandardScheme();
    }
  }

  private static class QueryTermStandardScheme extends StandardScheme<QueryTerm> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QueryTerm struct) throws org.apache.thrift.TException {
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
          case 2: // GRAPH_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.graph_id = iprot.readI32();
              struct.setGraph_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_FORWARD
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_forward = iprot.readBool();
              struct.setIs_forwardIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DESTINATION_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.destination_ids = iprot.readBinary();
              struct.setDestination_idsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.state_ids = new ArrayList<Integer>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  int _elem2; // required
                  _elem2 = iprot.readI32();
                  struct.state_ids.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setState_idsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QueryTerm struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SOURCE_ID_FIELD_DESC);
      oprot.writeI64(struct.source_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GRAPH_ID_FIELD_DESC);
      oprot.writeI32(struct.graph_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_FORWARD_FIELD_DESC);
      oprot.writeBool(struct.is_forward);
      oprot.writeFieldEnd();
      if (struct.destination_ids != null) {
        if (struct.isSetDestination_ids()) {
          oprot.writeFieldBegin(DESTINATION_IDS_FIELD_DESC);
          oprot.writeBinary(struct.destination_ids);
          oprot.writeFieldEnd();
        }
      }
      if (struct.state_ids != null) {
        if (struct.isSetState_ids()) {
          oprot.writeFieldBegin(STATE_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.state_ids.size()));
            for (int _iter3 : struct.state_ids)
            {
              oprot.writeI32(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryTermTupleSchemeFactory implements SchemeFactory {
    public QueryTermTupleScheme getScheme() {
      return new QueryTermTupleScheme();
    }
  }

  private static class QueryTermTupleScheme extends TupleScheme<QueryTerm> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QueryTerm struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSource_id()) {
        optionals.set(0);
      }
      if (struct.isSetGraph_id()) {
        optionals.set(1);
      }
      if (struct.isSetIs_forward()) {
        optionals.set(2);
      }
      if (struct.isSetDestination_ids()) {
        optionals.set(3);
      }
      if (struct.isSetState_ids()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetSource_id()) {
        oprot.writeI64(struct.source_id);
      }
      if (struct.isSetGraph_id()) {
        oprot.writeI32(struct.graph_id);
      }
      if (struct.isSetIs_forward()) {
        oprot.writeBool(struct.is_forward);
      }
      if (struct.isSetDestination_ids()) {
        oprot.writeBinary(struct.destination_ids);
      }
      if (struct.isSetState_ids()) {
        {
          oprot.writeI32(struct.state_ids.size());
          for (int _iter4 : struct.state_ids)
          {
            oprot.writeI32(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QueryTerm struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.source_id = iprot.readI64();
        struct.setSource_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.graph_id = iprot.readI32();
        struct.setGraph_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.is_forward = iprot.readBool();
        struct.setIs_forwardIsSet(true);
      }
      if (incoming.get(3)) {
        struct.destination_ids = iprot.readBinary();
        struct.setDestination_idsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.state_ids = new ArrayList<Integer>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            int _elem7; // required
            _elem7 = iprot.readI32();
            struct.state_ids.add(_elem7);
          }
        }
        struct.setState_idsIsSet(true);
      }
    }
  }

}

