package com.qa.Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpTravelsLandingPage {

		@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
		private WebElement searchBox;

		@FindBy(xpath = "//*[@id=\"dpd1\"]/div/input")
		private WebElement checkIn;
		
		@FindBy(xpath = "/html/body/div[9]/div[1]/table/tbody/tr[4]/td[3]")
		private WebElement checkInDate;
		
		@FindBy(xpath = "//*[@id=\"dpd2\"]/div/input")
		private WebElement checkOut;
		
		@FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[4]/td[4]")
		private WebElement checkOutDate;
		
		@FindBy(xpath = "//*[@id=\"travellersInput\"]")
		private WebElement peopleSection;
		
		@FindBy(xpath = "//*[@id=\"adultInput\"]")
		private WebElement adultInput;
		
		@FindBy(xpath = "//*[@id=\"hotels\"]/form/div[5]/button")
		private WebElement searchButton;
		
		
		public void searchFor(String text, String number) {

			searchBox.sendKeys(text+Keys.RETURN);
			checkIn.click();
			checkInDate.click();
			checkOut.click();
			checkOutDate.click();
			peopleSection.click();
			adultInput.sendKeys(number+Keys.RETURN);
			searchButton.click();
			
		}

}
