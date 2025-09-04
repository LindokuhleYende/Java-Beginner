package chapter4.Excercise;


public class Mix4 {
    // Make count static so it can be accessed from static main
    static int count = 0;

    // Instance variable to track per-object count
    int countPerObject = 0;

    public static void main(String[] args) {
        Mix4[] mixes = new Mix4[20];  // Array of Mix4 objects
        int i = 0;

        while (i < 9) {
            mixes[i] = new Mix4();  // Create a new Mix4 object
            mixes[i].countPerObject += 1;  // Increment its own counter
            count += 1;  // Increment global count
            count += mixes[i].maybeNew(i);  // Possibly increment more
            i += 1;
        }

        // Print global count and the count of mixes[1]
        System.out.println("Global count: " + count);
        System.out.println("mixes[1] countPerObject: " + mixes[1].countPerObject);
    }

    public int maybeNew(int index) {
        if (index < 5) {
            // Just return 1 to increment global count
            return 1;
        }
        return 0;
    }
}
