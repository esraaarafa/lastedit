class LoginModel : LoginContract.Model {
    override fun authenticate(username: String, password: String): Boolean {
        return username == "user" && password == "password"
    }
}

class LoginPresenter(private val view: LoginContract.View, private val model: LoginContract.Model) :
    LoginContract.Presenter {
    override fun login(username: String, password: String) {
        if (model.authenticate(username, password)) {
            view.showLoginSuccessMessage()
        } else {
            view.showLoginErrorMessage("Invalid username or password")
        }
    }
}
