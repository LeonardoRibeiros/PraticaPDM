package com.example.blocodenotas.controller;

import android.content.Context;

import com.example.blocodenotas.modelo.Nota;
import com.example.blocodenotas.modelo.NotaDao;

import java.util.ArrayList;

public class NotaController {
    NotaDao notaDao;
    Context mContext;
    public NotaController(Context c){
        mContext= c;
        notaDao = new NotaDao(c);
    }
    public Nota CadastrarNovaNota(Nota n){
        return notaDao.inserirNota(n);
    }
    public ArrayList<Nota> listaNotas(){
        return notaDao.getListaNotas();
    }
    public ArrayList<String> listaTitulosNotas(){
        ArrayList<String> result = new ArrayList<String>();
        for(Nota nota: this.listaNotas()){
            result.add(nota.getTitulo());
        }
        return result;
    }


}
