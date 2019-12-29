# HackerRank

<b>Counting Valleys</b>
  
Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step. Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. We define the following terms
A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high. Finally, he returns to sea level and ends his hike.

Function Description </br>
It must return an integer that denotes the number of valleys Gary traversed.
countingValleys has the following parameter(s):
n: the number of steps Gary takes
s: a string describing his path

<b>EqualizeArray</b>

Karl has an array of integers. He wants to reduce the array until all remaining elements are equal. Determine
the minimum number of elements to delete to reach his goal.

Function Description</br>
It must return an integer that denotes the minimum number of deletions required.
equalizeArray has the following parameter(s):
arr: an array of integers

<b>Sock Merchant</b>

Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are. 

Function Description</br>
It must return an integer representing the number of matching pairs of socks that are available.
sockMerchant has the following parameter(s):
n: the number of socks in the pile
ar: the colors of each sock

<b> Jumping on Clouds </b>

Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2 . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game. For each game, Emma will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided.

Function Description</br>
It should return the minimum number of jumps required, as an integer.
jumpingOnClouds has the following parameter(s):
c: an array of binary integers

<b> Cut the Sticks </b>

You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. 

Function Description</br>
It should return an array of integers representing the number of sticks before each cut operation is performed.
cutTheSticks has the following parameter(s):arr: an array of integers representing the length of each stick

<b> Non Divisible Subset </b>

Given a set of distinct integers, print the size of a maximal subset of S where the sum of any 2 numbers in S' is not evenly divisible by k.

Function Description</br>
It should return an integer representing the length of the longest subset of  meeting the criteria.
nonDivisibleSubset has the following parameter(s):
S: an array of integers
k: an integer

<b> Repeated String </b>

Lilah has a string, , of lowercase English letters that she repeated infinitely many times.
Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

Function Description</br>
It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.
repeatedString has the following parameter(s):
s: a string to repeat
n: the number of characters to consider
