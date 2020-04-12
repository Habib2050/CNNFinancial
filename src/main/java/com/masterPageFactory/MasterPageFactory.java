package com.masterPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {

		WebDriver driver;
		public  MasterPageFactory( WebDriver driver) {
			
			this.driver=driver;
		}
		
		@ FindBy //Source>>>Getter and Setter>>Click on elemnt u want to get>>>then click on getter>>generate
		(xpath=("(//*[@name='markets'])[1]"))
		private WebElement market;
		public WebElement getMarket() {
			return market;
		}
		
		@FindBy
		(xpath=("(//*[text()='Tech'])[1]"))
		private WebElement tech;
		public WebElement getTech() {
			return tech;
		}
		
		@FindBy
		(xpath=("(//*[text()='Media'])[1]"))
		private WebElement media;
		public WebElement getMedia() {
			return media;
		}
		@FindBy
		(xpath=("(//*[text()='Success'])[1]"))
		private WebElement success;
		public WebElement getSuccess() {
			return success;
		}
		@FindBy
		(xpath=("(//*[text()='Perspectives'])[1]"))
		private WebElement perspective;
		public WebElement getPerspective() {
			return perspective;
		}
		@FindBy
		(xpath=("(//*[text()='Videos'])[1]"))
		private WebElement videos;
		public WebElement getVideos() {
			return videos;
		}
		@FindBy
		(xpath=("//*[contains(@class,'three-equal-columns wsod')]"))
		private List <WebElement> topSection;
		public List<WebElement> getTopSection() {
			return topSection;
		}
		
		@FindBy
		(xpath="//*[@class='module-body wsod most-popular-stocks']")
		private List<WebElement> mostPopular;
		public List<WebElement> getMostPopular() {
			return mostPopular;
		}
		
		
		
		
		
				}
		
		
		
		
		
	


