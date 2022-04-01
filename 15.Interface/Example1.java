//call back method

interface Member{
    public void callback();
}

class store{
    Member member[] = new Member[10];
    int count = 0;
    
    void register(Member m){
        member[count++] = m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++){
            member[i].callback();
        }
    }
}

class customer implements Member{
    String name;

    customer(String n){
        name = n;
    }

    public void callback(){
        System.out.println("Ok, I will visit, "+name);
    }
}

class Example1{
    public static void main(String[] args){
        store obj1 = new store();
        customer obj2 = new customer("Manika");
        customer obj3 = new customer("Madhuranjan");

        obj1.register(obj2);
        obj1.register(obj3);
        obj1.inviteSale();
    }
}