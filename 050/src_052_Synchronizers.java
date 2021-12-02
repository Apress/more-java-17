// Assuming a BarrierAction class implements the 
// Runnable interface
Runnable barrierAction = new BarrierAction();
CyclicBarrier barrier = new CyclicBarrier(
    5, barrierAction);
