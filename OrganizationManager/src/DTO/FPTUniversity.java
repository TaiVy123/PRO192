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
public class FPTUniversity extends University implements Role {

    private String address;

    public FPTUniversity() {
    }

    public FPTUniversity(int size, String name, String address) {
        super(size, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    
    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }

    @Override
    public String toString() {
        return "FPTU has four campuses: Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
}
