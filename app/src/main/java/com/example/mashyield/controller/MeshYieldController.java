package com.example.mashyield.controller;

import android.content.ContentValues;
import android.content.Context;

import com.example.mashyield.datamodel.MeshYieldDataModel;
import com.example.mashyield.model.MeshYield;
import com.example.mashyield.modelsource.DataSource;

import java.text.ParseException;
import java.util.List;

public class MeshYieldController extends DataSource {

    ContentValues dados;

    public MeshYieldController(Context context) {
        super(context);
    }//fim do construtor

    public boolean save(MeshYield obj){

        boolean success = true;

        dados = new ContentValues();

        dados.put(MeshYieldDataModel.getProduct(), obj.getProduct());
        dados.put(MeshYieldDataModel.getMesh(), obj.getMesh());
        dados.put(MeshYieldDataModel.getType(), obj.getType());
        dados.put(MeshYieldDataModel.getColor(), obj.getColor());
        dados.put(MeshYieldDataModel.getWeight(), obj.getWeight());
        dados.put(MeshYieldDataModel.getData(), obj.getData());
        dados.put(MeshYieldDataModel.getAdult(), obj.isAdult());
        dados.put(MeshYieldDataModel.getChildren(), obj.isChildren());
        dados.put(MeshYieldDataModel.getCustom(), obj.isCustom());

        success = insert(MeshYieldDataModel.getTABELA(), dados);

        return success;
    }//fim do método salvar

    public boolean deletar(MeshYield obj){

        boolean success = deletar(MeshYieldDataModel.getTABELA(), obj.getId());

        return success;
    }//fim do deletar

    public boolean update(MeshYield obj){

        boolean success = true;

        dados = new ContentValues();

        dados.put(MeshYieldDataModel.getProduct(), obj.getProduct());
        dados.put(MeshYieldDataModel.getMesh(), obj.getMesh());
        dados.put(MeshYieldDataModel.getType(), obj.getType());
        dados.put(MeshYieldDataModel.getColor(), obj.getColor());
        dados.put(MeshYieldDataModel.getWeight(), obj.getWeight());
        dados.put(MeshYieldDataModel.getData(), obj.getData());
        dados.put(MeshYieldDataModel.getAdult(), obj.isAdult());
        dados.put(MeshYieldDataModel.getChildren(), obj.isChildren());
        dados.put(MeshYieldDataModel.getCustom(), obj.isCustom());

        success = atualizar(MeshYieldDataModel.getTABELA(), dados);

        return success;
    }

    public List<MeshYield> toList() throws ParseException {

        return getAllMeshYiled();
    }


}//fim da classe
