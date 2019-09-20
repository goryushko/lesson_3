//I must write a program that print "Hello world" to the console using both the method "transformIntToChar"
// and "printList" one.
import java.util.ArrayList;
public class Task_8 {
    public static void main(String[] args) {

        printList(transformIntToChar(72,101,108,108,111,32,119,111,114,108,100));
    }
    private static ArrayList<Character>transformIntToChar(int... values){
        ArrayList<Character>buffer = new ArrayList();
        for (int i: values) {
            buffer.add(((char)i));
        }
        return buffer;
    }
    private static void printList(ArrayList<Character>characters){
        for (char c: characters) {
            System.out.print(c);
        }
    }
}



