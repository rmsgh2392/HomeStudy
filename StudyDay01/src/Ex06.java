
public class Ex06 {
 public static void main(String []args) {
	 
	 int x = 0;//�������� ������Ÿ�� x������ 0�� ����(�ʱ�ȭ)
	 System.out.printf("x = %d�ϋ�, �����̶��%n",x);
	 //x=%d(����)�϶� �����̶�� ��� ���ٶ���ְ� x�� ���
	 //%d�� ������ ��Ÿ���� ������ printf()�޼ҵ带 �� �� �����ڸ� ���ش�.
	 //%f,%e:�Ǽ� , %n���๮��, %d,%x,%o:���� , %c,%s:����
	 
	 if(x==0)System.out.println("x==0");
	 //���ǹ� if�� ���ǽ� x==0�� ���̸� ()�� ���
	 if(x!=0)System.out.println("x!=0");
	 //���ǽ� 'x�� 0�� �ƴϴ�'�� ���̸� ()���
	 if(!(x==0))System.out.println("!(x==0)");
	 //���ǽ� 'x�� 0�� �ƴϴ�'�� ���̸�()���
	 if(!(x!=0))System.out.println("!(x!=0)");
	 //���ǽ��� Ǯ�� 'x��0�ϋ�'���̸� ()���
	 
	 x=1;
	 System.out.printf("x = %d�϶�, �����̶��%n",x);
	
	 if(x==0)System.out.println("x==0");//���ǽĿ� �ʱ�ȭ�� x�� 1�� ���� ����
	 if(x!=0)System.out.println("x!=0");//���ǽ� ->true
	 if(!(x==0))System.out.println("!(x==0)");//���ǽ�->true
	 if(!(x!=0))System.out.println("!(x!=0)");//���ǽ�->false
	 
	 
 }
}