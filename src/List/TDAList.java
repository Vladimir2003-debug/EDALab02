package List;

interface TDAList<E>{
    boolean isEmpty();
    void insertFirst(E x);
    void insert(E x);
    int search(E x);
    E searchK(int k);
    E remove(E x);
}

