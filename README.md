# Java_ATM_simulator
🏦 Java ATM Simulator
A simple console-based ATM simulation program written in Java that mimics basic banking operations.

✨ Features

🔐 PIN authentication (default PIN: 54321)
💰 Check account balance
💸 Withdraw money with balance validatio
💳 Deposit money
🔄 Menu-driven interface
♻️ Return to main menu after each operation

📋 Prerequisites

Java Development Kit (JDK) 8 or higher
Any Java IDE or command line compiler

🔧 Customization

Change the default PIN by modifying int pin=54321;
Set an initial balance by changing float balance; to float balance = 1000.0f;

📝 Code Overview

The program uses:
Scanner class for user input
if-else statements for menu navigation
Recursive menu calls for continuous operation
Basic arithmetic operations for banking transactions

🤝 Contributing

Feel free to fork this repository and submit pull requests with enhancements like:
Database integration for persistent storage
Multiple account support
Transaction history
GUI implementation
Enhanced security features

📄 License
This project is open source and available under the MIT License.

⚠️ Limitations

No persistent storage - All data is lost when program closes
Single hardcoded PIN - No user account management
No transaction records - No history of operations
Basic error handling - Minimal input validation
