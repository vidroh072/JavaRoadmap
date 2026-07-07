package MoreAboutOOps.Interface;

public class Fish implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("Fish is Fleeing");
    }
    @Override
    public void hunt(){
        System.out.println("fish is hunting");
    }
}
