import java.util.Scanner;

public class hurricane {
    public static void main(String[] args)
    {
        int windSpeed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wind speed please.");
        windSpeed = sc.nextInt();
        if(windSpeed <= 73){
            System.out.println("It is not a hurricane.");
        }
        else if(windSpeed >= 74 && windSpeed <= 95){
            System.out.println("It is a Category 1 hurricane.");
        }
        else if(windSpeed >= 96 && windSpeed <= 110){
            System.out.println("It is a Category 2 hurricane.");
        }
        else if(windSpeed >= 111 && windSpeed <= 129){
            System.out.println("It is a Category 3 hurricane.");
        }
        else if(windSpeed >= 130 && windSpeed <= 156){
            System.out.println("It is a Category 4 hurricane.");
        }
        else {
            System.out.println("It is a Category 5 hurricane.");
        }

    }
}
