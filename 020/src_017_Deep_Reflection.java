SecurityManager smgr = System.getSecurityManager();
if (smgr == null) {
    System.out.println(
        "Security manager is not installed.");
}
