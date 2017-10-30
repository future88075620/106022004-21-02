import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h;
        h=in.nextInt();
        if(h<=40)
            System.out.print(h*100);
        else
            System.out.print(4000+(h-40)*120);
    }
}
