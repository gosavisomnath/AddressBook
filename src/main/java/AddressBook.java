import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    /*
    creating ArrayList TO Add Contact
     */
    ArrayList<Contact> list = new ArrayList<Contact>();
    // creating Method To Add Contact in ArrayList
    public List<Contact> add() {
        try {
            Contact contact = new Contact();
            list.add(contact);
            throw new CustomException("Custom Exception Occured");
        }catch (CustomException e){

            System.out.println(e);

        }
        return list;
    }
}
