import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressBookTest {
    @Test
    void givenDataInsertedInto_AddressBook_ShouldMatchtheCount(){
        AddressBook addressBook=new AddressBook();
        List<Contact> contactList=addressBook.add();
        Assertions.assertEquals(1,contactList.size());

    }




}
