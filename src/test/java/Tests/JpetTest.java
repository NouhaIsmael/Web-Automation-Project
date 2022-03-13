package Tests;

import base.JpetsBase;
import org.testng.annotations.Test;
import pages.*;
import static org.testng.Assert.*;

public class JpetTest extends JpetsBase {

    @Test
    public void TestAllJPetFunctions () throws InterruptedException {

      // REGISTERATION TEST //

      SignInPage signinpage = jhomepage.ClickSignInLinktoRegister();
     /* RegisterPage registerpage = signinpage.ClickRegisterNowLink();
      registerpage.USERINFO("NohA","123456","123456");
      registerpage.ACCOUNTINFO("Nouha","Ismael","ex@ex.com",

              "01234567890","abbasya","street 6","cairo",
              "EG","1212","Egypt");
      registerpage.LANGUAGEPREF();
      registerpage.FAVORITECATEGORY();
      registerpage.ENABLEMYLIST();
      registerpage.ENABLEMYBANNER();
      registerpage.CLICKONSAVEACCOUNTINFOBUTTON();*/

      // SIGN IN TEST //
      signinpage.USERNAMEFIELD("NohA");
      signinpage.PASSWORDFIELD("123456");
      signinpage.CLICKLOGINBUTTON();

     // CLICK ON DOGS ICON LINK //
      GoToDogsTypePage dogtypepage = jhomepage.ClickDogsIconLink();

      // CLICK TO CHOOSE DOG TYPE //
      GoToDalmationDogPage poodledogpage = dogtypepage.ClickToChooseDogType();

      // CHOOSE MALE PUPPY //
      SpottedAdultFemaleDalmationDescriptionPage SpottedAdultFemaleDalmation =  poodledogpage.CHOOSEMALEPUPPY();

      // CLICK ON ADD TO CART //
      GoToShoppingCart shoppingcart = SpottedAdultFemaleDalmation.ClickAddToCart();

      // TEST TO CHANGE THE QUANTITY //

             // --------- Assertion on Total Cost = Quantity * List Price ----------- //

      String Quantity = "3";
      float listprice = 18.50F;
      int quantity = Integer.parseInt(Quantity);
      float Expectedtotalprice = quantity*listprice;

      String NewExpectedTotalPrice = Float.toString(Expectedtotalprice);
      String FinalExpectedTotalPrice = "$" + NewExpectedTotalPrice + "0";

      System.out.println(" The Final Expected result is = " + FinalExpectedTotalPrice);

      shoppingcart.CHANGEQUANTITY(Quantity);

      shoppingcart.ClickOnUpdateCartToUpdateTheTotalCost();

      String ActualTotalPrice = shoppingcart.getTotalPrice();

      System.out.println(" The Actual result is = " + ActualTotalPrice);

      assertEquals(ActualTotalPrice,FinalExpectedTotalPrice,"Actual Price and Final total Price are not matched");

      PaymentDetailsPage paymentdetails = shoppingcart.ClickProceedToCheckout();

      //TEST TO CONFIRM/CHANAGE THE PAYMENT DETAILS //

      paymentdetails.ChangeCardType();
      paymentdetails.ChangeCardNumber("123567890001000");
      ConfrimingTheInfoPage confirmtheinfopage  = paymentdetails.ClickContinueButton();

      //TEST TO CONFIRM THE CHECKOUT & RETURN BACK T HOMEPAGE //

      ThankYouPage thankyou = confirmtheinfopage.ClickConfirmToCheckOut();
      assertTrue(thankyou.GetConfirmationMsg().contains("Thank you, your order has been submitted."),
              "Confirmation message is incorrect");

      thankyou.ClickOnReturnToMainMenuLink();

      System.out.println(" The user is redirected to the home page successfully after clicking on the Return main menu link ");

      jhomepage.ClickSignOutButton();

        }
    }


