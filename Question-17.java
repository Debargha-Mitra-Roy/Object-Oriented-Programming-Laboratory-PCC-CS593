import java.util.Scanner;

class NoMatchException extends Exception {

    NoMatchException(String msg) {
        super(msg);
    }
}

class userDefine {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        String s1, s2 = "Jalpaiguri";

        System.out.print("Enter a String : ");
        s1 = sc.nextLine();

        int i = s1.compareTo(s2);

        try {
            if (i == 0)
                System.out.println("Equal");

            else
                throw new NoMatchException("Not Equal");
        } catch (NoMatchException e) {
            System.out.println(e);
        }
    }
}