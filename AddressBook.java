import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//AddressBook implements AddressBookInfo
public class AddressBook implements AddressBookInfo {
    //Declaring ArrayList
    ArrayList<Person> book = new ArrayList<>();
    //Creating scanner object
    Scanner scan = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Enter the AddressBook Name");
        scan.nextLine();
        System.out.println("Enter the Person Firstname: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the Person Lastname: ");
        String lastName = scan.nextLine();

        for (int search = 0; search < book.size(); search++) {
            if (book.get(search).getFirstName().equalsIgnoreCase(firstName)) {
                if (book.get(search).getLastName().equalsIgnoreCase(lastName)) {
                    System.out.println("Sorry Name is already exist please update/edit your details with option 2");
                    return;
                }

            }
        }
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
        Person person = new Person(firstName, lastName, address, city, state, phoneNumber, zip);
        book.add(person);
        System.out.println("Successfully Added!!");
    }

    /*Method to edit or update the details using firstname*/
    @Override
    public void edit(String firstName) {
        for (int search = 0; search < book.size(); search++) {

            if (book.get(search).getFirstName().equalsIgnoreCase(firstName)) {
                Person person = book.get(search);
                System.out.println("Hi  " + person.getFirstName() + " Please edit your details");
                System.out.println("Hi " + person.getFirstName() + " Please edit your address");
                scan.next();
                String address = scan.nextLine();
                person.setAddress(address);
                System.out.println("Hi  " + person.getFirstName() + " Please edit your city");
                String city = scan.next();
                person.setCity(city);
                System.out.println("Hi " + person.getFirstName() + " Please edit your state");
                String state = scan.next();
                person.setState(state);
                System.out.println("Hi " + person.getFirstName() + " Please edit your phone number");
                long phone = scan.nextLong();
                person.setPhoneNumber(phone);
                System.out.println("Hi " + person.getFirstName() + " Please edit your zip");
                scan.nextLine();
                String zip = scan.nextLine();
                person.setZip(zip);
                System.out.println("Hi " + person.getFirstName() + " Successfully you have updated your details. ");
            }
        }

    }
    /*Method to delete the details using firstname*/

    @Override
    public void delete(String firstName) {
        for (int select = 0; select < book.size(); select++) {
            if (book.get(select).getFirstName().equalsIgnoreCase(firstName)) {
                Person person = book.get(select);
                book.remove(person);
                System.out.println("Successfully Deleted!");
            }
        }

    }

    @Override
    public void sortAlphabetically(String firstName) {
        book.stream().sorted((p1, p2) -> p1.getFirstName().compareToIgnoreCase(p2.getFirstName())).forEach(System.out::println);

        //Collections.sort(book, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        //System.out.println(book);
    }

    public void searchPersonInCity(String firstName) {
        List<Person> people = book.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());

        for (Person person : people) {
            System.out.println(person.getFirstName() + "->" + person.getCity());
        }
    }

    public void searchPersonInState(String firstName) {
        List<Person> people = book.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());
        for (Person person : people) {
            System.out.println(person.getFirstName() + "->" + person.getState());
        }
    }
    public void viewByCity(String city)
    {

        List<Person> people = book.stream().filter(person1 -> person1.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        for (Person person: people )
        {
            System.out.println(person);
        }

    }
    public void viewByState(String state)
    {
        List<Person> people = book.stream().filter(person1 -> person1.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
        for (Person person: people )
        {
            System.out.println(person);
        }
    }

        public void display() {
            for( Person person : book )
                System.out.println(person);
        }

    }
