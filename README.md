# Java Socket Programming - DNS Resolution & Simple Network Server

## Overview

This project demonstrates fundamental socket programming in Java, executed within a Linux environment. It includes:

- Resolving domain names to IPv4 addresses.
- Reverse-resolving IPv4 addresses to hostnames.
- Creating a basic client-server interaction using TCP sockets.

## Requirements

- Java Development Kit (JDK)
- Linux environment (or equivalent terminal for compiling/running Java)
- Basic terminal tools: `javac`, `java`, `gedit` or any text editor

## Files

- `resolve.java`: Resolves domain names to IPv4 addresses.
- `reverse.java`: Resolves IPv4 addresses to domain names.
- `SimpleServer.java`: TCP server that greets connecting clients.
- `SimpleClient.java`: TCP client that connects to the server and prints the greeting.

## Compilation

```bash
javac *.java
```

### Domain to IP Resolution

```bash
java resolve <domain1> <domain2> ... <domainN>
```

Example:
```bash
java resolve www.google.com www.facebook.com
```

### IP to Hostname Resolution

```bash
java reverse <ip1> <ip2> ... <ipN>
```

Example:
```bash
java reverse 130.217.250.39 127.0.0.2
```

### Running the Server

```bash
java SimpleServer
```

The server will output the port it is listening on.

### Running the Client

```bash
java SimpleClient <hostname> <port>
```

Example:
```bash
java SimpleClient localhost 31446
```
