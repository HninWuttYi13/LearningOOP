## Mini Project: Design a Library System
### Understand Requirements
- to track books, members, and transactions (borrow/return)
- member can borrows books(max 3 at at time). Each loan has a due date(14 days) and return books.
- The system is to tell you which books are available, which are borrowed, and who borrowed them.

### Design Classes
- Book class - title, author, isbn, isAvailable 
- LibraryMember class - name, memberId, borrowedBooks[]
- Loan class -book, member, borrowDate, dueDate
- Library class - books[], members[], loans[]

### Implement Methods
- Book.borrow() - set isAvailable = false
- Book.return() - set isAvailable = true
- LibraryMember.borrowBook(book) - add loan to borrowedBooks[] if the book is available and not exceed max 3 books
- LibraryMember.returnBook(book) - remove loan from borrowedBooks[]
- Library.addBook(book) - add books to books[]
- Library.addMember(member) - add members to members[]
- Library.loanBook(member, book) - create loan and add to loans[]

### Relationship Breakdown
#### Library -> Book/Member/Loan
- One Library has many Books (Composition)
- One Library has many Members (Composition)
- One Library has many loans (Composition)
So, library owns them and if library is deleted, all books, members, and loans are deleted. So this is **Composition**.

#### Loan -> Book + Member
- One Loan has one Book (Association)
- One Loan has one member (Association)
This is Composition but slightly different. Loan depends on Book and Member. Book and Member can exist without Loan. But Loan cannot exist without Book and Member. So this is **Composition**.

