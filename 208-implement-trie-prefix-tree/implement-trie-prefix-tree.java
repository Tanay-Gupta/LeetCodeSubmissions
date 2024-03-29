class Node{

    Node links[]=new Node[26];
    boolean isend=false;
    boolean containsKey(char ch){

        return (links[ch-'a']!=null);
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch, Node node){

        links[ch-'a']=node;
    }

    void setEnd(){isend=true;}

    boolean isEnd(){
        return isend;
    }

   }
class Trie {


   Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {


        Node node=root;
        for(int i=0;i<word.length();i++){

            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
        
    }
    
    public boolean search(String word) {
       Node node=root;

       for(int i=0;i<word.length();i++)
       {
        if(node.containsKey(word.charAt(i)))
                node=node.get(word.charAt(i));

                else 
                return false;
       }

       if(node.isEnd())
       return true;
       return false;   
    }
    
    public boolean startsWith(String word) {

       Node node=root;

       for(int i=0;i<word.length();i++)
       {
        if(node.containsKey(word.charAt(i)))
                node=node.get(word.charAt(i));

                else 
                return false;
       }

       
       return true;   
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */