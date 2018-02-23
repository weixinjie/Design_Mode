package com.weixinjie.iterator_pattern;

public class NameResp implements Container {
    public String[] names = new String[]{"weixinjie", "zhangrui", "11111", "22222", "33333"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index >= names.length) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }
}
