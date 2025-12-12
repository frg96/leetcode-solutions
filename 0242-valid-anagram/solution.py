class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_map: dict[str, int] = {}
        for c in s:
            s_map[c] = s_map.get(c, 0) + 1
        for c in t:
            if c in s_map:
                s_map[c] -= 1
            else:
                return False

        for v in s_map.values():
            if v != 0:
                return False

        return True
        
