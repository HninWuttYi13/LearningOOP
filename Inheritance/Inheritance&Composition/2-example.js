/**
 * Admin User and User
 * Ask -> Is Admin User is a User -> yes
 * Ask -> Is Admin User has a User -> No
 * So Admin User extends User
 */
class User {
  register() {
    console.log("User registered");
  }
}
class AdminUser extends User {
  deleteUser() {
    console.log("Admin remove user");
  }
}
const userAdmin = new AdminUser();
userAdmin.deleteUser();
userAdmin.register();
// Admin remove user
// User registered
