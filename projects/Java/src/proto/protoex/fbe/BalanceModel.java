// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.1.0.0

package protoex.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import protoex.*;

// Fast Binary Encoding Balance model class
public final class BalanceModel extends Model
{
    public final FieldModelBalance model;

    public BalanceModel() { model = new FieldModelBalance(getBuffer(), 4); }
    public BalanceModel(Buffer buffer) { super(buffer); model = new FieldModelBalance(getBuffer(), 4); }

    // Get the model size
    public long fbeSize() { return model.fbeSize() + model.fbeExtra(); }
    // Get the model type
    public static final long fbeTypeConst = FieldModelBalance.fbeTypeConst;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    public boolean verify()
    {
        if ((getBuffer().getOffset() + model.fbeOffset() - 4) > getBuffer().getSize())
            return false;

        int fbeFullSize = readInt32(model.fbeOffset() - 4);
        if (fbeFullSize < model.fbeSize())
            return false;

        return model.verify();
    }

    // Create a new model (begin phase)
    public long createBegin()
    {
        long fbeBegin = getBuffer().allocate(4 + model.fbeSize());
        return fbeBegin;
    }

    // Create a new model (end phase)
    public long createEnd(long fbeBegin)
    {
        long fbeEnd = getBuffer().getSize();
        int fbeFullSize = (int)(fbeEnd - fbeBegin);
        write(model.fbeOffset() - 4, fbeFullSize);
        return fbeFullSize;
    }

    // Serialize the struct value
    public long serialize(Balance value)
    {
        long fbeBegin = createBegin();
        model.set(value);
        long fbeFullSize = createEnd(fbeBegin);
        return fbeFullSize;
    }

    // Deserialize the struct value
    public Balance deserialize() { var value = new Balance(); deserialize(value); return value; }
    public long deserialize(Balance value)
    {
        if ((getBuffer().getOffset() + model.fbeOffset() - 4) > getBuffer().getSize())
        {
            value = new Balance();
            return 0;
        }

        int fbeFullSize = readInt32(model.fbeOffset() - 4);
        assert (fbeFullSize >= model.fbeSize()) : "Model is broken!";
        if (fbeFullSize < model.fbeSize())
        {
            value = new Balance();
            return 0;
        }

        value = model.get(value);
        return fbeFullSize;
    }

    // Move to the next struct value
    public void next(long prev)
    {
        model.fbeShift(prev);
    }
}
