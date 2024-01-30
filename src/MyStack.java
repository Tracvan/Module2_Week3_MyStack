import java.net.BindException;

public class MyStack {
    int[] arr ;
    int size;
    int index =0;
    MyStack(int size){
        this.size = size;
        arr = new int[this.size];
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Overflow ! Unable to push element to Stack");
        }else{
            arr[index] = element;
            index++;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow ! Unable to remove an Element from Stack");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
    public boolean isFull(){
        boolean status = false;
        if(index == size){
            status = true;
        }
        return status;
    }
    public boolean isEmpty(){
        boolean status = false;
        if(index == 0){
            status = true;
        }
        return status;
    }

}
