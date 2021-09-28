//interface
public interface AddressBookInfo {
    public void add();
    public void edit(String firstName);
    public void delete(String firstName);
    public void sortAlphabetically(String firstName);
    public void searchPersonInState(String firstName);
    public void searchPersonInCity(String firstName);

}
