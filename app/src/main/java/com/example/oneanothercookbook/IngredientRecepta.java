package com.example.oneanothercookbook;

public class IngredientRecepta {
    String nazvanie;
    Double kolichestvo;
    String edinicaIzmereniia;
    String izobazhenie;

    public IngredientRecepta() {
    }

    public IngredientRecepta(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public IngredientRecepta(String nazvanie, Double kolichestvo, String edinicaIzmereniia) {
        this.nazvanie = nazvanie;
        this.kolichestvo = kolichestvo;
        this.edinicaIzmereniia = edinicaIzmereniia;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public Double getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(Double kolichestvo) {
        this.kolichestvo = kolichestvo;
    }

    public String getEdinicaIzmereniia() {
        return edinicaIzmereniia;
    }

    public void setEdinicaIzmereniia(String edinicaIzmereniia) {
        this.edinicaIzmereniia = edinicaIzmereniia;
    }

    public String getIzobazhenie() {
        return izobazhenie;
    }

    public void setIzobazhenie(String izobazhenie) {
        this.izobazhenie = izobazhenie;
    }
}
