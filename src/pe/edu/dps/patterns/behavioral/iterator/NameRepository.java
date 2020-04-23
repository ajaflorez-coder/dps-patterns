package pe.edu.dps.patterns.behavioral.iterator;

public class NameRepository implements Container{
    public String names[] = {"Robert", "John", "Julie", "Lora", "Pepe", "Rosa", "Maria"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        public NameIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if( index < names.length ) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if( this.hasNext() ) {
                return names[ index++ ];
            }
            return null;
        }
    }
}
