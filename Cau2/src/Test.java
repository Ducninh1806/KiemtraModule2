public class Test {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Trong","Hoang","0987654321" );
        Contact contact2 = new Contact("Van","Duc","0987123467" );
        Contact contact3 = new Contact("Duc","Binh","0123456789" );


        ContactPhone list = new ContactPhone();

        list.addNumber(contact1);
        list.addNumber(contact2);
        list.addNumber(contact3);

       list.removeNumber("0987654321");

        list.displayContact();

    }
}
