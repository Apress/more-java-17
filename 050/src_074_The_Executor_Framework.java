import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.SECONDS;
import java.util.concurrent.TimeUnit;
...
LocalDateTime scheduledDateTime = 
    get the scheduled date and time for the task...
// Compute the delay from the time you schedule the task  
long delay = SECONDS.between(LocalDateTime.now(), 
    scheduledDateTime);
// Schedule the task  
sexec.schedule(task, delay, TimeUnit.MILLISECONDS);
