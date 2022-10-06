package week3;

import java.util.Scanner;
public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		double temp;

		java.util.Scanner sc = new Scanner(System.in);

		System.out.println("번호를 선택하시오: ");
		number = sc.nextInt();

		if (number==1){
			System.out.println("화씨온도를 입력하시오: ");
			temp = sc.nextDouble();
			System.out.println("섭씨온도는 " + ((temp - 32)*5/9));
		
		} else {
				System.out.println("섭씨온도를 입력하시오: ");
				temp = sc.nextDouble();
				System.out.println("화씨온도는 " + (temp * 1.8 + 32));
			}
		}

	}


