package com.example.oneanothercookbook;

import java.util.ArrayList;
import java.util.Date;

public class ReceptBluda {
    String nazvanie;
    String polnoeOpisanie;
    String kratkoeOpisanie;
    //TODO:Время
    String foto;
    ArrayList<IngredientRecepta> ingredienty;
    ArrayList<EtapGotovki> etapy;

    public ReceptBluda() {
    }

    public ReceptBluda(String nazvanie, String polnoeOpisanie, String kratkoeOpisanie) {
        this.nazvanie = nazvanie;
        this.polnoeOpisanie = polnoeOpisanie;
        this.kratkoeOpisanie = kratkoeOpisanie;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public String getPolnoeOpisanie() {
        return polnoeOpisanie;
    }

    public void setPolnoeOpisanie(String polnoeOpisanie) {
        this.polnoeOpisanie = polnoeOpisanie;
    }

    public String getKratkoeOpisanie() {
        return kratkoeOpisanie;
    }

    public void setKratkoeOpisanie(String kratkoeOpisanie) {
        this.kratkoeOpisanie = kratkoeOpisanie;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public ArrayList<IngredientRecepta> getIngredienty() {
        return ingredienty;
    }

    public void setIngredienty(ArrayList<IngredientRecepta> ingredienty) {
        this.ingredienty = ingredienty;
    }

    public ArrayList<EtapGotovki> getEtapy() {
        return etapy;
    }

    public void setEtapy(ArrayList<EtapGotovki> etapy) {
        this.etapy = etapy;
    }

    @Override
    public String toString(){
        return this.nazvanie;
    }
}
