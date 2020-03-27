package com.HeadFirst.Chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    public CoffeeWithHook() {
    }

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    // implement the hook
    boolean customerWantsCondiment() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y") ? true : false ;

    }

    private String getUserInput() {

        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n) ? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();

        }catch (IOException ioe){
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null){
            return "no";
        }

        return answer;
    }


}
