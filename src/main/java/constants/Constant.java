/**
 *  is now private
 * */

package constants;

import java.util.Arrays;
import java.util.List;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 20;
        public static final int EXPLICIT_WAIT = 20;
    }

    public static class Urls {
        public static final String MAIN_PAGE_URL = "https://book-of-ra-play.com/";
        public static final String ONLINE_CASINOS_PAGE_URL = "https://book-of-ra-play.com/online-casinos/";
        public static final String CONTACT_US_PAGE_URL = "https://book-of-ra-play.com/feedback/";
    }

    public static class Header {
        public static final List<String> HEADER_TITLES = Arrays.asList(
                "Book of Ra Online Slot in the SA - Book-of-Ra-Play.com",
                "Book of Ra Online Slot in the SA - Book-of-Ra-Play.com",
                "Book of Ra Online Slot in the UK - Book-of-Ra-Play.com",
                "Book of Ra Online Slot in the UK - Book-of-Ra-Play.com",
                "Book of Ra Online Slot in the USA - Book-of-Ra-Play.com",
                "Book of Ra Online Slot in the USA - Book-of-Ra-Play.com"
        );
        public static final int NUMBER_OF_GOOD_HEADER_BUTTONS = 3;

        public static final List<String> LANGUAGE_URLS = Arrays.asList(
                "/fr/"
        );
        public static final int MAX_AMOUNT_LANGUAGE_CHANGE_BUTTONS = 10;
    }

    public static class Footer {
        public static final List<String> FOOTER_TITLES = Arrays.asList(
                "Book of Ra Slot Machine",
                "Best Slots Online to Play for Free or for Money",
                "Best Online Mobile Casino Sites",
                "Contacts",
                "Sitemap",
                "Book-of-Ra-Play.com Privacy Policy - How We Use Visitor Information",
                "Book-of-Ra-Play.com - Terms Of Service Of Our Website",
                "What is Gambling Addiction? - Guide & Resources",
                "South African Online Casinos"
        );
        public static final int NUMBER_OF_GOOD_FOOTER_BUTTONS = 6;
    }

    public static class Reg {
        public static final List<String> REG_TITLES = Arrays.asList(
                "Two-Up Casino",
                "DrBet Casino",
                "bet365",
                "Mr Green"
        );
        public static final int NUMBER_OF_PLAY_FOR_REAL_MONEY_BUTTON_MAIN_PAGE = 3;
        public static final int NUMBER_OF_TOP_5_CASINOS_REVIEW_BUTTON_MAIN_PAGE = 5;
        public static final int NUMBER_OF_PLAY_NOW_BUTTON_MAIN_PAGE = 12;
    }

    public static class Reviews {

        public static final List<String> REVIEW_TITLES = Arrays.asList(
                "Sky Vegas Book Of Ra"
        );
        public static final List<String> AUTHORS_TITLES = Arrays.asList(
                "Denis Carter"
        );
        public static final List<String> CITIES_TITLES = Arrays.asList(
                "Aberdeen"
        );
        public static final int NUMBER_OF_LAST_ARTICLES_READ_MORE_BUTTON_MAIN_PAGE = 1;
    }

    public static class Common {
        public static final int NUMBER_OF_FAQ_COLLAPSE_BUTTONS = 4;
    }

    public static class CommentForm {
        public static final String TOPIC = "TestTest123";
        public static final String NAME = "TestTest123";
        public static final String EMAIL = "testtest123@gmail.com";
        public static final String SUBJECT = "TestTest123";
        public static final String COMMENT = "TesttestTesttest123";
        public static final String EMPTY = "";
        public static final int NUMBER_OF_ERROR_MESSAGE = 3;
    }
}
