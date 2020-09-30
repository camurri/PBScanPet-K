package co.estudos.pbscanpet_k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cad_pet.*

class CadPetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_pet)


        btnNext.setOnClickListener{
            val intent = Intent(this, CadPetActivity2::class.java)
            startActivity(intent)
        }


    }
}