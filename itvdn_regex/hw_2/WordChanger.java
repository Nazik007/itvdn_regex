package itvdn_regex.hw_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordChanger {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher("Ever since Harry Potter had come home for the summer, the Dursleys had been so mean and hideous that all Harry wanted was to get back to the Hogwarts School for Witchcraft and Wizardry.");
        System.out.println(matcher.replaceAll(" Java"));
    }
}
