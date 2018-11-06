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

// Fast Binary Encoding enums receiver class
@Suppress("MemberVisibilityCanBePrivate", "PrivatePropertyName", "UNUSED_PARAMETER")
open class Receiver : fbe.Receiver
{
    // Receiver values accessors
    private val EnumsValue: enums.Enums

    // Receiver models accessors
    private val EnumsModel: EnumsModel

    constructor()
    {
        EnumsValue = enums.Enums()
        EnumsModel = EnumsModel()
    }

    constructor(buffer: Buffer) : super(buffer)
    {
        EnumsValue = enums.Enums()
        EnumsModel = EnumsModel()
    }

    // Receive handlers
    protected open fun onReceive(value: enums.Enums) {}

    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        when (type)
        {
            enums.fbe.EnumsModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                EnumsModel.attach(buffer, offset)
                assert(EnumsModel.verify()) { "enums.Enums validation failed!" }
                val deserialized = EnumsModel.deserialize(EnumsValue)
                assert(deserialized > 0) { "enums.Enums deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = EnumsValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                onReceive(EnumsValue)
                return true
            }
        }

        return false
    }
}
