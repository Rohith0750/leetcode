class Solution(object):
    def isAnagram(self, s, t):
        return sorted(s.lower()) == sorted(t.lower())
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        