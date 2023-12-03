package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.academiatech.model.FuncionarioTeste;

import java.util.List;

@Dao
public interface FuncionarioTesteDao { //TODO --> REMOVER APÓS TESTE OU REAPROVEITAR CÓDIGO

    @Query("SELECT * FROM FuncionarioTeste")
    List<FuncionarioTeste> getFuncionarios();

    @Query("SELECT * FROM FuncionarioTeste where re=:reFuncionarioTeste")
    FuncionarioTeste buscarPorRe(int reFuncionarioTeste);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(FuncionarioTeste funcionarioTeste);

    @Delete
    void delete(FuncionarioTeste funcionarioTeste);

    @Update
    void update(FuncionarioTeste funcionarioTeste);
}
