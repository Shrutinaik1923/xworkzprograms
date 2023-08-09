package com.xworkz.boot;

import com.xworkz.app.accessspecifier.BlackBoxTheatre;
import com.xworkz.app.accessspecifier.Library;
import com.xworkz.app.accessspecifier.PublicLibrary;
import com.xworkz.app.accessspecifier.Theatre;

public class LibraryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LibraryRunner");
		Library library=new Library();
		library.groupStudy();
		
		Library library1=new Library();
		library1.groupStudy("bookMobile");
		
		Library library2=new Library();
		library2.groupStudy(10);
		
		Library library3=new Library();
		library3.groupStudy(10,true);
		
		Library library4=new Library();
		library4.groupStudy(10,'s');
		
		Library library5=new Library();
		library5.groupStudy("bookMobile",'s',8,10);
		
		System.out.println("####################################");
		
		Library publicLibrary=new PublicLibrary();
		publicLibrary.groupStudy();
		
		Library publicLibrary1=new PublicLibrary();
		publicLibrary1.groupStudy("bookMobile");
		
		Library publicLibrary2=new PublicLibrary();
		publicLibrary2.groupStudy(7);
		
		Library publicLibrary3=new PublicLibrary();
		publicLibrary3.groupStudy(10,true);
		
		Library publicLibrary4=new PublicLibrary();
		publicLibrary4.groupStudy(10,'s');
		
		Library publicLibrary5=new PublicLibrary();
		publicLibrary5.groupStudy("bookMobile",'m',7,10);

	}
	}


