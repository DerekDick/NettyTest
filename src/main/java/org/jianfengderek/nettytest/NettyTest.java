package org.jianfengderek.nettytest;

public class NettyTest {

    public static void main(String[] args) throws Exception {
        int port;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = 8080;
        }

//        // Test the DiscardServer
//        new DiscardServer(port).run();

//        // Test EchoServer
//        new EchoServer(port).run();

        // Test the TimeServer
        new TimeServer(port).run();
    }

}
