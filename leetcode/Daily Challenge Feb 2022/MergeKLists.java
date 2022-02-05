public class mergeKLists{
       public ListNode MergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        return merge(lists,0, lists.length-1);
    }
    private ListNode merge(ListNode[]lists, int start, int end){
        if(start==end)return lists[start];
        int mid =start+(end-start)/2;
        ListNode l1= merge(lists,start,mid);
        ListNode l2 = merge(lists,mid+1,end);
        return merge2Lists(l1,l2);
    }
    
    private ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode dummy = new ListNode(-1);
        ListNode p3=dummy;
        while(p1!=null&&p2!=null){
            if(p1.val<p2.val){
                p3.next =p1;
                p1=p1.next;
            }else{
                p3.next =p2;
                p2=p2.next;
            }
            p3=p3.next;
        }
        p3.next = p1==null?p2:p1;
        return dummy.next;
    }
}