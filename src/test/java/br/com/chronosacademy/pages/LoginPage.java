package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();

    }

    public void clckBtnFechar(){
        loginMap.btnFechar.click();

    }

    public void clickDivFechaModal(){
        loginMap.divFechaModal.click();
    }

    public void setInpUserName(String username){
      loginMap.inpUserName.sendKeys(username);
    }

    public void setInpPassword(String password){
        loginMap.inpPassword.sendKeys(password);

    }

    public void clickInpRemember(){
        loginMap.inpRemember.click();

    }

    public void clickInpLinkCreateAccount(){
        loginMap.linkCreateAccount.click();

    }

    public void clickBtnSigIn(){

        loginMap.btnSignIn.click();
    }

    public boolean isBtnSignIn(){

        return loginMap.btnSignIn.isEnabled();
    }

    public void visibilityofBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);

    }

    public void invisibilityofBtnFechar(){
        Driver.invisibilityOf(loginMap.btnFechar);

    }
}