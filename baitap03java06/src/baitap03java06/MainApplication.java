package baitap03java06;

import java.util.Scanner;

public class MainApplication {
	
	public static void main(String[] args) {
		
//		Bai 1: Tính cạnh huyền tam giác vuông.
		
//		Khai báo dữ liệu input:
//		Scanner soLieu = new Scanner(System.in);
//		Khai báo biến 1
//		System.out.println("nhập cạnh góc vuông 1: ");
//		Double canhA = soLieu.nextDouble();
//		Khai báo biến 2
//		System.out.println("nhập cạnh góc vuông 2: ");
//		Double canhB = soLieu.nextDouble();
//		Khai báo cạnh huyền và công thức tính
//		double canhHuyen = Math.sqrt(canhA * canhA + canhB + canhB);
//		System.out.println("Cạnh Huyền " + canhHuyen);
		
//		Bài 2: P(x) = ax^n; với x = 8
		
//		Khai báo dữ liệu input:
//		Scanner number = new Scanner(System.in);
//		Khai báo biến a (số thực double)
//		System.out.println("Nhập số thực: ");
//		double a = number.nextDouble();
//		Khai báo biến n (số nguyên int)
//		System.out.println("Nhập số nguyên: ");
//		int n = number.nextInt();
//		Khai báo biến x = 8
//		int x = 8;
//		Tính công thức
//		double ketQua = a*Math.pow(x, n);
//		System.out.println("Kết quả là: " + ketQua);
		
//		Bài 3: Tính tổng 2 ký số
		
//		Khai báo dữ liệu input:
//		Scanner data = new Scanner(System.in);
//		Khai báo biến số
//		System.out.println("nhập số liệu: ");
//		int number = data.nextInt();
//		Lấy ký số từ số liệu input:
//		int soDonvi = number%10;
//		int soHangChuc = (number - soDonvi)/10;
//		Xổ kết quả
//		System.out.println("Kết quả: " + (soDonvi + soHangChuc));
		
//		Bài 4 Tính trung bình 5 số input

//		Khai báo số data input
		Scanner data = new Scanner(System.in);
//		Khai báo biến 1
		System.out.print("Nhập số 1 từ bàn phím: ");
		int no1 = data.nextInt();
//		Khai báo biến 2
		System.out.print("Nhập số 2 từ bàn phím: ");
		int no2 = data.nextInt();
//		Khai báo biến 3
		System.out.print("Nhập số 3 từ bàn phím: ");
		int no3 = data.nextInt();
//		Khai báo biến 4
		System.out.print("Nhập số 4 từ bàn phím: ");
		int no4 = data.nextInt();
//		Khai báo biến 5
		System.out.print("Nhập số 5 từ bàn phím: ");
		int no5 = data.nextInt();
//		Tính trung bình 5 số 
		System.out.println("Kết quả trung bình 5 số là: " + (no1+no2+no3+no4+no5/5));
		
//		Bài 5 Đổi độ C -> F
		
//		Khai báo data C input:
//		Scanner data = new Scanner(System.in);
//		Khai báo biến C
//		System.out.println("nhập độ C: ");
//      double doC = data.nextDouble();
//      chuyển đổi sang F
//      System.out.println("Độ F là: " + ((doC*1.8)+32));
		
//		Bài 6 Đổi VND -> USD với tỷ giá là 23500vnd
		
//		Khai báo vnd input
//		Scanner money = new Scanner(System.in);
//		Chuyển đổi vnd -> usd
//		System.out.println("Nhập số tiền: ");
//		double VND = money.nextDouble();
//		double tyGiaUSD = 23.500;
//		System.out.println("Giá trị quy đổi: " + (VND/tyGiaUSD));
		
	}

}
