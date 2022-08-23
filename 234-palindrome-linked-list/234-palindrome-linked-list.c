bool helper(struct ListNode** front, struct ListNode* back);

bool isPalindrome(struct ListNode* head){
    struct ListNode* front = head;
    return helper(&front, head);

}

bool helper(struct ListNode** front, struct ListNode* back){
    if(back == NULL) return true;
    
    //let back pointer travel to the back of the list through recursion
    bool equal_so_far = helper(front, back->next);
    
    //check if front and back have the same value
    bool value_equal = ((*front)->val == back->val);
    
    //when the function return, back is gradually moved toward head of the list
    //move front accordingly to compare their value
    *front = (*front)->next;
    return equal_so_far && value_equal;
}
