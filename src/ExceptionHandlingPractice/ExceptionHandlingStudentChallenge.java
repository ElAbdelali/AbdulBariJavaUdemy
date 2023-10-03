package ExceptionHandlingPractice;

class StackOverflowException extends Exception{
    public String toString(){
        return "Stack is full";
    }
}
class StackUnderflowException extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}
class Stack{
    private int size;
    private int top = -1;
    private int stack[];

    public Stack(int s){
        size = s;
        stack = new int[size];
    }
    public void push(int x) throws StackOverflowException{
        if(top == size-1){
            throw new StackOverflowException();
        }
        top++;
        stack[top] = x;
    }
    public int pop() throws StackUnderflowException{
        int x = -1;

        if(top == -1){
            throw new StackUnderflowException();
        }
        x = stack[top];
        top--;
        return x;
    }
}

public class ExceptionHandlingStudentChallenge  {
    public static void main(String[] args) {
        Stack sof = new Stack(5);
        Stack suf = new Stack(7);
        try {
            sof.push(10);
            sof.push(15);
            sof.push(10);
            sof.push(15);
            sof.push(10);
        }
        catch(StackOverflowException s){
            System.out.println(s);
        }
        try{
            sof.pop();
            sof.pop();
            sof.pop();
            sof.pop();
            sof.pop();
        }
        catch(StackUnderflowException e){
            System.out.println(e);
        }


    }
}
