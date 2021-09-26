import java.util.ArrayList;
import java.util.Scanner;

//AddressBook implements AddressBookInfo
public class AddressBook implements AddressBookInfo {
    //Declaring ArrayList
    ArrayList<Person> book = new ArrayList<>();
    //Creating scanner object
    Scanner scan = new Scanner(System.in);
    @Override
    public void add() {
        //Reading the user input and print the details
        System.out.println("Enter the Person Firstname: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the Person Lastname: ");
        String lastName = scan.nextLine();
        System.out.println("Enter the Person Address: ");
        String address = scan.nextLine();
        System.out.println("Enter the Person City: ");
        String city = scan.nextLine();
        System.out.println("Enter the Person State: ");
        String state = scan.nextLine();
        System.out.println("Enter the Person Phone Number: ");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter the Zip code: ");
        scan.nextLine();
        String zip = scan.nextLine();
        Person person = new Person(firstName,lastName,address,city,state,phoneNumber,zip);
        book.add(person);
        System.out.println("Successfully Added!!");
    }

    //Display the person details added
    public void display() {
        for( Person person : book )
            System.out.println(person);
    }
}
