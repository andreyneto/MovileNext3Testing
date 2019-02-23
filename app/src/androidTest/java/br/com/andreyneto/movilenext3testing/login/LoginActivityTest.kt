package br.com.andreyneto.movilenext3testing.login

import androidx.test.rule.ActivityTestRule
import br.com.andreyneto.movilenext3testing.LoginActivity
import br.com.andreyneto.movilenext3testing.MainActivity
import br.com.andreyneto.movilenext3testing.R
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class LoginActivityTest {
    @get:Rule
    val rule = ActivityTestRule(LoginActivity::class.java)

    private val activity: LoginActivity by lazy {
        rule.activity
    }

    private lateinit var robot: LoginRobot

    @Before
    fun setUp() {
        robot = LoginRobot(activity)
    }

    @Test
    fun loginWrongPassword() {
        robot
            .setEmail("email@email.com")
            .setPassword("1234qwer")
            .clickLogin()
            .matchErrorText(R.string.login_fail)
    }

    @Test
    fun loginMissingEmailPassword() {

    }

    @Test
    fun loginMissingPassword() {

    }

    @Test
    fun loginSuccess() {

    }
}