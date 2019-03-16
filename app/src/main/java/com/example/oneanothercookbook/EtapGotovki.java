package com.example.oneanothercookbook;

import java.util.ArrayList;
import java.util.Date;

public class EtapGotovki {
    String opisanie;
    Date vremiaVyp;
    ArrayList<String> fotki;

    public EtapGotovki() {
    }

    public EtapGotovki(String opisanie) {
        this.opisanie = opisanie;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public Date getVremiaVyp() {
        return vremiaVyp;
    }

    public void setVremiaVyp(Date vremiaVyp) {
        this.vremiaVyp = vremiaVyp;
    }

    public ArrayList<String> getFotki() {
        return fotki;
    }

    public void setFotki(ArrayList<String> fotki) {
        this.fotki = fotki;
    }
}
