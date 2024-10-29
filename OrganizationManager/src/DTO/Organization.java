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
public abstract class Organization {

    protected int Size;

    public Organization() {
    }

    public Organization(int Size) {
        this.Size = Size;
    }

    public abstract void communicateByTool();

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    @Override
    public String toString() {
        return "Organization{" + "Size=" + Size + '}';
    }

}
