package de.greenrobot.daotest;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SIMPLE_ENTITY.
 */
public class SimpleEntity {

    private Long id;
    private Boolean simpleBoolean;
    private Byte simpleByte;
    private Short simpleShort;
    private Integer simpleInt;
    private Long simpleLong;
    private Float simpleFloat;
    private Double simpleDouble;
    private String simpleString;
    private byte[] simpleByteArray;

    public SimpleEntity() {
    }

    public SimpleEntity(Long id) {
        this.id = id;
    }

    public SimpleEntity(Long id, Boolean simpleBoolean, Byte simpleByte, Short simpleShort, Integer simpleInt, Long simpleLong, Float simpleFloat, Double simpleDouble, String simpleString, byte[] simpleByteArray) {
        this.id = id;
        this.simpleBoolean = simpleBoolean;
        this.simpleByte = simpleByte;
        this.simpleShort = simpleShort;
        this.simpleInt = simpleInt;
        this.simpleLong = simpleLong;
        this.simpleFloat = simpleFloat;
        this.simpleDouble = simpleDouble;
        this.simpleString = simpleString;
        this.simpleByteArray = simpleByteArray;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSimpleBoolean() {
        return simpleBoolean;
    }

    public void setSimpleBoolean(Boolean simpleBoolean) {
        this.simpleBoolean = simpleBoolean;
    }

    public Byte getSimpleByte() {
        return simpleByte;
    }

    public void setSimpleByte(Byte simpleByte) {
        this.simpleByte = simpleByte;
    }

    public Short getSimpleShort() {
        return simpleShort;
    }

    public void setSimpleShort(Short simpleShort) {
        this.simpleShort = simpleShort;
    }

    public Integer getSimpleInt() {
        return simpleInt;
    }

    public void setSimpleInt(Integer simpleInt) {
        this.simpleInt = simpleInt;
    }

    public Long getSimpleLong() {
        return simpleLong;
    }

    public void setSimpleLong(Long simpleLong) {
        this.simpleLong = simpleLong;
    }

    public Float getSimpleFloat() {
        return simpleFloat;
    }

    public void setSimpleFloat(Float simpleFloat) {
        this.simpleFloat = simpleFloat;
    }

    public Double getSimpleDouble() {
        return simpleDouble;
    }

    public void setSimpleDouble(Double simpleDouble) {
        this.simpleDouble = simpleDouble;
    }

    public String getSimpleString() {
        return simpleString;
    }

    public void setSimpleString(String simpleString) {
        this.simpleString = simpleString;
    }

    public byte[] getSimpleByteArray() {
        return simpleByteArray;
    }

    public void setSimpleByteArray(byte[] simpleByteArray) {
        this.simpleByteArray = simpleByteArray;
    }

}
