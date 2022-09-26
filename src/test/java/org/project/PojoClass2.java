package org.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass2 extends BaseClass{
	
	
public PojoClass2() {
		
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//input[@itemprop='query-input']")
	 private WebElement search;
	 
	 @FindBy(id="search_btn")
	 private WebElement searchbtn;
	  
	 @FindBy(xpath="//a[contains(text(),'Luxdream Home')]")
	 private WebElement product1;
	 
	 @FindBy(xpath="(//input[@class='add_cartbutton addToCartBtn testCartArrowRed'])[1]")
	 private WebElement addCart1;

     @FindBy(xpath="//input[@class='continue_shopbutton_viewcart']")
     private WebElement conti;
     
	 
	 @FindBy(xpath="(//a[contains(text(),'Queen ')])[1]")
     private WebElement product2;
	 
	 
	 @FindBy(xpath="(//a[@ref='code-LST'])[2]")
     private WebElement product3;
	 
	 @FindBy(xpath="//a[contains(text(),'Maxkon 40 Inch Wall')]")
     private WebElement product4;
	 
	 @FindBy(xpath="//a[text()='Maxkon 160W Cordless Stick ']")
     private WebElement product11;
	 
	 @FindBy(xpath="(//a[contains(text(),'Large Magnifying Glass')])[1]")
     private WebElement product22;
	 
	 
	 @FindBy(xpath="(//a[@ref='code-LST'])[2]")
     private WebElement product33;
	 
	 @FindBy(xpath="(//a[@ref='code-LST'])[2]")
     private WebElement product44;
	 

     //getter setter
	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public void setSearchbtn(WebElement searchbtn) {
		this.searchbtn = searchbtn;
	}

	public WebElement getProduct1() {
		return product1;
	}

	public void setProduct1(WebElement product1) {
		this.product1 = product1;
	}

	public WebElement getAddCart1() {
		return addCart1;
	}

	public void setAddCart1(WebElement addCart1) {
		this.addCart1 = addCart1;
	}

	public WebElement getProduct2() {
		return product2;
	}

	public void setProduct2(WebElement product2) {
		this.product2 = product2;
	}

	public WebElement getProduct3() {
		return product3;
	}

	public void setProduct3(WebElement product3) {
		this.product3 = product3;
	}

	public WebElement getProduct4() {
		return product4;
	}

	public void setProduct4(WebElement product4) {
		this.product4 = product4;
	}

	public WebElement getConti() {
		return conti;
	}

	public void setConti(WebElement conti) {
		this.conti = conti;
	}

	public WebElement getProduct11() {
		return product11;
	}

	public void setProduct11(WebElement product11) {
		this.product11 = product11;
	}

	public WebElement getProduct22() {
		return product22;
	}

	public void setProduct22(WebElement product22) {
		this.product22 = product22;
	}

	public WebElement getProduct33() {
		return product33;
	}

	public void setProduct33(WebElement product33) {
		this.product33 = product33;
	}

	public WebElement getProduct44() {
		return product44;
	}

	public void setProduct44(WebElement product44) {
		this.product44 = product44;
	}
		


}



