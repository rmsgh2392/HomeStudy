import java.util.Scanner;

public class Ex07 {
	public static void main(String[]args) {
		int i = 0;
		System.out.print("�����ϳ��� �Է��ϼ���.:");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		//���ڿ� ���� tmp�� ����ڰ� �Է��� ���� ���´�
		//��) 15 - > "15"
		int input =Integer.parseInt(tmp);
		//���ڿ� ���� tmp�� ������ Ÿ������ �ٲ� ������Ÿ��
		//input�� ���� 
		
		if(i==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		}//ó���� �ʱ�ȭ�ߴ� i�� ���� ���ǽ��� ���� ������{}��� ����
		if(input !=0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� "+input+"�Դϴ�.");
		}//������ Ÿ������ ����� input������ ���ǽ���
		 //������ {}��� ���� 
		
				
		
	}

}
