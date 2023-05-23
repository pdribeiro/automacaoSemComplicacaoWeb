package br.com.chronosacademy.steps;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage;

    @Before

    public void iniciaNavegador(){

        new Driver("chrome");
    }

    @After
    public void fechaNavegador(){

        Driver.getDriver().quit();
    }


    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();

    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFechaModal();

    }
    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try{
            loginPage.invisibilityofBtnFechar();

        }catch (Exception e){
            throw  new Exception("A janela modal não foi fechada");
        }
    }


    @Quando("for realizado um clique no icone de fechar da modal")
    public void forRealizadoUmCliqueNoIconeDeFecharDaModal() {
        loginPage.clickDivFechaModal();
        
    }

    @Quando("for realizado um clique no link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickInpLinkCreateAccount();
        
    }

    @Entao("a pagina Create Account deve ser exibida")
    public void aPaginaCreateAccountDeveSerExibida() {

        
    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String,String> map) {
        String username = map.get("login");
        String password = map.get("password");
        boolean remember = Boolean.parseBoolean(map.get("remember"));

        loginPage.setInpPassword(username);
        loginPage.setInpPassword(password);
        if(remember) loginPage.clickInpRemember();

        
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickBtnSigIn();
        
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {

        
    }

    @Entao("o sistema devera exibir uma mensagem de erro")
    public void oSistemaDeveraExibirUmaMensagemDeErro() {
        
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }
}
