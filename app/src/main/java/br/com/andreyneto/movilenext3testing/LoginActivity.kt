package br.com.andreyneto.movilenext3testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.yesButton

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btLogin.setOnClickListener {
            val usr = etEmail.text.toString()
            val pwd = etPassword.text.toString()
            if(usr.isEmpty() || pwd.isEmpty())
                alert(R.string.missing_fields){ yesButton {  } }.show()
            else if(usr == "adm@adm.com" && pwd == "admin")
                tvNameSurname.text = getString(R.string.login_success)
            else
                alert(R.string.login_fail){ yesButton {  } }.show()
        }
    }
}
