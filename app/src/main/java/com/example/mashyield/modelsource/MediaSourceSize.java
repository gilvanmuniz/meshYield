package com.example.mashyield.modelsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.mashyield.datamodel.MeshYieldDataModel;
import com.example.mashyield.datamodel.ProductSizeDataModel;
import com.example.mashyield.model.MeshYield;
import com.example.mashyield.model.ProductSize;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MediaSourceSize extends SQLiteOpenHelper {

    private static final String DB_NAME = "mesh_yield.sqlite";
    private static final int DB_VERSION = 1;

    SQLiteDatabase db;

    Cursor cursor;

    public MediaSourceSize(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        //habilita o banco de dados para escrita e leitura:
        db = getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        try {

            db.execSQL(ProductSizeDataModel.createTable());

        }catch (Exception e){
            Log.e("Media", "--> ERRO: " + e.getMessage());
        }

    }//fim do onCreate

    @Override
    public void onUpgrade(SQLiteDatabase db,
                          int oldVersion, int newVersion) {

    }


    public boolean insert(String tabela, ContentValues dados){

        boolean success = true;
        try{
            success = db.insert(tabela,null, dados) > 0;
        }
        catch(Exception e){
            success = false;
        }

        return success;

    }//fim do insert

    public boolean deletar(String tabela,int id){

        boolean success = true;
        try{
            success = db.delete(tabela, "id=?",
                    new String[]{Integer.toString(id)}) > 0;
        }
        catch(Exception e){
            success = false;
        }

        return success;

    }//fim do delete

    public boolean atualizar(String tabela,ContentValues dados){

        boolean success = true;

        int id = dados.getAsInteger("id");
        try{
            success = db.update(tabela, dados, "id=?",
                    new String[]{Integer.toString(id)}) > 0;
        }
        catch(Exception e){
            success = false;
        }

        return success;

    }// fim do metodo atualizar

    public List<ProductSize> getProductSize() throws ParseException {

        ProductSize obj;

        List<ProductSize> list = new ArrayList<>();

        String sql = "SELEC * FROM " + ProductSizeDataModel.getTABELA();

        cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()){
            do{
                obj = new ProductSize();
                obj.setId(cursor.getInt(cursor.getColumnIndex(ProductSizeDataModel.getId())));
                obj.setPp(cursor.getInt(cursor.getColumnIndex(ProductSizeDataModel.getPp())));
                obj.setP(cursor.getInt(cursor.getColumnIndex(ProductSizeDataModel.getP())));
                obj.setM(cursor.getInt(cursor.getColumnIndex(ProductSizeDataModel.getM())));
                obj.setG(cursor.getInt(cursor.getColumnIndex(ProductSizeDataModel.getG())));
                obj.setGg(cursor.getInt(cursor.getColumnIndex(ProductSizeDataModel.getGg())));
                obj.setExg(cursor.getInt(cursor.getColumnIndex(ProductSizeDataModel.getExg())));
                obj.setTotal(cursor.getInt(cursor.getColumnIndex(ProductSizeDataModel.getTotal())));

                list.add(obj);

            }while (cursor.moveToNext());
        }
        return list;




    } //fim do getAllMeshYield

}
