package com.tst.hbase;

import org.apache.flume.Event;
import org.apache.flume.sink.hbase.HbaseEventSerializer;

public interface FaysonHBaseEventSerializer extends HbaseEventSerializer {
    void initialize(Event var1, byte[] var2, String var3);
}