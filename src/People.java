import java.util.ArrayList;

class People {
    private String name;
    private String id;

    public String getId () {
        return id;
    }
    public void setId (String index) {
        id = index;
    }

    public String getName() {
        return name;
    }
    public void setName (String UserName) {
        name = UserName;
    }

}

class TestDrivePeople {
    public static void main (String[] args) {

        ArrayList<String> ListOfNames = new ArrayList<>();
        ListOfNames.add("Алекс");
        ListOfNames.add("Виктория");
        ListOfNames.add("Андрэ");
        ListOfNames.add("Оля");
        ListOfNames.add("Лада");
        ListOfNames.add("Аниса");

        People[] User = new People[5];
        int x = 0;
        for(People num : User) {

            User[x] = new People();

            int ListOfNamesLength = ListOfNames.size();
            int randomListNum = (int)(Math.random() * ListOfNames.size());
            String randomName = ListOfNames.get(randomListNum);

            int randomNum = (int)(Math.random() * 1000);
            String numberId = String.valueOf(randomNum);

            User[x].setName(randomName);
            User[x].setId(numberId);

            ListOfNames.remove(randomName);

            System.out.println(User[x].getName());
            x = x + 1;
        }


    }
}




