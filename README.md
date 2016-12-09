# Converting Numbers to Words

This simple Java Application, was built-in as a solution for Project Euler, it was one of the problems that I couldn't solve during high school. Definetevly some time, I was able to come back the problem and solve it.

If you would like to check the problem, and try yourself, definevetely check it out [here](https://projecteuler.net/problem=17), which includes all the information.

When desigining the application, I need to be aware of some stuffs:

1. Must comply with the British Numerical System.
   - Example: 119 (one hundred and nineteen)
2. Tenths (10, 20, 30, 40, 50, 60, 70, 80 and 90)
   - This numbers are unique. Since each number, represents it's own word.
3. Numbers 1-19
   - This numbers are also unique, please refer to the numerical chart.

Here is a chart system of the numerical numbers:

Number | Numerical Word | Characters Length  | Number | Numerical Word | Characters Length |
:----: | :------------: | :----------------: | :----: | :------------: | :---------------: |
   0   | zero           | 4                  |   20   | twenty         | 6                 |
   1   | one            | 3                  |   30   | thirty         | 6                 |
   2   | two            | 3                  |   40   | forty          | 5                 |
   3   | three          | 5                  |   50   | fifty          | 5                 |
   4   | four           | 4                  |   60   | sixty          | 5                 |
   5   | five           | 4                  |   70   | seventy        | 7                 |
   6   | six            | 3                  |   80   | eighty         | 6                 |
   7   | seven          | 5                  |   90   | ninety         | 6                 |
   8   | eight          | 5                  |   --   | --             | --                |
   9   | nine           | 4                  |   --   | --             | --                |

Here are the base numbers, respect to 10^n (where n is positive integer):

Number        | Numerical Word | Characters Length |
:-----------: | :------------: | :---------------: |
100           | hundred        | 7                 |
1000          | thousand       | 8                 |
1,000,000     | million        | 7                 |
1,000,000,000 | billion        | 7                 |

The application only accepts values from 1-1000 and (2000, 3000, 4000, 5000, 6000, 7000, 8000 and 9000). Definevetely need to refactor my code, in order to keep expanding the application.
