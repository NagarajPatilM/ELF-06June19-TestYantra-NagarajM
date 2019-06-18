package com.testyantra.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WritingObbjectDemo {

	public static void main(String[] args) {
		FileInputStream f = null;
		ObjectInputStream obj = null;
		// FileOutputStream f=null;
		// ObjectOutputStream obj=null;
		WritingObjectPerson p = new WritingObjectPerson();
		p.setName("virat");
		p.setId(18);
		try {
			// f=new FileOutputStream("nag.java",true);
			// obj=new ObjectOutputStream(f);
			// obj.writeObject(p);

			f = new FileInputStream("nag.java");
			obj = new ObjectInputStream(f);
			WritingObjectPerson w = (WritingObjectPerson) obj.readObject();
			System.out.println(w.getId());
			System.out.println(w.getName());

			// obj.close();
			System.out.println("done");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (f != null) {
				try {
					f.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
