// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.1.0.0

package enums.fbe;;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import enums.*;

import com.google.gson.*;

public final class EnumCharJson implements JsonSerializer<EnumChar>, JsonDeserializer<EnumChar>
{
    @Override
    public JsonElement serialize(EnumChar src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive(src.getRaw());
    }

    @Override
    public EnumChar deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        return new EnumChar(json.getAsJsonPrimitive().getAsByte());
    }
}
