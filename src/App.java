import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();

            if(a == 360 || a >=0 && a <90){
                System.out.println("Bom Dia!!");
            }else if(a >=90 && a <180){
                System.out.println("Boa Tarde!!");
            }else if(a >=180 && a <270){
                System.out.println("Boa Noite!!");
            }else if(a >=270 && a < 360){
                System.out.println("De Madrugada!!");
            }
        }

        sc.close();
    }
}
