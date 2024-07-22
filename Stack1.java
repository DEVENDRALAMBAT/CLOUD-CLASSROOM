public class Stack1 {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        int currentIndex = 0;
        for (int i = 1; i < 10; i++) {
            push(myArray, i, currentIndex);
        }
        displayArray(myArray);
        int poppedElement = pop(myArray, currentIndex);
        System.out.println("Popped Element: " + poppedElement);
        displayArray(myArray);
    }
    private static void push(int[] arr, int value, int currentIndex) {
        if (currentIndex == arr.length) {
            System.out.println("Stack is full.");
            return;
        }
        arr[currentIndex++] = value;
    }
    private static int pop(int[] arr, int currentIndex) {
        if (currentIndex == 0) {
            System.out.println("Stack is empty.");
            return 0;
        }
        int poppedElement = arr[--currentIndex];
        arr[currentIndex] = 0;
        return poppedElement;
    }
    private static void displayArray(int[] arr) {
        System.out.print("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}