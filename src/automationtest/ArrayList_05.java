package automationtest;

import java.util.ArrayList;

public class ArrayList_05 {

    public static void main(String[] args) {

        ArrayList<String>value=new ArrayList();

             value.add("Scrum");
             value.add("Java");
             value.add("Jira");
             value.add("Selenium");
             value.add("Cucumber");
             value.add("Postman");

             for (String str:value){
                 System.out.println(str);
             }
    }
}
