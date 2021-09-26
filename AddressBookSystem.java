public class AddressBookSystem {
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book Program");
        Person person = new Person("Namratha" ,"Shetty", "Bangalore,Karnataka", "Bangalore", "Karnataka", 7653786757L, "678");
        System.out.println("Firstname:"+ person.getFirstName());
        System.out.println("Lastname:"+ person.getLastName());
        System.out.println("Address:"+ person.getAddress());
        System.out.println("City:"+ person.getCity());
        System.out.println("State:"+ person.getState());
        System.out.println("Phone number:"+ person.getPhoneNumber());
        System.out.println("Zip:"+ person.getZip());
        System.out.println(person);

    }

}


