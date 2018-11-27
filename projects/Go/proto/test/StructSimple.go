// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test

import "strings"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// StructSimple key
type StructSimpleKey struct {
    Uid int32
}

// Convert StructSimple flags key to string
func (k StructSimpleKey) String() string {
    var sb strings.Builder
    return sb.String()
}

// StructSimple struct
type StructSimple struct {
    Uid int32 `json:"uid"`
    F1 bool `json:"f1"`
    F2 bool `json:"f2"`
    F3 byte `json:"f3"`
    F4 byte `json:"f4"`
    F5 rune `json:"f5"`
    F6 rune `json:"f6"`
    F7 rune `json:"f7"`
    F8 rune `json:"f8"`
    F9 int8 `json:"f9"`
    F10 int8 `json:"f10"`
    F11 uint8 `json:"f11"`
    F12 uint8 `json:"f12"`
    F13 int16 `json:"f13"`
    F14 int16 `json:"f14"`
    F15 uint16 `json:"f15"`
    F16 uint16 `json:"f16"`
    F17 int32 `json:"f17"`
    F18 int32 `json:"f18"`
    F19 uint32 `json:"f19"`
    F20 uint32 `json:"f20"`
    F21 int64 `json:"f21"`
    F22 int64 `json:"f22"`
    F23 uint64 `json:"f23"`
    F24 uint64 `json:"f24"`
    F25 float32 `json:"f25"`
    F26 float32 `json:"f26"`
    F27 float64 `json:"f27"`
    F28 float64 `json:"f28"`
    F29 fbe.Decimal `json:"f29"`
    F30 fbe.Decimal `json:"f30"`
    F31 string `json:"f31"`
    F32 string `json:"f32"`
    F33 fbe.Timestamp `json:"f33"`
    F34 fbe.Timestamp `json:"f34"`
    F35 fbe.Timestamp `json:"f35"`
    F36 fbe.UUID `json:"f36"`
    F37 fbe.UUID `json:"f37"`
    F38 fbe.UUID `json:"f38"`
    F39 proto.OrderSide `json:"f39"`
    F40 proto.OrderType `json:"f40"`
    F41 proto.Order `json:"f41"`
    F42 proto.Balance `json:"f42"`
    F43 proto.State `json:"f43"`
    F44 proto.Account `json:"f44"`
}

// Create a new StructSimple struct
func NewStructSimple() *StructSimple {
    return &StructSimple{
        Uid: 0,
        F1: false,
        F2: true,
        F3: 0,
        F4: byte(255),
        F5: '\000',
        F6: '!',
        F7: '\000',
        F8: rune(0x0444),
        F9: 0,
        F10: int8(127),
        F11: 0,
        F12: uint8(255),
        F13: 0,
        F14: int16(32767),
        F15: 0,
        F16: uint16(65535),
        F17: 0,
        F18: int32(2147483647),
        F19: 0,
        F20: uint32(0xFFFFFFFF),
        F21: 0,
        F22: int64(9223372036854775807),
        F23: 0,
        F24: uint64(0xFFFFFFFFFFFFFFFF),
        F25: 0.0,
        F26: float32(123.456),
        F27: 0.0,
        F28: float64(-123.456e+123),
        F29: fbe.DecimalZero(),
        F30: fbe.DecimalFromString("123456.123456"),
        F31: "",
        F32: "Initial string!",
        F33: fbe.TimestampEpoch(),
        F34: fbe.TimestampEpoch(),
        F35: fbe.TimestampUTC(),
        F36: fbe.UUIDNil(),
        F37: fbe.UUIDSequential(),
        F38: fbe.UUIDFromString("123e4567-e89b-12d3-a456-426655440000"),
        F39: *proto.NewOrderSide(),
        F40: *proto.NewOrderType(),
        F41: *proto.NewOrder(),
        F42: *proto.NewBalance(),
        F43: *proto.NewState(),
        F44: *proto.NewAccount(),
    }
}

// Create a new StructSimple struct from JSON
func NewStructSimpleFromJSON(buffer []byte) (*StructSimple, error) {
    result := *NewStructSimple()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s StructSimple) Copy() *StructSimple {
    var result = s
    return &result
}

// Struct deep clone
func (s StructSimple) Clone() *StructSimple {
    var result = s
    return &result
}

// Get the struct key
func (s StructSimple) Key() StructSimpleKey {
    return StructSimpleKey{
        Uid: s.Uid,
    }
}

// Convert struct to optional
func (s StructSimple) Optional() *StructSimple {
    return &s
}

// Convert struct to string
func (s StructSimple) String() string {
    var sb strings.Builder
    return sb.String()
}

// Convert struct to JSON
func (s StructSimple) JSON() ([]byte, error) {
    return fbe.Json.Marshal(&s)
}
