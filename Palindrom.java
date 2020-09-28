import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        //The logic is inside the for loops :)
	Scanner in= new Scanner(System.in);
        String angka=in.nextLine();

        String balik="";

        for(int i=angka.length()-1; i >=0; i--)
        {
            balik +=angka.charAt(i);

        }
        if(angka.equals(balik)){
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Bukan palindrom");
        }

    }
}
