package org.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass3 extends BaseClass {
	
	public PojoClass3() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[text()='All Categories']")
	private WebElement drop;
	
	
	@FindBy(xpath="//h2[@class='clf']")
	private WebElement clicks;
	
	public WebElement getDrop() {
		return drop;
	}

	public void setDrop(WebElement drop) {
		this.drop = drop;
	}

	public WebElement getClicks() {
		return clicks;
	}

	public void setClicks(WebElement clicks) {
		this.clicks = clicks;
	}

	public WebElement getHome() {
		return home;
	}

	public void setHome(WebElement home) {
		this.home = home;
	}

	public WebElement getApp() {
		return App;
	}

	public void setApp(WebElement app) {
		App = app;
	}

	public WebElement getFurn() {
		return furn;
	}

	public void setFurn(WebElement furn) {
		this.furn = furn;
	}

	public WebElement getGarden() {
		return garden;
	}

	public void setGarden(WebElement garden) {
		this.garden = garden;
	}

	public WebElement getSport() {
		return sport;
	}

	public void setSport(WebElement sport) {
		this.sport = sport;
	}

	public WebElement getPet() {
		return pet;
	}

	public void setPet(WebElement pet) {
		this.pet = pet;
	}

	public WebElement getOutdoor() {
		return outdoor;
	}

	public void setOutdoor(WebElement outdoor) {
		this.outdoor = outdoor;
	}

	public WebElement getBaby() {
		return baby;
	}

	public void setBaby(WebElement baby) {
		this.baby = baby;
	}

	public WebElement getBath() {
		return bath;
	}

	public void setBath(WebElement bath) {
		this.bath = bath;
	}

	public WebElement getBeauty() {
		return beauty;
	}

	public void setBeauty(WebElement beauty) {
		this.beauty = beauty;
	}

	@FindBy(xpath="//span[text()='Holiday Deals']")
	private WebElement home;
	@FindBy(xpath="//a[text()='Christmas Trees']")
	private WebElement s1;
	
	
	@FindBy(xpath="(//span[text()='Appliances'])[1]")
	private WebElement App;
	@FindBy(xpath="//a[text()='Ice Makers']")
	private WebElement s2;
	
	
	@FindBy(xpath="(//span[text()='Furniture'])[1]")
	private WebElement furn;
	@FindBy(xpath="//a[text()='Clothes Rack']")
	private WebElement s3;
	
	
	@FindBy(xpath="(//span[text()='Home & Garden'])[1]")
	private WebElement garden;
	@FindBy(xpath="//a[text()='Mouse Trap']")
	private WebElement s4;
	
	
	@FindBy(xpath="(//span[text()='Sports & Fitness'])[1]")
	private WebElement sport;
	@FindBy(xpath="//a[text()='Helmets']")
	private WebElement s5;
	
	
	@FindBy(xpath="(//span[text()='Pet Supplies'])[1]")
	private WebElement pet;
	@FindBy(xpath="//a[text()='Cat Toys']")
	private WebElement s6;
	
	
	@FindBy(xpath="(//span[text()='Outdoor & Leisure'])[1]")
	private WebElement outdoor;
	@FindBy(xpath="//a[text()='Pool Cleaners']")
	private WebElement s7;
	
	
	@FindBy(xpath="(//span[text()='Baby, Kids & Toys'])[1]")
	private WebElement baby;
	@FindBy(xpath="//a[text()='Baby Care']")
	private WebElement s8;
	
	
	@FindBy(xpath="(//span[text()='Bedding & Bath'])[1]")
	private WebElement bath;
	@FindBy(xpath="//a[text()='Mirrors']")
	private WebElement s9;
	
	
	@FindBy(xpath="(//span[text()='Health & Beauty'])[1]")
	private WebElement beauty;
	@FindBy(xpath="//a[text()='Massage Chair']")
	private WebElement s10;

	public WebElement getS1() {
		return s1;
	}

	public void setS1(WebElement s1) {
		this.s1 = s1;
	}

	public WebElement getS2() {
		return s2;
	}

	public void setS2(WebElement s2) {
		this.s2 = s2;
	}

	public WebElement getS3() {
		return s3;
	}

	public void setS3(WebElement s3) {
		this.s3 = s3;
	}

	public WebElement getS4() {
		return s4;
	}

	public void setS4(WebElement s4) {
		this.s4 = s4;
	}

	public WebElement getS5() {
		return s5;
	}

	public void setS5(WebElement s5) {
		this.s5 = s5;
	}

	public WebElement getS6() {
		return s6;
	}

	public void setS6(WebElement s6) {
		this.s6 = s6;
	}

	public WebElement getS7() {
		return s7;
	}

	public void setS7(WebElement s7) {
		this.s7 = s7;
	}

	public WebElement getS8() {
		return s8;
	}

	public void setS8(WebElement s8) {
		this.s8 = s8;
	}

	public WebElement getS9() {
		return s9;
	}

	public void setS9(WebElement s9) {
		this.s9 = s9;
	}

	public WebElement getS10() {
		return s10;
	}

	public void setS10(WebElement s10) {
		this.s10 = s10;
	}
	
	

}
