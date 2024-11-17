class MainThread{
    public static void main(String[] args) {
    Thread mainThread = Thread.currentThread();
    
    System.out.println("default thread name: " + mainThread.getName());
    System.out.println("default thread priority: " + mainThread.getPriority());

    mainThread.setName("newthread");
    mainThread.setPriority(Thread.MAX_PRIORITY);  

    System.out.println("new thread name: " + mainThread.getName());
    System.out.println("new thread priority: " + mainThread.getPriority());

    System.out.println("Performing operations in the main thread:");
    for (int i = 1; i <= 5; i++) {
         System.out.println("Operation " + i + " in " + mainThread.getName());
         try {
            Thread.sleep(500); 
         } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
         }
        }

    System.out.println("Main thread operations completed.");
    }
}
