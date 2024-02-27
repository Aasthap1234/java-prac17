//Parent class
class Emerging_Technologie {
    void forum() {
        System.out.println("Forum: General Emerging Technologies Forum");
    }
}

// Child class 1
class AIML extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President: Aastha pathak");
        System.out.println("Forum Vice President: yash virulkar");
        System.out.println("Forum Secretary: khushi vaidya");
        System.out.println("Forum Treasurer: preeti D");
        System.out.println("Event Head: Sherya ");
    }
}

// Child class 2
class AIDS extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President: Himanshi kawade");
        System.out.println("Forum Vice President: Himanshu Shrivastav");
        System.out.println("Forum Secretary: Yash Virulkar");
        System.out.println("Forum Treasurer: Mayank");
        System.out.println("Event Head: Khushi");
    }
}

// Child class 3
class CSE extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President: Prantik Deodhagale");
        System.out.println("Forum Vice President: Yash Virulkar");
        System.out.println("Forum Secretary: Khushi Vaidya");
        System.out.println("Forum Treasurer: Mayank");
        System.out.println("Event Head: Anchal");
    }
}

public class Main {
    public static void main(String[] args) {
        AIML aimlForum = new AIML();
        AIDS aidsForum = new AIDS();
        CSE cseForum = new CSE();

        System.out.println("AIML Forum Details:");
        aimlForum.forum();
        System.out.println();

        System.out.println("AIDS Forum Details:");
        aidsForum.forum();
        System.out.println();

        System.out.println("CSE Forum Details:");
        cseForum.forum();
    }
}
