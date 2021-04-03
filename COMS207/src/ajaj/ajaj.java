package ajaj;
public class ajaj
{
public static boolean mystery(String input) {
    int size = input.length();
    for (int i = 0; i < size/2; i++) {
        if (input.charAt(i) != input.charAt(size - i - 1))
               { return false; }
               
    }
    return true;

	}
}