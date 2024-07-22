public class Stack {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int currentIndex = 0;
        for (int i = 1; i <= 10; i++) {
            myArray[currentIndex++] = i;
        }
        displayArray(myArray);
        int poppedElement = myArray[--currentIndex];
        myArray[currentIndex] = 0; 
        System.out.println("Popped Element: " + poppedElement);
        displayArray(myArray);
    }
    private static void displayArray(int[] arr) {
        System.out.print("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}