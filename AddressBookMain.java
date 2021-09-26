import java.util.Scanner;

public class AddressBookMain {
    private void options(){
        boolean status = true;
        //Declaring and initializing with predefined standard input object
        Scanner scan = new Scanner(System.in);
        //Creating AddressBook object
        AddressBook addressBook = new AddressBook();

        /*To print options to perform
         *Choice to print add and display method
         */
        while( status ) {
            System.out.println("Hello Enter your option to perform actions: \n Press 1 to add new person" +
                    " \n Press 2 to display details \n press 9 to quit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 : addressBook.add();
                    break;
                case 2 : addressBook.display();
                    break;
                default: status = false;
            }
        }
    }

    /*Main method to call options*/
    public static void main(String args[]){
        AddressBookMain main = new AddressBookMain();
        main.options();

    }
}
