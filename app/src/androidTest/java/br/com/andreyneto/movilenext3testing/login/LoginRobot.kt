package br.com.andreyneto.movilenext3testing.login

import android.content.Context
import androidx.test.espresso.ViewInteraction
import br.com.andreyneto.movilenext3testing.R
import br.com.andreyneto.movilenext3testing.robot.BaseTestRobot

class LoginRobot(private val context: Context) : BaseTestRobot() {

    fun setEmail(email: String) = apply { fillEditText(R.id.etEmail, email) }

    fun setPassword(pass: String) = apply { fillEditText(R.id.etPassword, pass) }

    fun clickLogin() = apply {
        clickButton(R.id.btLogin)
    }

    fun matchErrorText(err: Int): ViewInteraction {
        return matchText(textView(android.R.id.message), context.getString(err))
    }
}

