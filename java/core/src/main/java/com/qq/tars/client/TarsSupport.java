package com.qq.tars.client;

import com.qq.tars.protocol.tars.TarsInputStream;

public interface TarsSupport {
    void readFrom(TarsInputStream is);
}
