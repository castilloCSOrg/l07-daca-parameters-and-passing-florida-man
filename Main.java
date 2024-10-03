// YOUR NAME: 
// COLLABORATORS: 
// DATE: 

public class Main
{
        final static String ASCII_ART_0 = "    .----.    .----.  ",
                ASCII_ART_1 = "   (  --  \\  /  --  )",
                ASCII_ART_2 = "          |  |        ",
                ASCII_ART_3 = "         _/  \\_      ",
                ASCII_ART_4 = "        (_    _)      ",
                ASCII_ART_5 = "     ,    `--`    ,   ",
                ASCII_ART_6 = "     \\'-.______.-'/  ",
                ASCII_ART_7 = "      \\          /   ",
                ASCII_ART_8 = "       '.--..--.'     ",
                ASCII_ART_9 = "         `\"\"\"\"\"` ",
                ASCII_CREDIT = "   ascii art by: jgs    ";

        final static String TITLE_USA = "UNITED STATES OF AMERICA",
                TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
        final static String LABEL_SURNAME = "Surname", LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
                LABEL_CATEGORY = "Category", LABEL_CARD_NUM = "Card#", LABEL_BIRTH_COUNTRY = "Country of Birth",
                LABEL_TERMS_CONDITIONS = "Terms and Conditions", LABEL_BIRTH_DATE = "Date of Birth",
                LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
                LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";
    public static void main(String[] args)
    {
        //ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
        

        //DECLARATION SECTION
        //complete fields
        String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
        char sex;

        //parts of fields
        String birthMonth;
        int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay, validMonth, validYear, expireMonth, expireDay, expireYear;

        //extra vars to help with formatting of Strings (not raw data like above vars)
        String uscisNum, dateOfBirth, validDate, expireDate;

        //INITIALIZATION SECTION
        surname = "CHAPETON-LAMAS";
        givenName = "NERY";
        uscisNum1 = 12;
        uscisNum2 = 4;
        uscisNum3 = 789;
        category = "C09";
        cardNum = "SRC9876543210";
        birthCountry = "Guatemala";
        termsAndConditions = "None";

        birthDay = 1;
        birthMonth = "JAN";
        birthYear = 1970;

        sex = 'M'; //note single quotes

        validMonth = 2;
        validDay = 2;
        validYear = 2020;

        expireMonth = 2;
        expireDay = 2;
        expireYear = 2022;

        //Strings to help clean up long printf's below
        uscisNum = String.format("%03d-%03d-%03d", uscisNum1, uscisNum2, uscisNum3);
        dateOfBirth = String.format("%02d %s %d", birthDay, birthMonth, birthYear);     
        validDate = Main.calcDate(validMonth, validDay, validYear);
        expireDate = Main.calcDate(expireMonth, expireDay, expireYear);

        System.out.println(Main.formatCard(surname, givenName, category, cardNum, birthCountry, termsAndConditions, sex, uscisNum, dateOfBirth, validDate, expireDate));
    }


        //INPUT + CALCULATION SECTION
        //N/A

        //OUTPUT SECTION
        public static String formatCard(String surname, String givenName,
    String category, String cardNum, String birthCountry, 
    String termsAndConditions, char sex, String uscisNum, 
    String dateOfBirth, String validDate, String expireDate)
    {
        String fullcard = "";
        fullcard += String.format("╔══════════════════════════════════════════════════════════════════════╗%n");
        fullcard += String.format("║%35s%35s║%n", TITLE_USA, "");
        fullcard += String.format("║%60s%10s║%n", TITLE_EAC, "");
        fullcard += String.format("║%-25s%-45s║%n", "", LABEL_SURNAME);
        fullcard += String.format("║%-25s%-45s║%n", "", surname);
        fullcard += String.format("║%-25s%-45s║%n", ASCII_ART_0, LABEL_GIVEN_NAME);
        fullcard += String.format("║%-25s%-45s║%n", ASCII_ART_1, givenName);
        fullcard += String.format("║%-25s%-15s%-15s%-15s║%n", ASCII_ART_2, LABEL_USCIS_NUM, LABEL_CATEGORY, LABEL_CARD_NUM);
        fullcard += String.format("║%-25s%-15s%-15s%-15s║%n", ASCII_ART_3, uscisNum, category, cardNum);
        fullcard += String.format("║%-25s%-45s║%n", ASCII_ART_4, LABEL_BIRTH_COUNTRY);
        fullcard += String.format("║%-25s%-45s║%n", ASCII_ART_5, birthCountry);
        fullcard += String.format("║%-25s%-45s║%n", ASCII_ART_6, LABEL_TERMS_CONDITIONS);
        fullcard += String.format("║%-25s%-45s║%n", ASCII_ART_7, termsAndConditions);
        fullcard += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_8, LABEL_BIRTH_DATE, LABEL_SEX);
        fullcard += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_9, dateOfBirth, sex);
        fullcard += String.format("║%-25s%-15s%-30s║%n", "", LABEL_VALID_DATE, validDate);
        fullcard += String.format("║%-25s%-15s%-30s║%n", "", LABEL_EXPIRE_DATE, expireDate);
        fullcard += String.format("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
        fullcard += String.format("╚══════════════════════════════════════════════════════════════════════╝%n");
        return fullcard;
    }
    public static String calcDate(int month, int Day, int Year)
    {
        String formattedDate;
        formattedDate = String.format("%02d/%02d/%4d", month, Day, Year);

        return formattedDate;

    }


}