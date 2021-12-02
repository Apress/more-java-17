CAS(M, V, N) {
    currentValueAtM = get the value at Location M;
    if (currentValueAtM == V) {
        set value at M to N;
    }
    return currentValueAtM;
}
