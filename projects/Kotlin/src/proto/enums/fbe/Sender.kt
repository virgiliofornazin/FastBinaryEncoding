// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.1.0.0

@file:Suppress("UnusedImport", "unused")

package enums.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import enums.*

// Fast Binary Encoding enums sender class
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class Sender : fbe.Sender
{
    // Sender models accessors
    val EnumsModel: EnumsModel

    constructor()
    {
        EnumsModel = EnumsModel(buffer)
    }

    constructor(buffer: Buffer) : super(buffer)
    {
        EnumsModel = EnumsModel(buffer)
    }

    fun send(value: enums.Enums): Long
    {
        // Serialize the value into the FBE stream
        val serialized = EnumsModel.serialize(value)
        assert(serialized > 0) { "enums.Enums serialization failed!" }
        assert(EnumsModel.verify()) { "enums.Enums validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }

    // Send message handler
    override fun onSend(buffer: ByteArray, offset: Long, size: Long): Long { throw UnsupportedOperationException("enums.fbe.Sender.onSend() not implemented!") }
}
