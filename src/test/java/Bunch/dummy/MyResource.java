package Bunch.dummy;

public class MyResource {

    private String resourceName;

    public MyResource(String name) {
        this.resourceName = name;
    }

    // Override the finalize() method
    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup operations here
            System.out.println("Cleaning up resource: " + resourceName);
        } finally {
            // Call the finalize() method of the superclass
            super.finalize();
        }
    }

    public static void main(String[] args) {
        MyResource resource1 = new MyResource("Resource1");
        MyResource resource2 = new MyResource("Resource2");

        // Assigning null to the references to make them eligible for garbage collection
        resource1 = null;
        resource2 = null;

        // Suggesting the garbage collector to run, but it's not guaranteed to run immediately
        System.gc();
    }
}
