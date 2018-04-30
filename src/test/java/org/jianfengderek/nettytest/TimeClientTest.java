package org.jianfengderek.nettytest;

import org.junit.jupiter.api.Test;

class TimeClientTest {

    @Test
    void test() throws Exception {
        new TimeClient("localhost", 8080).run();
    }

}
