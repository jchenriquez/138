class Node {
  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}

class Main {

  public Node copyRandomList(Node head) {
    HashMap<> map = new HashMap<Integer, Node>(1000);
    Node res = null;
    Node curr = null;

    for (cur = head; cur != null; cur = cur.next) {
      if (res == null) {
        res = new Node(cur.val);
        curr = res;
      } else {
        Node tmp = new Node(cur.val);
        curr.next = tmp;
        curr = tmp;
      }

      map.put(curr.val, curr);
    }

    for (curr1 = head, curr2 = res; curr1 != null && curr2 != null; curr1 = curr1.next, curr2 = curr2.next) {
      if (curr1.random != null) {
        int randVal = curr1.random.val;
        Node ranNode = map.get(randVal);
        curr2.random = ranNode;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}