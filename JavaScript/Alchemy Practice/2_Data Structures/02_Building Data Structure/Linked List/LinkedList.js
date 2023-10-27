class LinkedList {
    constructor(){
        this.head = null;
    }
    addFirst(node){
        if(this.head!==null){
            node.next = this.head;
        }
        this.head = node;
    }
    addLast(node){
        if(this.head===null){
            this.head = node;
        }else{
            let temp = this.head;
            while(temp.next!==null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    indexOf(node){
        let index = 0;
        let temp = this.head;
        while(temp!==null){
            if(temp.data === node.data){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
    removeAt(index){
        if (index === 0) {
            this.head = this.head.next;
        } else {
            let temp = this.head;
            let prev = null;
            let currentIndex = 0;
            while (temp !== null && currentIndex !== index) {
                prev = temp;
                temp = temp.next;
                currentIndex++;
            }
            if (temp !== null) {
                prev.next = temp.next;
            }
        }
    }
}

module.exports = LinkedList;