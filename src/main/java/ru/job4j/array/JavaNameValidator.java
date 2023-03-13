package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        int index = 0;
        int code = name.codePointAt(index);
        if (!isLowerLatinLetter(code)) {
            return false;
        }
        for (index = 1; index < name.length(); index++) {
            code = name.codePointAt(index);
            if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code) || Character.isDigit(code)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return Character.isUpperCase(code) && code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return Character.isLowerCase(code) && code >= 97 && code <= 122;
    }
}
