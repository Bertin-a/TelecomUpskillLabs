package Bambai;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class createAccountTest extends bambai {
   private CreateAccount createAccount;

    @BeforeClass
    public void setup(){
        createAccount = new CreateAccount(bambai.driver);

    }
    @Test
    public void test() throws InterruptedException {
        //createAccount.fillForm();
        createAccount.login();
    }
}
