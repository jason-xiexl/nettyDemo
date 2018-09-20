package com.xiexl.netty.demo.pojo;

import java.util.Date;

public class UnixTime {

    private long value = 0;

    public UnixTime() {
        this(System.currentTimeMillis() / 1000L + 2208988800L);
    }

    public UnixTime(long l) {
        this.value = l;
    }

    public long value() {
        return value;
    }

    @Override
    public String toString() {
        return new Date((value() - 2208988800L) * 1000L).toString();
    }
}
