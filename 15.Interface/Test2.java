class Phone{
    public void call(){
        System.out.println("Calling method of concrete class");
    }
    public void sms(){
        System.out.println("Sending SMS method of concrete class");
    }
}

interface Camera{
    void click();
    void video();
}

interface MusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements Camera,MusicPlayer{
    public void click(){
        System.out.println("Photo clicking on Smart phone");
    }
    public void video(){
        System.out.println("Video Recording on Smart phone");
    }
    public void play(){
        System.out.println("Playing music on Smart phone");
    }
    public void stop(){
        System.out.println("Stopped playing music on Smart phone");
    }

}

class Test2{
    public static void main(String args[]){
        SmartPhone obj1 = new SmartPhone();

        obj1.click();
        obj1.video();
        obj1.play();
        obj1.stop();

        Phone obj2 = new SmartPhone();
        obj2.call();
        obj2.sms();
        // obj2.click();  ->Showing an error

        Camera obj3 = new SmartPhone();
        obj3.click();
        // obj3.play();     -> Showing an error
    }
}