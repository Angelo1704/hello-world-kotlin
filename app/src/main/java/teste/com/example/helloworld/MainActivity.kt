package teste.com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val soma = findViewById<Button>(R.id.button3)
        val subtracao = findViewById<Button>(R.id.button4)
        val multiplicacao = findViewById<Button>(R.id.button5)
        val divisao = findViewById<Button>(R.id.button6)
        soma.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val editText = findViewById<EditText>(R.id.editText2).text.toString().toInt()
                val editText2 = findViewById<EditText>(R.id.editText3).text.toString().toInt()
                val text = editText
                val text2 = editText2
                val result = editText + editText2;
                Toast.makeText(this@MainActivity,result.toString(),Toast.LENGTH_SHORT).show()
                //Toast.makeText(this@MainActivity,text2,Toast.LENGTH_SHORT).show()

            }
        })
        subtracao.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val editText = findViewById<EditText>(R.id.editText2).text.toString().toInt()
                val editText2 = findViewById<EditText>(R.id.editText3).text.toString().toInt()
                val text = editText
                val text2 = editText2
                val result = editText - editText2;
                Toast.makeText(this@MainActivity,result.toString(),Toast.LENGTH_SHORT).show()
                //Toast.makeText(this@MainActivity,text2,Toast.LENGTH_SHORT).show()

            }
        })
        divisao.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val editText = findViewById<EditText>(R.id.editText2).text.toString().toInt()
                val editText2 = findViewById<EditText>(R.id.editText3).text.toString().toInt()
                val text = editText
                val text2 = editText2
                val result = editText / editText2;
                Toast.makeText(this@MainActivity,result.toString(),Toast.LENGTH_SHORT).show()
                //Toast.makeText(this@MainActivity,text2,Toast.LENGTH_SHORT).show()

            }
        })
        multiplicacao.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val editText = findViewById<EditText>(R.id.editText2).text.toString().toInt()
                val editText2 = findViewById<EditText>(R.id.editText3).text.toString().toInt()
                val text = editText
                val text2 = editText2
                val result = editText * editText2;
                Toast.makeText(this@MainActivity,result.toString(),Toast.LENGTH_SHORT).show()
                //Toast.makeText(this@MainActivity,text2,Toast.LENGTH_SHORT).show()

            }
        })
    }
}
