while (buffer is empty) {
    buffer.wait();
}
buffer.consume();
