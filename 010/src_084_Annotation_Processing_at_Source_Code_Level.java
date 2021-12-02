String errorMsg = "Version cannot be negative. major=" + 
    major + " minor=" + minor;
Messager messager = this.processingEnv.getMessager();
messager.printMessage(Kind.ERROR, errorMsg, element);
