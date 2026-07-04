package Day7.Super;

public class Person {
    String first;
    String last;

    Person(String first,String last){
        this.first = first;
        this.last = last;
    }
    void showName(){
        System.out.printf("Your Name is %s %s\n",this.first,this.last);
    }
}
