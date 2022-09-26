import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook(){
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null){
            myBuddies.add(aBuddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);

        }
        return null;
    }


    public static void main(String[] args){

        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Leah");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }



}

