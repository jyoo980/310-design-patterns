public class Main {

    public static void main(String[] args) {
        Logger.getInstance().info("New Logger Instantiated");
        try {
            Thread.sleep(1000);
            Logger.getInstance().info("Thead.sleep(1000) succesful");
        } catch (InterruptedException e) {
            Logger.getInstance().error("Thread.sleep(..) failed");
        }
    }
}
