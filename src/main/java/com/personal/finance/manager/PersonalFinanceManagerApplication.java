package com.personal.finance.manager;

import java.io.FileReader;
import java.util.Scanner;

import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
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
			return "Welcome "+ personalFinance.getPfFirstName() + " " + personalFinance.getPfLastName()+ "\n\n"
					+ "2. Show all ventures \n\n3. Add Ventures \n\n4. ";
		}
		return "Please valid Information \n\n0. to continue \n\n1. Create the Personal Information";
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
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("D:\\Java\\InfoTrixs\\Personal-Finanace-Management\\Personal-Finanace-Management\\src\\main\\resources\\personalDetail.json");
		Object object = jsonParser.parse(fileReader);
		ObjectMapper objectMapper = new ObjectMapper();
		PersonalFinance personalFinance  = new PersonalFinance();
		String t = scanner.next();
		switch(t) {
			case "0":
				
			case "1":
				personalFinance = objectMapper.convertValue(object, PersonalFinance.class);
				System.out.println(this.personalControllerDao.createModulePersonal(personalFinance));
				break;
			case "2":
				System.out.println();
			default:
				System.out.println("you want to continue...");
				SpringApplication.run(PersonalFinanceManagerApplication.class, args);
				break;
		}
		scanner.close();
	}
}
