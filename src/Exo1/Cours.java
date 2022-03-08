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
public class Cours 
{
   private int idCours;
   private String nomCOurs;
   private int prixCours;
   
   public Cours(int unId, String unNom, int unPrix)
   {
       idCours = unId;
       nomCOurs = unNom;
       prixCours = unPrix;
   }
   
   public int getIdCours()
   {
       return idCours;
   }
   
   public String getNomCours()
   {
       return nomCOurs;
   }
   
   public int getPrixCours()
   {
       return 10;
   }
}
