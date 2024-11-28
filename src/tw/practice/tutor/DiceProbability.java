package tw.practice.tutor;

public class DiceProbability {

	public static void main(String[] args) {
		int d1, d2, d3, d4, d5, d6;//骰子的1~6面
		d1 = d2 = d3 = d4 = d5 = d6 = 0;
		
		int n =10000000; //投擲次數控制項
		
		for (int i = 0; i < 10000000; i++) {
			int p = (int) (Math.random() * 6)+1;
			switch (p) {
//			計算每點次數
			case 1:
				d1++;
				break;
			case 2:
				d2++;
				break;
			case 3:
				d3++;
				break;
			case 4:
				d4++;
				break;
			case 5:
				d5++;
				break;
			case 6:
				d6++;
				break;
			}
		}
		System.out.printf("1 : %d 次%n2 : %d 次%n3 : %d 次%n4 : %d 次%n5 : %d 次%n6 : %d 次%n", d1, d2, d3, d4, d5, d6);
	}

}
