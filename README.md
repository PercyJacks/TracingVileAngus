# TracingVileAngus
Solution to a code challenge

Introduction

Inspector Catchburgle is on a case! He is chasing a mysterious villain that goes by the name Vile Angus. Fortunately, Angus has a bad memory and tends to write a lot of things down. And Catchburgle just found a pile of the scoundrel's notes! There must be lots of valuable clues in them!

However, Angus isn't stupid; he was encrypting his messages with some cipher, so that they are not so easy to read.

Inspector Catchburgle has applied his brilliant logic, and found out that the villain uses some sort of a substitution cipher. It seems that he goes over the text multiple times, and each time swaps two letters in part of the text from a random position to the end.

But that's not all! The bright detective has even figured out the mechanism by which Angus decides which letters to swap and from which position.

Well, inspector Catchburgle didn't share the details of this mechanism with you, but before he went on a well deserved coffee break, he wrote down all the substitutions for each encoded message.

Will you, the inspector's assistant, be able to impress the inspector by decoding the messages before he returns from his coffee break? It will surely help to catch the villain (and you will deserve part of the credit)!

Input Specifications

First line of input is the message as Vile Angus wrote it. Its length is in the interval 0 ≤ length ≤ 10000. (Yes, there were some blank papers, too. The inspector didn't bother removing them.) 
Second line is number N, where 0 ≤ N ≤ 1000.
The next N lines each contains information about a pair of letters that the inspector found to be swapped. Each line is in the format pos first second, and means that starting at position pos (zero-based), each occurrence of letter first has been replaced by letter second and vice versa. The values of pos form a non-decreasing sequence.

Note that:

There can be multiple swapped pairs starting at the same position.

The order of swaps is important. When Angus encrypted his messages, he was applying the substitutions in the order in which you receive them on input.

The letters first and second are always lower case letters, but when doing the substitutions, Angus keeps the upper- or lower-case of the original letter. So if the original letter was upper case, the substituted letter will also be upper case.

Some positions pos may be past the end of the message. Inspector Catchburgle might have gotten carried away a little...

Output Specifications

Print the villain's message with all the letter swaps undone.

Sample Input and Outputs

Input
Vile Angus
0

Output
Vile Angus

Explanation - There are 0 substitutions. The text is not encrypted at all.

Input
Diury uf Vise Ongal
3
0 a u
6 l s
6 o u

Output
Diary of Vile Angus

Input
The password to my safe is: f1ddler
5
28 k f
28 t d
28 l e
28 n e
28 s r

Output
The password to my safe is: k1ttens

Input
Trkin to Viennk: Juexdky, 7.15km, 3rd ajkas
12
2 a k
2 q s
4 q x
6 h s
8 t j
14 s s
16 a c
19 o j
23 f v
26 z o
31 x f
42 j y

Output
Train to Vienna: Tuesday, 7:15am, 3rd coach

Input

2
0 n o
0 o n

Output

Explanation - This text is empty, there is nothing to swap. The output is empty as well.
