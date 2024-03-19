import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import androidx.appcompat.app.AppCompatActivity
import com.example.yourappname.R


class LoginActivity : AppCompatActivity(), LoginContract.View {

    private lateinit var presenter: LoginContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val model = LoginModel()
        presenter = LoginPresenter(this, model)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (username == "esraa arafa" && password == "esraa1154") {
                presenter.login(username, password)
            } else {
                showError("Invalid username or password")
            }
        }
    }

    override fun showLoginSuccessMessage() {
        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
    }

    override fun showLoginErrorMessage(errorMessage: String) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
    }
}
