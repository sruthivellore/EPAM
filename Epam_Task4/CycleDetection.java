    
boolean hasCycle(Node head) {
    if(head == null || head.next == null) {
        return false;
    }
    HashSet<Node> visited = new HashSet<Node>();
    Node currentNode = head.next;
    while(currentNode != null) {
           
        if(visited.contains(currentNode)){
            return true;
        }else{
            visited.add(currentNode);
        }
        currentNode = currentNode.next;
    }
    return false;
}
