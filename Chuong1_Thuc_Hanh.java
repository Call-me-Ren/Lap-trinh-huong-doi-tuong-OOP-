
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Chuong1_Thuc_Hanh {

    //khai báo toàn cục
    static int n;
    static ArrayList<Integer> a = new ArrayList<>();

    //ham goc :D
    public static void main(String[] args) {

        System.out.println("----------------- MENU CHINH ----------------- ");
        System.out.println("1. Bai tap tren lop");
        System.out.println("2. Bai tap ve nha");
        System.out.println("3. Thoat");
        System.out.println("----------------------------------------------");
        System.out.print("MOI BAN NHAP (VD: 1):  ");
        Scanner sc_Choice = new Scanner(System.in);
        int choice = sc_Choice.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. Bt2_1a");
                System.out.println("2. Bt2_1b");
                System.out.println("3. Bt2_1c");
                System.out.println("4. Bt2_1d");
                System.out.println("5. Bt2_2a");
                System.out.println("6. Bt2_2b");
                System.out.println("7. Bt2_2c");
                System.out.println("8. Bt2_2d");
                System.out.println("9. Bt2_2e");
                System.out.println("10. Bt2_2f");
                System.out.print("MOI BAN NHAP:  ");
                int choice1 = sc_Choice.nextInt();
                switch (choice1) {
                    case 1:
                        bt2_1a();
                        break;
                    case 2:
                        bt2_1b();
                        break;
                    case 3:
                        bt2_1c();
                        break;
                    case 4:
                        bt2_1d();
                        break;
                    case 5:
                        bt2_2a();
                        break;
                    case 6:
                        bt2_2b();
                        break;
                    case 7:
                        bt2_2c();
                        break;
                    case 8:
                        bt2_2d();
                        break;
                    case 9:
                        bt2_2e();
                        break;
                    case 10:
                        bt2_2f();
                        break;
                    default:
                        System.out.println("???? GET OUT!!! ");
                        break;
                }
                break;
            case 2:
                System.out.println("1. Bt3_g1");
                System.out.println("2. Bt3_g2");
                System.out.println("3. Giai_phuong_trinh_Bac2bt3_g2");
                System.out.println("4. Bt3_perfect_Number");
                System.out.println("5. Bt3_j");
                System.out.println("6. Bt3_k");
                System.out.println("7. Bt3_1");
                System.out.println("8. Bt3_m");
                System.out.println("9. Bt3_n");
                System.out.println("10. Bt3_o");
                System.out.println("11. Bt3_p");
                System.out.print("MOI BAN NHAP:  ");
                int choice2 = sc_Choice.nextInt();
                switch (choice2) {
                    case 1:
                        bt3_g1();
                        break;
                    case 2:
                        bt3_g2();
                        break;
                    case 3:
                        giai_phuong_trinh_Bac2();
                        break;
                    case 4:
                        perfect_Number();
                        break;
                    case 5:
                        bt3_j();
                        break;
                    case 6:
                        bt3_k();
                        break;
                    case 7:
                        bt3_l();
                        break;
                    case 8:
                        bt3_m();
                        break;
                    case 9:
                        bt3_n();
                        break;
                    case 10:
                        bt3_o();
                        break;
                    case 11:
                        bt3_p();
                        break;
                    default:
                        System.out.println("???? GET OUT!!! ");
                        break;
                }
                break;
            case 3:
                System.out.println("--- Chuc ban mot ngay tot lanh ---");
                break;
            default:
                System.out.println("???? GET OUT!!! ");
                break;
        }
        System.out.print("Cac gia tri trong mang la: ");
        for (int pt : a) {
            System.out.print(pt + " ");
        }

//choice 1 la chon bt tren lop, choice 2 la bt ve nha
    }

    // các hàm bài tập
    //bt2_1a();      
    //bt2_1b();    
    //bt2_1c();
    //bt2_1d();
    //bt3_g1();
    //bt3_g2();
    //giai_phuong_trinh_Bac2();
    //perfect_Number();
    //bt2_2a();
    //bt2_2b();
    //bt2_2c();
    //bt2_2d();
    //bt2_2e();
    //bt2_2f();
    //bt3_j();
    //bt3_k();
    //bt3_l();
    //bt3_m();
    //bt3_n();
    //bt3_o();
    //bt3_p();
    //a. Nhập chiều dài, chiều rộng của HCN. Tính chu vi, iện tích HCN đó.
    public static void bt2_1a() {
        System.out.print("Moi nhap chieu dai va chieu rong ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        while (a <= 0 || b <= 0) {
            System.out.println("Loi roi, nhap lai di ");
            a = sc.nextFloat();
            b = sc.nextFloat();
        }
        float chuVi = (a + b) * 2;
        float dienTich = a * b;
        System.out.println("Chu Vi= " + chuVi + ", " + " Dien tich= " + dienTich);
    }

