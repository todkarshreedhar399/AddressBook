import java.util.Scanner;

public class AddressBookMain {
    private void options(){
        boolean status = true;
        //Declaring and Initializing with predefined standard input object
        Scanner scan = new Scanner(System.in);
        //Creating AddressBook object
        AddressBook addressBook = new AddressBook();

        /*To print options to perform
         *Choice to print add and display method
         * Update or edit the details
         * Delete the details using firstname
         */
        while( status ) {
            System.out.println("Hello Enter your option to perform actions: \n Press 1 to Add new person"+
                    "\n Press 2 to Update/edit details \n Press 3 to Display details \n Press 4 to Delete details " +
                    "\n Press 9 to quit ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 :
                    addressBook.add();
                    break;
                case 2 :
                    System.out.println("Hello Please enter your firstname to update your details");
                    String firstName = scan.next();
                    addressBook.edit(firstName);
                    break;
                case 3 :
                    addressBook.display();
                    break;
                case 4 :
                    System.out.println("Hello Please enter your firstname to delete your details");
                    String firstname = scan.next();
                    addressBook.delete(firstname);
                    break;
                default:
                    status = false;
            }
        }
    }

    /*Main method to call options*/
    public static void main(String args[]){
        AddressBookMain main = new AddressBookMain();
        main.options();

    }
}
