package cTest2;

public interface XpathDirectory {
    //FRAME
    public static final String HEADER_LOGO = "//*[@id=\"root\"]/div/header/div[1]/a";
    public static final String SIGN_IN = "//*[@id=\"root\"]/div/header/div[2]/a[2]";
    public static final String ACCOUNT_NAME = "//*[@id=\"root\"]/div/header/div[2]/a[2]";
    public static final String ADMIN = "//*[@id=\"root\"]/div/header/div[2]/div/a";
    public static final String ADMIN_PRODUCT = "//*[@id=\"root\"]/div/header/div[2]/div/ul/li/a[2]";
    public static final String ADMIN_VENDOR = "//*[@id=\"root\"]/div/header/div[2]/div/ul/li/a[3]";
    public static final String ADMIN_FACTORY = "//*[@id=\"root\"]/div/header/div[2]/div/ul/li/a[4]";
    public static final String SEARCH_TEXT_BOX = "//*[@id=\"root\"]/div/main/div/ul[1]/li[1]/form/input";
    public static final String SEARCH_BUTTON = "//*[@id=\"root\"]/div/main/div/ul[1]/li[1]/form/button";
    public static final String SORT_BY = "//*[@id=\"root\"]/div/main/div/ul[1]/li[2]/text()";
    public static final String FOOTER = "//*[@id=\"root\"]/div/footer";

    //SIDEBAR
    public static final String SIDEBAR_OPEN_BUTTON = "//*[@id=\"root\"]/div/header/div[1]/button";
    public static final String CATEGORY = "//*[@id=\"searchOptions\"]/h2[1]";

    //LANDING
    public static final String ERROR = "//*[@id=\"root\"]/div/main/div/div";
    public static final String FIRST_THUMB_IMG = "//*[@id=\"root\"]/div/main/div/ul[2]/li[1]/div/a/img";
    public static final String FIRST_ITEM_PRODUCT_NAME = "//*[@id=\"root\"]/div/main/div/ul[2]/li[1]/div/div[1]/a";
    public static final String FIRST_ITEM_BRAND_NAME = "//*[@id=\"root\"]/div/main/div/ul[2]/li[1]/div/div[2]";
    public static final String FIRST_ITEM_PRICE = "//*[@id=\"root\"]/div/main/div/ul[2]/li[1]/div/div[3]";
    public static final String FIRST_ITEM_REVIEWS = "//*[@id=\"root\"]/div/main/div/ul[2]/li[1]/div/div[4]/div/span[6]";

    //SORT_BY
    public static final String SORT_BY_HIGHEST = "//*[@id=\"root\"]/div/main/div/ul[1]/li[2]/select/option[3]";
    public static final String SORT_BY_LOWEST = "//*[@id=\"root\"]/div/main/div/ul[1]/li[2]/select/option[2]";
    public static final String SORT_BY_NEWEST = "//*[@id=\"root\"]/div/main/div/ul[1]/li[2]/select/option[1]";
    public static final String SORT_DROPDOWN = "//*[@id=\"root\"]/div/main/div/ul[1]/li[2]/select";

    //SIGN_IN
    public static final String CREATE_ACCOUNT_BUTTON = "//*[@id=\"root\"]/div/main/div/div/form/ul/li[7]/a";
    public static final String SIGN_IN_EMAIL = "//*[@id=\"email\"]";
    public static final String SIGN_IN_PASSWORD = "//*[@id=\"password\"]";
    public static final String SIGN_IN_BUTTON = "//*[@id=\"root\"]/div/main/div/div/form/ul/li[5]/button";

    //CREATE_ACCOUNT
    public static final String CREATE_ACCOUNT_NAME = "//*[@id=\"name\"]";
    public static final String CREATE_ACCOUNT_EMAIL = "//*[@id=\"email\"]";
    public static final String CREATE_ACCOUNT_PASSWORD = "//*[@id=\"password\"]";
    public static final String CREATE_ACCOUNT_REPASSWORD = "//*[@id=\"rePassword\"]";
    public static final String REGISTER_BUTTON = "//*[@id=\"root\"]/div/main/div/div/form/ul/li[7]/button";

