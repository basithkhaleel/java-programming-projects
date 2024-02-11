import java.util.*;
import java.text.DecimalFormat;
public class currencyconverter {
    public static void main(String[] args) {
        double rupee, dollar, pound, code, euro, KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to webeduclick currency converter project ***\nEnter the currency code\n1:rupees\n2:Dollar\n3:pound\n4:Euro\n5:Kuwaiti dinar");
        code = sc.nextInt();
        if (code == 1) {
            System.out.println("Enter amount in rupees");
            rupee = sc.nextDouble();
            dollar = rupee / 83.01;
            System.out.println("Dollar : " + f.format(dollar));
            pound = rupee / 94.46;
            System.out.println("pound :" + f.format(pound));
            euro = rupee / 80.36;
        } else if (code == 2) {
            System.out.println("Enter amount in dollar:");
            dollar =sc.nextDouble();
            rupee=dollar*83.01;
            System.out.println("Rupees :"+f.format(rupee));
            pound=dollar * 0.82;
            System.out.println("pound :"+f.format(pound));
            euro = dollar * 0.96;
            System.out.println("Euro :"+f.format(euro));
            KWD = dollar * 0.31;
            System.out.println("Kuwaiti dinar :" +f.format(KWD));
        } else if (code == 3) {
            System.out.println("Enter the amount in pound:");
            pound = sc.nextDouble();
            rupee = pound * 94.43;
            System.out.println("Rupees :"+f.format(rupee));
            dollar = pound * 1.22;
            System.out.println("Dollar :"+f.format(dollar));
            euro = pound * 1.17;
            System.out.println("Euro :"+f.format(euro));
            KWD = pound * 0.3748;
            System.out.println("Kuwaiti dinar :"+f.format(KWD));
        } else if (code == 4) {System.out.println("Enter the amount in Euro:");
            euro= sc.nextDouble();
            rupee =  euro * 80.43;
            System.out.println("Rupees :"+f.format(rupee));
            dollar = euro * 1.04;
            System.out.println("Dollar :"+f.format(dollar));
            pound = euro * 1.17;
            System.out.println("Euro :"+f.format(euro));
            KWD = euro * 0.318949;
            System.out.println("Kuwaiti dinar :"+f.format(KWD));
        } else if (code == 5) {
            System.out.println("Enter the amount in Kuwaiti dinar:");
            KWD= sc.nextDouble();
            rupee =  KWD * 251.96;
            System.out.println("Rupees :"+f.format(rupee));
            dollar = KWD * 3.26;
            System.out.println("Dollar :"+f.format(dollar));
            pound = KWD * 2.67;
            System.out.println("Euro :"+f.format(pound));
            euro = KWD * 3.13;
            System.out.println("Kuwaiti dinar :"+f.format(KWD));
        }else System.out.println("INVALID CODE!");
    }
}