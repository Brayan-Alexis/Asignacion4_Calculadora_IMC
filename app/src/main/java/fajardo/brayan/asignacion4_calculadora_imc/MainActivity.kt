package fajardo.brayan.asignacion4_calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Variables
    val etPeso: EditText = findViewById(R.id.etPeso) as EditText
    val etEstatura: EditText = findViewById(R.id.etEstatura) as EditText
    val btnCalcular: Button = findViewById(R.id.btnCalcular) as Button
    val imc: TextView = findViewById(R.id.imc) as TextView
    val range: TextView = findViewById(R.id.range) as TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Evento button click o cliclistener
        btnCalcular.setOnClickListener {
            val etPeso = etPeso.text.toString().toDouble()
            val etEstatura = etEstatura.text.toString().toDouble()

            imc.text = (etPeso / (etEstatura * etEstatura)).toString()
        }
    }

    //función
    fun calcular(peso: Double,altura: Double): Double{
        return peso/(altura*altura)
    }
}