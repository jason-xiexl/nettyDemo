package com.xiexl.netty.demo.pojo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.Date;

public class TimeClientHandler extends ChannelInboundHandlerAdapter {

    

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        UnixTime m = (UnixTime) msg;

        try{
//
            System.out.println(m.toString());
            System.out.println("finish");
            ctx.close();
        }finally{
//            m.release();
        }
    }
}
