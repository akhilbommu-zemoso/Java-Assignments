class SList<E> {
    private Link<E> headLink = new Link<E>(null);
    SListIterator<E> iterator() { return new SListIterator<E>(headLink); }
    public String toString() {
        if(headLink.next == null) {
            return "SList: []";
        }
        System.out.print("SList: [");
        SListIterator<E> it = this.iterator();
        StringBuilder s = new StringBuilder();
        while(it.hasNext()) {
            s.append(it.next()).append(it.hasNext() ? ", " : "");
        }
        return s + "]";
    }
}

class SListIterator<E> {
    Link<E> current;
    SListIterator(Link<E> link) {
        current = link;
    }
    public boolean hasNext() {
        return current.next != null;
    }
    public Link<E> next() {
        current = current.next;
        return current;
    }
    public void insert(E e) {
        current.next = new Link<E>(e, current.next);
        current = current.next;
    }
    public void remove(E data) {
        Link temp;
        while(current.next != null){
            temp = current;
            current = current.next;
            if(current.value == data){
                temp.next = current.next;
                break;
            }
        }
    }
}

class Link<E> {
    E value;
    Link<E> next;
    Link(E value, Link<E> next) {
        this.value = value;
        this.next = next;
    }
    Link(E value) {
        this(value, null);
    }
    public String toString() {
        if(value == null) {
            return "null";
        }
        return value.toString();
    }
}

public class Assignment10 {
    public static void main(String[] args){
        SList<String> sl = new SList<String>();
        System.out.println(sl);
        SListIterator<String> slIter = sl.iterator();
        slIter.insert("One");
        slIter.insert("Two");
        slIter.insert("Three");
        slIter.insert("Four");
        slIter.insert("Five");
        System.out.println(sl);
        SListIterator<String> slIter2 = sl.iterator();
        slIter2.remove("Five");
        System.out.println(sl);
        SListIterator<String> slIter3 = sl.iterator();
        slIter3.remove("Three");
        System.out.println(sl);
    }
}
