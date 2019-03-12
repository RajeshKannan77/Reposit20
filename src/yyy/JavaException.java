package yyy;

import java.io.IOException;
import java.sql.SQLException;

public class JavaException {

	 public static void main(String[] args) {
	
	 try {
	
	 System.out.println(10 / 0);
	 } finally {
	
	 System.out.println("Error code");
	 }
	
	 }
	
//	public static void main(String[] args)throws SQLException,Exception {
//		
//		throw new IOException("error");
//	}
}
