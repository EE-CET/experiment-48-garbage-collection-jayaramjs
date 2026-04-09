public class GarbageCollection {

    // The finalize method is invoked by the Garbage Collector 
    // just before an object is destroyed.
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        // 1. Create an object of the class
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();

        // 2. Make objects eligible for Garbage Collection
        // By assigning null, the objects are no longer reachable
        g1 = null;
        g2 = null;

        // 3. Requesting the JVM to run the Garbage Collector
        System.gc();
    }
}
