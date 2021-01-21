package achomy.tapcounter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var taps = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun screenTap(view: View) {
        taps += 1
        val counter: TextView = findViewById(R.id.counter)
        counter.text = "Taps: $taps"
    }

}