package com.dilip.dayNineCodes.MultiThreadingDemo.InterThreadCommunication;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.produce();
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.consume();
            }
        });

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SharedResource {
    private int data;
    private boolean produced = false;

    public synchronized void produce() {
        while (produced) {
            try {
                wait(); // Wait for the consumer to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = (int) (Math.random() * 100); // Produce data
        System.out.println("Produced: " + data);
        produced = true;
        notify(); // Notify the consumer that data is ready
    }

    public synchronized void consume() {
        while (!produced) {
            try {
                wait(); // Wait for the producer to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);
        produced = false;
        notify(); // Notify the producer that the buffer is empty
    }
}
