// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.1.0.0

package protoex

import "strings"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// Balance key
type BalanceKey struct {
    proto.BalanceKey
}

// Convert Balance flags key to string
func (k BalanceKey) String() string {
    var sb strings.Builder
    return sb.String()
}

// Balance struct
type Balance struct {
    proto.Balance
    Locked float64 `json:"locked"`
}

// Create a new Balance struct
func NewBalance() *Balance {
    return &Balance{
        Balance: *proto.NewBalance(),
        Locked: float64(0.0),
    }
}

// Create a new Balance struct from JSON
func NewBalanceFromJSON(buffer []byte) (*Balance, error) {
    result := *NewBalance()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s Balance) Copy() *Balance {
    var result = s
    return &result
}

// Struct deep clone
func (s Balance) Clone() *Balance {
    var result = s
    return &result
}

// Get the struct key
func (s Balance) Key() BalanceKey {
    return BalanceKey{
        s.Balance.Key(),
    }
}

// Convert struct to optional
func (s Balance) Optional() *Balance {
    return &s
}

// Convert struct to string
func (s Balance) String() string {
    var sb strings.Builder
    return sb.String()
}

// Convert struct to JSON
func (s Balance) JSON() ([]byte, error) {
    return fbe.Json.Marshal(&s)
}
