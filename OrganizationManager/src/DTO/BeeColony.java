/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author taing
 */
public class BeeColony extends Colony implements Role {

    private String type;

    public BeeColony() {
    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public String toString() {
        return "The colony’s type is " + type + ", size is about " + getSize() + ", and the place is " + place;
    }
}
