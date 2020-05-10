package com.homeSmart;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        int port = 50000;
        UdpUnicastServer server = new UdpUnicastServer(port);
        UdpUnicastClient client = new UdpUnicastClient(port);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(client);
        executorService.submit(server);
    }
}
