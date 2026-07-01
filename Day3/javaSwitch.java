package Day3;

public class javaSwitch {
    // Enhanced switch = A replacement to many else if statement
    // (Java14 feature)

    // There are Two way to create Switch
    public static void main(String[] args) {
    
        String day = "3";
        if (day=="1" || day=="2"){
            switch(day){
                case "1" -> System.out.println("Day One");
                case "2" -> System.out.println("Day Two");
            }
        }
        else if(day=="3" || day=="4")
        switch(day){
            // break is used to stop at one case and dont check other
            case "3": System.out.println("Day Three");break;
            case "4": System.out.println("Day Four");break;
        }
        else System.out.println("Day > 4");
    }
}
