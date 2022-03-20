package calc;

public class Calc {

		//���ϱ� �޼���
		public void add(int aNum, int bNum) {
			int result = aNum + bNum;
			this.printResult(aNum, bNum, result);
		}
		//���� �޼���
		public void minus(int aNum, int bNum) {
			int result = aNum - bNum;
			this.printResult(aNum, bNum, result);
		}
		//���ϱ� �޼���
		public void multi(int aNum, int bNum) {
			int result = aNum * bNum;
			this.printResult(aNum, bNum, result);
		}
		//������ �޼���
		public void divide(int aNum, int bNum) {
			double result = (double)aNum / bNum;
			this.printResult(aNum, bNum, result);
		}
		
		private void printResult(int aNum, int bNum, int result) {
			System.out.printf("%d�� %d�� ���� ����� %d�Դϴ�. %n",aNum,bNum,result);
		}
		//printResult �����ε�
		private void printResult(int aNum, int bNum, double result) {
			System.out.printf("%d�� %d�� ���� ����� %5.3f�Դϴ�. %n",aNum,bNum,result);
		}
		
}
