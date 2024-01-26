import java.util.Scanner;

public class switchcondition {
     public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("enter button number");
        int button=a.nextInt();
     /** 
        if(button==1){
            System.out.println("numbers are equal");
        }
        else if (button==2){
            System.out.println("numbers is greater "+b);
        }
        else{
            System.out.println("numbers c is greater "+c); 
        } wrong so we use switch*/
        switch(button) {
            case 1 : System.out.println("numbers are equal");
            break; //break is use to stop case if it is true
            case 2 : System.out.println("numbers is greater ");
            break;
            default :  System.out.println("numbers c is greater "); 
        }
        }
}
