Expression Evaluator
==========


configuration 
-------------
Extract the "expression-evaluator.zip".

Set the environment variable with the name of 'EVALUATOR_HOME'.

Use shell file to run evaluator.

ReleaseNotes :
--------------

Space is mandatory between operator and operand(for versions 0,1 to 0,6);

Brackets are not allowed (for versions 0,1 to 0,4).

Release 0.8
--------------

Working for no spaces between operand and operator

gives operand if has only one operand

`Example - jk_ExpEval.sh "operand1+((operand2*operand3)/(operand4^operand5))" `

`Example - jk_ExpEval.sh "1+((2.5*3)/(10^-2))"        output : 751.0`


Release 0.7
--------------
working with nested brackets.

Working for no spaces between operand and operator

`Example - jk_ExpEval.sh "operand1  + ((operand2 * operand3) / (operand4 ^ operand 5))" `

`Example - jk_ExpEval.sh "1 +((2.5 * 3) / (10 ^ -2))"        output : 751.0`

Release 0.6
--------------
Expression with one or more number of brackets allowed.

Space is not allowed between bracket and operand.

`Example - jk_ExpEval.sh "operand1  + (operand2 * operand3) / (operand4 ^ operand 5)" `

`Example - jk_ExpEval.sh "1 +(2.5 * 3) / (10 ^ -2)"        output : 850.0`

Release 0.5
--------------
Expression with only one bracket allowed.

Space is not allowed between bracket and operand.

`Example - jk_ExpEval.sh "operand1  + (operand2 * operand3) / operand4 ^ operand 5" `

`Example - jk_ExpEval.sh "10 - (-5.0 * 2.0) / 10"        output : 2.0`

Release 0.4
--------------
Multiple operands and operator allowed.

It supports (+ , - ,* , / , ^) for positive / negative float numbers.

`Example - jk_ExpEval.sh "operand1  + operand2 * operand3 / operand4 ^ operand 5" `

`Example - jk_ExpEval.sh "10 - -5.0 * 2.0 / 10"        output : 3.0`

Release 0.3
--------------
Bugs of Negative Exponent handled.

It supports (+ , - * / ^) for positive / negative float numbers.

`Example - jk_ExpEval.sh "operand1  + operand2" `

`Example - jk_ExpEval.sh "2.5 - -2.55"        output : 5.05`


Release 0.2
--------------

It supports (+ , - * / ^) for positive / negative float numbers.

Exponent should be positive;

for Exclusive operation it will calculate result upto 32 bit ie. 10 digits.

`Example - jk_ExpEval.sh "operand1  + operand2"`

`Example - jk_ExpEval.sh "4 ^ 5"        output : 1024`


Release 0.1
--------------

It will add two positive integer numbers ;

`Example - jk_ExpEval.sh "4 + 5" `

this will give ans : 9

