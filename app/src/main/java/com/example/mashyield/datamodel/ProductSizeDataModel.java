package com.example.mashyield.datamodel;

public class ProductSizeDataModel {

    private final static String TABELA = "sizesQuantity";
    private final static String id ="id";
    private final static String pp ="pp";
    private final static String p ="p";
    private final static String m ="m";
    private final static String g ="g";
    private final static String gg ="gg";
    private final static String exg ="exg";
    private final static String total ="total";
    private final static String media ="media";

    private static String queryCriarTabela = "";

    public static String createTable(){

        queryCriarTabela = "CREATE TABLE " + TABELA +
                           "(" + id + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            pp + " INTEGER, " +
                            p + " INTEGER, " +
                            m + " INTEGER, " +
                            g + " INTEGER, " +
                            gg + " INTEGER, " +
                            exg + " INTEGER, " +
                            total + " INTEGER, " +
                            media + " REAL) ";
        return queryCriarTabela;
    }

    public static String getTABELA() {
        return TABELA;
    }

    public static String getId() {
        return id;
    }

    public static String getPp() {
        return pp;
    }

    public static String getP() {
        return p;
    }

    public static String getM() {
        return m;
    }

    public static String getG() {
        return g;
    }

    public static String getGg() {
        return gg;
    }

    public static String getExg() {
        return exg;
    }

    public static String getTotal() {
        return total;
    }

    public static String getMedia() {
        return media;
    }

    public static String getQueryCriarTabela() {
        return queryCriarTabela;
    }

    public static void setQueryCriarTabela(String queryCriarTabela) {
        ProductSizeDataModel.queryCriarTabela = queryCriarTabela;
    }
}
