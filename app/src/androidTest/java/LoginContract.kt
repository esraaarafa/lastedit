interface LoginContract {
    interface View {
        fun showLoginSuccessMessage()
        fun showLoginErrorMessage(errorMessage: String)
    }

    interface Presenter {
        fun login(username: String, password: String)
    }

    interface Model {
        fun authenticate(username: String, password: String): Boolean
    }
}
