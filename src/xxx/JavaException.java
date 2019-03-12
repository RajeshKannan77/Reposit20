package xxx;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Arithmetic Exception
		// int i= 10/0;
		// System.out.println(i);

		// NullPointerException
		// String a=null;
		// System.out.println(a.length());

		// InputMismatchException
		// System.out.println("Enter value");
		// int b=sc.nextInt();
		// System.out.println(b);

		// ArrayIndexOutofBoundException
		// int num[]=new int[4];
		// System.out.println(num[4]);

		// StringIndexOutofBoundException
		// String a="Raj";
		// System.out.println(a.charAt(3));

		// IndexOutofBoundException
		// ArrayList name=new ArrayList();
		// name.add("raj");
		// name.add("ram");
		// System.out.println(name.get(2));

		// NumberFormatException
		// String a="12345";
		// int b=Integer.parseInt(a);
		// System.out.println(b+5);
		// String c="12abc45";
		// int d=Integer.parseInt(c);
		// System.out.println(d+5);

		// int i=8;
		// int j=0;
		// try {
		//
		// System.out.println(i/j);
		//
		// }
		// catch(Exception e) {
		//
		// System.out.println("Arithmetic Exception");
		// }

		// int i = 8;
		// int j = 2;
		// try {
		//
		// System.out.println(i / j);
		// String h = null;
		// System.out.println(h.length());
		// } catch (ArithmeticException e) {
		//
		// System.out.println("ArithmeticException");
		// } catch (Exception e) {
		//
		// System.out.println("NullPointerException");
		// }

		// int i = 8;
		// int j = 2;
		//
		// try {
		//
		// System.out.println(i / j);
		// String h = "RAJ";
		// System.out.println(h.length());
		//
		// }
		//
		// catch (ArithmeticException e) {
		//
		// System.out.println("ArithmeticException");
		// }
		//
		// catch (Throwable e) {
		//
		// System.out.println("NullPointerException");
		// } finally {
		//
		// System.out.println("Remaining code");
		// }

		// int i=8;
		// int j=2;
		// try {
		//
		// int k=i/j;
		//
		// if(k==4) {
		//
		// throw new ArithmeticException();
		//
		// }String h=null;
		//
		// System.out.println(h.length());
		// }
		// catch(ArithmeticException e) {
		//
		// System.out.println("ArithmeticException");
		//
		// }finally {
		//
		// System.out.println("End the code");
		// }

		// int i=8;
		// int j=0;
		//
		// try {
		//
		// System.out.println(i/j);
		// }catch(ArithmeticException e) {
		//
		// e.printStackTrace();
		// }

		// try {
		//
		// for (int l = 0; l <= 8; l++) {
		//
		// if (l == 4) {
		//
		// throw new MyException("error");
		// }
		//
		// System.out.println(l);
		// }
		// } catch (MyException e) {
		//
		// System.out.println(e);
		// } finally {
		//
		// System.out.println("remaining code executed");
		// }

		try {

			System.out.println(10 / 2);

			try {

				String h = null;
				System.out.println(h.length());

				try {

					int[] num = new int[5];

					System.out.println(num[3]);
				} catch (ArrayIndexOutOfBoundsException e) {

					System.out.println("ArrayIndexOutOfBoundsException");
				}

				finally {

					System.out.println("Code End");
				}
			} catch (NullPointerException e) {

				System.out.println("NullPointerException");
			}

			finally {

				System.out.println("Code End");
			}
		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException");

		}

		finally {

			System.out.println("Code End");
		}

	}

}
