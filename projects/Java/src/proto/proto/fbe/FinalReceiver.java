// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package proto.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

import fbe.*;
import proto.*;

// Fast Binary Encoding proto final receiver class
public class FinalReceiver extends fbe.Receiver
{
    // Receiver values accessors
    private final proto.Order OrderValue;
    private final proto.Balance BalanceValue;
    private final proto.Account AccountValue;

    // Receiver models accessors
    private final OrderFinalModel OrderModel;
    private final BalanceFinalModel BalanceModel;
    private final AccountFinalModel AccountModel;

    public FinalReceiver()
    {
        setFinal(true);
        OrderValue = new proto.Order();
        OrderModel = new OrderFinalModel();
        BalanceValue = new proto.Balance();
        BalanceModel = new BalanceFinalModel();
        AccountValue = new proto.Account();
        AccountModel = new AccountFinalModel();
    }
    public FinalReceiver(Buffer buffer)
    {
        super(buffer);
        setFinal(true);
        OrderValue = new proto.Order();
        OrderModel = new OrderFinalModel();
        BalanceValue = new proto.Balance();
        BalanceModel = new BalanceFinalModel();
        AccountValue = new proto.Account();
        AccountModel = new AccountFinalModel();
    }

    // Receive handlers
    protected void onReceive(proto.Order value) {}
    protected void onReceive(proto.Balance value) {}
    protected void onReceive(proto.Account value) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case 1:
            {
                // Deserialize the value from the FBE stream
                OrderModel.attach(buffer, offset);
                assert OrderModel.verify() : "proto.Order validation failed!";
                long deserialized = OrderModel.deserialize(OrderValue);
                assert (deserialized > 0) : "proto.Order deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = OrderValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(OrderValue);
                return true;
            }
            case 2:
            {
                // Deserialize the value from the FBE stream
                BalanceModel.attach(buffer, offset);
                assert BalanceModel.verify() : "proto.Balance validation failed!";
                long deserialized = BalanceModel.deserialize(BalanceValue);
                assert (deserialized > 0) : "proto.Balance deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = BalanceValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(BalanceValue);
                return true;
            }
            case 3:
            {
                // Deserialize the value from the FBE stream
                AccountModel.attach(buffer, offset);
                assert AccountModel.verify() : "proto.Account validation failed!";
                long deserialized = AccountModel.deserialize(AccountValue);
                assert (deserialized > 0) : "proto.Account deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = AccountValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(AccountValue);
                return true;
            }
        }

        return false;
    }
}