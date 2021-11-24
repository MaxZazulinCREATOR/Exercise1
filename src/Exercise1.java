/* - Создайте функцию, которая отображает все различные комбинации трех разных
     цифр в порядке возрастания, перечисленных в порядке возрастания  - да,
     повторение является добровольным.
Пример: 012, 013, 014, 015, 016, 017, 018, 019, 023, ...,  689, 789.
ДОПОЛНИТЕЛЬНОЕ УСЛОВИЕ:
- 987 не должно быть, потому что 789 уже есть.
- 999 тоже, потому что цифра 9 присутствует более одного раза.
 */
public class Exercise1 {
    public static void progressionOne(int n1, int n2, int n3){
        while (n3 <= 9){
            if (n3 == n1 || n2 == n3 || n1 == n2 || n1 > n3) {
                n3++;
            } else {
                System.out.print(n1);
                System.out.print(n2);
                System.out.print(n3 + ", ");
                n3++;
            }
        }
    }
    public static void progressionTwo(int n1, int n2, int n3) {
        while (n2 <= 9){
            if (n3 == n1 || n2 == n3 || n1 == n2 || n1 > n3) {
                progressionOne(n1, n2, 0);
                n2++;
            } else {
                progressionOne(n1, n2, 0);
                n2++;
            }
        }
    }
    public static void progressionTree(int n1, int n2, int n3) {
            while (n1 <= 9){
                if (n3 == n1 || n2 == n3 || n1 == n2 || n1 > n3) {
                    progressionTwo(n1, n2, 0);
                    n1++;
                } else {
                    progressionTwo(n1, n2, 0);
                    n1++;
                }
            }
        }
    public static void main(String[] args) {
        progressionTree(0,0,0);
        System.out.println("Расчёт завершён.");
    }
}
