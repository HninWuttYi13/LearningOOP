/**
 * JavaScript doesn't have abstract or interface
 * JavaScript uses duck typing
 * JS doesn’t care about:
 * class
 * interface
 * type
 * JS only cares:
 * “Do you have the method I need?”
 */
class GoogleLogin {
  login() {
    console.log("Login with Google");
  }
}

class GitHubLogin {
  login() {
    console.log("Login with GitHub");
  }
}

class EmailLogin {
  constructor(email, password) {
    this.email = email;
    this.password = password;
  }

  login() {
    console.log("Login with Email:", this.email);
  }
}
const providers = [
  new GoogleLogin(),
  new GitHubLogin(),
  new EmailLogin("hnin@gmail.com", "1234"),
];

providers.forEach((p) => p.login());
