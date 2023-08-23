package designPattern.TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    public void addCondiments() {
        System.out.println("우유와 설탕 추가");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")) {
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = "";

        System.out.println("커피와 우유에 설탕 넣을까? (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException ioe) {
            System.out.println("IO 오류");
        }
        if(answer == "") {
            return "no";
        }
        return answer;
    }
}
