package com.lemon.software.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang.StringUtils;

public class StringReplace {
    private String searchString;
    private String replacement;

    public StringReplace(String searchString, String replacement) {
        this.searchString = searchString;
        this.replacement = replacement;
    }

    public void replaceInput() {
        try {
            final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(StringUtils.replace(line, searchString, replacement));
            }

        } catch (IOException io) {
            throw new RuntimeException(io);
        }

    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: <token> <replace>");
            return;
        }
        new StringReplace(args[0], args[1]).replaceInput();
    }
}
