package ro.pao.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Time;
import java.util.List;
import java.util.UUID;

public class Book {

    private String id;

    private String name;

    private String effect;

    private String sideEffects;

    private String characteristics;

    private Time time;

    private String difficulty;

    private String manufacturer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", effect='" + effect + '\'' +
                ", sideEffects='" + sideEffects + '\'' +
                ", characteristics='" + characteristics + '\'' +
                ", time=" + time +
                ", difficulty='" + difficulty + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
