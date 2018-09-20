package com.xiexl.netty.demo.dealing;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

public class TimeDecoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> out)
            throws Exception {
        if(internalBuffer().readableBytes() < 4){
            return;
        }
        out .add(internalBuffer().readBytes(4));
    }
}
