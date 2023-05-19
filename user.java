import java.util.Scanner;

class user {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String n, m;
        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("Enter Username:- ");
                n = input.nextLine();

            } while (n.length() == 8);

            if (n.length() < 8)

            {
                System.out.println("Username is too short ");
                System.out.println("Username is Must be in 9 Character");

            }

            else {
                for (int j = 0; j < 10; j++) {
                    do {
                        System.out.print("Enter Password:-");
                        m = input.nextLine();

                    } while (m.length() == 8);
                    if(m.length()<8)
                    {
                        System.out.println("Password is too short ");
                        System.out.println("Password must be in 9 Character");
                    }
                    else{
                        System.out.println("\n");

                        System.out.println("login success");
                        System.out.println("Username is  :- " +n);
                        System.out.println("Password is  :- " +m);
                        System.out.println("\n");
                        System.out.println("Next login \n");
                        break;
                    }
                }
            }
           
        }
        
        
    }
    
}






