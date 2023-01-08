package tests.contactUs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.CommentForm.*;
import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Urls.CONTACT_US_PAGE_URL;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContactUsTest extends BaseTest {

    @Test(invocationCount = 2, successPercentage = 99)
    public void headerButtonsTest () {
        startDriver("contactUs");
        basePage.goToUrl(CONTACT_US_PAGE_URL);
        basePage.waitOneSeconds();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_HEADER_BUTTONS; i++) {
            basePage.waitOneSeconds();
            basePage.headerOpenClick();
            basePage.waitOneSeconds();
            basePage.headerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(HEADER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(CONTACT_US_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void footerButtonsTest () {
        startDriver("contactUs");
        basePage.goToUrl(CONTACT_US_PAGE_URL);
        basePage.waitOneSeconds();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_FOOTER_BUTTONS; i++) {
            basePage.waitOneSeconds();
            basePage.footerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(FOOTER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(CONTACT_US_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_FOOTER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void mainLogoLinkTest () {
        startDriver("contactUs");
        basePage.goToUrl(CONTACT_US_PAGE_URL);
        basePage.waitOneSeconds();
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void successfulCommentFormTest () {
        startDriver("contactUs");
        basePage.goToUrl(CONTACT_US_PAGE_URL);
        basePage.waitOneSeconds();
        contactUsPage.enterName(NAME)
                .enterEmail(EMAIL)
                .enterSubject(SUBJECT)
                .enterComment(COMMENT)
                .submitButtonClick();
        basePage.waitTwoSeconds();
        assertTrue(contactUsPage.submitMessageVisibleCheck());
    }

}
