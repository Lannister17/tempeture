import java.util.Scanner;

public class events {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;

        System.out.print("Hava Sıcaklıgını giriniz : ");
        temp = input.nextInt();

        if (temp<5){
            System.out.println("Kayak Etkinliğine katılmalısınız..");
        } else if (temp>=5 && temp<15) {
            System.out.println("Sinema Etkinliğine katılmalısınız..");
        } else if (temp>=15 && temp<25) {
            System.out.println("Piknik Etkinliğine katılmalısınız..");
        }else {
            System.out.println("Yüzme Etkinliğine katılmalısınız..");
        }
    }
}
