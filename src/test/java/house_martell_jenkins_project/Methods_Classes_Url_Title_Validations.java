package house_martell_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validations {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validations.DoranMartell();
		Methods_Classes_Url_Title_Validations.OberynMartell();
		
		Methods_Classes_Url_Title_Validations HouseMartell = new Methods_Classes_Url_Title_Validations();
		HouseMartell.EllariaSand();
		HouseMartell.EliaSand();
		
		Methods_Classes_Url_Title_Validations HouseMartell1 = new Methods_Classes_Url_Title_Validations();
		HouseMartell1.ObellaSand();
	
		
			
	}
	public static void DoranMartell() {
		System.out.println("Lord of Sunspear");
	}
	public static void OberynMartell() {
		System.out.println("The RedViper");
	}
	public static void EllariaSand() {
		System.out.println("Serpent's Wife");
	}
	public static void EliaSand() {
		System.out.println("SandSnake 1");
	}
	public static void ObellaSand() {
		System.out.println("SandSnake 2");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Martell");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Martell";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Martell - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
			
		}
		
		
		
		
		

	}



		
		
	
		

	}


