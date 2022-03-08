/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo2;

/**
 *
 * @author jbuffeteau
 */
public class ClasseExo2
{
    public static double CalculerForfait(boolean licencie, int age,boolean carteNeige, boolean assurance)
    {
    
        
        int forfait =0 ;
        if (licencie == true)
        {
            forfait = 13;
        }
        else
        {
            if (age < 12)
            {
                forfait = 20;
            }
            else
            {
                forfait = 30;
            }
        }
        
        if(assurance == true)
        {
            forfait = forfait + 3;
        }
        
        if(carteNeige==true)
        {
            forfait = forfait - ( forfait * 10 / 100);
        }
        
        return 0;
        
    }
    

}
