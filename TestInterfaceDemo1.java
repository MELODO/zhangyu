package TestInterfaceDemo2;

	interface A
	 {
	 int i = 10 ;
	 public void sayI() ;
	 }
	 interface E
	 {
	 int x = 40 ;
	 public void sayE() ;
	 }
	 // B ͬʱ�̳��� A�� E �����ӿ�
	 interface B extends A,E
	 {
	 int j = 20 ;
	 public void sayJ() ;
	 }
	
	 // C �̳�ʵ�� B �ӿڣ�Ҳ����ζ��Ҫʵ�� A�� B�� E �����ӿڵĳ��󷽷�
	 class C implements B
	 {
	 public void sayI()
	 {
	 System.out.println("i = "+i);
	 }
	 public void sayJ()
	 {
	 System.out.println("j = "+j) ;
	 }
	 public void sayE()
	 {
	 System.out.println("e = "+x);
	 }
	 }
class TestInterfaceDemo2
	 {
   public static void main(String[] args)
	 {
	 C c = new C() ;
	 c.sayI() ;
	 c.sayJ() ;
	 }
 }
