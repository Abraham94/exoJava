package exo.java;

class CompteBancaire {
    private Client client;
    private String numeroCompte;
    private Double soldeCompteBancaire;

    public CompteBancaire () {
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the numeroCompte
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * @param numeroCompte the numeroCompte to set
     */
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    /**
     * @return the soldeCompteBancaire
     */
    public Double getSoldeCompteBancaire() {
        return soldeCompteBancaire;
    }

    /**
     * @param soldeCompteBancaire the soldeCompteBancaire to set
     */
    public void setSoldeCompteBancaire(Double soldeCompteBancaire) {
        this.soldeCompteBancaire = soldeCompteBancaire;
    }

    
}
