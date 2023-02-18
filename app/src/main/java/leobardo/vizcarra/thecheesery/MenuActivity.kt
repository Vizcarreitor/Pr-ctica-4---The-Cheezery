package leobardo.vizcarra.thecheesery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnColdDrinks: Button = findViewById(R.id.button_cold_drinks);
        val btnHotDrinks:Button = findViewById(R.id.button_hot_drinks);
        val btnSweets:Button = findViewById(R.id.button_sweets);
        val btnSalties:Button = findViewById(R.id.button_salties);
        val btnCombos:Button = findViewById(R.id.button_combos);
        val btnCustom:Button = findViewById(R.id.button_custom);

        btnColdDrinks.setOnClickListener {
            var intent: Intent = Intent(this,RegisterActivity::class.java)
        }

    }
}