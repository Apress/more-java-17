// Prepare the attachment 
Attachment attach = new Attachment(); 
attach.server = server; 
// Accept new connections 
server.accept(attach, new ConnectionHandler());
