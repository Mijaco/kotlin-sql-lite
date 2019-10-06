package com.mmarquez.gastos

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Datos(context:Context, factory:SQLiteDatabase.CursorFactory?):
SQLiteOpenHelper(context,"banco",factory,1){
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE movimientos (DESCRIPCION text, MONTO numeric)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun registrarGasto(datos:Datos,descripcion:String,monto:String){
        var db:SQLiteDatabase = datos.writableDatabase
        db.execSQL("Insert into movimientos (DESCRIPCION,MONTO) values('"+
                descripcion+"',"+ monto +")")
    }
}