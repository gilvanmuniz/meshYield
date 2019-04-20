package com.example.mashyield.model;

public class ProductSize {

    private int id;
    private int pp;
    private int p;
    private int m;
    private int g;
    private int gg;
    private int exg;
    private int total;
    private double media;


   /* private static final ProductSize ourInstance = new ProductSize();

    public static ProductSize getInstance() {
        return ourInstance;
    }*/

    public ProductSize() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getGg() {
        return gg;
    }

    public void setGg(int gg) {
        this.gg = gg;
    }

    public int getExg() {
        return exg;
    }

    public void setExg(int exg) {
        this.exg = exg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
