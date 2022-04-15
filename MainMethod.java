package com.spring;


import com.spring.configs.AppConfig;
import com.spring.entities.Library;
import com.spring.services.LibraryService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) throws InterruptedException, SQLException {
        
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        LibraryService libraryService = context.getBean(LibraryService.class);
        Scanner sc = new Scanner(System.in);
        
        do
		{
			System.out.println("Enter your choice :");
			System.out.println("1. Insert 2. Delete 3. Update  4.Retrieve  5. Exit");
			int n=sc.nextInt();
			switch(n) {
			
			case 1:System.out.println("Insertion");
				libraryService.insert(new Library(sc.nextInt(),sc.next(),sc.nextLong(),sc.next(),sc.next()));
				break;
				
			case 2:System.out.println("deletion");
			
				Library l=new Library();
				l.setBorid(sc.nextInt());
				libraryService.delete(l);
				break;
				
			case 3:System.out.println("Updating");
				libraryService.update(new Library(sc.nextInt(),sc.next(),sc.nextLong(),sc.next(),sc.next()));
				break;
				
			
			case 4:System.out.println("Retriving School Information");
    		List<Library> ly=libraryService.selects();
    		for(Library i:ly) {
    			System.out.println(i.getBorid()+"    "+i.getBorName()+"     "+i.getBorMobno()+"     "+i.getDept()+"      "+i.getBookName());
    		}
    		break;
			
			case 5:System.out.println("existing");
				System.exit(0);
				break;
			
			
			}
			}while(true);
			

        // Add Library
      //  libraryService.add(new Library(5,"Meera", 9573986754l, "EEE","BEE"));
      
        //Delete Library
      /*  Library l=new Library();
        l.setBorid(6);
        libraryService.delete(l);*/
        
        //Update Library
     /*   Library ly=new Library();
        ly.setBorid(5);
        ly.setBorName("Kiara");
        ly.setBorMobno(9784335428l);
        ly.setDept("Mechanical");
        ly.setBookName("Thermodynamics");
        libraryService.update(ly);*/
       
        
       // context.close();
    }
}