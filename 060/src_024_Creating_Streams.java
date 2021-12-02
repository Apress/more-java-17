for (int index = seed; 
       hasNext.test(index); 
       index = next.applyAsInt(index)) {
    // index is the next element in the stream
}
