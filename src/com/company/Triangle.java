package com.company;

public class Triangle {
    private int firstEdge, secondEdge, thirdEdge;

    public Triangle(int firstEdge, int secondEdge, int thirdEdge) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
    }

    public int getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(int firstEdge) {
        this.firstEdge = firstEdge;
    }

    public int getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(int secondEdge) {
        this.secondEdge = secondEdge;
    }

    public int getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(int thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    public String checkTriangleType(){
        boolean checkEdgeGreaterThanZero = firstEdge > 0 && secondEdge > 0 && thirdEdge > 0;
        if(checkEdgeGreaterThanZero) {
            boolean checkThreeEdgesEqual = firstEdge == secondEdge && secondEdge == thirdEdge;
            boolean checkTwoEdgesEqual = firstEdge == secondEdge || firstEdge == thirdEdge || secondEdge == thirdEdge;
            if (checkThreeEdgesEqual) {
                return "Equilateral Triangle";
            } else if (checkTwoEdgesEqual) {
                return "Isosceles Triangle";
            } else {
                boolean checkSumTwoEdgesGreaterThanOneEdges = firstEdge + secondEdge > thirdEdge && firstEdge + thirdEdge > secondEdge && secondEdge + thirdEdge > firstEdge;
                if (checkSumTwoEdgesGreaterThanOneEdges) {
                    return "Normal Triangle";
                } else {
                    return "Not a triangle!";
                }
            }
        }else{
            return "Not a triangle!";
        }
    }
}
