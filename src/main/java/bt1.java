import javafx.scene.SceneAntialiasing;
import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cha = "";
        String con = "";
        boolean contains = false;
        System.out.println("Put String 1");
        cha = sc.nextLine();
        System.out.println("Put String 2");
        con = sc.nextLine();
        int numberAppear = 0;
        int dem=0;
        int idx=-1;
/*
        for (int i=1; i <= cha.length(); i++) {
            if (cha.equals(con)) {
                numberAppear++;
                contains = true;
                break;
            }
            if (contains) {
                System.out.println("ton tai String can tim kiem.");
                System.out.println(numberAppear);
            } else {
                System.out.println("khong ton tai");
            }
*/
while(dem!=-1)
{
    dem=cha.indexOf(con,idx+1);
    if(dem!=-1){
    numberAppear++;}
    idx=dem;
    contains = true;
}
        System.out.println(numberAppear);

    }
}