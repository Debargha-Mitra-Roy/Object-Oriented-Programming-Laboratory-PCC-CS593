import java.util.Scanner;

class MyException extends Exception {

    MyException(String msg) {
        super(msg);
    }
}

class Stack {

    Scanner sc = new Scanner(System.in);

    int list[], size;
    int top;

    Stack(int x) {

        top = -1;
        size = x;
        list = new int[size];
    }

    void push() {

        int item;

        if (top == size - 1) {

            try {
                throw new MyException("Overflow");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.print("Enter an Item : ");
            item = sc.nextInt();
            list[++top] = item;
        }
    }

    void pop() {

        if (top == -1) {

            try {
                throw new MyException("Underflow");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Deleted item : " + list[top--]);
        }
    }

    void display() {

        if (top == -1) {

            try {
                throw new MyException("Empty");
            } catch (MyException e) {
                e.getMessage();
            }
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
        }
    }
}

class StackDemo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.print("Enter the size of the Stack : ");
        int n = sc.nextInt();
        Stack st = new Stack(n);

        int ch;

        do {
            System.out.println("Press '1' for Push\nPress '2' for Pop\nPress '3' for Display\nPress '0' to exit");
            System.out.print("Select : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    st.push();
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    st.display();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid Selection");
                    break;
            }

        } while (ch != 0);
    }
}