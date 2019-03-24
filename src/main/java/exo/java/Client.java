package exo.java;

import java.time.LocalDate;
import java.util.ArrayList;

// la class c'est le moule, 
// le constructeur c'est le constructeur d'objet qui va servir a créer les objets qui sont de type client. 
// le contrcuteur est DANS la class

class Client {
    private String identifiantClient;
    private String nomClient;
    private LocalDate datedenaissanceClient;
    private ArrayList<CompteBancaire> compteBancaire;

    // constructeur
    public Client () {
    }

    /**
     * @return the identifiantClient
     */
    public String getIdentifiantClient() {
        return identifiantClient;
    }

    /**
     * @param identifiantClient the identifiantClient to set
     */
    public void setIdentifiantClient(String identifiantClient) {
        this.identifiantClient = identifiantClient;
    }

    /**
     * @return the nomClient
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * @param nomClient the nomClient to set
     */
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    /**
     * @return the datedenaissanceClient
     */
    public LocalDate getDatedenaissanceClient() {
        return datedenaissanceClient;
    }

    /**
     * @param datedenaissanceClient the datedenaissanceClient to set
     */
    public void setDatedenaissanceClient(LocalDate datedenaissanceClient) {
        this.datedenaissanceClient = datedenaissanceClient;
    }

    /**
     * @return the compteBancaire
     */
    public ArrayList<CompteBancaire> getCompteBancaire() {
        return compteBancaire;
    }

    /**
     * @param compteBancaire the compteBancaire to set
     */
    public void setCompteBancaire(ArrayList<CompteBancaire> compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

}

