package assignment5_1;

class  InstanceCounter  {
    // Static variable to track the number of instances
    private static int instanceCount = 0;

    // Constructor
    public InstanceCounter() {
        instanceCount++;
    }

    // Static method to get the instance count
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Static method to reset the instance count
    public static void resetInstanceCount() {
        instanceCount = 0;
    }
 }

    public class Main {
    	
    public static void main(String[] args) {
        // Create instances
        InstanceCounter counter1 = new InstanceCounter();
        InstanceCounter counter2 = new InstanceCounter();
        InstanceCounter counter3 = new InstanceCounter();

        // Print instance count
        System.out.println("Number of instances created: " +  InstanceCounter.getInstanceCount());

        // Reset instance count
        InstanceCounter.resetInstanceCount();

        // Print instance count after reset
        System.out.println("Number of instances created after reset: " + InstanceCounter.getInstanceCount());
    }
}



