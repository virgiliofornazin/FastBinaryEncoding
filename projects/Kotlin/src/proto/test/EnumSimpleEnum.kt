// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

@file:Suppress("UnusedImport", "unused")

package test

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class EnumSimpleEnum
{
    ENUM_VALUE_0(0 + 0)
    , ENUM_VALUE_1(1 + 0)
    , ENUM_VALUE_2(1 + 1)
    , ENUM_VALUE_3(3 + 0)
    , ENUM_VALUE_4(0x4 + 0)
    , ENUM_VALUE_5(ENUM_VALUE_3.raw)
    ;

    var raw: Int = 0
        private set

    constructor(value: Byte) { this.raw = value.toInt() }
    constructor(value: Short) { this.raw = value.toInt() }
    constructor(value: Int) { this.raw = value.toInt() }
    constructor(value: Long) { this.raw = value.toInt() }
    constructor(value: EnumSimpleEnum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0"
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1"
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2"
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3"
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4"
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = HashMap<Int, EnumSimpleEnum>()

        init
        {
            for (value in EnumSimpleEnum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Int): EnumSimpleEnum? { return mapping[value] }
    }
}
