/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

/**
 *
 * @author Priyam
 */
public class girls {
    String nameg;
    int attractivenessg;
    int main_budgetg;
    int intelligenceg;
    String statusg = "single";   //0 for and 1 for comitted
     public void girl_name(String Name)
    {
        nameg=Name;
    }
      public void girl_intelligence(int i)
    {
        intelligenceg = i;
    }
    public void girl_budget(int gd)
    {
        main_budgetg = gd;
    }
    public void girl_attract(int at)
    {
        attractivenessg = at;
    }
    
}
