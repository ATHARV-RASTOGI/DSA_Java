package Stack_queue;

public class CustomStack {
    protected int[] data;
    private static final  int DEFAULT_SIZE = 10;

    int ptr= -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data= new int [size];
    }

    public boolean push(int item ){

        if(isfull()){
            System.out.println("Stacke is full");
            return false;
        }

        ptr++;
        data[ptr]= item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
           throw new Exception("Can not pop from empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception{

        if(isEmpty()){
            throw new Exception("Cant peek from the stack ");
        }

        return data[ptr];
    }

    boolean isfull(){
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

}
