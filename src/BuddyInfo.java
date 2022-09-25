public class BuddyInfo {

    public BuddyInfo(String name) {
        this.name = name;

    }

    public String getName() {

        return name;
    }


    private String name;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Leah");

        System.out.println("Hello " + buddy.getName() + "!");


    }
}

