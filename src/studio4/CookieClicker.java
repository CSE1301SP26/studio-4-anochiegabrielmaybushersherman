package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class CookieClicker {
    public static void main(String[] args) {
        int chipCount = 0;
        int cookieCount = 0;
        int clickMultiplier = 1;
        int idleMultiplier = 1;

        double cookieX = 0.5;
        double cookieY = 0.5;
        double cookieRadius = 0.25;

        double pow1X = 0.0;
        double pow1Y = 1.0;
        double pow1Radius = 0.1;
        double pow2X = 1.0;
        double pow2Y = 1.0;
        double pow2Radius = 0.1;

        StdDraw.setPenColor(255,0,0);
        StdDraw.filledCircle(pow1X, pow1Y, pow1Radius);
        StdDraw.text(0.15, 0.8, "+1 cookies/click");
        StdDraw.text(0.15, 0.75, "Cost: 20 cookies");
        StdDraw.setPenColor(0,0,255);
        StdDraw.filledCircle(pow2X, pow2Y, pow2Radius);
        StdDraw.text(0.85, 0.8, "+1 cookies/second");
        StdDraw.text(0.85, 0.75, "Cost: 60 cookies");
        StdDraw.setPenColor(135,90,52);
        StdDraw.filledCircle(cookieX, cookieY, cookieRadius);
        StdDraw.setPenColor(75,38,27);
        while (chipCount < 5) {
            double xChip = Math.random();
            double yChip = Math.random();
            double distanceFromCenter = Math.sqrt(Math.pow(xChip - cookieX, 2) + Math.pow(yChip - cookieY, 2));
            
            if (distanceFromCenter < (cookieRadius - 0.05)) {
                StdDraw.filledCircle(xChip, yChip, 0.05);
                chipCount++;
            }
        }
        long beginTime = System.currentTimeMillis();
        while (true) {
            long currentTime = System.currentTimeMillis();
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledRectangle(0.5, 0.1, 0.5, 0.05);
            StdDraw.setPenColor(0,0,0);
            StdDraw.text(0.5, 0.1, cookieCount + " cookies collected");
            
            if (currentTime - beginTime >= 1000) {
                    cookieCount += idleMultiplier;
                    beginTime = currentTime;
                    
                }

            if (StdDraw.isMousePressed()) {
                double xPos = StdDraw.mouseX();
                double yPos = StdDraw.mouseY();
                double clickDistance = Math.sqrt(Math.pow(xPos - cookieX,2) + Math.pow(yPos - cookieY,2));
                double pow1Distance = Math.sqrt(Math.pow(xPos - pow1X,2) + Math.pow(yPos - pow1Y,2));
                double pow2Distance = Math.sqrt(Math.pow(xPos - pow2Y,2) + Math.pow(yPos - pow2Y,2));
                
                if (clickDistance < cookieRadius) {
                    System.out.println("Cookie clicked!");
                    cookieCount += clickMultiplier;
                    StdDraw.pause(100);
                }
                else if (pow1Distance < pow1Radius && cookieCount >= 20) {
                    cookieCount -= 20;
                    System.out.println("Pow 1 bought!");
                    clickMultiplier++;
                    StdDraw.pause(100);
                }
                else if (pow2Distance < pow2Radius && cookieCount >= 60) {
                    cookieCount -= 60;
                    System.out.println("Pow 2 bought!");
                    idleMultiplier++;
                    StdDraw.pause(100);
                }
            }
        StdDraw.setPenColor(255,255,255);
        StdDraw.filledRectangle(0.5, 0.1, 0.5, 0.05);
        StdDraw.setPenColor(0,0,0);
        StdDraw.text(0.5, 0.1, cookieCount + " cookies collected");    
        StdDraw.pause(10); 
        }
    }
}
