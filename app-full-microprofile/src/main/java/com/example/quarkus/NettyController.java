package com.example.quarkus;

import io.netty.buffer.PooledByteBufAllocator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class NettyController
{
    @GET
    public String stats()
    {
        return PooledByteBufAllocator.DEFAULT.dumpStats();
    }
}
