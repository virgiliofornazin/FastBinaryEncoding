// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding StructSet final model class
public final class FinalModelStructSet extends FinalModel
{
    public final FinalModelVectorByte f1;
    public final FinalModelVectorEnumSimple f2;
    public final FinalModelVectorFlagsSimple f3;
    public final FinalModelVectorStructSimple f4;

    public FinalModelStructSet(Buffer buffer, long offset)
    {
        super(buffer, offset);
        f1 = new FinalModelVectorByte(buffer, 0);
        f2 = new FinalModelVectorEnumSimple(buffer, 0);
        f3 = new FinalModelVectorFlagsSimple(buffer, 0);
        f4 = new FinalModelVectorStructSimple(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(StructSet fbeValue)
    {
        long fbeResult = 0
            + f1.fbeAllocationSize(fbeValue.f1)
            + f2.fbeAllocationSize(fbeValue.f2)
            + f3.fbeAllocationSize(fbeValue.f3)
            + f4.fbeAllocationSize(fbeValue.f4)
            ;
        return fbeResult;
    }

    // Get the field type
    public static final long fbeTypeConst = 132;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        f1.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f1.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f2.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f2.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f3.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f3.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f4.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f4.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public StructSet get(Size fbeSize) { return get(fbeSize, new StructSet()); }
    public StructSet get(Size fbeSize, StructSet fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(StructSet fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        f1.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1.get(fbeValue.f1);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f2.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f2.get(fbeValue.f2);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f3.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f3.get(fbeValue.f3);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f4.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f4.get(fbeValue.f4);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(StructSet fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(StructSet fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        f1.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1.set(fbeValue.f1);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f2.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f2.set(fbeValue.f2);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f3.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f3.set(fbeValue.f3);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f4.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f4.set(fbeValue.f4);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
