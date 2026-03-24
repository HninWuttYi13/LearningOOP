/**
 * Example of  Inheritance and Composition
 * first ask -> relationship (is-a or has-a)
 * is-a -> Inheritance
 * has-a -> Composition
 */
/**
 * Phone and Camera
 * Ask -> Is phone is a camera? -> No.
 * Ask-> Dose phone contain camera? -> Yes
 * So, Phone has a Camrera (composition)
 */
class Camera {
  takePhoto() {
    console.log("SnapShot!!!");
  }
}
class Phone {
  constructor() {
    this.camera = new Camera();
  }
}
const phone = new Phone();
phone.camera.takePhoto();
//SnapShot!!!
