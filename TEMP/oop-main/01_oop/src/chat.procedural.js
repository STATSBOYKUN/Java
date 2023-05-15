const chatRoom = [];
let username = "";

function joinChat(name) {
  username = name;
  console.log(`User ${username} joined the chat room.`);
}

function leaveChat() {
  console.log(`User ${username} left the chat room.`);
  username = "";
}

function sendMessage(text) {
  if (!username) {
    console.log("Error: User not logged in.");
    return;
  }
  
  const message = {
    sender: username,
    text: text,
    timestamp: new Date()
  };
  
  chatRoom.push(message);
  console.log(`[${message.timestamp}] ${message.sender}: ${message.text}`);
}

function viewChat() {
  console.log(`-- Chat Room --`);
  
  for (const message of chatRoom) {
    console.log(`[${message.timestamp}] ${message.sender}: ${message.text}`);
  }
}

// Example usage
joinChat("Alice");
sendMessage("Hi there!");
viewChat();
leaveChat();
username = "Sancita";
console.log(username)