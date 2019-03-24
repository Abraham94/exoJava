package exo.java;

import java.util.ArrayList;

class Banque {
    private String codeBanque;
    // Int c'est uniquement lorsque tu vas faire un calcul avec donc le codebanque
    // est une string
    private String nomBanque;
    private String adresseBanque;
    private ArrayList<Client> clientsBanque;

    public Banque() {
    }

    /**
     * @return the codeBanque
     */
    public String getCodeBanque() {
        return codeBanque;
    }

    /**
     * @param codeBanque the codeBanque to set
     */
    public void setCodeBanque(String codeBanque) {
        this.codeBanque = codeBanque;
    }

    /**
     * @return the nomBanque
     */
    public String getNomBanque() {
        return nomBanque;
    }

    /**
     * @param nomBanque the nomBanque to set
     */
    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    /**
     * @return the adresseBanque
     */
    public String getAdresseBanque() {
        return adresseBanque;
    }

    /**
     * @param adresseBanque the adresseBanque to set
     */
    public void setAdresseBanque(String adresseBanque) {
        this.adresseBanque = adresseBanque;
    }

    /**
     * @return the clientsBanque
     */
    public ArrayList<Client> getClientsBanque() {
        return clientsBanque;
    }

    /**
     * @param clientsBanque the clientsBanque to set
     */
    public void setClientsBanque(ArrayList<Client> clientsBanque) {
        this.clientsBanque = clientsBanque;
    }

    @Override
    public String toString() {
        return this.nomBanque;
    }

    
}