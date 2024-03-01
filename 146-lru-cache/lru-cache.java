class LRUCache {

    class Node
    {

        int key;
        int val;
        Node next;
        Node prev;

    Node(int key,int val){
            this.key=key;
            this.val=val;
        }

    }


    Node left;
    Node right;
    int cap;
    HashMap<Integer,Node> cache;

    public LRUCache(int capacity) {
        
        this.cap=capacity;
        cache=new HashMap<>();
        this.left=new Node(0,0);
        this.right=new Node(0,0);
        this.left.next=right;
        this.right.prev=left;
    }

    public int get(int key) {

        if(cache.containsKey(key)){
            remove(cache.get(key));
            insert(cache.get(key));

            return cache.get(key).val;
        }
        return -1;

    }

    public void put(int key, int value) {

        if(cache.containsKey(key)) remove(cache.get(key));

        cache.put(key,new Node(key,value));
        insert(cache.get(key));
        if(cache.size()>cap){

            Node lru=this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }

    }

    void remove(Node node){

        Node prev=node.prev;
        Node next =node.next;

        prev.next=next;
        next.prev=prev;
    }
    void insert(Node node){

        Node prev=this.right.prev;
        Node next=this.right;
        
        prev.next=node;
        next.prev=node;
        node.next=next;
        node.prev=prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */