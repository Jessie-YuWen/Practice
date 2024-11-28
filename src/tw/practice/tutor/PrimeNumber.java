package tw.practice.tutor;

import java.util.LinkedList;

public class PrimeNumber {

	public static void main(String[] args) {

		long T1,T2;
		T1= System.currentTimeMillis();//計算執行時間，單位毫秒
		int total=10000000;//計算範圍的控制項
		LinkedList prime = new LinkedList();//存放質數

		for (int v = 2; v < total; v++) {
			boolean isPrime = true;
			for (int i = 2; i < v; i++) {
				if (v % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				prime.add(v);
//				System.out.printf("%d 是質數%n", v); //如需列印出質數可開啟
			}
		}
		System.out.printf("包含 %d 在內，共有 %d 個質數%n",total,prime.size());
		T2=System.currentTimeMillis();//執行結束時間
		System.out.printf("計算到 %d 的質數，共花了 %d 秒",total,(T2-T1)/1000);
	}
}
