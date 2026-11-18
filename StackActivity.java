public class StackActivity {
    private int maxSiz;
    private long[] stackArray;
    private int top;

    public StackActivity(int s) {
        maxSiz = s;
        stackArray = new long[maxSiz];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        StackActivity theStack = new StackActivity(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);

        System.out.println("Top item: " + theStack.peek());
        
        System.out.print("Popping elements: ");
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
