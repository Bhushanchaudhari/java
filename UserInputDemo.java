import java.io.DataInputStream;
import java.io.IOException;

class UserInputDemo {
    public static void main(String args[]) {
        int fno = 0, sno = 0, ans;
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("\n\nADDTION OF 2 NUMBERS");

        try {
            System.out.print("\n\nEnter the First no = ");
            fno = Integer.parseInt(d.readLine());
            System.out.print("\n\nEnter the Second no = ");
            sno = Integer.parseInt(d.readLine());
        } catch (IOException ioe) {

        }
        ans = fno + sno;
        System.out.println("\n\nAddition is = " + ans);
    }

}