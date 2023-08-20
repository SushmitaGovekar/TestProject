import java.util.Scanner;

public class InsertRecentValues {
    static int[] values;
    static int size;
    static int capacity;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the capacity");
        capacity= sc.nextInt();

        values = new int[capacity];

        while(true) {
            System.out.println("\nEnter the value");
            int value= sc.nextInt();
            insertValue(value);
            for (int i = 0; i < size; i++) {
                System.out.print(values[i] + " ");
            }
        }
    }

    public static void insertValue(int value) {
        // if size less than capacity, add elements without shifting
        if (size < capacity) {
            values[size] = value;
            size++;
        } else {
            // Shift elements if size greater than capacity
            for (int i = 0; i < size - 1; i++) {
                values[i] = values[i + 1];
            }
            values[size - 1] = value;
        }
    }
}
