class ThreadLifeCycle implements Runnable {
    public static Thread thread1;
    public static ThreadLifeCycle obj;

    public static void main(String[] args) {
        obj = new ThreadLifeCycle();
        thread1 = new Thread(obj);

        // State 1: NEW
        System.out.println("State of thread1 after creation: " + thread1.getState());

        thread1.start();

        // State 2: RUNNABLE
        System.out.println("After calling .start() for thread1: " + thread1.getState());
    }

    public void run() {
        Thread thread2 = new Thread(new DemoThread());

        // State 1 (Thread 2): NEW
        System.out.println("After creating Thread2: " + thread2.getState());
        thread2.start();

        // State 2 (Thread 2): RUNNABLE
        System.out.println("After calling .start() for thread2: " + thread2.getState());

        try {
            // Moving thread2 to TIMED_WAITING
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread2 waiting for 200ms: " + thread2.getState());

        try {
            // Waiting for thread2 to finish
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // State 6: TERMINATED
        System.out.println("Thread2 finished execution: " + thread2.getState());
    }
}

class DemoThread implements Runnable {
    public void run() {
        try {
            // Move thread to TIMED_WAITING so thread1 can capture the state
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}