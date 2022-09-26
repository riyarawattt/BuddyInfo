public class BuddyInfo {
    private String name;
    private String lastname;

    public BuddyInfo(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

    }

    public String getName() {

        return name;
    }

    public String getLastName() { //added a new getter method

        return lastname;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Leah",  "Sanders");

        System.out.println("Hello " + buddy.getName() + " " + buddy.getLastName() + "!");


    }
}

