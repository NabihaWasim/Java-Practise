package package_super_keyword;
class animal_super {
    String name;
    int age;
    String breed;
    public animal_super(String name,int age,String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    void sound(){
        System.out.println(name+" barks very loud");
    }
    
}

