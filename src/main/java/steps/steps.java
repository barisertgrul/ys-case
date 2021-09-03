package steps;

import pageObject.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;

import java.util.concurrent.TimeUnit;


public class steps extends BaseSteps{
    private BaseSteps base;
    private LoginPage loginpage;
    private Search search;
    private CloseBanners banners;
    private AddtoFav fav;
    private ClearFavList clr;
    private LoginwithWrongiD wrng;
    private LoginFail lgnfl;
    boolean result;

    public steps(BaseSteps base) {
        this.base = base;
        loginpage = new LoginPage(base.driver);
        search = new Search(base.driver);
        banners = new CloseBanners(base.driver);
        fav = new AddtoFav(base.driver);
        clr = new ClearFavList(base.driver);
        wrng = new LoginwithWrongiD(base.driver);
        lgnfl = new LoginFail(base.driver);


    }

    @Given("^I land on entry page$")
    public void iLandOnEntryPage() throws Exception {
        loginpage.navigateTo(config.getHost());
        loginpage.validate_city_select_page();
    }

    @When("^I click on city button$")
    public void iClickOnCityButton() throws InterruptedException {
        loginpage.selectcity();
        Thread.sleep(1000);
    }

    @Given("^I land on home page$")
    public void iLandOnHomePage() throws InterruptedException {
        loginpage.validatehomepage();
        Thread.sleep(1000);
    }
    @When("I enter email, password and click on Sign in button")
    public void iEnterEmailPasswordAndClickOnSignInButton() {
        loginpage.logInTheForm(config.getUserName(),config.getPassword());
    }
    @When("^I click to select region$")
    public void iClickToSelectRegion() throws InterruptedException {
        Thread.sleep(1000);
        search.validatehomepage();
        search.regiondropdown();

    }

    @And("^I enter region name$")
    public void iEnterRegionName() {
        search.regiontype();

    }

    @And("^I click on region$")
    public void iClickOnRegion() {
        search.selectregion();

    }

    @And("I close banabi banners")
    public void iCloseBanabiBanners() throws InterruptedException {
        Thread.sleep(5000);
        banners.banners();
    }

    @When("^I enter text on search box$")
    public void iEnterTextOnSearchBox() {
        search.search();

    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        search.searchbutton();
    }

    @Then("^I should see search results$")
    public void iShouldSeeSearchResults() {
        search.searchresults();
    }

    @When("^I click on first restaurant of results$")
    public void iClickOnFirstRestaurantOfResults() throws InterruptedException {
        search.selectfromsearchresults();
    }

    @Then("^I land on restaurant detail page$")
    public void iLandOnRestaurantDetailPage() {
        fav.landingtorestaurant();
    }

    @When("^I click on fav button$")
    public void iClickOnFavButton() {
        fav.addingfav();
    }

    @Then("^I should see fav icon turn yellow$")
    public void iShouldSeeFavIconTurnYellow() {
        fav.faviconyellow();
    }

    @Given("^I land on  favorites page$")
    public void iLandOnFavoritesPage() {
        clr.gotofavlist();
    }

    @When("^I click on restaurants checkbox that I want to remove$")
    public void iClickOnRestaurantsCheckboxThatIWantToRemove() {
        clr.selectrestaurants();
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        clr.clearlist();
    }

    @Then("^I should see deleted text on screen$")
    public void iShouldSeeDeletedTextOnScreen() {
        clr.emptylist();
    }

    @When("I enter email, wrong password and click on Sign in button")
    public void iEnterEmailWrongPasswordAndClickOnSignInButton() {
        wrng.logintry(config.getUserName(),config.getWrongPassword());
    }

    @Then("^I should see error popup$")
    public void iShouldSeeErrorPopup(){
        wrng.wrongidpopup();
    }

    @When("^I click on Ok button$")
    public void iClickOnOkButton() {
        wrng.popupclose();
    }
    @When("I enter email, password and try to click on Sign in button")
    public void iEnterEmailPasswordAndTryToClickOnSignInButton() {
        lgnfl.faillogin();
    }

}

