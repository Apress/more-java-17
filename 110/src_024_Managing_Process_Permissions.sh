/opt/jdk17/bin/java \
-Dfile.encoding=UTF-8 \
-classpath /[<path-to-project>]/bin \
-XX:+ShowCodeDetailsInExceptionMessages \
com.jdojo.process.ManageProcessPermission

Process Count: 332
Command used:
/opt/jd17/bin/java 
  --class-path [...] com.jdojo.process.Job 1 3
Job (pid=3858) info: Sleep Interval=1 seconds, 
  Sleep Duration=3 seconds.
Job (pid=3858) is going to sleep for 1 seconds.
Job (pid=3858) is going to sleep for 1 seconds.
Job (pid=3858) is going to sleep for 1 seconds.
A security manager is installed.
Could not get a process count: access denied 
    ("java.lang.RuntimePermission" "manageProcess")
Could not start a new process: access denied 
    ("java.lang.RuntimePermission" "manageProcess")
