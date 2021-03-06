// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.duration



@SerialVersionUID(0L)
final case class Duration(
    seconds: Long = 0L,
    nanos: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Duration] with com.trueaccord.lenses.Updatable[Duration] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (seconds != 0L) { __size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, seconds) }
      if (nanos != 0) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, nanos) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = seconds
        if (__v != 0L) {
          _output__.writeInt64(1, __v)
        }
      };
      {
        val __v = nanos
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.duration.Duration = {
      var __seconds = this.seconds
      var __nanos = this.nanos
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __seconds = _input__.readInt64()
          case 16 =>
            __nanos = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.duration.Duration(
          seconds = __seconds,
          nanos = __nanos
      )
    }
    def withSeconds(__v: Long): Duration = copy(seconds = __v)
    def withNanos(__v: Int): Duration = copy(nanos = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = seconds
          if (__t != 0L) __t else null
        }
        case 2 => {
          val __t = nanos
          if (__t != 0) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.duration.Duration
}

object Duration extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.duration.Duration] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.duration.Duration] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.duration.Duration = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.duration.Duration(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[Long],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = DurationProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.duration.Duration(
  )
  implicit class DurationLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.duration.Duration]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.duration.Duration](_l) {
    def seconds: com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.seconds)((c_, f_) => c_.copy(seconds = f_))
    def nanos: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.nanos)((c_, f_) => c_.copy(nanos = f_))
  }
  final val SECONDS_FIELD_NUMBER = 1
  final val NANOS_FIELD_NUMBER = 2
}
