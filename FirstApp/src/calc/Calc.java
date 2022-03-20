package calc;

public class Calc {

		//더하기 메서드
		public void add(int aNum, int bNum) {
			int result = aNum + bNum;
			this.printResult(aNum, bNum, result);
		}
		//빼기 메서드
		public void minus(int aNum, int bNum) {
			int result = aNum - bNum;
			this.printResult(aNum, bNum, result);
		}
		//곱하기 메서드
		public void multi(int aNum, int bNum) {
			int result = aNum * bNum;
			this.printResult(aNum, bNum, result);
		}
		//나누기 메서드
		public void divide(int aNum, int bNum) {
			double result = (double)aNum / bNum;
			this.printResult(aNum, bNum, result);
		}
		
		private void printResult(int aNum, int bNum, int result) {
			System.out.printf("%d와 %d의 연산 결과는 %d입니다. %n",aNum,bNum,result);
		}
		//printResult 오버로딩
		private void printResult(int aNum, int bNum, double result) {
			System.out.printf("%d와 %d의 연산 결과는 %5.3f입니다. %n",aNum,bNum,result);
		}
		
}
