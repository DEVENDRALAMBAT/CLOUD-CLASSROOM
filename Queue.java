import java.util.*;

class Queue {
    	// global variables
    	static final int size = 100;
    	static int[] arr = new int[size];
    	static int front = 0, rear = -1;

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	int choice;

        	// Do while loop to accept the user input till the user exits the program
        	do {
            		System.out.println("Menu for Queue Operations: ");
            		System.out.println("1. Insert");
            		System.out.println("2. Delete");
            		System.out.println("3. Display front");
            		System.out.println("4. Display all elements");
            		System.out.println("5. Exit");

            		System.out.print("Enter your choice: ");
            		choice = sc.nextInt();

            		// Switch case to display on the basis of users choice
            		switch (choice) {
                		case 1:
                    			insertElement(sc);
                    			break;

                		case 2:
                    			deleteElement(sc);
                    			break;

                		case 3:
                    			displayFront(sc);
                    			break;

                		case 4:
                    			displayAll(sc);
                    			break;

                		case 5:
                    			System.out.println("Exiting the program!!");
                    			break;

                		default:
                    			System.out.println("Please enter a valid option! Try again");

            		}
        	} while (choice != 5);
    	}

    	// Insert element method
    	public static void insertElement(Scanner sc) {
        	if (rear == size - 1) {
            		System.out.println("Queue is full. Cannot insert more elements");
        	} else {
            		System.out.print("\nEnter the element to insert: ");
            		int element = sc.nextInt();
            		rear++;
            		arr[rear] = element;
            		System.out.println("Element inserted\n");
        	}
    	}

    	// Delete element method
    	public static void deleteElement(Scanner sc) {
        	if (front > rear) {
            		System.out.println("Queue is empty. Cannot delete elements");
        	} else {
            		System.out.println("\nElement " + arr[front] + " deleted \n");
            		front++;
        	}
    	}

    	// Display element at the front method
    	public static void displayFront(Scanner sc) {
        	if (front > rear) {
            		System.out.println("Queue is empty. Cannot display the element");
        	} else {
            		System.out.println("\nFront element is " + arr[front] + "\n");
        	}
    	}

    	// Display all elements method
    	public static void displayAll(Scanner sc) {
        	if (front > rear) {
            		System.out.println("Queue is empty. Cannot display any elements");
        	} else {
            		System.out.println("\nAll elements in the queue: ");
            		for (int i = front; i <= rear; i++) {
                		System.out.print(arr[i] + "\t");
            		}
            		System.out.print("\n\n");
        	}
    	}
}
