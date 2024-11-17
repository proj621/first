class ChildThread extends Thread {
    private String threadName;

    public ChildThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is executing operation " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " completed.");
    }
}

public class ChThread {
    public static void main(String[] args) {

        System.out.println("Main thread started.");

        ChildThread thread1 = new ChildThread("Child Thread 1");
        ChildThread thread2 = new ChildThread("Child Thread 2");
        ChildThread thread3 = new ChildThread("Child Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread is executing operation " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted.");
            }
        }

        System.out.println("Main thread completed.");
    }
}
