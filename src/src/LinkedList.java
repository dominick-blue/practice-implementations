import java.util.ArrayList;

public class LinkedList
{
    private static class Node
    {
        int val;
        Node next;

        Node (int val)
        {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LinkedList()
    {
        this.head = null;
        this.size = 0;
    }

    public int get(int index)
    {
        if (index < 0 || index >= size)
        {
            return -1;
        }

        Node current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current.val;
    }

    public void insertHead(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertTail(int val)
    {
        Node newNode = new Node(val);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(int index)
    {
        if (index < 0 || index >= size)
        {
            return false;
        }

        if (index == 0)
        {
            head = head.next;
        }
        else
        {
            Node current = head;
            for (int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues()
    {
        ArrayList<Integer> values = new ArrayList<>();
        Node current = head;
        while (current != null)
        {
            values.add(current.val);
            current = current.next;
        }
        return values;
    }
}
