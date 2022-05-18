package com.example.cat;

public class Cats {

    String CatName , CatBreed, CatDescription  ;

    public Cats() {
    }

    public Cats(String catname, String catBreed, String catDes) {
        CatName = catname;
        CatBreed = catBreed;
        CatDescription  = catDes;
    }

    public String getCatname() {
        return CatName;
    }

    public void setCatname(String catname) {
        CatName = catname;
    }

    public String getCatBreed() {
        return CatBreed;
    }

    public void setCatBreed(String catBreed) {
        CatBreed = catBreed;
    }

    public String getCatDes() {
        return CatDescription ;
    }

    public void setCatDes(String catDes) {
        CatDescription  = catDes;
    }
}

