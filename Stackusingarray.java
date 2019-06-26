/**
 *
 * @author Manu Singhal
 */
public class Stackusingarray{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(23);
        stack.push(24);
        stack.push(26);
        stack.showall();
        stack.push(124);
        stack.push(125);
        System.out.println("Element poped = "+stack.pop());
        stack.showall();
        System.out.println("Element poped = "+stack.peek());
        System.out.println(stack.isEmpty());
         
        
    }
    
}
 class Stack{
     int top=-1,max=100;
     public Stack(){
         top=-1;
     }
     int[] a = new int[max];
         public boolean push(int item){
             if(top==max-1){
                 System.out.println("Stack Overflow");
                 return false;}
             top++;
             a[top]=item;
             return true;
         }
         public int pop(){
             if(top==-1){
                 System.out.println("Stack Underflow");
                 return 0;
             }
             int ret=a[top];
             top--;
             return ret;
         }
         public int peek(){
             if(top<0){
                 System.out.println("Stack Underflow");
                 return 0;
             }
             else
             return a[top];
         }
         boolean isEmpty(){
             return top<0;
         }
         public void showall(){
             for(int i=0;i<=top;i++){
                  System.out.println(a[i]);
             }
         }
     
 }
