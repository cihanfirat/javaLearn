public class App {
    public static void main(String[] args) throws Exception {
        IChatMediator chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom, "cihan");
        User user2 = new ChatUser(chatroom, "mikail");
        User user3 = new ChatUser(chatroom, "bob");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);

        user1.send("hi");
        user3.send("hi cihan");
    }
}
