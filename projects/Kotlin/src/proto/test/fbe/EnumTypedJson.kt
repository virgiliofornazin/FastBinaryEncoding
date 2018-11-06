// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

@file:Suppress("UnusedImport", "unused")

package test.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import test.*

import com.google.gson.*

class EnumTypedJson : JsonSerializer<EnumTyped>, JsonDeserializer<EnumTyped>
{
    override fun serialize(src: EnumTyped, typeOfSrc: Type, context: JsonSerializationContext): JsonElement
    {
        return JsonPrimitive(src.raw)
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, type: Type, context: JsonDeserializationContext): EnumTyped
    {
        return EnumTyped(json.asJsonPrimitive.asByte)
    }
}
