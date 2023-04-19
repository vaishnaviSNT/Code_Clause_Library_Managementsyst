import java.util.*;

public class libsys2 {
     public static void main(String args[]) {
          char r;
          do {

               System.out.println("-----------------------LIBRARY MANAGEMENT SYSTEM------------------------------");
               System.out.println("Press 1 to add Book");
               System.out.println("Press 2 to Issue Book");
               System.out.println("Press 3 to Return Book");
               System.out.println("Press 4 to Print complete Issue details");

               System.out.println("Press 5 to Exit");
               Scanner obj1 = new Scanner(System.in);
               System.out.println("Enter any number");
               int a = obj1.nextInt();
               switch (a) {

                    case 1:
                         Library aa = new Library();
                         aa.add();
                         break;

                    case 2:
                         Library bb = new Library();
                         bb.iss();
                         break;
                    case 3:
                         Library cc = new Library();
                         cc.ret();
                         break;

                    case 4:
                         Library is = new Library();
                         is.detail();
                         break;

                    case 5:
                         Library add = new Library();
                         add.exit();
                         break;
                    default:
                         System.out.println("Invalid ");
               }

               System.out.println("You want to select next option Y/N");
               r = obj1.next().charAt(0);

          } while (r == 'y' || r == 'Y');
          if (r == 'n' || r == 'N') {
               Library z = new Library();
               z.exit();
          }
     }

     static class Library {
          static String str, date, b;
          static int a, c;

          void add() {
               System.out.println("Enter Book Name,Price,Book_no");
               Scanner obj2 = new Scanner(System.in);
               String str = obj2.nextLine();
               float price = obj2.nextInt();
               int bookno = obj2.nextInt();
               System.out.println("Your details are" + str + price + bookno);

          }

          void iss() {

               Scanner obj3 = new Scanner(System.in);
               System.out.println(" Book Name");
               str = obj3.nextLine();
               System.out.println("Book_id");
               a = obj3.nextInt();
               obj3.nextLine();
               System.out.println("Issue Date");
               b = obj3.nextLine();
               System.out.println("Total Number of BooksIssued");
               c = obj3.nextInt();
               obj3.nextLine();
               System.out.println("Return Book Date");
               date = obj3.nextLine();

          }

          int getid() {
               return a;
          }

          void ret() {
               System.out.println("Enter Stud_Name and Book-id");
               Scanner c = new Scanner(System.in);
               String name = c.nextLine();
               int bookid = c.nextInt();
               if (a == bookid) {
                    System.out.println("Total Details");
                    System.out.println("BookName ::" + str);
                    System.out.println("Bookid::" + a);
                    System.out.println("Issue Date::" + b);
                    System.out.println("Total Number of Books Issued::" + c);
                    System.out.println("Ret::" + date);
               } else {
                    System.out.println("Wrong Id.Please enter correct Id");
               }
          }

          void detail() {

               System.out.println("BookName ::" + Library.str);
               System.out.println("Bookid::" + Library.a);
               System.out.println("Issue Date::" + Library.b);
               System.out.println("Total Number of Books Issued::" + Library.c);
               System.out.println("Return Book Date::" + Library.date);
          }

          void exit() {

          }
     }
}