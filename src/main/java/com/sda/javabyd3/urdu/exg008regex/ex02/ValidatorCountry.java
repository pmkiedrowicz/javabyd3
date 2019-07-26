package com.sda.javabyd3.urdu.exg008regex.ex02;
/**
 * Program sprwadzający poprawność numeru telefonu
 * Poprawne formaty to: 888888888, 888 888 888, 888-888-888
 * Oraz możliwość przedrosta kierunkowego do kraju: na przykłąd +48
 */

import java.util.regex.Pattern;

public class ValidatorCountry {

        public boolean checkPhoneNumber(String telephone){

            Pattern pattern = Pattern.compile("^([+][0-9]{2})?\\d{9}$|"
                    +"^([+][0-9]{2})?[0-9]{3}[ ][0-9]{3}[ ][0-9]{3}$|"
                    + "^([+][0-9]{2})?[0-9]{3}[-][0-9]{3}[-][0-9]{3}$"
                    +"");
            Boolean bool =pattern.matcher(telephone).matches();
            return bool;
        }

}
