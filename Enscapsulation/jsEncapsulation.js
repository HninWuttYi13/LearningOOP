/**
 * Encapsulation = data + methods together + controlled access
 * Two parts-
 *  1. Bundle data and methods together
 * =========================================
 *  class BanAccount {
 *    #balance;
 *     deposit() {}
 *  } => Data + behavior in one place (object)
 * ==========================================
 *  2. Hide internal state
 * ==========================================
 * #balance => private and cannot access directly, access from via methods
 *  ==========================================
 */
/**
 * ============ ATM Analogy ===================
 * Public (what we see and use)
 *  - Buttons (deposit, withdraw, check balance)
 *  - Screen (display balance)
 * ==========================================
 * Private (hidden internal workings)
 *  - Wires, circuits, gears
 *  - Money storage
 *  - Logic for calculating totals
 * ==========================================
 * What happen when the bank gives us direct access
 * - can take all money
 * - system breaks
 */
/**
 * ======= Problem Without Encapsulation ========
 */
// class BankAccount {
//     constructor (owner, balance) {
//         this.owner = owner;
//         this.balance = balance;
//     }
// }
// const account = new BankAccount("Hnin", 1000);
// account.balance = -500;  // Negative balance! No rules!
// account.balance = "hello"; // Not even a number!
/**
 * ======== Encapsulation in JavaScript =========
 * Method 1: Private Fields with # (modern)
 * Method 2 : Private Fields with _ (old)
 */
class BankAccount {
  #balance; //this is private and cannot be accessed
  constructor(owner, balance) {
    this.owner = owner;
    this.#balance = balance; //this._balance = balance is old JS
  }
  //Public methods _ interface
  deposit(amount) {
    if (amount <= 0) throw new Error("Amount should be positive");
    this.#balance += amount;
    console.log(`Deposited ${amount}. New balance ${this.#balance}`);
  }
  withdraw(amount) {
    if (amount <= 0) throw new Error("Amount must be positive");
    if (amount > this.#balance) throw new Error("Insufficient funds");
    this.#balance -= amount;
    console.log(`Withdrew ${amount}. New Balance: ${this.#balance}`);
  }
  getBalance() {
    console.log(`Balance: ${this.#balance}`);
  }
}
const accountA = new BankAccount("Hnin", 1000);
accountA.deposit(1000);
accountA.withdraw(200);
accountA.getBalance();
// Deposited 1000. New balance 2000
// Withdrew 200. New Balance: 1800
// Balance: 1800
