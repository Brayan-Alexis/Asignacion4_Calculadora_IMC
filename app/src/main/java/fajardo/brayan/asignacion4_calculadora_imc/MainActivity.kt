package fajardo.brayan.asignacion4_calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Variables


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val etPeso: EditText=findViewById(R.id.etPeso)
            val etEstatura: EditText=findViewById(R.id.etEstatura)
            val calcular:Button=findViewById(R.id.btnCalcular)
            val imc: TextView=findViewById(R.id.imc)
            val range: TextView=findViewById(R.id.range)

            //Evento button click o cliclistener
            calcular.setOnClickListener {
                imc.setText(calcularIMC(etPeso.text.toString().toFloat(),etEstatura.text.toString().toFloat()).toString())
                range.setText(calcularCategoria(imc.text.toString().toFloat()))
                calcularColorRange(range)
            }
    }

        fun calcularIMC(peso:Float,altura:Float):Float{
            return peso/(altura*altura)
        }

        fun calcularCategoria(imc:Float): String =
                when{
                    imc < 18.5 ->         "Bajo peso"
                    imc in 18.5..24.99 -> "Normal"
                    imc in 25.0..29.99 -> "Sobrepeso"
                    imc in 30.0..34.99 -> "Obesidad grado 1"
                    imc in 35.0..39.99 -> "Obesidad grado 2"
                    imc >40 ->            "Obesidad grado 3"
                    else -> imc.toString()
                }
        }

        fun calcularColorRange(range:TextView){
            if(range.text.toString()=="Normal") range.setBackgroundResource(R.color.color3)
            else range.setBackgroundResource(R.color.color7)
        }

    //función
    //fun calcular(peso: Double,altura: Double): Double{
    //    return peso/(altura*altura)
    //}
