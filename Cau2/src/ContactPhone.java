import java.util.LinkedList;

public class ContactPhone {
    LinkedList<Contact> contacts = new LinkedList<>();

    public void displayContact(){
        for (Contact display: contacts){
            System.out.println(display);
        }
}

    public void addNumber(Contact contact){
        contacts.add(contact);
    }

    public void editContact(int index,Contact contact){
        contacts.set(index, contact);
    }

    public void removeNumber(String number){
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber() == number){
                    contacts.remove(i);
            }
        }
    }

    public void searchFirstNumber(String name){
        boolean check= false;
        for (int i = 0; i <contacts.size() ; i++) {
            if (contacts.get(i).getFirstName() == name){
                check =true;
            }else {
                check= false;
            }
        }
        if (check){
            System.out.println(name +" have at contact Phone");
        }else {
            System.out.println(name +" haven't at contact Phone");
        }
    }

    public void searchLastNumber(String name){
        boolean check= false;
        for (int i = 0; i <contacts.size() ; i++) {
            if (contacts.get(i).getLastName() == name){
                check =true;
            }else {
                check= false;
            }
        }
        if (check){
            System.out.println(name +" have at contact Phone");
        }else {
            System.out.println(name +" haven't at contact Phone");
        }
    }

    public void searchNumber(String number){
        for (int i = 0; i <contacts.size() ; i++) {
           if (contacts.get(i).getPhoneNumber() == number){
               System.out.println(number +" have at contact Phone");
           }else {
               System.out.println(number +" haven't at contact Phone");

           }

        }
    }
}





