package com.example.einat.gates.DB;

/**
 * Created by Einat on 11/09/2015.
 */
public class Gate {

    String name;
    int tel, latlon, dist;

    public Gate(String name, int tel, int latlon, int dist) {
        this.name = name;
        this.tel = tel;
        this.latlon = latlon;
        this.dist = dist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getLatlon() {
        return latlon;
    }

    public void setLatlon(int latlon) {
        this.latlon = latlon;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }
}
