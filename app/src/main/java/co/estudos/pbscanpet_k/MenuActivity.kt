package co.estudos.pbscanpet_k

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)



        btnMyPets.setOnClickListener {
            val intent = Intent(this, CadPetActivity::class.java)
            startActivity(intent)

        }


        btnSearch.setOnClickListener{
               val intent = Intent(this, ScanActivity::class.java)
               startActivity(intent)

            }


            btnLostAnim.setOnClickListener{
                val intent = Intent(this, LostActivity::class.java)
                startActivity(intent)
            }


        }





    }
