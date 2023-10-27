function walk(node) {
    if(node.next!=null){
        return node.next;
    }
    return node;
}

module.exports = walk;

