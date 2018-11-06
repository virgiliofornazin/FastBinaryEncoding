// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import proto.*;

public final class FlagsTyped implements Comparable<FlagsTyped>
{
    public static final FlagsTyped FLAG_VALUE_0 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_0);
    public static final FlagsTyped FLAG_VALUE_1 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_1);
    public static final FlagsTyped FLAG_VALUE_2 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_2);
    public static final FlagsTyped FLAG_VALUE_3 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_3);
    public static final FlagsTyped FLAG_VALUE_4 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_4);
    public static final FlagsTyped FLAG_VALUE_5 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_5);
    public static final FlagsTyped FLAG_VALUE_6 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_6);
    public static final FlagsTyped FLAG_VALUE_7 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_7);
    public static final FlagsTyped FLAG_VALUE_8 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_8);
    public static final FlagsTyped FLAG_VALUE_9 = new FlagsTyped(FlagsTypedEnum.FLAG_VALUE_9);

    private FlagsTypedEnum value = FlagsTypedEnum.values()[0];
    private long flags = value.getRaw();

    public FlagsTyped() {}
    public FlagsTyped(long value) { setEnum(value); }
    public FlagsTyped(FlagsTypedEnum value) { setEnum(value); }
    public FlagsTyped(EnumSet<FlagsTypedEnum> value) { setEnum(value); }
    public FlagsTyped(FlagsTyped value) { setEnum(value); }

    public FlagsTypedEnum getEnum() { return value; }
    public long getRaw() { return flags; }

    public void setDefault() { setEnum((long)0); }

    public void setEnum(long value) { this.flags = value; this.value = FlagsTypedEnum.mapValue(value); }
    public void setEnum(FlagsTypedEnum value) { this.value = value; this.flags = value.getRaw(); }
    public void setEnum(EnumSet<FlagsTypedEnum> value) { setEnum(FlagsTyped.fromSet(value)); }
    public void setEnum(FlagsTyped value) { this.value = value.value; this.flags = value.flags; }

    public boolean hasFlags(long flags) { return (((this.flags & flags) != 0) && ((this.flags & flags) == flags)); }
    public boolean hasFlags(FlagsTypedEnum flags) { return hasFlags(flags.getRaw()); }
    public boolean hasFlags(FlagsTyped flags) { return hasFlags(flags.flags); }

    public FlagsTyped setFlags(long flags) { setEnum((long)(this.flags | flags)); return this; }
    public FlagsTyped setFlags(FlagsTypedEnum flags) { setFlags(flags.getRaw()); return this; }
    public FlagsTyped setFlags(FlagsTyped flags) { setFlags(flags.flags); return this; }

    public FlagsTyped removeFlags(long flags) { setEnum((long)(this.flags & ~flags)); return this; }
    public FlagsTyped removeFlags(FlagsTypedEnum flags) { removeFlags(flags.getRaw()); return this; }
    public FlagsTyped removeFlags(FlagsTyped flags) { removeFlags(flags.flags); return this; }

    public EnumSet<FlagsTypedEnum> getAllSet() { return value.getAllSet(); }
    public EnumSet<FlagsTypedEnum> getNoneSet() { return value.getNoneSet(); }
    public EnumSet<FlagsTypedEnum> getCurrentSet() { return value.getCurrentSet(); }

    public static FlagsTyped fromSet(EnumSet<FlagsTypedEnum> set)
    {
        long result = 0;
        if (set.contains(FLAG_VALUE_0.getEnum()))
        {
            result |= FLAG_VALUE_0.flags;
        }
        if (set.contains(FLAG_VALUE_1.getEnum()))
        {
            result |= FLAG_VALUE_1.flags;
        }
        if (set.contains(FLAG_VALUE_2.getEnum()))
        {
            result |= FLAG_VALUE_2.flags;
        }
        if (set.contains(FLAG_VALUE_3.getEnum()))
        {
            result |= FLAG_VALUE_3.flags;
        }
        if (set.contains(FLAG_VALUE_4.getEnum()))
        {
            result |= FLAG_VALUE_4.flags;
        }
        if (set.contains(FLAG_VALUE_5.getEnum()))
        {
            result |= FLAG_VALUE_5.flags;
        }
        if (set.contains(FLAG_VALUE_6.getEnum()))
        {
            result |= FLAG_VALUE_6.flags;
        }
        if (set.contains(FLAG_VALUE_7.getEnum()))
        {
            result |= FLAG_VALUE_7.flags;
        }
        if (set.contains(FLAG_VALUE_8.getEnum()))
        {
            result |= FLAG_VALUE_8.flags;
        }
        if (set.contains(FLAG_VALUE_9.getEnum()))
        {
            result |= FLAG_VALUE_9.flags;
        }
        return new FlagsTyped(result);
    }

    @Override
    public int compareTo(FlagsTyped other)
    {
        return (int)(flags - other.flags);
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!FlagsTyped.class.isAssignableFrom(other.getClass()))
            return false;

        final FlagsTyped flg = (FlagsTyped)other;

        if (flags != flg.flags)
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + (int)flags;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        boolean first = true;
        if (hasFlags(FLAG_VALUE_0.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_0");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_1.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_1");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_2.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_2");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_3.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_3");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_4.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_4");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_5.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_5");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_6.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_6");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_7.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_7");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_8.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_8");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_9.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_9");
            first = false;
        }
        return sb.toString();
    }
}
