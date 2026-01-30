package martins.mattheus.javaoneforall.javacore.ZZGconcurrent.test;


import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Mattheus"));
        System.out.println(tq.offer("Mattheus"));
        System.out.println(tq.offer("Mattheus", 10, TimeUnit.SECONDS));
        tq.put("Martins");
        if(tq.hasWaitingConsumer()) {
            tq.transfer("Martins");
        }
        System.out.println(tq.tryTransfer("Carvalho"));
        System.out.println(tq.tryTransfer("Carvalho", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}