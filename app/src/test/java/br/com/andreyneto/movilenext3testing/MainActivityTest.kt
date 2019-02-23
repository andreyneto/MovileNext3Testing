package br.com.andreyneto.movilenext3testing

import android.widget.TextView
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class MainActivityTest2 {
    @Test
    fun loadActivity_shouldShowHelloWorld() {
        val activity = Robolectric.setupActivity(MainActivity::class.java)
        val results = activity.findViewById(R.id.textView) as TextView
        assertThat(results.text.toString(), equalTo("Hello World!"))
    }
}