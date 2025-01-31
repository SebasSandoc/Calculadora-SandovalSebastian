package sandoval.sebastian.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var operation: String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bt0: Button = findViewById(R.id.bt0)
        val bt1: Button = findViewById(R.id.bt1)
        val bt2: Button = findViewById(R.id.bt2)
        val bt3: Button = findViewById(R.id.bt3)
        val bt4: Button = findViewById(R.id.bt4)
        val bt5: Button = findViewById(R.id.bt5)
        val bt6: Button = findViewById(R.id.bt6)
        val bt7: Button = findViewById(R.id.bt7)
        val bt8: Button = findViewById(R.id.bt8)
        val bt9: Button = findViewById(R.id.bt9)
        val btAdd: Button = findViewById(R.id.btAdd)
        val btSubstract: Button = findViewById(R.id.btSubstract)
        val btMultiply: Button = findViewById(R.id.btMultiply)
        val btDivide: Button = findViewById(R.id.btDivide)
        val btClear: Button = findViewById(R.id.btClear)
        val btResult: Button = findViewById(R.id.btResult)
        val Screen: TextView = findViewById(R.id.Screen)

        bt1.setOnClickListener {
            operation+="1"
            Screen.setText(operation)
        }
        bt2.setOnClickListener {
            operation+="2"
            Screen.setText(operation)
        }
        bt3.setOnClickListener {
            operation+="3"
            Screen.setText(operation)
        }
        bt4.setOnClickListener {
            operation+="4"
            Screen.setText(operation)
        }

        bt5.setOnClickListener {
            operation+="5"
            Screen.setText(operation)
        }

        bt6.setOnClickListener {
            operation+="6"
            Screen.setText(operation)
        }

        bt7.setOnClickListener {
            operation+="7"
            Screen.setText(operation)
        }

        bt8.setOnClickListener {
            operation+="8"
            Screen.setText(operation)
        }

    }
}