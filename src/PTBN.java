import java.util.Scanner;

public class PTBN {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Phương trình có dạng ax + b=0");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập hệ số a:");
        int a= scanner.nextInt();
        System.out.println("Nhập hệ số b:");
        int b = scanner.nextInt();

        if(a!=0){
            double solution=-b/a;
        }else {
            System.out.println("hệ số a khác không");
        }
    }
}
