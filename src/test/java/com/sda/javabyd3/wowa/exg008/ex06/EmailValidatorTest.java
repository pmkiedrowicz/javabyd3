////Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres e-mail
////jest poprawny. Przygotuj klasę o nazwie EmailValidator posiadającą metodę
////public boolean validate(String email);
////Przygotuj test jednostkowy sprawdzający poprawność działania.
////Poprawny e-mail: prettyandsimple@example.com, very.common@example.com,
////disposable.style.email.with+symbol@example.com, other.email-with-dash@example.com
////Błędny e-mail: john.doe@example..com, Abc.example.com, just"not"right@example.com, john..doe@example.com

package com.sda.javabyd3.wowa.exg008.ex06;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class EmailValidatorTest
{
    EmailValidator ev = new EmailValidator();

    @Test
    public void isEmailValid ()
    {
        boolean result1 = ev.validate("prettyandsimple@example.com");
        boolean result2 = ev.validate("very.common@example.com");
        boolean result3 = ev.validate("disposable.style.email.with+symbol@example.com");
        boolean result4 = ev.validate("other.email-with-dash@example.com");

        Assert.assertThat(result1, is(true));
        Assert.assertThat(result2, is(true));
        Assert.assertThat(result3, is(true));
        Assert.assertThat(result4, is(true));
    }

    @Test
    public void isEmailInvalid ()
    {
        String email1 = "john.doe@example..com";
        String email2 = "Abc.example.com";
        String email3 = "just\"not\"right@example.com";
        String email4 = "john..doe@example.com";

        Assert.assertFalse(email1, ev.validate(email1));
        Assert.assertFalse(email2, ev.validate(email2));
        Assert.assertFalse(email3, ev.validate(email3));
        Assert.assertFalse(email4, ev.validate(email4));
    }
}
