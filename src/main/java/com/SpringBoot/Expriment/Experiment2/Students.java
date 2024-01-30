package com.SpringBoot.Expriment.Experiment2;

public class Students {

    private String First_Name;
    private String Roll_Number;

    Students(String First_Name,String Roll_Number){
            this.First_Name = First_Name;
            this.Roll_Number = Roll_Number;
    }

    public String get_First_Name(){
            return this.First_Name;
    }

    
    

    public String get_Roll_Number(){
        return this.Roll_Number;
    }

    public void set_Roll_Number(String Roll_Number){
        this.Roll_Number = Roll_Number;
    }

    
    public void set_First_Name(String First_Name){
        this.First_Name = First_Name;
    }
    
   
}
