package edu.cosc4353.group3.AcornsEmulator;

import java.util.Scanner;

/**
 *
 * @author Detrich
 */
public class StartMenu {

    /**
     * @param args the command line arguments
     */
    private int Select = 0;
    
    public static void DisplayMenu()
    {
        //STARTUP MENU OPTIONS
        System.out.println("     Welcome!      ");
        System.out.println("");
        System.out.println("===================");
        System.out.println("    1: Login          ");
        System.out.println("    2: Sign Up ");
        System.out.println("    3: Exit ");
        System.out.println("===================");

    }
    public void UserInput(int selection)
    {
        //FUNCTION TO GET USER INPUT
        int Temp = 9999;
        Scanner UserScan =  new Scanner(System.in);
        Temp = UserScan.nextInt();
        setSelect(Temp);
        
    
    {
        //FUNTION TO ACCESS USER SELECTED OPTION
        switch(getSelect())
        {
        // Will add functions to access login/create/exit later
            //case 1: {}
            //case 2: {}
            //case 3: {}
        }
    }
    public int getSelect()
    {
        return Select;
    }
    
    public void setSelect(int newNumb)
    {
        Select = newNumb;
    }
    
    public void ResetSelect()
    {
        setSelect(0);
    }
    
    public static void main(String[] args) {
        
        //will add other functions later
        DisplayMenu();
    }
    
    
}