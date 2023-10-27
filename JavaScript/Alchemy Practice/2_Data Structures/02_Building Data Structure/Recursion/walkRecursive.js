function walk(node) {
    if(node.next!=null){
        return walk(node.next);
    }
    return node;
}

module.exports = walk;