// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.1.0.0

@file:Suppress("UnusedImport", "unused")

package protoex

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class OrderSide : Comparable<OrderSide>
{
    companion object
    {
        val buy = OrderSide(OrderSideEnum.buy)
        val sell = OrderSide(OrderSideEnum.sell)
        val tell = OrderSide(OrderSideEnum.tell)
    }

    var value: OrderSideEnum? = OrderSideEnum.values()[0]
        private set

    val raw: Byte
        get() = value!!.raw

    constructor()
    constructor(value: Byte) { setEnum(value) }
    constructor(value: OrderSideEnum) { setEnum(value) }
    constructor(value: OrderSide) { setEnum(value) }

    fun setDefault() { setEnum(0.toByte()) }

    fun setEnum(value: Byte) { this.value = OrderSideEnum.mapValue(value) }
    fun setEnum(value: OrderSideEnum) { this.value = value }
    fun setEnum(value: OrderSide) { this.value = value.value }

    override fun compareTo(other: OrderSide): Int
    {
        if (value == null)
            return -1
        if (other.value == null)
            return 1
        return (value!!.raw - other.value!!.raw).toInt()
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!OrderSide::class.java.isAssignableFrom(other.javaClass))
            return false

        val enm = other as OrderSide? ?: return false

        if (enm.value == null)
            return false
        if (value!!.raw != enm.value!!.raw)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        var hash = 17
        hash = hash * 31 + if (value != null) value!!.hashCode() else 0
        return hash
    }

    override fun toString(): String
    {
        return if (value != null) value!!.toString() else "<unknown>"
    }
}
