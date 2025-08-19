import model.Contact;
import model.ContactBook;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
public class ContactBookTest {

    ArrayList<Contact> contactList;
    Contact contact = new Contact("Pedro", "pedroprueba@gmail.com", "3101010101");

   @Test
   void setupStage1WithAddMethod(){
       ContactBook contactBook = new ContactBook();
       contactList = new ArrayList<>();
       contactList.add(contact);
       contactBook.setContacts(contactList);

       assertTrue(contactBook.add("Juan", "juantest@gmail.com", "3333333333"));

   }

   @Test
   void setupStage1WithRemoveMethod(){
       ContactBook contactBook = new ContactBook();
       contactList = new ArrayList<>();
       contactList.add(contact);
       contactBook.setContacts(contactList);

       assertSame(contact, contactBook.remove("pedroprueba@gmail.com"));
   }

   @Test
   void setupStage1WithSearchMethod(){
       ContactBook contactBook = new ContactBook();
       contactList = new ArrayList<>();
       contactList.add(contact);
       contactBook.setContacts(contactList);

       assertSame(contact, contactBook.search("pedroprueba@gmail.com"));
   }

   @Test
   void setupStage2WithAddMethod(){
       ContactBook contactBook = new ContactBook();
       contactList = new ArrayList<>();
       contactBook.setContacts(contactList);

       assertTrue(contactBook.add("Juan", "juantest@gmail.com", "3333333333"));
   }

   @Test
   void setupStage2WithRemoveMethod(){
       ContactBook contactBook = new ContactBook();
       contactList = new ArrayList<>();
       contactBook.setContacts(contactList);

       assertNull(contactBook.remove("pedroprueba@gmail.com"));
   }

   @Test
   void setupStage2WithSearchMethod(){
       ContactBook contactBook = new ContactBook();
       contactList = new ArrayList<>();
       contactBook.setContacts(contactList);

       assertNull(contactBook.search("pedroprueba@gmail.com"));
   }

   @Test
   void setupStage3WithAddMethod(){
       ContactBook contactBook = new ContactBook();
       contactBook.setContacts(contactList);

       assertThrows(NullPointerException.class, () -> {contactBook.add("Juan", "juantest@gmail.com", "3333333333");});
   }

    @Test
    void setupStage3WithRemoveMethod(){
       ContactBook contactBook = new ContactBook();
       contactBook.setContacts(contactList);

        assertThrows(NullPointerException.class, () -> {contactBook.remove("pedroprueba@gmail.com");});
   }

   @Test
   void setupStage3WithSearchMethod(){
       ContactBook contactBook = new ContactBook();
       contactBook.setContacts(contactList);

       assertThrows(NullPointerException.class, () -> {contactBook.search("pedroprueba@gmail.com");});
   }
}
