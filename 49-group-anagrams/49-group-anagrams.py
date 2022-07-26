class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        hashTable = {}
        for word in strs:
            sortedWord = "".join(sorted(word))
            if sortedWord in hashTable:
                hashTable[sortedWord].append(word)
            else:
                hashTable[sortedWord] = [word]
        return list(hashTable.values())