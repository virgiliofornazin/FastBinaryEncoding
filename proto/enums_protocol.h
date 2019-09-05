// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "enums_models.h"

namespace FBE {
namespace enums {

// Fast Binary Encoding enums protocol version
struct ProtocolVersion
{
    // Protocol major version
    static const int major = 0;
    // Protocol minor version
    static const int minor = 0;
};

} // namespace enums
} // namespace FBE

namespace FBE {
namespace enums {

// Fast Binary Encoding enums sender
template <class TBuffer>
class Sender : public virtual FBE::Sender<TBuffer>
{
public:
    Sender()
    {}
    Sender(const Sender&) = default;
    Sender(Sender&&) noexcept = default;
    virtual ~Sender() = default;

    Sender& operator=(const Sender&) = default;
    Sender& operator=(Sender&&) noexcept = default;

public:
    // Sender models accessors
};

} // namespace enums
} // namespace FBE

namespace FBE {
namespace enums {

// Fast Binary Encoding enums receiver
template <class TBuffer>
class Receiver : public virtual FBE::Receiver<TBuffer>
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

        return false;
    }

private:
    // Receiver values accessors

    // Receiver models accessors
};

} // namespace enums
} // namespace FBE

namespace FBE {
namespace enums {

// Fast Binary Encoding enums proxy
template <class TBuffer>
class Proxy : public virtual FBE::Receiver<TBuffer>
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

        return false;
    }

private:
    // Proxy models accessors
};

} // namespace enums
} // namespace FBE

namespace FBE {
namespace enums {

// Fast Binary Encoding enums client
template <class TBuffer>
class Client : public virtual Sender<TBuffer>, protected virtual Receiver<TBuffer>
{
public:
    Client() = default;
    Client(const Client&) = default;
    Client(Client&&) = default;
    virtual ~Client() = default;

    Client& operator=(const Client&) = default;
    Client& operator=(Client&&) = default;

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
    std::mutex _lock;
    uint64_t _timestamp{0};

    // Reset client requests
    virtual void reset_requests()
    {
        Sender<TBuffer>::reset();
        Receiver<TBuffer>::reset();
    }

    // Watchdog client requests for timeouts
    virtual void watchdog_requests(uint64_t utc)
    {
    }
};

} // namespace enums
} // namespace FBE

namespace FBE {
namespace enums {

// Fast Binary Encoding enums final sender
template <class TBuffer>
class FinalSender : public virtual FBE::Sender<TBuffer>
{
public:
    FinalSender()
    { this->final(true); }
    FinalSender(const FinalSender&) = default;
    FinalSender(FinalSender&&) noexcept = default;
    virtual ~FinalSender() = default;

    FinalSender& operator=(const FinalSender&) = default;
    FinalSender& operator=(FinalSender&&) noexcept = default;

public:
    // Sender models accessors
};

} // namespace enums
} // namespace FBE

namespace FBE {
namespace enums {

// Fast Binary Encoding enums final receiver
template <class TBuffer>
class FinalReceiver : public virtual FBE::Receiver<TBuffer>
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

        return false;
    }

private:
    // Receiver values accessors

    // Receiver models accessors
};

} // namespace enums
} // namespace FBE

namespace FBE {
namespace enums {

// Fast Binary Encoding enums final client
template <class TBuffer>
class FinalClient : public virtual FinalSender<TBuffer>, protected virtual FinalReceiver<TBuffer>
{
public:
    FinalClient() = default;
    FinalClient(const FinalClient&) = default;
    FinalClient(FinalClient&&) = default;
    virtual ~FinalClient() = default;

    FinalClient& operator=(const FinalClient&) = default;
    FinalClient& operator=(FinalClient&&) = default;

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
    std::mutex _lock;
    uint64_t _timestamp{0};

    // Reset client requests
    virtual void reset_requests()
    {
        Sender<TBuffer>::reset();
        Receiver<TBuffer>::reset();
    }

    // Watchdog client requests for timeouts
    virtual void watchdog_requests(uint64_t utc)
    {
    }
};

} // namespace enums
} // namespace FBE