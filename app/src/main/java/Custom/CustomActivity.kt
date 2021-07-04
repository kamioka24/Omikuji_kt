package Custom

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

// 部品を保管する場所

open class CustomActivity : AppCompatActivity() {

    fun nextActivity(activity: Activity) {
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
    }

    fun fadeIn(view: View) {

    }

    fun fadeOut(view: View) {

    }
}