package Day5;
public class variableScope {
    static int x = 10; // class scope
    public static void main(String[] args) {
        int x = 1; //local scope
        System.out.println(x);
        print();
    }
    static void print(){
        System.out.println(x);
    }
    
}