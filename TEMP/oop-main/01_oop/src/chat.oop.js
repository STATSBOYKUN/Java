class ChatRoom {
    constructor() {
      this.messages = [];
    }
    
    addMessage(sender, text) {
      const message = new Message(sender, text);
      this.messages.push(message);
      console.log(`[${message.timestamp}] ${message.sender}: ${message.text}`);
    }
    
    viewChat() {
      console.log(`-- Chat Room --`);
      for (const message of this.messages) {
        console.log(`[${message.timestamp}] ${message.sender}: ${message.text}`);
      }
    }
  }
  
  class User {
    constructor(username) {
      this.username = username;
      this.isAdmin = false
      const  a = new User()
    }
    
    sendMessage(chatRoom, text) {
      chatRoom.addMessage(this.username, text);
    }

    addMember(user){
        if(!this.isAdmin) return;
    }
  }
  
  class Message {
    constructor(sender, text) {
      this.sender = sender;
      this.text = text;
      this.timestamp = new Date();
    }
  }

  class Admin extends User{

    constructor(username){
        super(username)
        this.isSuperAdmin = false
    }
    addMember(user){

    }

  }
  
  // Example usage
  const chatRoom = new ChatRoom();
  const alice = new User("Alice");
  alice.sendMessage(chatRoom, "Hi there!");
  chatRoom.viewChat();
  