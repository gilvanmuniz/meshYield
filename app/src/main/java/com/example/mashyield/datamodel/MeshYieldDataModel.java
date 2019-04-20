package com.example.mashyield.datamodel;

public class MeshYieldDataModel {

    private final static String TABELA = "yield";

    private final static String id = "id";
    private final static String product = "product";
    private final static String mesh = "mesh";
    private final static String type = "type";
    private final static String color = "color";
    private final static String weight = "weight";
    private final static String data = "data";
    private final static String adult = "adult";
    private final static String children = "children";
    private final static String custom = "custom";

    private static String queryCriarTabela = "";

    public static String createTable(){
        queryCriarTabela =   "CREATE TABLE " + TABELA ;
        queryCriarTabela +=  "(";
        queryCriarTabela +=  id + " INTEGER PRIMARY KEY AUTOINCREMENT, " ;
        queryCriarTabela +=  product + " TEXT, " ;
        queryCriarTabela +=  mesh + " TEXT, " ;
        queryCriarTabela +=  type + " TEXT, " ;
        queryCriarTabela +=  color + " TEXT, ";
        queryCriarTabela +=  weight + " TEXT, ";
        queryCriarTabela +=  data + " NUMERIC, " ;
        queryCriarTabela +=  adult + " NUMERIC, ";
        queryCriarTabela +=  children + " NUMERIC, ";
        queryCriarTabela +=  custom + " NUMERIC ";
        queryCriarTabela +=  " )";

        return queryCriarTabela;
    }//fim do metodo criarTabela

    public static String getTABELA() {
        return TABELA;
    }

    public static String getId() {
        return id;
    }

    public static String getProduct() {
        return product;
    }

    public static String getMesh() {
        return mesh;
    }

    public static String getType() {
        return type;
    }

    public static String getColor() {
        return color;
    }

    public static String getWeight() {
        return weight;
    }

    public static String getData() {
        return data;
    }

    public static String getAdult() {
        return adult;
    }

    public static String getChildren() {
        return children;
    }

    public static String getCustom() {
        return custom;
    }

    public static String getQueryCriarTabela() {
        return queryCriarTabela;
    }

    public static void setQueryCriarTabela(String queryCriarTabela) {
        MeshYieldDataModel.queryCriarTabela = queryCriarTabela;
    }
}


