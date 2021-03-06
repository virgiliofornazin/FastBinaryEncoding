// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "test_models.h"

#include "proto_protocol.h"

namespace FBE {
namespace test {

// Fast Binary Encoding test protocol version
struct ProtocolVersion
{
    // Protocol major version
    static const int major = 123;
    // Protocol minor version
    static const int minor = 456;
};

} // namespace test
} // namespace FBE

namespace FBE {
namespace test {

// Fast Binary Encoding test sender
template <class TBuffer>
class Sender : public virtual FBE::Sender<TBuffer>
    , public virtual proto::Sender<TBuffer>
{
public:
    Sender()
    {}
    Sender(const Sender&) = default;
    Sender(Sender&&) noexcept = default;
    virtual ~Sender() = default;

    Sender& operator=(const Sender&) = default;
    Sender& operator=(Sender&&) noexcept = default;

    // Imported senders
    proto::Sender<TBuffer>& proto_sender() noexcept { return *this; }

public:
    // Sender models accessors
};

} // namespace test
} // namespace FBE

namespace FBE {
namespace test {

// Fast Binary Encoding test receiver
template <class TBuffer>
class Receiver : public virtual FBE::Receiver<TBuffer>
    , public virtual proto::Receiver<TBuffer>
{
public:
    Receiver() {}
    Receiver(const Receiver&) = default;
    Receiver(Receiver&&) = default;
    virtual ~Receiver() = default;

    Receiver& operator=(const Receiver&) = default;
    Receiver& operator=(Receiver&&) = default;

protected:
    // Receive handlers

    // Receive message handler
    bool onReceive(size_t type, const void* data, size_t size) override
    {
        switch (type)
        {
            default: break;
        }

        if (proto::Receiver<TBuffer>::onReceive(type, data, size))
            return true;

        return false;
    }

private:
    // Receiver values accessors

    // Receiver models accessors
};

} // namespace test
} // namespace FBE

namespace FBE {
namespace test {

// Fast Binary Encoding test proxy
template <class TBuffer>
class Proxy : public virtual FBE::Receiver<TBuffer>
    , public virtual proto::Proxy<TBuffer>
{
public:
    Proxy() {}
    Proxy(const Proxy&) = default;
    Proxy(Proxy&&) = default;
    virtual ~Proxy() = default;

    Proxy& operator=(const Proxy&) = default;
    Proxy& operator=(Proxy&&) = default;

protected:
    // Proxy handlers

    // Receive message handler
    bool onReceive(size_t type, const void* data, size_t size) override
    {
        switch (type)
        {
            default: break;
        }

        if (proto::Proxy<TBuffer>::onReceive(type, data, size))
            return true;

        return false;
    }

private:
    // Proxy models accessors
};

} // namespace test
} // namespace FBE

namespace FBE {
namespace test {

// Fast Binary Encoding test client
template <class TBuffer>
class Client : public virtual Sender<TBuffer>, protected virtual Receiver<TBuffer>
    , public virtual proto::Client<TBuffer>
{
public:
    typedef proto::Client<TBuffer> protoClient;

    Client() = default;
    Client(const Client&) = default;
    Client(Client&&) = default;
    virtual ~Client() = default;

    Client& operator=(const Client&) = default;
    Client& operator=(Client&&) = default;

    // Imported clients
    proto::Client<TBuffer>& proto_client() noexcept { return *this; }

    // Reset client buffers
    void reset()
    {
        std::scoped_lock locker(this->_lock);
        reset_requests();
    }

    // Watchdog for timeouts
    void watchdog(uint64_t utc)
    {
        std::scoped_lock locker(this->_lock);
        watchdog_requests(utc);
    }

protected:
    // Reset client requests
    virtual void reset_requests()
    {
        proto::Client<TBuffer>::reset_requests();
    }

    // Watchdog client requests for timeouts
    virtual void watchdog_requests(uint64_t utc)
    {
        proto::Client<TBuffer>::watchdog_requests(utc);

    }
};

} // namespace test
} // namespace FBE

namespace FBE {
namespace test {

// Fast Binary Encoding test final sender
template <class TBuffer>
class FinalSender : public virtual FBE::Sender<TBuffer>
    , public virtual proto::FinalSender<TBuffer>
{
public:
    FinalSender()
    { this->final(true); }
    FinalSender(const FinalSender&) = default;
    FinalSender(FinalSender&&) noexcept = default;
    virtual ~FinalSender() = default;

    FinalSender& operator=(const FinalSender&) = default;
    FinalSender& operator=(FinalSender&&) noexcept = default;

    // Imported senders
    proto::FinalSender<TBuffer>& proto_sender() noexcept { return *this; }

public:
    // Sender models accessors
};

} // namespace test
} // namespace FBE

namespace FBE {
namespace test {

// Fast Binary Encoding test final receiver
template <class TBuffer>
class FinalReceiver : public virtual FBE::Receiver<TBuffer>
    , public virtual proto::FinalReceiver<TBuffer>
{
public:
    FinalReceiver() { this->final(true); }
    FinalReceiver(const FinalReceiver&) = default;
    FinalReceiver(FinalReceiver&&) = default;
    virtual ~FinalReceiver() = default;

    FinalReceiver& operator=(const FinalReceiver&) = default;
    FinalReceiver& operator=(FinalReceiver&&) = default;

protected:
    // Receive handlers

    // Receive message handler
    bool onReceive(size_t type, const void* data, size_t size) override
    {
        switch (type)
        {
            default: break;
        }

        if (proto::FinalReceiver<TBuffer>::onReceive(type, data, size))
            return true;

        return false;
    }

private:
    // Receiver values accessors

    // Receiver models accessors
};

} // namespace test
} // namespace FBE

namespace FBE {
namespace test {

// Fast Binary Encoding test final client
template <class TBuffer>
class FinalClient : public virtual FinalSender<TBuffer>, protected virtual FinalReceiver<TBuffer>
    , public virtual proto::FinalClient<TBuffer>
{
public:
    typedef proto::FinalClient<TBuffer> protoFinalClient;

    FinalClient() = default;
    FinalClient(const FinalClient&) = default;
    FinalClient(FinalClient&&) = default;
    virtual ~FinalClient() = default;

    FinalClient& operator=(const FinalClient&) = default;
    FinalClient& operator=(FinalClient&&) = default;

    // Imported clients
    proto::FinalClient<TBuffer>& proto_client() noexcept { return *this; }

    // Reset client buffers
    void reset()
    {
        std::scoped_lock locker(this->_lock);
        reset_requests();
    }

    // Watchdog for timeouts
    void watchdog(uint64_t utc)
    {
        std::scoped_lock locker(this->_lock);
        watchdog_requests(utc);
    }

protected:
    // Reset client requests
    virtual void reset_requests()
    {
        proto::FinalClient<TBuffer>::reset_requests();
    }

    // Watchdog client requests for timeouts
    virtual void watchdog_requests(uint64_t utc)
    {
        proto::FinalClient<TBuffer>::watchdog_requests(utc);

    }
};

} // namespace test
} // namespace FBE
