
public class ForTest {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Test_1:
		54321
		5432
		543
		54
		5
		*/
		System.out.println("Test_1:");
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		 Test_2:
		 1
		 22
		 333
		 4444
		 55555
		 */
		System.out.println("\nTest_2:");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);;
			}
			System.out.println();
		}
		/*
		 Test_3:
		 九九乘法表：
		 1*1=1
		 1*2=2 2*2=4
		 1*3=3 2*3=6 3*3=9 
		 */
		System.out.println("\nTest_3:");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
		/*
		 Test_4:
		 * * * * *
		  * * * *
		   * * * 
		    * *
		     *
		 */
		System.out.println("\nTest_4:");		
		Demo();
	}
	
	public static void Demo() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(' ');
			}
			for(int j=i; j<5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
