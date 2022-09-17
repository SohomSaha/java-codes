class Solution:
    def palindromePairs(self, words: List[str]) -> List[List[int]]:
        trie = {}
        palindromes = []
        
        @cache
        def isPal(word):
            l = 0
            r = len(word) - 1
            while l < r:
                if word[l] == word[r]:
                    l += 1
                    r -= 1
                else: return False
            return True
		
		# Populate trie
        for idx, word in enumerate(words):
            if word != '' and isPal(word):
                palindromes.append(idx)
            t = trie
            for i in reversed(range(len(word))):
                letter = word[i]
                if letter not in t:
                    t[letter] = {}
                t = t[letter]
            t['isWord'] = idx
        
        def checkRemaining(idx, trie, string):
            if len(string) and 'isWord' in trie:
                if isPal(string):
                    output.append([idx, trie['isWord']])
            for key in trie:
                if key == 'isWord': continue
                checkRemaining(idx, trie[key], string + key)
            return

        output = []
        for idx, word in enumerate(words):            
            if word == '':
                for p_idx in palindromes:
                    output.append([idx, p_idx])
                continue

            t, i = trie, 0
            while i < len(word):
                if 'isWord' in t and isPal(word[i:]):
                    output.append([idx, t['isWord']])
                letter = word[i]
                if letter in t:
                    t = t[letter]
                    i += 1
                else: break

            if i == len(word):
                if t.get('isWord', idx) != idx:
                    output.append([idx, t['isWord']])
                checkRemaining(idx, t, '')
        return output