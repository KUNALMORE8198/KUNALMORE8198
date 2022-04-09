import java.util.*;



class CorporateEventList{
    Scanner sc1 = new Scanner(System.in);

    static int Hall_Rent;
    static double Catering;
    static double Decor;



    {
        System.out.println("1.Exhibition");
        System.out.println("2.Expo");
        System.out.println("3.Conferences");
        System.out.println("6.Product Launch / Service Launch");
        System.out.println("9.Team building Events / Appreciation Events"); 
    }
    CorporateEventList(){
        System.out.println("Enter you choice :");
        int ch = sc1.nextInt();
        do{
            switch (ch) {
                case 1: Exhibition();
                    break;
                case 2: Expo();
                    break;
                case 3: Conference();
                    break;
                case 6: ProductLaunch_ServiceLaunch();
                    break;
                case 9: TeamBuilding_AppreciatonEvents();
                    break;
            
                default:System.out.println("Invalid Input");
            }
            System.out.println("Do you want to continue Y/N");
            char choice1 = sc1.next().charAt(0);
        }while(choice1 == 'Y');

    }

    void Exhibition(){
        System.out.println("Accomodation Rent   =   "+Hall_Rent);
        System.out.println("Catering charges   =   "+Hall_Rent);
        System.out.println("Accomodation Rent   =   "+Hall_Rent);
        System.out.println("Accomodation Rent   =   "+Hall_Rent);
        System.out.println("Accomodation Rent   =   "+Hall_Rent);
        System.out.println("Accomodation Rent   =   "+Hall_Rent);
        System.out.println("Accomodation Rent   =   "+Hall_Rent);
        System.out.println("Accomodation Rent   =   "+Hall_Rent);

    }


}

}


class SocialEventList {
    {
        System.out.println("1.Festival gatherings");
        System.out.println("2.Ceremonies and Galas");
        System.out.println("3.Parties");
        System.out.println("4.Concerts");
        System.out.println("5.Funerals");
        System.out.println("6.Competitions");
        System.out.println("7.Sport Events");
        //System.out.println("8.Festivals");
    }

}




class Event{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice1;

        

        System.out.println("Welcome to Garud Event Management Agency");

        do{

        System.out.println("Please choose Category");
        System.out.println("1.Corporate Events");
        System.out.println("2.Social Events");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1: CorporateEventList cel = new CorporateEventList();
                    break;

            case 2: SocialEventList sel = new SocialEventList();
                    break;

            default : System.out.println("Invalid input");
        }
        System.out.println("Do you want to continue Y/N");
        char choice1 = sc.next().charAt(0);

    }while(choice1  == 'Y');
    
    System.out.println("Thank you Have a nice day");
    }
}

