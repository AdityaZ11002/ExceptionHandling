public class Order {

	public void doSomething() {

		String name = null;

		try {
			System.out.println(name.length());
			System.out.println("After length:");

			int i = 10 / 0;

			String a[] = {};
			String str = a[5];
		}

		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Handled");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception Handled");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception handled");
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Driver.main " + i);
		}
	}
}






//// In this we get compalition error because of inorder of  exception

//public class Order {
//	
//	public void doSomething() {
//		
//		String name = null;
//		
//		try {
//		System.out.println(name.length());
//		System.out.println("After length:");
//		
//		int i = 10/0;
//		String a[] = {};
//		String str = a[5];
//		}
//		
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		catch (NullPointerException e) {
//		}
//		
//		catch (ArrayIndexOutOfBoundsException) {
//		}
//		
//		for (int i=0;i<5;i++) {
//			System.out.println("Driver.main" + i);
//		}
//		
//	}
//
//}
