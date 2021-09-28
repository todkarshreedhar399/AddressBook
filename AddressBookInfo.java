//interface
public interface AddressBookInfo {
    public void add();
    public void edit(String firstName);
    public void delete(String firstName);
    public void sortAlphabetically(String firstName);
    public void searchPersonInState(String firstName);
    public void searchPersonInCity(String firstName);
    public void viewByCity(String city);
    public void viewByState(String state);
    public void countByCity(String city);
    public void countByState(String state);

}
