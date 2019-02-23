package br.com.andreyneto.movilenext3testing

import android.widget.TextView
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import junit.framework.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun abrirActivityDeveFuncionar() {
        val activity = rule.activity
        val textView = activity.findViewById<TextView>(R.id.textView)
        val text = textView.text

        assertEquals("Hello World!", text)
    }
}