package com.wipro.fundamentals;

public class VariableScope {
    boolean takeUmbrella;

    public static void main (String[] args) {
        VariableScope varScope = new VariableScope();
       // varScope.weather (isRaining true);
   // varScope.canVote(55);
    }

    public void weather( boolean isRaining){

        if(isRaining){
            takeUmbrella = true;
            String reminder = "don't forget to take the umbrella";
            System.out.println(reminder);
        }

     //   public void canVote (int age) {
            boolean vote = false;
            String message = "";

      //      if(age >=18){
                vote = true;
                message= "you are eligible to vote";
    }
       //     System.out.println(message);

}