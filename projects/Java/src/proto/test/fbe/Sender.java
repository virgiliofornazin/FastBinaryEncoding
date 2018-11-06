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

// Fast Binary Encoding test sender class
public class Sender extends fbe.Sender
{
    // Imported senders
    public final proto.fbe.Sender protoSender;

    // Sender models accessors
    public final StructSimpleModel StructSimpleModel;
    public final StructOptionalModel StructOptionalModel;
    public final StructNestedModel StructNestedModel;
    public final StructBytesModel StructBytesModel;
    public final StructArrayModel StructArrayModel;
    public final StructVectorModel StructVectorModel;
    public final StructListModel StructListModel;
    public final StructSetModel StructSetModel;
    public final StructMapModel StructMapModel;
    public final StructHashModel StructHashModel;
    public final StructHashExModel StructHashExModel;

    public Sender()
    {
        protoSender = new proto.fbe.Sender(getBuffer());
        StructSimpleModel = new StructSimpleModel(getBuffer());
        StructOptionalModel = new StructOptionalModel(getBuffer());
        StructNestedModel = new StructNestedModel(getBuffer());
        StructBytesModel = new StructBytesModel(getBuffer());
        StructArrayModel = new StructArrayModel(getBuffer());
        StructVectorModel = new StructVectorModel(getBuffer());
        StructListModel = new StructListModel(getBuffer());
        StructSetModel = new StructSetModel(getBuffer());
        StructMapModel = new StructMapModel(getBuffer());
        StructHashModel = new StructHashModel(getBuffer());
        StructHashExModel = new StructHashExModel(getBuffer());
    }
    public Sender(Buffer buffer)
    {
        super(buffer);
        protoSender = new proto.fbe.Sender(getBuffer());
        StructSimpleModel = new StructSimpleModel(getBuffer());
        StructOptionalModel = new StructOptionalModel(getBuffer());
        StructNestedModel = new StructNestedModel(getBuffer());
        StructBytesModel = new StructBytesModel(getBuffer());
        StructArrayModel = new StructArrayModel(getBuffer());
        StructVectorModel = new StructVectorModel(getBuffer());
        StructListModel = new StructListModel(getBuffer());
        StructSetModel = new StructSetModel(getBuffer());
        StructMapModel = new StructMapModel(getBuffer());
        StructHashModel = new StructHashModel(getBuffer());
        StructHashExModel = new StructHashExModel(getBuffer());
    }

    public long send(test.StructSimple value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructSimpleModel.serialize(value);
        assert (serialized > 0) : "test.StructSimple serialization failed!";
        assert StructSimpleModel.verify() : "test.StructSimple validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructOptional value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructOptionalModel.serialize(value);
        assert (serialized > 0) : "test.StructOptional serialization failed!";
        assert StructOptionalModel.verify() : "test.StructOptional validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructNested value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructNestedModel.serialize(value);
        assert (serialized > 0) : "test.StructNested serialization failed!";
        assert StructNestedModel.verify() : "test.StructNested validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructBytes value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructBytesModel.serialize(value);
        assert (serialized > 0) : "test.StructBytes serialization failed!";
        assert StructBytesModel.verify() : "test.StructBytes validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructArray value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructArrayModel.serialize(value);
        assert (serialized > 0) : "test.StructArray serialization failed!";
        assert StructArrayModel.verify() : "test.StructArray validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructVector value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructVectorModel.serialize(value);
        assert (serialized > 0) : "test.StructVector serialization failed!";
        assert StructVectorModel.verify() : "test.StructVector validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructList value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructListModel.serialize(value);
        assert (serialized > 0) : "test.StructList serialization failed!";
        assert StructListModel.verify() : "test.StructList validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructSet value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructSetModel.serialize(value);
        assert (serialized > 0) : "test.StructSet serialization failed!";
        assert StructSetModel.verify() : "test.StructSet validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructMap value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructMapModel.serialize(value);
        assert (serialized > 0) : "test.StructMap serialization failed!";
        assert StructMapModel.verify() : "test.StructMap validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructHash value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructHashModel.serialize(value);
        assert (serialized > 0) : "test.StructHash serialization failed!";
        assert StructHashModel.verify() : "test.StructHash validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructHashEx value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructHashExModel.serialize(value);
        assert (serialized > 0) : "test.StructHashEx serialization failed!";
        assert StructHashExModel.verify() : "test.StructHashEx validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }

    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("test.fbe.Sender.onSend() not implemented!"); }
}
