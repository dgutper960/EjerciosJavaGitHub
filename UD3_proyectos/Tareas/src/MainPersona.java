class Persona { //por defecto visibilidad package es lo que esta en la carpeta madre del proyecto
    private String name = "Tu Nombre";
    private Integer age = 0;
    private static String species = "Humano";

    Persona () {

    }

    //Para crear un constructor
    Persona (String name, Integer age){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void mayoredad(String[] args) {
        if(age < 18){
            System.out.print("La persona es menor de edad");
        }else
            System.out.print("La persona es mayor de edad");
    }

    String getName () {
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(Integer age){
        this.age = age;
    }

    void  setSpecies(String species){
        this.species = species;
    }

    public static String getSpecies() {
        return species;
    }

    Integer getAge() {
        return age;
    }


}