    //CREATE PRODUCT
    public static final String ADMIN_PRODUCT_LIST_FIRST_ITEM = "//*[@id=\"root\"]/div/main/div/div/div[2]/table/tbody/tr[1]/td[2]";
    public static final String ADMIN_PRODUCT_DELETE_FIRST_PRODUCT = "//*[@id=\"root\"]/div/main/div/div/div[2]/table/tbody/tr[1]/td[6]/button[2]";
    public static final String ERROR_CREATE_PRODUCT = "//*[@id=\"root\"]/div/main/div/div/div[2]/form/ul/li[2]/div";
    public static final String INITIAL_CREATE_PRODUCT_BUTTON ="//*[@id=\"root\"]/div/main/div/div/div[1]/button";
    public static final String NEW_PRODUCT_NAME = "//*[@id=\"name\"]";
    public static final String NEW_PRODUCT_PRICE = "//*[@id=\"price\"]";
    public static final String NEW_PRODUCT_IMG = "";
    public static final String NEW_PRODUCT_BRAND_NAME = "//*[@id=\"brand\"]/option[3]";
    public static final String NEW_PRODUCT_FACTORY = "//*[@id=\"factory\"]/option[5]";
    public static final String NEW_PRODUCT_STOCK_COUNT = "//*[@id=\"countInStock\"]";
    public static final String NEW_PRODUCT_RANKING = "//*[@id=\"ranking\"]";
    public static final String NEW_PRODUCT_CATEGORY = "//*[@id=\"category\"]";
    public static final String NEW_PRODUCT_DESCRIPTION = "//*[@id=\"description\"]";
    public static final String NEW_PRODUCT_CREATE_BUTTON = "//*[@id=\"root\"]/div/main/div/div/div[2]/form/ul/li[12]/button";

    //PRODUCT
    public static final String PRODUCT_IMG = "//*[@id=\"root\"]/div/main/div/div/div[2]/div[1]/img";
    public static final String PRODUCT_MAIN_NAME = "//*[@id=\"root\"]/div/main/div/div/div[2]/div[2]/ul/li[1]/h4";
    public static final String PRODUCT_MAIN_BRAND = "";
    public static final String PRODUCT_MAIN_REVIEW_LINK = "//*[@id=\"root\"]/div/main/div/div/div[2]/div[2]/ul/li[2]/a/div/span[6]";
    public static final String PRODUCT_MAIN_PRICE = "//*[@id=\"root\"]/div/main/div/div/div[2]/div[2]/ul/li[3]/b";
    public static final String PRODUCT_MAIN_DESCRIPTION = "//*[@id=\"root\"]/div/main/div/div/div[2]/div[2]/ul/li[4]/div";
    public static final String PRODUCT_MAIN_REVIEW_SECTION = "//*[@id=\"root\"]/div/main/div/div/div[3]/h2";
    public static final String PRODUCT_MAIN_STATUS = "//*[@id=\"root\"]/div/main/div/div/div[2]/div[3]/ul/li[2]";
    public static final String QUANTITY_TWO = "//*[@id=\"root\"]/div/main/div/div/div[2]/div[3]/ul/li[3]/select/option[2]";
    public static final String ADD_TO_CART = "//*[@id=\"root\"]/div/main/div/div/div[2]/div[3]/ul/li[4]/button";
    public static final String REVIEW_SIGN_IN = "//*[@id=\"reviews\"]/li[5]/div/a";

