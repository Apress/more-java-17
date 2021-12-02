compareAndSet(M, V, N) {
    // Call CAS (see CAS pseudocode) if CAS succeeded, 
    // return true; otherwise, return false.
    return (CAS(M, V, N) == V)
}
