package com.example.maylet.ap1;

public class Curp {
    private String nombre;
    private String paterno;
    private String materno;
    private String sexo;
    private String estado;
    private int dd;
    private int mm;
    private int yyyy;

    /*Arreglo de tipo String que contiene las
     * calves de las entidades federativas de M�xico*/
    final static String claves[] = {"AS","BS","BC","CC","CS","CH","CL",
            "CM","DF","DG","GT","GR","HG","JC","MC","MN","MS","NT","NL","OC",
            "PL","QT","QR","SP","SL","SR","TC","TS","TL","VZ","YN","ZS","NE"};

    public Curp(){
        this.nombre = null;
        this.paterno = null;
        this.materno = null;
        this.sexo = null;
        this.estado = null;
        this.mm = 0;
        this.dd = 0;
        this.yyyy = 0;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getPaterno(){
        return this.paterno;
    }
    public void setPaterno(String n){
        this.paterno = n;
    }
    public String getMaterno(){
        return this.materno;
    }
    public void setMaterno(String n){
        this.materno = n;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String n){
        this.sexo = n;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String n){
        this.estado = n;
    }
    public int getDD(){
        return this.dd;
    }
    public void setDD(int n){
        this.dd = n;
    }
    public int getMM(){
        return this.mm;
    }
    public void setMM(int n){
        this.mm = n;
    }
    public int getYYYY(){
        return this.yyyy;
    }
    public void setYYYY(int  n){
        this.yyyy = n;
    }

    public String generaClave(int id){
        String re = claves[id];
        return re;
    }

    public String buscaVocales(String en){
        String re = "";
        en.toUpperCase();
        for (int i=1; i<en.length(); i ++){
            if(en.charAt(i) == 'A' || en.charAt(i) == 'E'
                    || en.charAt(i) == 'I' || en.charAt(i) == 'O'
                    || en.charAt(i) == 'U'){
                re=""+en.charAt(i);
                break;
            }
        }
        return re;
    }

    public String buscaConsonantes(String en){
        String re = "";
        en.toUpperCase();
        for (int i=1; i<en.length(); i ++){
            if(en.charAt(i) == 'B' || en.charAt(i) == 'C'
                    || en.charAt(i) == 'D' || en.charAt(i) == 'F'
                    || en.charAt(i) == 'G' || en.charAt(i) == 'H'
                    || en.charAt(i) == 'J' || en.charAt(i) == 'K'
                    || en.charAt(i) == 'L' || en.charAt(i) == 'M'
                    || en.charAt(i) == 'N' || en.charAt(i) == '�'
                    || en.charAt(i) == 'P' || en.charAt(i) == 'Q'
                    || en.charAt(i) == 'R' || en.charAt(i) == 'S'
                    || en.charAt(i) == 'T' || en.charAt(i) == 'V'
                    || en.charAt(i) == 'W' || en.charAt(i) == 'X'
                    || en.charAt(i) == 'Y' || en.charAt(i) == 'Z'){
                re=""+en.charAt(i);
                break;
            }
        }
        return re;
    }

    public String generaCurp(String clave){

        String ddd,mmm,yyy;
        yyy = ""+this.yyyy;

        if(this.dd<10){
            ddd = "0"+this.dd;
        }else{ddd = ""+this.dd;}

        if(this.mm<10){
            mmm = "0"+this.mm;
        }else{mmm = ""+this.mm;}

        String re =""+this.paterno.charAt(0)+buscaVocales(this.paterno)+
                this.materno.charAt(0)+this.nombre.charAt(0)+yyy.charAt(2)+
                yyy.charAt(3)+mmm+ddd+this.sexo.charAt(0)+
                clave+buscaConsonantes(this.paterno)+
                buscaConsonantes(this.materno)+buscaConsonantes(this.nombre);

        return re;
    }
}

