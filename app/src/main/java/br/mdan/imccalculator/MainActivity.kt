package br.mdan.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("Lifecycle", "CREATE - estou criando a tela...")
        //finish()
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "START - Deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "RESUME - Agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "PAUSE - Tela perdeu o foco, voce nao pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "STOP - A tela nao esta mais visivel mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "\nRESTART - A tela esta recuperando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "\nDESTROY - Oh No! a tela nao existe mais")
    }
}