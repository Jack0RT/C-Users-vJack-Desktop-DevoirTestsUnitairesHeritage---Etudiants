package Exo1;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class Jour
{
    private int idJour;
    private String nomJour;
    private ArrayList<Cours> lesCours;
    
    public Jour(int unId, String unNom)
    {
        idJour = unId;
        nomJour = unNom;
        lesCours = new ArrayList<Cours>();
    }
    
    public int getIdJour()
    {
        return idJour;
    }
    
    public String getNomJour()
    {
        return nomJour;
    }
    
    public ArrayList<Cours> getLesCours()
    {
        return lesCours;
    }
}
            