    //CREATE VENDOR
    public static final String ADMIN_VENDOR_LIST_FIRST_ITEM = "//*[@id=\"root\"]/div/main/div/div/div[2]/table/tbody/tr[1]/td[2]";
    public static final String ADMIN_VENDOR_DELETE_FIRST_PRODUCT = "//*[@id=\"root\"]/div/main/div/div/div[2]/table/tbody/tr[1]/td[4]/button[2]";
    public static final String INITIAL_CREATE_VENDOR_BUTTON ="//*[@id=\"root\"]/div/main/div/div/div[1]/button";
    public static final String ERROR_CREATE_VENDOR = "//*[@id=\"root\"]/div/main/div/div/div[2]/form/ul/li[2]/div";
    public static final String NEW_VENDOR_NAME = "//*[@id=\"name\"]";
    public static final String NEW_VENDOR_IMG = "";
    public static final String NEW_VENDOR_RANKING = "//*[@id=\"ranking\"]";
    public static final String NEW_VENDOR_DESCRIPTION = "//*[@id=\"description\"]";
    public static final String NEW_VENDOR_CREATE_BUTTON = "//*[@id=\"root\"]/div/main/div/div/div[2]/form/ul/li[7]/button";

    //CREATE FACTORY
    public static final String ADMIN_FACTORY_LIST_FIRST_ITEM = "//*[@id=\"root\"]/div/main/div/div/div[2]/table/tbody/tr[1]/td[2]";
    public static final String ADMIN_FACTORY_DELETE_FIRST_PRODUCT = "//*[@id=\"root\"]/div/main/div/div/div[2]/table/tbody/tr[1]/td[3]/button[2]";
    public static final String ERROR_CREATE_FACTORY = "//*[@id=\"root\"]/div/main/div/div/div[2]/form/ul/li[2]/div";
    public static final String INITIAL_CREATE_FACTORY_BUTTON ="//*[@id=\"root\"]/div/main/div/div/div[1]/button";
    public static final String NEW_FACTORY_NAME = "//*[@id=\"name\"]";
    public static final String NEW_FACTORY_ADDRESS = "//*[@id=\"address\"]";
    public static final String NEW_FACTORY_ADDRESS2 = "//*[@id=\"address2\"]";
    public static final String NEW_FACTORY_CITY = "//*[@id=\"city\"]";
    public static final String NEW_FACTORY_STATE = "//*[@id=\"state\"]";
    public static final String NEW_FACTORY_ZIP = "//*[@id=\"zip\"]";
    public static final String NEW_FACTORY_COUNTRY = "//*[@id=\"country\"]/option[132]";
    public static final String NEW_FACTORY_CREATE_BUTTON = "//*[@id=\"root\"]/div/main/div/div/div[2]/form/ul/li[10]/button";

    //REVIEW
    public static final String RATING_DROPDOWN = "//*[@id=\"rating\"]/option[5]";
    public static final String REVIEW_COMMENT = "//*[@id=\"reviews\"]/li[4]/form/ul/li[2]/textarea";
    public static final String SUBMIT_REVIEW_BUTTON = "//*[@id=\"reviews\"]/li[4]/form/ul/li[3]/button";
    public static final String NEW_TEST_REVIEW = "//*[@id=\"reviews\"]/li[5]/div[5]";

    //CART
    public static final String CART_LINK = "//*[@id=\"root\"]/div/header/div[2]/a[1]";
    public static final String CART_DELETE_PRODUCT = "//*[@id=\"root\"]/div/main/div/div/div[1]/ul/li[2]/div[2]/div[2]/button";
    public static final String TOTAL = "//*[@id=\"root\"]/div/main/div/div/div[2]/h3";
    public static final String PROCEED_TO_CHECKOUT = "//*[@id=\"root\"]/div/main/div/div/div[2]/button";

    public static final String GOOGLE_PAGE = "http://google.com";
    public static final String GOOGLE_SEARCH_BUTTON = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[6]/center/input[1]";
    public static final String YAHOO_PAGE = "http://yahoo.com";
    public static final String GOOGLE_SEARCH_AREA = "//*[@id=\"APjFqb\"]";
    public static final String FIRST_SEARCH_RESULT = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3";

}
