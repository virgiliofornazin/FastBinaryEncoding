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

public class StructSet implements Comparable<Object>
{
    public HashSet<Byte> f1 = new HashSet<Byte>();
    public HashSet<EnumSimple> f2 = new HashSet<EnumSimple>();
    public HashSet<FlagsSimple> f3 = new HashSet<FlagsSimple>();
    public HashSet<StructSimple> f4 = new HashSet<StructSimple>();

    public StructSet() {}

    public StructSet(HashSet<Byte> f1, HashSet<EnumSimple> f2, HashSet<FlagsSimple> f3, HashSet<StructSimple> f4)
    {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
    }

    public StructSet(StructSet other)
    {
        this.f1 = other.f1;
        this.f2 = other.f2;
        this.f3 = other.f3;
        this.f4 = other.f4;
    }

    public StructSet clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new test.fbe.StructSetModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new test.fbe.StructSetModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!StructSet.class.isAssignableFrom(other.getClass()))
            return -1;

        final StructSet obj = (StructSet)other;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!StructSet.class.isAssignableFrom(other.getClass()))
            return false;

        final StructSet obj = (StructSet)other;

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("StructSet(");
        if (f1 != null)
        {
            boolean first = true;
            sb.append("f1=[").append(f1.size()).append("]{");
            for (var item : f1)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("}");
        }
        if (f2 != null)
        {
            boolean first = true;
            sb.append(",f2=[").append(f2.size()).append("]{");
            for (var item : f2)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("}");
        }
        if (f3 != null)
        {
            boolean first = true;
            sb.append(",f3=[").append(f3.size()).append("]{");
            for (var item : f3)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("}");
        }
        if (f4 != null)
        {
            boolean first = true;
            sb.append(",f4=[").append(f4.size()).append("]{");
            for (var item : f4)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("}");
        }
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return test.fbe.Json.getEngine().toJson(this); }
    public static StructSet fromJson(String json) { return test.fbe.Json.getEngine().fromJson(json, StructSet.class); }
}
