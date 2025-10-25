/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* sum = new ListNode();

        int carry = 0;

        ListNode* current_l1 = l1;
        ListNode* current_l2 = l2;
        ListNode* current_sum = nullptr;

        while(current_l1 != nullptr || current_l2 != nullptr || carry == 1) {
            if(current_sum == nullptr) {
                current_sum = sum;
            }
            else {
                current_sum->next = new ListNode();
                current_sum = current_sum->next;
            }
            
            if(current_l1 != nullptr) {
                current_sum->val += current_l1->val;
                current_l1 = current_l1->next;
            }
            if(current_l2 != nullptr) {
                current_sum->val += current_l2->val;
                current_l2 = current_l2->next;
            }

            if(carry == 1) {
                current_sum->val += 1;
                carry = 0;
            }
            
            if(current_sum->val >= 10) {
                current_sum->val %= 10;
                carry = 1;
            }
        }

        return sum;
    }
};
