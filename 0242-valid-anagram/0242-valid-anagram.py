class Solution(object):
    def isAnagram(self, s, t):
        return sorted(s.lower()) == sorted(t.lower())
      
        