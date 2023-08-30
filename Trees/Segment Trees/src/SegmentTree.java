public class SegmentTree {
    private static class Node{
        int data;
        int startInterval,endInterval;
        Node left,right;
        public Node(int startInterval,int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
        //create a tree using this array
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int startInterval, int endInterval) {
        //O(n) -> Time complexity to construct tree / make tree
        if(startInterval==endInterval){
            //leaf node
            Node leaf = new Node(startInterval,endInterval);
            leaf.data = arr[startInterval];
            return leaf;
        }
        //create new node w/ index we are at
        Node node = new Node(startInterval,endInterval);
        int mid = (startInterval+endInterval)/2;
        node.left = this.constructTree(arr,startInterval,mid);
        node.right = this.constructTree(arr,mid+1,endInterval);
        node.data = node.left.data + node.right.data;
        return node;
    }
    public void display(){
        display(this.root);
    }

    private void display(Node node) {
        String str = "";
        if(node.left!=null){
            str = str +"Interval=["+node.left.startInterval + "-"+node.left.endInterval+"] and data: "+node.left.data+" => ";
        }else{
            str= str+"No left child";
        }
        //for current node
        str = str +"Interval=["+node.startInterval + "-"+node.endInterval+"] and data: "+node.data+"<-";
        if(node.right!=null){
            str = str +"Interval=["+node.right.startInterval + "-"+ node.right.endInterval+"] and data: "+node.right.data+" ->";
        }else{
            str+="No Right Child";
        }
        System.out.println(str);

        //call recursion
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }
    //query
    public int query(int qsi, int qei){
        return this.query(this.root,qsi,qei);
    }
    public int query(Node node,int qsi,int qei){
        if(node.startInterval>=qsi && node.endInterval<=qei){
            //node is completely lying inside query
            return node.data;
        }else if(node.startInterval > qei || node.endInterval<qsi){
            //completely outside
            return 0;
        }else{
            return this.query(node.left,qsi,qei)+this.query(node.right,qsi,qei);
        }
    }

    public void update(int index, int value){
        this.root.data = update(this.root,index,value);
    }
    //update
    public int update(Node node,int index,int value){
        if(index>=node.startInterval && index <=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                node.data = value;
                return node.data;
            }else{
              int leftAns = update(node.left,index,value);
              int rightAns = update(node.right,index,value);
              node.data = leftAns+rightAns;
              return node.data;
            }
        }
        return node.data;
    }
}