package achomy.tapcounter

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.core.view.MenuItemCompat
import androidx.core.view.MenuItemCompat.getActionView


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
        val nightMode= menu?.findItem(R.id.app_bar_switch)
        val actionView:SwitchCompat= nightMode?.actionView as SwitchCompat;
        return super.onCreateOptionsMenu(menu)
    }

}