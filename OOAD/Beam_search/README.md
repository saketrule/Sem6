### Problem
Please refer to the Beam Search algorithm outlined in the attached image and answer the following questions.

1) Refer to Line 12. Prove the lemma that size of Omega is always <=B. [5 Marks]

Proof:

We will proove the required lemma by induction

At initialization, |Omaga| <= |B|

Assume lemma holds at iteration i of the while loop (line 12). i.e |Omega| <= |B|

Then |X| <= |B| (line 13)

In the iteration, |Omega| is changed 2 times:
1. reduced at line 14 by |X|,
2. increased by 1 less than |X| times in the loop at line15.

Therefore, |Omega| <= |B| at the end of loop i, i.e. lemma holds also at iteration i+1.

Hence, by induction we conclude that |Omega| is always less than |B|.

Q.E.D


2) Refer to Omega = Omega - X (between Lines 13 and 14). One another question is, is this required? [1 Mark]

Yes, else old states will persist in the queue, leading to the failure of beam search algorithm. The line can be written as Omega = Phi.

3) Line 16. Needs a small correction. What is it? [2 Marks]

States in X should be removed from N. i.e. N = N - X

4) Does this algorithm terminate? After addressing question (2) above. [2 Marks]

For an infinite search space, the algorithm may not terminate. However for a finite search space, or on a local maximum on all beams, it may terminate
