package br.mdan.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        //Log.w("Lifecycle", "CREATE - estou criando a tela...")
        //finish()
    }

    private fun setListeners() {
        etPeso.doAfterTextChanged { text ->
            //Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        etAltura.doOnTextChanged { text, _, _, _ ->
            //tvTitulo.text = text
        }
        btnIMC.setOnClickListener {
            CalcIMC(etPeso.text.toString(), etAltura.text.toString())
        }
    }

    private fun CalcIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            tvResultado.text = "Seu IMC é:%.2f".format(imc)
        }

    }

//    override fun onStart() {
//        super.onStart()
//        Log.w("Lifecycle", "START - Deixei a tela visivel para você")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.w("Lifecycle", "RESUME - Agora você pode interagir com a tela")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.w("Lifecycle", "PAUSE - Tela perdeu o foco, voce nao pode mais interagir")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.w("Lifecycle", "STOP - A tela nao esta mais visivel mas ainda existe")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.w("Lifecycle", "\nRESTART - A tela esta recuperando o foco")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.w("Lifecycle", "\nDESTROY - Oh No! a tela nao existe mais")
//    }
}