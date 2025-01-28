import java.util.Scanner;
public class AgeCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Current Year:");
        int CurYear=sc.nextInt();
        System.out.print("Enter Year of Birth:");
        int BirYear=sc.nextInt();
        int age;
        if(BirYear>=CurYear || BirYear<=0 || CurYear<=0){
            System.out.println("Invalid Year");
        }
        else{
            age=CurYear-BirYear;
            System.out.println("age:"+age);
        }
    }
}
