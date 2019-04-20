package com.example.mashyield.modelsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.mashyield.datamodel.MeshYieldDataModel;
import com.example.mashyield.model.MeshYield;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DataSource extends SQLiteOpenHelper {

    private static final String DB_NAME = "mesh_yield.sqlite";
    private static final int DB_VERSION = 1;

    SQLiteDatabase db;

    Cursor cursor;

    public DataSource(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        //habilita o banco de dados para escrita e leitura:
        db = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        try {

            db.execSQL(MeshYieldDataModel.createTable());

        }catch (Exception e){
            Log.e("Media", "--> ERRO: " + e.getMessage());
        }


    } //fim do onCreate

    @Override
    public void onUpgrade(SQLiteDatabase db,
                          int oldVersion, int newVersion) {

    } //fim do onUpgrade

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


    public List<MeshYield> getAllMeshYiled() throws ParseException {

        MeshYield obj;

        List<MeshYield> list = new ArrayList<>();

        String sql = "SELEC * FROM " + MeshYieldDataModel.getTABELA();

        cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()){
            do{
                obj = new MeshYield();
                obj.setId(cursor.getInt(cursor.getColumnIndex(MeshYieldDataModel.getId())));
                obj.setProduct(cursor.getString(cursor.getColumnIndex(MeshYieldDataModel.getProduct())));
                obj.setMesh(cursor.getString(cursor.getColumnIndex(MeshYieldDataModel.getMesh())));
                obj.setType(cursor.getString(cursor.getColumnIndex(MeshYieldDataModel.getType())));
                obj.setColor(cursor.getString(cursor.getColumnIndex(MeshYieldDataModel.getColor())));
                obj.setWeight(cursor.getDouble(cursor.getColumnIndex(MeshYieldDataModel.getWeight())));
                obj.setData(cursor.getString(cursor.getColumnIndex(MeshYieldDataModel.getData())));
                list.add(obj);

            }while (cursor.moveToNext());
        }
        return list;




    } //fim do getAllMeshYield



} //fim da classe
