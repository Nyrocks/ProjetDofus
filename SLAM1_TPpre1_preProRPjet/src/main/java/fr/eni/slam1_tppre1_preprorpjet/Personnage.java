/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.slam1_tppre1_preprorpjet;

/**
 *
 * @author erwan
 */
public class Personnage {
    private String nom;
    private String classe;
    private int niveau;
    private int pv;
    private int sagesse;
    private int force;
    private int intelligence;
    private int agilite;
    private int chance;
    private int pointDeCompetence;
    private Sort sortUn;
    private Sort sortDeux;
    private Sort sortTrois;
    public Personnage(String unNom, String uneClasse, int unNiveau, Sort unSortUn, Sort unSortDeux, Sort unSortTrois)
    {
        this.nom = unNom;
        this.classe = uneClasse;
        this.niveau = unNiveau;
        this.sortUn = unSortUn;
        this.sortDeux = unSortDeux;
        this.sortTrois = unSortTrois;
        this.pv = 50;
        this.sagesse = 0;
        this.force = 0;
        this.intelligence = 0;
        this.agilite = 0;
        this.chance = 0;
        this.pointDeCompetence = (this.niveau-1)*5;
    }

    public void remettreZeroStats()
    { 
        this.pv = this.pv - this.pv + 50;
        this.sagesse = this.sagesse - this.sagesse;
        this.force = this.force - this.force;       
        this.intelligence = this.intelligence - this.intelligence;
        this.agilite = this.agilite - this.agilite;
        this.chance = this.chance - this.chance;
        this.pointDeCompetence = (this.niveau-1)*5;
        System.out.println(this.pv);
        System.out.println(this.sagesse);
        System.out.println(this.force);
        System.out.println(this.intelligence);
        System.out.println(this.agilite);
        System.out.println(this.chance);
        System.out.println(this.pointDeCompetence);
        
    }
    public void affStats()
    {
        System.out.println(this.nom);
        System.out.println(this.classe);
        System.out.println(this.niveau);
        this.affPv();
        this.affSages();
        this.affIntel();
        this.affForce();
        this.affChanc();
        this.affAgili();
        this.affChanc();
        /*
        Cette fonction affiche la classe, le nom du personnage ainsi que toutes les statistiques.
        Vous pourrez vous aider des fonctions affX()que vous écrirez par la suite.
        */
    }   
    public void affPv()
    {
        System.out.println(this.pv);
    }
    public void affSages()
    {
        System.out.println(this.sagesse);
    }
    public void affIntel()
    {
        System.out.println(this.intelligence);  
    }
    public void affForce()
    {
        System.out.println(this.force);
    }
    public void affChanc()
    {
        System.out.println(this.chance);
    }
    public void affAgili()
    {
        System.out.println(this.agilite);
    }    
    
    public void affSorts()
    {
        System.out.println("\n\n\n\n\n");
        this.sortUn.affSort();
        System.out.println("\n\n\n\n\n");
        this.sortDeux.affSort();
        System.out.println("\n\n\n\n\n");
        this.sortTrois.affSort();
        /*
        Afficher les 3 sorts (sortUn, sortDeux, sortTrois) à l'aide de la fonction affSort (disponible dans la classe Sort).
        */
    }
    
    public void affSortsCombat()
    {
        this.sortUn.affDegatSort(1111,111,111,11);
        this.sortDeux.affDegatSort(1111,111,111,11);
        this.sortTrois.affDegatSort(1111,111,111,11);
        /*
        Utiliser affDegatSort sur les trois sorts du personnage.
        Cela servira à afficher les dégâts des sorts en combat :
        -> Contrairement à affSorts qui affiche les dégâts de base.
        */
    }
    
    public void augmenterStats(int nbAugmenter, int choixStats)
    {
        while (nbAugmenter >= 0){
        if (choixStats == 1){
            System.out.println("Combien de points voulez vous augmenter ? : \n");
         choixStats += this.pv;   
         System.out.println(this.pv);
        }
        if (choixStats == 2){
            System.out.println("Combien de points voulez vous augmenter ? : \n");
         choixStats += this.sagesse; 
         System.out.println(this.sagesse);
        }
        if (choixStats == 3){
            System.out.println("Combien de points voulez vous augmenter ? : \n");
         choixStats += this.intelligence;  
         System.out.println(this.intelligence);
        }
        if (choixStats == 4){
            System.out.println("Combien de points voulez vous augmenter ? : \n");
         choixStats += this.force;
         System.out.println(this.force);
        }
        if (choixStats == 5){
            System.out.println("Combien de points voulez vous augmenter ? : \n");
         choixStats += this.chance;
         System.out.println(this.chance);
        }
        if (choixStats == 6){
            System.out.println("Combien de points voulez vous augmenter ? : \n");
         choixStats += this.agilite;  
         System.out.println(this.agilite);
        }
        if (choixStats > nbAugmenter){
            System.out.println("Pas assez de points\n");
        }
            }
        
       /* Dépense autant de points de compétence qu'une statistique a été augmentée.
        /!\ Attention, on ne peut pas dépenser les points que nous n'avons pas.
        Dans ce cas, il faudra afficher "Pas assez de point".*/
          
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getSagesse() {
        return sagesse;
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getPointDeCompetence() {
        return pointDeCompetence;
    }

    public void setPointDeCompetence(int pointDeCompetence) {
        this.pointDeCompetence = pointDeCompetence;
    }

    public Sort getSortUn() {
        return sortUn;
    }

    public void setSortUn(Sort sortUn) {
        this.sortUn = sortUn;
    }

    public Sort getSortDeux() {
        return sortDeux;
    }

    public void setSortDeux(Sort sortDeux) {
        this.sortDeux = sortDeux;
    }

    public Sort getSortTrois() {
        return sortTrois;
    }

    public void setSortTrois(Sort sortTrois) {
        this.sortTrois = sortTrois;
    }
    
}
