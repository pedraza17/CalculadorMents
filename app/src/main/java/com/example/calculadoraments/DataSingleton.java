package com.example.calculadoraments;

public class DataSingleton {

    private static DataSingleton instance = null;
    private String usuario;
    private String Procedimientop1,Procedimientop2, Procedimientop3, Procedimientop4,
            Procedimientop5, Procedimientop6, Procedimientop7;
    private String Valorfinal, Intervalomenor;
    private String D1, D2, D3, D4, D5, D6;
    private String P1,P2,P3,P4,P5,P6,P7,P8;

    private DataSingleton(){
        usuario = "";
        Procedimientop1 = "";
        Procedimientop2 = "";
        Procedimientop3 = "";
        Procedimientop4 = "";
        Procedimientop5 = "";
        Procedimientop6 = "";
        Procedimientop7 = "";
        Valorfinal = "";
        Intervalomenor = "";
        D1 = "";
        D2 = "";
        D3 = "";
        D4 = "";
        D5 = "";
        D6 = "";
        P1="";
        P2="";
        P3="";
        P4="";
        P5="";
        P6="";
        P7="";
        P8="";
    }

    public static DataSingleton getInstance(){
        if(instance == null){
            instance = new DataSingleton();
        }
        return instance;
    }

    public void setUser(String user){
        this.usuario = user;
    }

    public String getUser(){
        return usuario;
    }

    public String getProcedimientop1() {
        return Procedimientop1;
    }

    public void setProcedimientop1(String procedimientop1) {
        Procedimientop1 = procedimientop1;
    }

    public String getProcedimientop2() {
        return Procedimientop2;
    }

    public void setProcedimientop2(String procedimientop2) {
        Procedimientop2 = procedimientop2;
    }

    public String getProcedimientop3() {
        return Procedimientop3;
    }

    public void setProcedimientop3(String procedimientop3) {
        Procedimientop3 = procedimientop3;
    }

    public String getProcedimientop4() {
        return Procedimientop4;
    }

    public void setProcedimientop4(String procedimientop4) {
        Procedimientop4 = procedimientop4;
    }

    public String getProcedimientop5() {
        return Procedimientop5;
    }

    public void setProcedimientop5(String procedimientop5) {
        Procedimientop5 = procedimientop5;
    }

    public String getProcedimientop6() {
        return Procedimientop6;
    }

    public void setProcedimientop6(String procedimientop6) {
        Procedimientop6 = procedimientop6;
    }

    public String getProcedimientop7() {
        return Procedimientop7;
    }

    public void setProcedimientop7(String procedimientop7) {
        Procedimientop7 = procedimientop7;
    }

    public String getValorfinal() {
        return Valorfinal;
    }

    public void setValorfinal(String valorfinal) {
        Valorfinal = valorfinal;
    }

    public String getIntervalomenor() {
        return Intervalomenor;
    }

    public void setIntervalomenor(String intervalomenor) {
        Intervalomenor = intervalomenor;
    }

    public String getD1() {
        return D1;
    }

    public void setD1(String d1) {
        D1 = d1;
    }

    public String getD2() {
        return D2;
    }

    public void setD2(String d2) {
        D2 = d2;
    }

    public String getD3() {
        return D3;
    }

    public void setD3(String d3) {
        D3 = d3;
    }

    public String getD4() {
        return D4;
    }

    public void setD4(String d4) {
        D4 = d4;
    }

    public String getD5() {
        return D5;
    }

    public void setD5(String d5) {
        D5 = d5;
    }

    public String getD6() {
        return D6;
    }

    public void setD6(String d6) {
        D6 = d6;
    }

    public String getP1() {
        return P1;
    }

    public void setP1(String p1) {
        P1 = p1;
    }

    public String getP2() {
        return P2;
    }

    public void setP2(String p2) {
        P2 = p2;
    }

    public String getP3() {
        return P3;
    }

    public void setP3(String p3) {
        P3 = p3;
    }

    public String getP4() {
        return P4;
    }

    public void setP4(String p4) {
        P4 = p4;
    }

    public String getP5() {
        return P5;
    }

    public void setP5(String p5) {
        P5 = p5;
    }

    public String getP6() {
        return P6;
    }

    public void setP6(String p6) {
        P6 = p6;
    }

    public String getP7() {
        return P7;
    }

    public void setP7(String p7) {
        P7 = p7;
    }

    public String getP8() {
        return P8;
    }

    public void setP8(String p8) {
        P8 = p8;
    }
}
