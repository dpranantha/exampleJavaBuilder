package builder;

class NameRepository implements Container {
    private final String names[];

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

    public static class Builder {
        private String names[];

        public Builder names(String[] names) {
            this.names = names;
            return this;
        }

        public NameRepository build() {
            return new NameRepository(this);
        }
    }

    private NameRepository(Builder builder) {
        this.names = builder.names;
    }
}
