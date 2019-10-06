package com.mmarquez.gastos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        var descripcion = tiDescripcion.editText?.text
        var monto = tiMonto.editText?.text
        var datos = Datos(this,null)
        datos.registrarGasto(datos, descripcion.toString(),monto.toString() )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRegistrar.setOnClickListener(this)
    }
}
