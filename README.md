# 📱 Android SQLite CRUD Operations

This Android application demonstrates the implementation of SQLite database operations, including Create, Read, Update, and Delete (CRUD). It provides a simple interface to manage data locally within the application.

---

## 🧰 Features

- **Create**: Add new records to the SQLite database.
- **Read**: Retrieve and display existing records.
- **Update**: Modify existing records.
- **Delete**: Remove records from the database.
- **Database Management**: Proper handling of database creation and closure.

---

## 🛠️ Technologies Used

- **Java**: Programming language for Android development.
- **Android Studio**: Integrated Development Environment (IDE) for Android.
- **SQLite**: Lightweight relational database for local data storage.

---

## 🚀 Getting Started

### Prerequisites

- **Android Studio** installed on your machine.
- **Java Development Kit (JDK)** installed.

### Installation

1. **Clone the Repository**:

   bash - https://github.com/Abimathi03/Android-SQLite-CRUD-Operations-Application.git

2.  **Open in Android Studio**:

- Launch Android Studio.
- Click on File > Open.
- Navigate to the cloned repository folder and select it.

3. **Build and Run**:

- Click on the Run button or press Shift + F10.
- Choose an emulator or connected device to run the application.

---

## 📄 Usage

1. **Launch the Application**:
   
- Upon launching, the main activity will be displayed.

2. **Perform CRUD Operations**:

- Create: Enter data into the input fields and click the 'Add' button to insert a new record.
- Read: Click the 'View' button to display all records stored in the database.
- Update: Enter the ID of the record to be updated along with new data, then click the 'Update' button.
- Delete: Enter the ID of the record to be deleted and click the 'Delete' button.

---

## 🧾 Code Overview

### DatabaseHelper.java

1. Extends SQLiteOpenHelper to manage database creation and version management.

2. Implements methods for CRUD operations:

- insertData(): Inserts new records.
- getAllData(): Retrieves all records.
- updateData(): Updates existing records.
- deleteData(): Deletes records based on ID.

### MainActivity.java

- Handles user interactions and UI updates.
- Calls appropriate methods from DatabaseHelper based on user actions.

---
