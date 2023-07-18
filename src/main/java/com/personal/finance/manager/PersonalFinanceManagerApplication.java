package com.personal.finance.manager;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.personal.finance.manager.dao.PersonalControllerDao;
import com.personal.finance.manager.entities.PersonalFinance;

@SpringBootApplication
public class PersonalFinanceManagerApplication implements CommandLineRunner {
	
	@Autowired
	private PersonalControllerDao personalControllerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(PersonalFinanceManagerApplication.class, args);
	}
	
	public String loginCheck(String str,String pass) {
	PersonalFinance personalFinance = this.personalControllerDao.loginPersonal(str, pass);
		if(personalFinance.getPfEmail() != null) {
			return "Welcome "+ personalFinance.getPfFirstName() + personalFinance.getPfLastName()+ "\n\n"
					+ "1. Show all ";
		}
		return "Please valid Information \n\n Enter to continue \n\n2. Create the Personal Information";
	}
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\t\t\t\t Welcome To Personal Finance Manager \t\t\t\t\t");
		System.out.println("Enter the email or mobile no:- ");
		String str = scanner.nextLine();
		System.out.println("Enter your password:");
		String pass = scanner.nextLine();
		System.out.println(loginCheck(str,pass));
//		String st = scanner.next();
		KeyListener keyListener = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
