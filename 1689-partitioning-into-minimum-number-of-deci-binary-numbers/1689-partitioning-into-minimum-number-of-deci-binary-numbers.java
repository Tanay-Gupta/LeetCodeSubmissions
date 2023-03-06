class Solution {
    public int minPartitions(String n) {
        
        char ch[]=n.toCharArray();
        Arrays.sort(ch);
        
        return(ch[ch.length-1]-48);
        
        /**
        How could I have come up with this solution?
This is definitely a question worth considering. How would one know that the solution is not a DP solution? We need to look at the question constraints and hints hidden in the description of the question.

One major hint was our input. We were given a String, not an int. The string can be really long as implied by the constraints of its length. Just from this, we can already conclude that we can't just change our String to an integer. This already puts the coin change strategy out of the picture.

Another hint would come from the fact that the numbers only consist of 1's and 0's and that n is strictly positive.

From here, it's important to think about a linear solution to the question since the length of the string could be quite large. With all of these things put into consideration, you should have more than enough information to assume that there's probably some trick involved in the question that's specific to the description of this question. The best thing to do from here is to draw out some short yet distinct examples and try and extract out any patterns.


*/
        
        
    }
}