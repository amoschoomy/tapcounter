package achomy.tapcounter

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat


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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu, menu);
        val nightMode = menu?.findItem(R.id.app_bar_switch)
        val actionView: SwitchCompat = nightMode?.actionView as SwitchCompat
        val toolbar:Toolbar = findViewById(R.id.my_toolbar)
        val menuLayout: ConstraintLayout = findViewById(R.id.menuLayout)
        actionView.text = "Night Mode"
        actionView.setOnClickListener(View.OnClickListener {
            when (actionView.isChecked) {
                true -> {
                    menuLayout.setBackgroundColor(ContextCompat.getColor(applicationContext,
                            R.color.black));
                }
                false -> menuLayout.setBackgroundColor(ContextCompat.getColor(applicationContext,
                        R.color.white))

            }
        })
        return super.onCreateOptionsMenu(menu)
    }

}