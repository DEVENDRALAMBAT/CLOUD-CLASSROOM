import java.util.Scanner;

class Stack{
    int stack[] = new int[100];
    public void push(int number){
        for(int i=0; i<stack.length; i++){
            if(stack[i] == 0){
                stack[i] = number;
                break;
            }
        }
    }
    public void pop(){
        for(int i=(stack.length-1); i>=0; i--){
            if(stack[i] != 0){
                stack[i] = 0;
                break;
            }
        }
    }
    public void peak(){
        for(int i=0; i<stack.length; i++){
            if(stack[i] != 0){
                continue;
            }
            else{
                System.out.println("Peak: " + stack[i-1]);
                break;
            }
        }
    }
    public void displayStack(){
        for(int i=0; i<stack.length; i++){
            if(stack[i] == 0){
                continue;
            }
            else{
                System.out.print(stack[i] + " ");
            }
        }
        System.out.println("");
    }
}

class StackEx{
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~ 1. Push Element you want to push     ~");
        System.out.println("~ 2. Pop Element you want to pop       ~");
        System.out.println("~ 3. Peak Element you want to peak     ~");
        System.out.println("~ 4. Display Stack                     ~");
        System.out.println("~ 5. Exit                              ~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Please Enter your choice: ");
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int choice = menu();
        do{
            switch(choice){
                case 1:
                    System.out.println("Enter element to push: ");
                    int elementToPush = sc.nextInt();
                    stack.push(elementToPush);
                    choice = menu();
                    break;
                case 2:
                    stack.pop();    
                    choice = menu();
                    break;
                case 3:
                    stack.peak();
                    choice = menu();
                    break;
                case 4:
                    stack.displayStack();
                    choice = menu();
                    break;
                default:
                    System.out.println("Try Again!");
                    System.out.println("Please enter the correct choice!");
                    choice = menu();
                    break;
                }
        }while(choice != 5);
    }
}