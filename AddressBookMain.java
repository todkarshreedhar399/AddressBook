import java.util.Scanner;

public class AddressBookMain {
    private void options() {
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
        while (status) {
            System.out.println("Hello Enter your option to perform actions: \n Press 1 to Add new person" +
                    "\n Press 2 to Update/edit details \n Press 3 to Display details \n Press 4 to Delete details " +
                    " \n Press 5 to Sort the details according to person firstname \n Press 6 to Search on the basis of state or city" +
                    "\n Press 7 to View on the basis of state or city \n Press 8 to Count on the basis of state or city \nPress 9 to Quit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addressBook.add();
                    break;
                case 2:
                    System.out.println("Hello Please enter your firstname to update your details");
                    String firstName = scan.next();
                    addressBook.edit(firstName);
                    break;
                case 3:
                addressBook.display();
                break;
                case 4:
                    System.out.println("Hello Please enter your firstname to delete your details");
                    String firstname = scan.next();
                    addressBook.delete(firstname);
                    break;
                case 5:
                    System.out.println("Sorted Person details: ");
                    firstname = scan.next();
                    addressBook.sortAlphabetically(firstname);
                    break;
                case 6:
                    System.out.println("Hi!! on what basis you would like to sort the details \nPress 1 to Search " +
                            "on the basis of City\nPress 2 to Search on the basis of State\n");
                    int optionToSort = scan.nextInt();
                    if (optionToSort == 1) {
                        System.out.println("Enter person firstname");
                        firstname = scan.next();
                        addressBook.searchPersonInState(firstname);
                        break;
                    } else {
                        firstname = scan.next();
                        addressBook.searchPersonInCity(firstname);
                        break;
                    }
                case 7:
                    System.out.println("\nPress 1 for View by city \nPress 2 for view by state");
                    int optionToView = scan.nextInt();
                    if (optionToView == 1)
                    {
                        System.out.println("Enter city name");
                        String city = scan.next();
                        addressBook.viewByCity(city);
                        break;
                    }
                    else {
                        System.out.println("Enter state name");
                        String state = scan.next();
                        addressBook.viewByState(state);
                        break;
                    }
                case 8:
                    System.out.println("\nPress 1 for Count by city \nPress 2 for Count by state");
                    int optionToCount = scan.nextInt();
                    if (optionToCount == 1)
                    {
                        System.out.println("Enter city name");
                        String city = scan.next();
                        addressBook.countByCity(city);
                        break;
                    }
                    else {
                        System.out.println("Enter state name");
                        String state = scan.next();
                        addressBook.countByState(state);
                        break;
                    }
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


