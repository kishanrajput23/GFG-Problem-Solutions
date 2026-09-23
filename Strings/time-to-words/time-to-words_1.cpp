class Solution {
public:
    string timeToWords(int h, int m) {

        string nums[] = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine"
        };

        string ans = "";

        switch (m) {
            case 0:
                ans = nums[h] + " o' clock";
                break;

            case 1:
                ans = "one minutes past " + nums[h];
                break;

            case 15:
                ans = "quarter past " + nums[h];
                break;

            case 30:
                ans = "half past " + nums[h];
                break;

            case 45:
                ans = "quarter to " + nums[(h % 12) + 1];
                break;

            case 59:
                ans = "one minutes to " + nums[(h % 12) + 1];
                break;

            default:
                if (m < 30)
                    ans = nums[m] + " minutes past " + nums[h];
                else
                    ans = nums[60 - m] + " minutes to " + nums[(h % 12) + 1];
        }

        return ans;
    }
};