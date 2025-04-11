public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        
        //  Pattern - 1
        System.out.println("Pattern - 1");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 2
        System.out.println("Pattern - 2");
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 3
        System.out.println("Pattern - 3");
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 4
        System.out.println("Pattern - 4");
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 5
        System.out.println("Pattern - 5");
        for (int i=1; i<=n; i++) {
            for (int j=0; j<n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 6
        System.out.println("Pattern - 6");
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 7
        System.out.println("Pattern - 7");
        for (int i=0; i<n; i++) {
            //  Space, Star, Space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        // Pattern - 8
        System.out.println("Pattern - 8");
        for (int i=0; i<n; i++) {
            // Space, Star, Space
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<2*n - (2*i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 9
        System.out.println("Pattern - 9");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<2*n- (2*i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 10
        System.out.println("Pattern - 10");
        for (int i=1; i<=2*n-1; i++) {
            int stars = i;
            if (i > n) stars = 2*n-i;
            for (int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 11
        System.out.println("Pattern - 11");
        for (int i=0; i<n; i++) {
            int start = 1;
            if (i % 2 == 0) start = 1;
            else start = 0;
            for (int j=0; j<=i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 12
        System.out.println("Pattern - 12");
        //  number space number
        int space = 2 * (n - 1);
        for (int i=1; i<=n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(j);
            }
            for (int j=1; j<=space; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
        System.out.println("-----------------------------");
        //  Pattern - 13
        System.out.println("Pattern - 13");
        int k = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        // Pattern - 14
        System.out.println("Pattern - 14");
        for (int i=0; i<n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        // Pattern - 15
        System.out.println("Pattern - 15");
        for (int i=0; i<n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n-i-1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 16
        System.out.println("Pattern - 16");
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print((char)(int)('A' + i));
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 17
        System.out.println("Pattern - 17");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j=0; j<2*i+1; j++) {
                System.out.print(ch);
                if (j < breakPoint) ch++;
                else ch--;
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 18 
        System.out.println("Pattern - 18");
        for (int i=0; i<n; i++) {
            for (char ch=(char)(int)('A'+n-1-i); ch <= (char)(int)('A'+n-1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        // Pattern - 19
        System.out.println("Pattern - 19");
        int inis = 0;
        for (int i=0; i<n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("*");
            }
            for (int j=0; j<inis; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
            inis += 2;
        }
        inis = 8;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=0; j<inis; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            inis -= 2;
            System.out.println();
        }
        System.out.println("-----------------------------");
        //  Pattern - 20
        System.out.println("Pattern - 20");
        int spaces = 2 * n - 2;
        for (int i=1; i<=2*n-1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) spaces -= 2;
            else spaces += 2;
        }
    }
}