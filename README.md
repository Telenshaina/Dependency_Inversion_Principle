# DIP_Lab6

https://lucid.app/lucidchart/cc028501-18f0-470b-a33d-927fce59a6cf/edit?viewport_loc=-454%2C-520%2C1664%2C1083%2C0_0&invitationId=inv_5c6533e8-d104-4556-a66f-bf1eda6915b9

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Create a repository in your GitHub account. Put your solution there. In the readMe file must include the problem statement, UML Class Diagram of Proposed solution.

Make sure you have a TestProgram that will validate the proposed refactored codes.