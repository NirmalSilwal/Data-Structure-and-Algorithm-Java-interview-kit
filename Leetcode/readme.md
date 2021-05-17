# Google Interview

## ``` Introduction```

Google tech interviews are notoriously difficult and quite challenging. To get a phone screen, you will need to submit your resume to their online application system or via an internal referral from a Googler.

Assuming you passed their resume screen, a recruiter will reach out to you. Usually there will be two phone screens, and if you do well, you'll be invited to onsite interviews.

Since Google operates at a large scale, be prepared to answer lots of follow up questions on how to scale the algorithm you wrote for multiple machines. Some examples are: [Number of Islands](https://leetcode.com/problems/number-of-islands/) and [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/description/).

## ``Interview Process``

You may receive an online assessment link as your first step of interview process. The assessment will expire within 7 days and contains two coding questions to be completed within an hour. Below are some Online Assessment questions for you to practice.

Near the end of this chapter we provide more details of the different stages of a Google interview.

## ``Google Phone Interview``
The phone screen usually last between 30 and 60 minutes.

Your phone interview will cover data structures and algorithms. Be prepared to write around 20-30 lines of code in your strongest language. This should be clean, rich, robust code.

Your interviewer will ask one or two coding questions with lots of follow up questions. Be prepared to talk through your thought process while writing code in a Google Doc that you’ll share with your interviewer. We recommend using a hands-free headset or speakerphone so you can type freely.

1. You will be asked an open ended question. Ask clarifying questions, devise requirements.
2. You will be asked to explain it in an algorithm.
3. Convert it to a workable code.
    - (**Hint**: Don't worry about getting it perfect because time is limited. Write what comes but then refine it later. Also make sure you consider corner cases and edge cases, production ready.)
4. Optimize the code, follow it with test cases and find any bugs.

## ``Google Onsite Interview``
This is it! You've passed the phone interviews and now you have received an onsite interview invitation. Onsite interview is the most important process of a Google interview, and your ability to receive an offer will largely depend on your performance during onsite interviews. Traditionally, the percentage of candidates who will receive an offer after onsite interview is about [1 of 5 to 1 of 7](https://www.quora.com/What-percentage-of-candidates-convert-a-Google-onsite-interview-into-an-offer).

You'll usually meet with five Googlers for about 30 to 45 minutes each, and one of them will be your lunch interviewer who does not submit interview feedback, so take this opportunity to freely ask questions.

All candidates will have the chance to highlight strengths in four different areas:

- **General cognitive ability**: Open-ended questions are asked to learn how you approach and solve problems. And there’s no one right answer—your ability to explain your thought process and how you use data to inform decisions is what’s most important.
- **Leadership:** Be prepared to discuss how you have used your communication and decision-making skills to mobilize others. This might be by stepping up to a leadership role at work or with an organization, or by helping a team succeed even when you weren’t officially the leader.
- **Role-related knowledge:** Google is interested in how your individual strengths combine with your experience to drive impact. Google don’t just look for how you can contribute today, but how you can grow into different roles—including ones that haven’t even been invented yet.
- **Googleyness:** Share how you work individually and on a team, how you help others, how you navigate ambiguity, and how you push yourself to grow outside of your comfort zone.
Note that Google put heavy emphasis on your analytical ability regardless of your job experience. Be prepared to showcase solid understanding of data structures and algorithms. If you have years of experiences in the industry and are rusty in your Computer Science fundamentals, invest more time in brushing up your basic CS fundamental skills. Otherwise, you may [end up being rejected like Max Howell](https://www.quora.com/Whats-the-logic-behind-Google-rejecting-Max-Howell-the-author-of-Homebrew-for-not-being-able-to-invert-a-binary-tree/answer/Max-Howell) for not able to [invert a binary tree](https://leetcode.com/problems/invert-binary-tree/).

Google wants to understand your coding skills and technical areas of expertise, including tools or programming languages and general knowledge on topics like data structures and algorithms. There's generally some back and forth in these discussions, just like there is on the job to push each other's thinking and learn about different approaches. So be prepared to talk through your solutions in depth. Push your own boundaries and find the best answer—that’s probably how you work anyway.

Technical onsite interviews at Google were historically conducted on whiteboards, but to provide a more authentic coding experience that’s less time-consuming, Google has started to offer laptops for coding interviews in some sites. These chromebooks have an interview app that let's you choose a coding language of your preference.

Throughout the interview process, feel free to ask your interviewers for clarification to make sure you fully understand their questions.

## ``Google Hiring Committee``
After the onsite interview, each of your interviewers (except the lunch interviewer) will have to submit detailed interview feedback. Each interviewer's feedback is kept hidden from other interviewers to ensure one's feedback does not influence the others. Each interviewer will assign a score and make a Hire / No Hire decision.

Assume the scores from the feedback are good enough, your whole packet will be moved forward to the hiring committee for review.

The hiring committee will review all submitted feedback thoroughly and make a hire / no hire recommendation. For more details about this process, [you can read here](https://www.quora.com/What-happens-during-a-Google-hiring-committee-meeting).


## ``Google Offer Review``
If Hiring Committee recommends hire, congratulations! You have arrived at the final stage of the process. There are about [10-12% candidates not extended offers](https://www.quora.com/My-Google-recruiter-has-asked-me-about-my-current-compensation-and-external-references-Whats-the-probability-of-not-getting-an-offer-from-this-point/answer/Bob-See) at this stage. Recruiter requests for External References and Compensation History, conducts reference checks, and prepares a packet for the Offer Review Process.

The Offer Review process:

1. Pre-Review Committee
2. Compensation Committee Review
3. Senior VP Review
There is a small percentage chance of [the offer not getting approved at the final SVP review](https://www.quora.com/Why-would-one-be-rejected-at-the-final-stage-at-Google/answer/Bob-See).


## ``` Arrays and Strings ```

> String manipulation problems are in the same category as arrays, because internally, a string is represented as an array of characters. 
Array problems usually do not require knowledge of advanced data structures, so just basic data structures such as [Hash Tables](https://leetcode.com/articles/hash-table/) and basic techniques 
like [Two Pointers](https://leetcode.com/articles/two-pointer-technique/) should suffice.

> Google likes to test your ability to think at large scale by asking variation of problems represented in a [data stream model](https://en.wikipedia.org/wiki/Streaming_algorithm#Data_stream_model). 
For example, instead of giving you an integer array, you are given a stream of integers and all integers are too large to fit in memory. 
A great example of such problem, which can be represented in a data stream model, is the [Longest Substring with At Most K Distinct Characters](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/).

## ```Linked Lists```

> According to our user survey data, Linked List problems are not asked frequently at Google. Perhaps, most linked list problems are not that complex and it is harder to ask follow up and complexity analysis questions.

> Nonetheless, we strongly recommend you to still practice classic Linked List interview questions such as: [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/), [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/), and [Copy List with Random Pointers](https://leetcode.com/problems/copy-list-with-random-pointer/). These problems are really fun and they teach you how to think outside of the box.

> Of course, [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) is one of our all-time favorite interview questions, and Google seems to love this question as well. Make sure you understand how to analyze the time complexity! This is a common follow up question for this problem.

## ```Trees and Graphs```

> Tree is just a special case of graph. To understand the difference between trees and graphs, you can work on [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/description/).

> Graphs are generally breath-first search or depth-first search. The same applies to Trees, but trees never contain cycles.

> Graphs are generally more complex than trees. Similarly, trees are generally more complex than linear data structures, such as arrays or linked lists.

> Prepping your knowledge in Graphs is essential for Google interviews as you would most likely encounter a tree or a graph question. A great way to brush up your skills in this area is to implement a tree or graph by coding it from scratch in the [Playground](https://leetcode.com/playground/).




