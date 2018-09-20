package com.xiexl.netty.demo.pojo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class TImeSererHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        final ByteBuf time = ctx.alloc().buffer(4);
//        time.writeInt();
//
//        final ChannelFuture f = ctx.writeAndFlush(time);
        ChannelFuture f = ctx.writeAndFlush(new UnixTime());
        f.addListener(ChannelFutureListener.CLOSE);

//        f.addListener(new ChannelFutureListener() {
//
//            @Override
//            public void operationComplete(ChannelFuture future) throws Exception {
//                assert f == future;
//                ctx.close();
//            }
//        });

    }
}