//b. Nhập 3 số nguyên a,b,c. Xuất số max, min của 3 số đó.
    public static void bt2_1b() {
        System.out.print("Moi nhap 3 so nguyen ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();

        while (a < 0 || b < 0 || c < 0) {
            System.out.print("Loi roi, nhap lai di:  ");
            a = sc1.nextInt();
            b = sc1.nextInt();
            c = sc1.nextInt();
        }

        float max = a;
        if (a < b) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Max la " + max);
        float min = a;
        if (a > b) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Min la " + min);
    }

//c. Nhập vào số nguyên dương n. Xuất các ước của n.
    public static void bt2_1c() {
        System.out.print("Moi nhap vao so nguyen duong n ");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();

        while (n <= 0) {
            System.out.print("Loi roi, nhap lai di:  ");
            n = sc2.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

//d. Nhập vào số nguyên dương x. Đếm số chữ số của x
    public static void bt2_1d() {
        System.out.print("Moi nhap vao so nguyen duong x: ");
        Scanner sc3 = new Scanner(System.in);
        int x = sc3.nextInt();
        while (x < 0) {
            System.out.print("Loi roi, nhap lai di:  ");
            x = sc3.nextInt();
        }
        int dem = 1;
        int bien = x;
        for (int i = 1; i <= bien; i++) {
            bien /= 10;
            if (bien > 0) {
                dem++;
            }
        }
        System.out.println("So chu so cua x la: " + dem);
    }

//g.Tinh tong cac S sau: S=1+2+3+...+n
    public static void bt3_g1() {

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n cua day S=1+2+3+...+n ");
        int n = sc4.nextInt();

        while (n < 0) {
            System.out.print("Loi roi nhap lai di");
            n = sc4.nextInt();
        }

        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tong cua day S la: " + tong);
    }

//g.Tinh tong cac S sau: S=1/1+1/2+1/3+...1/n
    public static void bt3_g2() {
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n cua day S=1+2+3+...+n ");
        int n = sc5.nextInt();

        while (n < 0) {
            System.out.print("Loi roi nhap lai di");
            n = sc5.nextInt();
        }

        float tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (float) 1 / i;
        }
        System.out.println("Tong cua day S la: " + tong);
    }

//h. giai phuong trinh bac 2: ac^2+bx+c=0    
    public static void giai_phuong_trinh_Bac2() {
        System.out.println("moi nhap 3 so a, b,c  ");
        Scanner sc5 = new Scanner(System.in);
        double a = sc5.nextDouble();
        double b = sc5.nextDouble();
        double c = sc5.nextDouble();
        double x, x1, x2;
        double delta = Math.pow(b, 2) - 4 * a * c;
        //a==0
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("phuong trinh vo so nghiem ");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("phuong trinh vo nghiem ");
        } else if (a == 0 && b != 0) {
            System.out.println("phuong trinh co 1 nghiem x= " + -c / b);
            //a!=0
        } else {
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co 2 nghiem " + x1 + " " + x2);
            } else if (delta == 0) {
                System.out.println("phuong trinh co nghiem kep" + " " + -b / (2 * a));
            } else {
                System.out.println("phuong trinh vo nghiem ");
            }
        }
    }

    /*i.Kiểm tra 1 số nguyên x có là số hoàn thiện không? Biết rằng số hoàn thiện là số có tổng
các ước (trừ nó ra) bằng chính nó.
Ví dụ: 6 là số hoàn thiện vì 6 có các ước: 1,2,3,6 Vậy trừ 6 ra, tổng các ước: 1+2+3=6*/
    public static void perfect_Number() {
        System.out.print("Moi nhap so x de check ");
        Scanner sc6 = new Scanner(System.in);
        int x = sc6.nextInt();

        while (x <= 0) {
            System.out.print("Loi roi, nhap lai di");
            x = sc6.nextInt();
        }
        int tong = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                tong += i;
            }
        }

        if (x == tong) {
            System.out.println("So " + x + " la so hoan hao ");
        } else {
            System.out.println("nah ");
        }
    }

    /*Tạo ArrayList a chứa n số nguyên. Viết các hàm sau:*/
    //a. Nhập các giá trị cho mảng a. Xuất mảng. (n=5)
    public static void bt2_2a() {
        Scanner sc_Mang = new Scanner(System.in);
//        System.out.print("Moi nhap vao so phan tu trong mang: "); //code dư để cần thì dùng :D
//        int n=sc_Mang.nextInt();      
        int n = 5;
        a.clear();
        for (int i = 0; i < n; i++) {
            System.out.print("Mang " + "[" + i + "]: ");
            int x = sc_Mang.nextInt();
            a.add(x);
        }
        System.out.print("Cac gia tri trong mang la: ");
        for (int pt : a) {
            System.out.print(pt + " ");
        }
    }

    //b. Sinh các giá trị ngẫu nhiên <100 cho a. Xuất mảng (n>=15)
    public static void bt2_2b() {
        Scanner sc7 = new Scanner(System.in);
        Random ngau_Nhien = new Random();
        int max = 100;

        int n = ngau_Nhien.nextInt(86) + 15;
        a.clear();
     

        for (int i = 0; i < n; i++) {
            int x = ngau_Nhien.nextInt(max);
            a.add(x);
        }
        System.out.print("Cac gia tri trong mang la: ");
        for (int pt : a) {
            System.out.print(pt + " ");
        }
    }

    //c. Thêm vô a 3 phần tử nhập từ bàn phím.
    public static void bt2_2c() {
        Scanner sc8 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Moi nhap Mang" + "[" + i + "]: ");
            int n = sc8.nextInt();
            a.add(n);
        }
    }

    //d. Xóa các số là bội của 5 trong a.
    public static void bt2_2d() {
//        System.out.println("Moi nhap n phan tu se co trong mang ");
//        Scanner sc9 = new Scanner(System.in);
//        int n = sc9.nextInt();
        for (int i = a.size() - 1; i >= 0; i--) {
            int vl = a.get(i);
            if (vl % 5 == 0) {
                a.remove(i);
            }
        }
    }

    //e. Tìm trong a có chứa số x không? Với x nhập từ bàn phím
    public static void bt2_2e() {
        System.out.print("Moi nhap x phan tu se co trong mang: ");
        Scanner sc9 = new Scanner(System.in);
        int x = sc9.nextInt();
        boolean ktra = a.contains(x);
        System.out.println(ktra);
    }

    //f. Xuất các phần có chữ số hàng chục là 1 trong a.
    public static void bt2_2f() {
        System.out.print("Cac phan tu co hang chuc = 1: ");
        for (int vl : a) {
            if ((vl / 10) % 10 == 1) {
                System.out.print(vl + " ");
            }
        }
    }

    //Phần ArrayList
    /*j. Tính tổng các phần tử là số có tổng các chữ số là chẵn. Ví dụ: 35, 28 là số có tổng các
chữ số là chẵn.*/
    public static void bt3_j() {
        int tong = 0;
        for (int pt : a) {
            int sum = 0;
            int temp = pt;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum % 2 == 0) {
                tong += pt;
            }
        }
        System.out.println(tong);
    }

    //k. Cắt mảng a thành các mảng con có 3 phần tử. Xuất các mảng con đó
    public static void bt3_k() {
        for (int i = 0; i < a.size(); i += 3) {
            ArrayList<Integer> mangCon = new ArrayList<>();

            for (int j = i; j < i + 3 && j < a.size(); j++) {
                mangCon.add(a.get(j));
            }

            System.out.println("Mang con: " + mangCon);
        }
    }

    /*l. Sắp xếp mảng a tăng dần/giảm dần. Xuất kết quả Ví dụ: Mảng a: 24 13 20 28 71
➔ Kết quản chèn 24 13 20 48 28 71*/
    public static void bt3_l() {
        Collections.sort(a);
        System.out.print("Mang tan dan la : ");
        Collections.sort(a, Collections.reverseOrder());
        System.out.print("Mang giam dan la : ");

    }

    //m. Chèn vào giữa 2 phần tử là số chẵn giá trị tổng của chúng.
    public static void bt3_m() {
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) % 2 == 0 && a.get(i + 1) % 2 == 0) {
                int tong = a.get(i) + a.get(i + 1);
                a.add(i + 1, tong);
                i++;
            }
        }

    }

    //n. Kiểm tra mảng a có chứa bao nhiêu số chẵn? bao nhiêu số lẻ?
    public static void bt3_n() {
        int dem_Chan = 0;
        int dem_Le = 0;
        for (int pt : a) {
            if (pt % 2 == 0) {
                dem_Chan++;
            } else {
                dem_Le++;
            }
        }
        System.out.println("So luong so chan: " + dem_Chan);
        System.out.println("So luong so le: " + dem_Le);
    }

    //o. Tìm số lớn nhất/nhỏ nhất trong a.
    public static void bt3_o() {
        int max = Collections.max(a);
        int min = Collections.min(a);
        System.out.print("Max la: " + max);
        System.out.print("Min la: " + min);
    }

    //p. Tính trung bình cộng các phần tử trong a
    public static void bt3_p() {
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < a.size(); i++) {
            dem++;
        }
        for (int pt : a) {
            tong += pt;
        }
        float tong_Final = (float) tong / dem;
        System.out.println("Trung binh cong cua cac phan tu trong a la " + tong_Final);
    }

}

