package dictionnary;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Import impot=new Import();
        Scanner sc=new Scanner(System.in);
        int menu=0;
        System.out.println("-------------");
        System.out.println("Menu");
        System.out.println("Chọn:1 để nhập dữ liệu.\n" +
                            "CHọn: 2 Để tra từ điển\n"+
                            "CHọn:0 để thoát ");
        menu=sc.nextInt();sc.nextLine();
        if (menu==1) {
            System.out.println("Nhập vào từ khóa ");
            String keyWord = sc.nextLine();
            System.out.println("Nhập vào ý nghĩa ");
            String meaning = sc.nextLine();
        }else if (menu==2){
                System.out.println("Nhập vào từ cần tìm ");
                String keyWord=sc.nextLine();
                System.out.println("Ý ngĩa là"+ impot.WordLookup(keyWord));
        }
    }
}
