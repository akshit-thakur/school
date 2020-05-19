import java.util.InputMismatchException;
import java.util.Scanner;

class Stack {
    java.lang.String st[];
    int size;
    int top;
    int ctr;

    Stack() {
        size = 0;
        top = -1;
        ctr = 0;
    }

    Stack(int cap) {
        size = cap;
        st = new java.lang.String[cap];
        top = -1;
    }

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        Stack obj = new Stack();
        try {
            System.out.println("Enter the size of stack");
            obj = new Stack(read.nextInt());
            obj.push();
            obj.display();
            do {
                java.lang.String n = obj.popName();
                System.out.println("Popped: " + n);
                obj.display();
            } while (obj.top != obj.st.length - 1);
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid! Ending program");
        }
    }

    void push() {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a name: ");
            pushName(read.nextLine());
        }
        read.close();
    }

    void pushName(java.lang.String n) {
        /** pushes a name into the stack. if filled, OVERFLOW */
        if (top == st.length - 1)
            System.out.println("OVERFLOW");
        else {
            top++;
            st[top] = n;
        }
    }

    java.lang.String popName() { /**
                        * removes a name from top of stack and returns it,when stack is empty,
                        * UNDERFLOW
                        */
        java.lang.String result = "";
        if (top == -1)
            System.out.println("UNDERFLOW");
        else {
            result = st[top];
            top--;
        }
        return result;
    }

    void display() {
        System.out.println(st[top] + "<-- top");
        for (int i = top; i >= 0; i--)
            System.out.println(st[i]);
    }
}